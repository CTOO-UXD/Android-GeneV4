import MarkdownIt from 'markdown-it'
import { basePath } from '../nav'

export type TocItem = { id: string; text: string; level: number }

function assetUrl(src: string): string {
  if (!src || src.startsWith('http') || src.startsWith('data:')) return src
  if (src.startsWith(basePath)) return src
  if (src.startsWith('/')) return `${basePath}${src.slice(1)}`
  return `${basePath}${src}`
}

const md = new MarkdownIt({
  html: false,
  linkify: true,
  typographer: true,
  highlight(str, lang) {
    const escaped = md.utils.escapeHtml(str)
    const label = lang ? `<span class="code-lang">${md.utils.escapeHtml(lang)}</span>` : ''
    return `<div class="code-panel"><div class="code-toolbar">${label}<md-icon-button class="copy-btn" data-copy aria-label="复制"><md-icon>content_copy</md-icon></md-icon-button></div><pre class="code-body"><code>${escaped}</code></pre></div>`
  },
})

md.renderer.rules.image = (tokens, idx) => {
  const token = tokens[idx]
  const src = assetUrl(token.attrGet('src') || '')
  const alt = token.content || 'Preview'
  return `<figure class="demo-frame"><div class="demo-stage"><img src="${md.utils.escapeHtml(src)}" alt="${md.utils.escapeHtml(alt)}" loading="lazy" /></div></figure>`
}

function slugify(text: string): string {
  return text
    .trim()
    .toLowerCase()
    .replace(/[^\w\u4e00-\u9fff\s-]/g, '')
    .replace(/\s+/g, '-')
}

/** Keep Types first; wrap demos. Avoid duplicate headings (md-it leaves empty <p> after figures). */
function promoteDemos(html: string): string {
  const cleaned = html.replace(/<p>\s*<\/p>/g, '')

  // Already ordered: wrap existing Types + demos in place
  if (/<h2 id="types">Types<\/h2>[\s\S]*?<figure class="demo-frame">/.test(cleaned)) {
    return cleaned.replace(
      /<h2 id="types">Types<\/h2>([\s\S]*?)(?=<h2\b|$)/,
      (_m, body) =>
        `<section class="types-block"><h2 id="types">Types</h2>${body.trim()}</section>`,
    )
  }

  const demos: string[] = []
  let withoutDemos = cleaned.replace(/<figure class="demo-frame">[\s\S]*?<\/figure>/g, (m) => {
    demos.push(m)
    return ''
  })
  if (!demos.length) return cleaned

  withoutDemos = withoutDemos
    .replace(/<p>\s*<\/p>/g, '')
    .replace(/<h2 id="types">Types<\/h2>\s*/g, '')

  const demoBlock = `<section class="types-block"><h2 id="types">Types</h2>${demos.join('')}</section>`

  const h1End = withoutDemos.search(/<\/h1>/)
  if (h1End < 0) return demoBlock + withoutDemos

  const afterH1 = withoutDemos.slice(h1End + 5)
  const nextH2 = afterH1.search(/<h2\b/)
  if (nextH2 < 0) {
    return withoutDemos.slice(0, h1End + 5) + afterH1 + demoBlock
  }
  const intro = afterH1.slice(0, nextH2)
  const rest = afterH1.slice(nextH2)
  return withoutDemos.slice(0, h1End + 5) + intro + demoBlock + rest
}

function injectDocLinks(html: string, sourceUrl: string): string {
  const links = `<nav class="doc-links"><a href="${md.utils.escapeHtml(sourceUrl)}" target="_blank" rel="noopener">Source</a><a href="https://github.com/CTOO-UXD/Android-GeneV4" target="_blank" rel="noopener">Repository</a></nav>`
  // Title → lede → links (material-web catalog order)
  const matched = html.match(/<\/h1>(\s*<p>[\s\S]*?<\/p>)?/)
  if (matched) {
    return html.replace(matched[0], `${matched[0]}${links}`)
  }
  return html
}

export function renderMarkdown(
  source: string,
  opts: { promoteDemo?: boolean; sourceUrl?: string } = {},
): { html: string; toc: TocItem[]; title: string } {
  const toc: TocItem[] = []
  let title = ''
  const tokens = md.parse(source, {})

  for (let i = 0; i < tokens.length; i++) {
    const token = tokens[i]
    if (token.type === 'heading_open') {
      const inline = tokens[i + 1]
      const text = inline?.children?.map((c) => c.content).join('') || inline?.content || ''
      const level = Number(token.tag.slice(1))
      const id = slugify(text) || `section-${toc.length}`
      token.attrSet('id', id)
      if (level === 1 && !title) title = text
      if (level >= 2 && level <= 3) toc.push({ id, text, level })
    }
  }

  let html = md.renderer.render(tokens, md.options, {})
  if (opts.promoteDemo) {
    html = promoteDemos(html)
    if (opts.sourceUrl) html = injectDocLinks(html, opts.sourceUrl)
    const rebuilt: TocItem[] = [{ id: 'types', text: 'Types', level: 2 }]
    const re = /<h2 id="([^"]+)">([^<]+)<\/h2>/g
    let m: RegExpExecArray | null
    while ((m = re.exec(html))) {
      if (m[1] === 'types') continue
      rebuilt.push({ id: m[1], text: m[2], level: 2 })
    }
    return { html, toc: rebuilt, title }
  }

  return { html, toc, title }
}
