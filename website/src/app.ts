import { LitElement, css, html, nothing } from 'lit'
import { customElement, property, state } from 'lit/decorators.js'
import { unsafeHTML } from 'lit/directives/unsafe-html.js'
import '@material/web/list/list.js'
import '@material/web/list/list-item.js'
import '@material/web/iconbutton/icon-button.js'
import '@material/web/icon/icon.js'
import '@material/web/button/filled-button.js'
import '@material/web/button/outlined-button.js'
import '@material/web/button/text-button.js'
import '@material/web/divider/divider.js'
import { basePath, docFiles, href, navGroups, normalizePath, type NavItem } from './nav'
import { renderMarkdown, type TocItem } from './lib/markdown'

const modules = import.meta.glob('@docs/**/*.md', {
  query: '?raw',
  import: 'default',
  eager: true,
}) as Record<string, string>

function resolveDoc(path: string): string | null {
  const file = docFiles[path]
  if (!file) return null
  const needle = `/docs/${file}`.replace(/\\/g, '/')
  const hit = Object.entries(modules).find(([key]) => {
    const k = key.replace(/\\/g, '/')
    return k.endsWith(needle) || k.endsWith(file)
  })
  return hit?.[1] ?? null
}

@customElement('genev4-app')
export class Genev4App extends LitElement {
  @state() private path = '/'
  @state() private drawer = false

  connectedCallback() {
    super.connectedCallback()
    this.path = normalizePath(window.location.pathname)
    window.addEventListener('popstate', this.onPop)
  }

  disconnectedCallback() {
    window.removeEventListener('popstate', this.onPop)
    super.disconnectedCallback()
  }

  private onPop = () => {
    this.path = normalizePath(window.location.pathname)
    this.drawer = false
  }

  private go(path: string, event?: Event) {
    event?.preventDefault()
    const next = normalizePath(path)
    if (next === this.path) {
      this.drawer = false
      return
    }
    history.pushState({}, '', href(next === '/' ? '' : next))
    this.path = next
    this.drawer = false
    window.scrollTo({ top: 0 })
  }

  private onContentClick = (event: Event) => {
    const target = event.target as HTMLElement | null
    if (!target) return

    const copy = target.closest('[data-copy]') as HTMLElement | null
    if (copy) {
      const panel = copy.closest('.code-panel')
      const code = panel?.querySelector('code')?.textContent || ''
      navigator.clipboard?.writeText(code)
      return
    }

    const a = target.closest('a') as HTMLAnchorElement | null
    if (!a) return
    const raw = a.getAttribute('href') || ''
    if (!raw || raw.startsWith('http') || raw.startsWith('#') || raw.startsWith('mailto:')) return
    event.preventDefault()
    const path = raw.startsWith(basePath) ? raw.slice(basePath.length - 1) || '/' : raw
    this.go(path)
  }

  private renderNavItem(item: NavItem) {
    const active = this.path === item.path
    const label = item.en || item.title
    return html`
      <md-list-item
        type="link"
        href=${href(item.path)}
        class=${active ? 'active' : ''}
        @click=${(e: Event) => this.go(item.path, e)}
      >
        <div slot="headline">${label}</div>
        ${item.en ? html`<div slot="supporting-text">${item.title}</div>` : nothing}
      </md-list-item>
    `
  }

  private renderHome() {
    document.title = 'GeneV4'
    return html`
      <section class="hero card">
        <div>
          <p class="eyebrow md-typescale-label-large">Android Jetpack Compose</p>
          <h1>GeneV4</h1>
          <p class="lede">
            面向业务工程的 Compose 组件库。统一包名 <code>com.genev4</code>，主题先行，常用控件开箱即用。
          </p>
          <div class="actions">
            <md-filled-button href=${href('/getting-started')} @click=${(e: Event) => this.go('/getting-started', e)}>
              快速开始
            </md-filled-button>
            <md-outlined-button href=${href('/components/')} @click=${(e: Event) => this.go('/components/', e)}>
              浏览组件
            </md-outlined-button>
            <md-text-button href="https://github.com/CTOO-UXD/Android-GeneV4" target="_blank" rel="noopener">
              GitHub
            </md-text-button>
          </div>
        </div>
        <div class="hero-demo" aria-hidden="true">
          <div class="demo-box">
            <md-filled-button>填充</md-filled-button>
            <md-outlined-button>描边</md-outlined-button>
            <md-text-button>文字</md-text-button>
          </div>
          <p class="hint">站点外壳使用 Material Web；下方组件页预览为 GeneV4 真机截图。</p>
        </div>
      </section>

      <section class="strip">
        <article class="card soft">
          <h2>Maven Central</h2>
          <p><code>io.github.ctoo-uxd:genev4:0.1.0</code></p>
        </article>
        <article class="card soft">
          <h2>主题入口</h2>
          <p><code>com.genev4.MaterialTheme</code></p>
        </article>
        <article class="card soft">
          <h2>真机画廊</h2>
          <p>仓库 <code>:catalog</code> 模块可安装预览</p>
        </article>
      </section>

      <section class="card catalog">
        <h2>Components</h2>
        <p class="lede">按页面查阅变体说明、预览与可复制示例。</p>
        <div class="grid">
          ${navGroups
            .find((g) => g.title === '组件')!
            .items.filter((i) => i.path !== '/components/')
            .map(
              (item) => html`
                <a class="tile" href=${href(item.path)} @click=${(e: Event) => this.go(item.path, e)}>
                  <strong>${item.en}</strong>
                  <span>${item.title}</span>
                </a>
              `,
            )}
        </div>
      </section>
    `
  }

  private renderDoc() {
    const source = resolveDoc(this.path)
    if (!source) {
      document.title = 'GeneV4'
      return html`<div class="card doc"><p>未找到文档。</p></div>`
    }
    const { html: body, toc, title } = renderMarkdown(source)
    document.title = title ? `${title} · GeneV4` : 'GeneV4'
    return html`
      <article class="card doc" @click=${this.onContentClick}>${unsafeHTML(body)}</article>
      ${toc.length
        ? html`
            <aside class="toc">
              <p class="toc-title">On this page</p>
              <div class="toc-rail">
                ${toc.map(
                  (item: TocItem) => html`
                    <a class=${item.level > 2 ? 'deep' : ''} href="#${item.id}">${item.text}</a>
                  `,
                )}
              </div>
            </aside>
          `
        : nothing}
    `
  }

  render() {
    const home = this.path === '/'
    return html`
      <header class="topbar">
        <a class="brand" href=${href('')} @click=${(e: Event) => this.go('/', e)}>
          <img src=${href('logo.svg')} width="28" height="28" alt="" />
          <span>GeneV4</span>
        </a>
        <div class="top-actions">
          <md-icon-button
            href="https://github.com/CTOO-UXD/Android-GeneV4"
            target="_blank"
            rel="noopener"
            aria-label="GitHub"
          >
            <md-icon>code</md-icon>
          </md-icon-button>
          ${home
            ? nothing
            : html`
                <md-icon-button class="menu" aria-label="菜单" @click=${() => (this.drawer = !this.drawer)}>
                  <md-icon>menu</md-icon>
                </md-icon-button>
              `}
        </div>
      </header>

      <div class="layout ${home ? 'home' : ''}">
        ${home
          ? nothing
          : html`
              <aside class="sidenav ${this.drawer ? 'open' : ''}">
                ${navGroups.map(
                  (group, index) => html`
                    ${index > 0 ? html`<md-divider></md-divider>` : nothing}
                    <p class="group-title">${group.title}</p>
                    <md-list>${group.items.map((item) => this.renderNavItem(item))}</md-list>
                  `,
                )}
              </aside>
              ${this.drawer ? html`<div class="scrim" @click=${() => (this.drawer = false)}></div>` : nothing}
            `}

        <main class="main">${home ? this.renderHome() : this.renderDoc()}</main>
      </div>
    `
  }

  static styles = css`
    :host {
      display: block;
      min-height: 100vh;
      background: var(--gv-canvas);
      color: var(--md-sys-color-on-surface);
    }

    .topbar {
      position: sticky;
      top: 0;
      z-index: 20;
      height: var(--gv-header);
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 0 12px 0 20px;
      background: var(--gv-surface);
      border-bottom: 1px solid color-mix(in srgb, var(--md-sys-color-outline) 24%, transparent);
    }

    .brand {
      display: inline-flex;
      align-items: center;
      gap: 10px;
      font-weight: 500;
      font-size: 1.125rem;
      letter-spacing: 0.01em;
    }

    .brand img {
      border-radius: 8px;
    }

    .top-actions {
      display: flex;
      align-items: center;
    }

    .layout {
      display: grid;
      grid-template-columns: 1fr;
      gap: 0;
      max-width: 1480px;
      margin: 0 auto;
      padding: 16px 12px 48px;
    }

    .layout.home {
      max-width: 1100px;
    }

    .sidenav {
      display: none;
    }

    .sidenav md-list {
      background: transparent;
      --md-list-container-color: transparent;
    }

    .sidenav md-list-item {
      margin: 2px 8px;
      border-radius: 999px;
      --md-list-item-container-shape: 999px;
      --md-list-item-label-text-weight: 500;
    }

    .sidenav md-list-item.active {
      background: var(--md-sys-color-surface-container-highest);
    }

    .group-title {
      margin: 18px 24px 4px;
      font-size: 0.7rem;
      font-weight: 700;
      letter-spacing: 0.08em;
      text-transform: uppercase;
      color: var(--md-sys-color-on-surface-variant);
    }

    md-divider {
      margin: 12px 16px;
    }

    .main {
      min-width: 0;
      display: grid;
      grid-template-columns: minmax(0, 1fr);
      gap: 16px;
      align-items: start;
    }

    .card {
      background: var(--gv-surface);
      border-radius: var(--gv-radius-xl);
      padding: 32px 24px 40px;
    }

    .card.soft {
      padding: 20px 22px;
    }

    .hero {
      display: grid;
      gap: 28px;
    }

    .eyebrow {
      margin: 0 0 8px;
      color: var(--md-sys-color-on-surface-variant);
      text-transform: uppercase;
      letter-spacing: 0.06em;
      font-size: 0.75rem;
      font-weight: 500;
    }

    h1 {
      margin: 0;
      font-size: clamp(2.6rem, 7vw, 3.8rem);
      line-height: 1.05;
      letter-spacing: -0.03em;
      font-weight: 700;
    }

    .lede {
      margin: 14px 0 0;
      max-width: 36rem;
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.65;
      font-size: 1.05rem;
    }

    .actions {
      display: flex;
      flex-wrap: wrap;
      gap: 10px;
      margin-top: 28px;
    }

    .hero-demo {
      display: grid;
      gap: 12px;
      align-content: center;
    }

    .demo-box {
      display: flex;
      flex-wrap: wrap;
      gap: 12px;
      justify-content: center;
      padding: 28px 20px;
      border-radius: 16px;
      border: 1px solid var(--md-sys-color-outline-variant);
      background: var(--md-sys-color-surface-container-low);
    }

    .hint {
      margin: 0;
      font-size: 0.82rem;
      color: var(--md-sys-color-on-surface-variant);
      text-align: center;
    }

    .strip {
      display: grid;
      gap: 12px;
      margin-top: 16px;
    }

    .strip h2,
    .catalog h2 {
      margin: 0 0 6px;
      font-size: 1rem;
      font-weight: 700;
    }

    .strip p {
      margin: 0;
      color: var(--md-sys-color-on-surface-variant);
    }

    .catalog {
      margin-top: 16px;
    }

    .catalog .lede {
      margin-top: 6px;
      font-size: 0.98rem;
    }

    .grid {
      margin-top: 22px;
      display: grid;
      grid-template-columns: repeat(2, minmax(0, 1fr));
      gap: 10px;
    }

    .tile {
      display: grid;
      gap: 4px;
      padding: 18px 16px;
      border-radius: 16px;
      background: var(--md-sys-color-surface-container-low);
    }

    .tile:hover {
      background: var(--md-sys-color-surface-container-high);
    }

    .tile span {
      color: var(--md-sys-color-on-surface-variant);
      font-size: 0.88rem;
    }

    .doc {
      max-width: 820px;
      justify-self: stretch;
    }

    .doc :is(h1) {
      margin: 0 0 10px;
      font-size: clamp(2rem, 4vw, 2.75rem);
      letter-spacing: -0.03em;
      line-height: 1.1;
    }

    .doc :is(h2) {
      margin: 44px 0 14px;
      font-size: 1.5rem;
      letter-spacing: -0.02em;
    }

    .doc :is(h3) {
      margin: 28px 0 10px;
      font-size: 1.1rem;
    }

    .doc :is(p, li) {
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.7;
    }

    .doc a {
      color: var(--md-sys-color-primary);
      text-decoration: underline;
      text-underline-offset: 2px;
    }

    .doc table {
      width: 100%;
      border-collapse: collapse;
      margin: 8px 0 24px;
      overflow: hidden;
      border-radius: 12px;
      border: 1px solid color-mix(in srgb, var(--md-sys-color-outline) 25%, transparent);
    }

    .doc th,
    .doc td {
      padding: 12px 14px;
      text-align: left;
      border-bottom: 1px solid color-mix(in srgb, var(--md-sys-color-outline) 18%, transparent);
    }

    .doc th {
      background: var(--md-sys-color-surface-container-low);
      color: var(--md-sys-color-on-surface);
    }

    .doc tr:last-child td {
      border-bottom: 0;
    }

    .doc :not(pre) > code,
    .hero code,
    .strip code {
      font-family: 'Roboto Mono', ui-monospace, monospace;
      font-size: 0.88em;
      padding: 0.12em 0.38em;
      border-radius: 6px;
      background: var(--md-sys-color-surface-container);
    }

    .doc .demo-frame {
      margin: 12px 0 28px;
      border: 1px solid var(--md-sys-color-outline-variant);
      border-radius: 16px;
      overflow: hidden;
      background: var(--gv-surface);
    }

    .doc .demo-stage {
      display: grid;
      place-items: center;
      padding: 36px 24px;
      min-height: 160px;
      background: var(--md-sys-color-surface-container-low);
    }

    .doc .demo-stage img {
      max-width: min(100%, 520px);
      height: auto;
    }

    .doc .demo-caption {
      margin: 0;
      padding: 10px 16px;
      border-top: 1px solid color-mix(in srgb, var(--md-sys-color-outline) 20%, transparent);
      font-size: 0.78rem;
      color: var(--md-sys-color-on-surface-variant);
    }

    .doc .code-panel {
      margin: 0 0 28px;
      border-radius: 12px;
      overflow: hidden;
      background: var(--md-sys-color-surface-container);
    }

    .doc .code-toolbar {
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 4px 8px 0 14px;
    }

    .doc .code-lang {
      font-size: 0.72rem;
      text-transform: uppercase;
      letter-spacing: 0.05em;
      color: var(--md-sys-color-on-surface-variant);
    }

    .doc .code-body {
      margin: 0;
      padding: 4px 18px 18px;
      overflow: auto;
      font-size: 0.86rem;
      line-height: 1.55;
      color: var(--md-sys-color-on-surface-variant);
      font-family: 'Roboto Mono', ui-monospace, monospace;
    }

    .toc {
      display: none;
    }

    .toc-title {
      margin: 0 0 12px;
      font-size: 0.72rem;
      font-weight: 700;
      letter-spacing: 0.04em;
      text-transform: uppercase;
      color: var(--md-sys-color-on-surface-variant);
    }

    .toc-rail {
      border-left: 1px solid var(--md-sys-color-outline-variant);
    }

    .toc a {
      display: block;
      padding: 7px 0 7px 14px;
      margin-left: -1px;
      border-left: 2px solid transparent;
      color: var(--md-sys-color-on-surface-variant);
      font-size: 0.86rem;
      line-height: 1.35;
    }

    .toc a.deep {
      padding-left: 24px;
      font-size: 0.8rem;
    }

    .toc a:hover {
      color: var(--md-sys-color-on-surface);
      border-left-color: var(--md-sys-color-outline);
    }

    .scrim {
      position: fixed;
      inset: 0;
      background: rgba(0, 0, 0, 0.32);
      z-index: 25;
    }

    .menu {
      display: inline-flex;
    }

    @media (max-width: 959px) {
      .sidenav.open {
        display: block;
        position: fixed;
        z-index: 30;
        inset: 0 auto 0 0;
        width: min(86vw, 320px);
        background: var(--gv-canvas);
        padding: 12px 0 24px;
        overflow: auto;
        box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
      }
    }

    @media (min-width: 960px) {
      .menu {
        display: none;
      }

      .layout {
        grid-template-columns: var(--gv-side) minmax(0, 1fr);
        gap: 8px;
        padding: 20px 24px 64px;
      }

      .layout.home {
        grid-template-columns: 1fr;
      }

      .sidenav {
        display: block;
        position: sticky;
        top: calc(var(--gv-header) + 12px);
        max-height: calc(100vh - var(--gv-header) - 24px);
        overflow: auto;
        padding-bottom: 24px;
      }

      .card {
        padding: 48px 52px 56px;
      }

      .hero {
        grid-template-columns: 1.15fr 0.85fr;
        align-items: center;
      }

      .strip {
        grid-template-columns: repeat(3, 1fr);
      }

      .grid {
        grid-template-columns: repeat(4, minmax(0, 1fr));
      }
    }

    @media (min-width: 1200px) {
      .main {
        grid-template-columns: minmax(0, 1fr) var(--gv-toc);
      }

      .layout.home .main {
        grid-template-columns: 1fr;
      }

      .toc {
        display: block;
        position: sticky;
        top: calc(var(--gv-header) + 28px);
        padding-top: 18px;
      }
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'genev4-app': Genev4App
  }
}
