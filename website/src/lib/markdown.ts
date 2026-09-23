import MarkdownIt from 'markdown-it'

export type TocItem = { id: string; text: string; level: number }

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
  const src = token.attrGet('src') || ''
  const alt = token.content || '组件效果'
  return `<figure class="demo-frame"><div class="demo-stage"><img src="${md.utils.escapeHtml(src)}" alt="${md.utils.escapeHtml(alt)}" loading="lazy" /></div><figcaption class="demo-caption">组件预览 · GeneV4 截图</figcaption></figure>`
}

function slugify(text: string): string {
  return text
    .trim()
    .toLowerCase()
    .replace(/[^\w\u4e00-\u9fff\s-]/g, '')
    .replace(/\s+/g, '-')
}

export function renderMarkdown(source: string): { html: string; toc: TocItem[]; title: string } {
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

  return { html: md.renderer.render(tokens, md.options, {}), toc, title }
}
