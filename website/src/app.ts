import { LitElement, css, html, nothing } from 'lit'
import { customElement, state } from 'lit/decorators.js'
import { unsafeHTML } from 'lit/directives/unsafe-html.js'
import '@material/web/list/list.js'
import '@material/web/list/list-item.js'
import '@material/web/iconbutton/icon-button.js'
import '@material/web/icon/icon.js'
import '@material/web/button/filled-button.js'
import '@material/web/button/outlined-button.js'
import { basePath, componentSource, docFiles, href, navGroups, normalizePath, type NavItem } from './nav'
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
  @state() private themeOpen = false

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
    const pane = this.renderRoot?.querySelector('.pane.content-pane .scroll-wrapper')
    if (pane instanceof HTMLElement) pane.scrollTop = 0
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
      </md-list-item>
    `
  }

  private renderHome() {
    document.title = 'GeneV4'
    const comps = navGroups
      .find((g) => g.title === 'Components')!
      .items.filter((i) => i.path !== '/components/' && i.en)

    return html`
      <section class="hero">
        <div>
          <p class="eyebrow">Jetpack Compose · Android</p>
          <h1 class="display">GeneV4</h1>
          <p class="lede">
            Compose 组件库。浏览 Types 截图与可复制 Usage；站点外壳对齐 Material Web catalog，画面来自 Paparazzi 金标。
          </p>
          <div class="actions">
            <md-filled-button href=${href('/getting-started')} @click=${(e: Event) => this.go('/getting-started', e)}>
              Quick start
            </md-filled-button>
            <md-outlined-button href=${href('/components/button')} @click=${(e: Event) => this.go('/components/button', e)}>
              Browse components
            </md-outlined-button>
          </div>
        </div>
        <a class="hero-shot" href=${href('/components/button')} @click=${(e: Event) => this.go('/components/button', e)}>
          <img src=${href('components/button.png')} alt="Button" />
        </a>
      </section>

      <section class="catalog">
        <h2>Components</h2>
        <p class="catalog-lede">点进任意组件：先看 Types，再复制 Usage。</p>
        <div class="grid">
          ${comps.map(
            (item) => html`
              <a class="tile" href=${href(item.path)} @click=${(e: Event) => this.go(item.path, e)}>
                <div class="tile-shot">
                  <img
                    src=${href(`components/${item.path.split('/').pop()}.png`)}
                    alt=${item.en || item.title}
                    loading="lazy"
                  />
                </div>
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
      return { title: '', toc: [] as TocItem[], body: html`<p>未找到文档。</p>` }
    }
    const isComponent =
      this.path.startsWith('/components/') && this.path !== '/components/'
    const { html: body, toc, title } = renderMarkdown(source, {
      promoteDemo: isComponent,
      sourceUrl: componentSource[this.path],
    })
    document.title = title ? `${title} · GeneV4` : 'GeneV4'
    return {
      title,
      toc,
      body: html`
        <div class="doc ${isComponent ? 'doc--component' : ''}" @click=${this.onContentClick}>
          ${unsafeHTML(body)}
        </div>
      `,
    }
  }

  render() {
    const home = this.path === '/'
    const doc = home ? null : this.renderDoc()
    const hasToc = !!(doc && doc.toc.length)

    return html`
      <header class="topbar">
        <div class="topbar-start">
          ${home
            ? nothing
            : html`
                <md-icon-button class="menu-btn" aria-label="菜单" @click=${() => (this.drawer = !this.drawer)}>
                  <md-icon>${this.drawer ? 'menu_open' : 'menu'}</md-icon>
                </md-icon-button>
              `}
          <a class="brand" href=${href('')} @click=${(e: Event) => this.go('/', e)}>
            <img src=${href('logo.svg')} width="28" height="28" alt="" />
            <span>GeneV4</span>
          </a>
        </div>
        <div class="top-actions">
          <md-icon-button
            href="https://github.com/CTOO-UXD/Android-GeneV4"
            target="_blank"
            rel="noopener"
            aria-label="GitHub"
          >
            <md-icon>code</md-icon>
          </md-icon-button>
          <md-icon-button
            aria-label="Theme"
            aria-expanded=${this.themeOpen ? 'true' : 'false'}
            @click=${() => {
              this.themeOpen = !this.themeOpen
              if (this.themeOpen) this.drawer = false
            }}
          >
            <md-icon>palette</md-icon>
          </md-icon-button>
        </div>
        <theme-changer
          .open=${this.themeOpen}
          @close=${() => (this.themeOpen = false)}
        ></theme-changer>
      </header>

      <div class="body ${home ? 'home' : ''} ${this.drawer ? 'drawer-open' : ''}">
        ${home
          ? nothing
          : html`
              <div class="spacer" aria-hidden="true"></div>
              <aside class="sidenav">
                <div class="scroll-wrapper">
                  ${navGroups.map(
                    (group) => html`
                      <p class="group-title">${group.title}</p>
                      <md-list class="nav">
                        ${group.items.map((item) => this.renderNavItem(item))}
                      </md-list>
                    `,
                  )}
                </div>
              </aside>
              <div class="scrim" @click=${() => (this.drawer = false)}></div>
            `}

        <div class="panes ${hasToc ? 'has-toc' : ''}">
          ${hasToc
            ? html`
                <aside class="pane toc">
                  <div class="scroll-wrapper">
                    <p class="toc-label">On this page</p>
                    <h2 class="toc-title">${doc!.title}</h2>
                    <nav class="toc-nav">
                      ${doc!.toc.map(
                        (item: TocItem) => html`
                          <a class=${item.level > 2 ? 'deep' : ''} href="#${item.id}">${item.text}</a>
                        `,
                      )}
                    </nav>
                  </div>
                </aside>
              `
            : nothing}

          <div class="pane content-pane">
            <div class="scroll-wrapper">
              <div class="content-inner">${home ? this.renderHome() : doc!.body}</div>
            </div>
          </div>
        </div>
      </div>
    `
  }

  static styles = css`
    :host {
      display: flex;
      flex-direction: column;
      min-height: 100dvh;
      background: var(--md-sys-color-surface-container);
      color: var(--md-sys-color-on-surface);
      --_drawer-width: var(--catalog-drawer-width);
      --_toc-pane-width: var(--catalog-toc-width);
      --_pane-margin-inline-end: var(--catalog-spacing-l);
      --_pane-margin-inline-start: 0px;
      --_pane-margin-block-end: var(--catalog-spacing-l);
    }

    /* —— top app bar (material-web catalog) —— */
    .topbar {
      position: sticky;
      top: 0;
      z-index: 12;
      height: var(--catalog-top-app-bar-height);
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: var(--catalog-spacing-m) var(--catalog-spacing-l);
      background: var(--md-sys-color-surface-container);
      color: var(--md-sys-color-on-surface);
      box-sizing: border-box;
    }

    .topbar-start {
      display: flex;
      align-items: center;
      gap: 4px;
      min-width: 0;
    }

    .brand {
      display: inline-flex;
      align-items: center;
      gap: 10px;
      color: var(--md-sys-color-primary);
      font-size: max(var(--catalog-title-l-font-size), 22px);
      font-weight: 500;
      text-decoration: none;
      padding-inline: 12px;
    }

    .brand:hover {
      text-decoration: none;
    }

    .brand img {
      border-radius: 8px;
    }

    .top-actions {
      display: flex;
      align-items: center;
    }

    .menu-btn {
      display: none;
    }

    /* —— body / drawer shell —— */
    .body {
      display: flex;
      flex-grow: 1;
      position: relative;
    }

    .body.home {
      --_pane-margin-inline-start: var(--catalog-spacing-xl);
    }

    .spacer,
    .sidenav {
      min-width: var(--_drawer-width);
      max-width: var(--_drawer-width);
    }

    /* material-web nav-drawer: spacer min-width animates across the 1500px breakpoint */
    .spacer {
      flex-shrink: 0;
      position: relative;
      transition: min-width 0.5s cubic-bezier(0.3, 0, 0, 1);
    }

    .sidenav {
      position: fixed;
      inset: var(--catalog-top-app-bar-height) 0 0 0;
      z-index: 12;
      background: var(--md-sys-color-surface-container);
      overflow: hidden;
      transform: translateX(0);
      transition: transform 0.5s cubic-bezier(0.3, 0, 0, 1);
    }

    .sidenav .scroll-wrapper {
      overflow-y: auto;
      max-height: 100%;
      padding-block: var(--catalog-spacing-m);
      padding-inline-end: var(--catalog-spacing-s);
    }

    md-list.nav {
      --md-list-container-color: transparent;
      background: transparent;
      display: block;
      margin-inline: var(--catalog-spacing-m);
      min-width: unset;
    }

    .group-title {
      margin: var(--catalog-spacing-xl) var(--catalog-spacing-l) var(--catalog-spacing-m);
      font-size: var(--catalog-headline-s-font-size);
      font-weight: 700;
      color: var(--md-sys-color-on-surface);
    }

    .sidenav .scroll-wrapper > .group-title:first-child {
      margin-block-start: var(--catalog-spacing-s);
    }

    md-list.nav md-list-item {
      margin-block: var(--catalog-spacing-m);
      display: block;
      border-radius: var(--catalog-shape-xl);
      --md-list-item-container-shape: var(--catalog-shape-xl);
      --md-focus-ring-shape: var(--catalog-shape-xl);
    }

    .group-title + md-list.nav md-list-item:first-of-type {
      margin-block-start: 0;
    }

    md-list.nav md-list-item.active {
      background-color: var(--md-sys-color-surface-container-highest);
    }

    /* —— panes (content + toc) —— */
    .panes {
      display: flex;
      flex-direction: row-reverse;
      justify-content: start;
      gap: var(--_pane-margin-inline-end);
      margin-inline: var(--_pane-margin-inline-start) var(--_pane-margin-inline-end);
      margin-block-end: var(--_pane-margin-block-end);
      width: 100%;
      max-width: calc(
        100% - var(--_drawer-width) - var(--_pane-margin-inline-start) - var(--_pane-margin-inline-end)
      );
      min-width: 0;
      /* emphasized easing — same as material-web catalog nav-drawer */
      transition: 0.5s cubic-bezier(0.3, 0, 0, 1);
      transition-property: margin, height, border-radius, max-width, width;
    }

    .body.home .panes {
      max-width: calc(100% - var(--_pane-margin-inline-start) - var(--_pane-margin-inline-end));
    }

    .pane {
      box-sizing: border-box;
      overflow: hidden;
      background-color: var(--md-sys-color-surface);
      border-radius: var(--catalog-shape-xl);
      height: calc(
        100dvh - var(--catalog-top-app-bar-height) - var(--_pane-margin-block-end)
      );
      transition: 0.5s cubic-bezier(0.3, 0, 0, 1);
      transition-property: margin, height, border-radius, max-width, width;
    }

    .pane.content-pane {
      flex-grow: 1;
      min-width: 0;
    }

    .pane.toc {
      width: var(--_toc-pane-width);
      max-width: var(--_toc-pane-width);
      flex-shrink: 0;
      opacity: 1;
      transition:
        0.5s cubic-bezier(0.3, 0, 0, 1),
        opacity 0.35s cubic-bezier(0.3, 0, 0, 1);
      transition-property: margin, height, border-radius, max-width, width, opacity;
    }

    .pane .scroll-wrapper {
      overflow-y: auto;
      max-height: 100%;
      border-radius: inherit;
      box-sizing: border-box;
      padding-block: var(--catalog-spacing-xl);
    }

    .pane.toc .scroll-wrapper {
      padding-inline: var(--catalog-spacing-xl);
    }

    .content-inner {
      display: block;
      width: 100%;
      max-width: min(100%, var(--catalog-content-max));
      margin-inline: auto;
      padding-inline: var(--catalog-spacing-xl);
      box-sizing: border-box;
    }

    .toc-label {
      margin: 0;
      font-size: var(--catalog-label-s-font-size);
      color: var(--md-sys-color-on-surface-variant);
      text-transform: uppercase;
      letter-spacing: 0.04em;
      font-weight: 500;
    }

    .toc-title {
      margin: var(--catalog-spacing-s) 0 var(--catalog-spacing-m);
      font-size: var(--catalog-headline-s-font-size);
      font-weight: 700;
    }

    .toc-nav {
      display: flex;
      flex-direction: column;
      gap: var(--catalog-spacing-m);
    }

    .toc-nav a {
      color: var(--md-sys-color-on-surface-variant);
      font-size: var(--catalog-body-m-font-size);
      text-decoration: none;
      line-height: 1.35;
    }

    .toc-nav a.deep {
      padding-inline-start: var(--catalog-spacing-xl);
      list-style: circle;
    }

    .toc-nav a:hover {
      color: var(--md-sys-color-primary);
      text-decoration: underline;
    }

    .scrim {
      display: none;
    }

    /* —— home —— */
    .hero {
      display: grid;
      gap: var(--catalog-spacing-xl);
      margin-block-end: 48px;
    }

    .eyebrow {
      margin: 0 0 8px;
      color: var(--md-sys-color-primary);
      font-size: var(--catalog-title-m-font-size);
      font-weight: 500;
    }

    .display {
      margin: 0;
      font-size: clamp(2.8rem, 8vw, var(--catalog-display-xl-font-size));
      line-height: 1.05;
      font-weight: 400;
      letter-spacing: -0.02em;
    }

    .lede,
    .catalog-lede {
      margin: 14px 0 0;
      max-width: 36rem;
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.6;
    }

    .actions {
      display: flex;
      flex-wrap: wrap;
      gap: 10px;
      margin-top: 28px;
    }

    .hero-shot {
      display: grid;
      place-items: center;
      padding: 28px;
      border-radius: var(--catalog-image-border-radius);
      border: 1px solid var(--md-sys-color-outline);
      background: var(--md-sys-color-surface);
      min-height: 180px;
      text-decoration: none;
    }

    .hero-shot img {
      max-width: min(100%, 420px);
      height: auto;
    }

    .catalog h2 {
      margin: 0;
      font-size: var(--catalog-headline-s-font-size);
    }

    .grid {
      margin-top: 22px;
      display: grid;
      grid-template-columns: repeat(2, minmax(0, 1fr));
      gap: 12px;
    }

    .tile {
      display: grid;
      gap: 8px;
      padding: 12px;
      border-radius: var(--catalog-shape-l);
      background: var(--md-sys-color-surface-container-low);
      color: inherit;
      text-decoration: none;
    }

    .tile:hover {
      background: var(--md-sys-color-surface-container-high);
      text-decoration: none;
    }

    .tile-shot {
      display: grid;
      place-items: center;
      min-height: 88px;
      padding: 12px;
      border-radius: var(--catalog-shape-m);
      background: var(--md-sys-color-surface);
      border: 1px solid var(--md-sys-color-outline-variant);
    }

    .tile-shot img {
      max-width: 100%;
      max-height: 64px;
      object-fit: contain;
    }

    .tile span {
      color: var(--md-sys-color-on-surface-variant);
      font-size: var(--catalog-body-m-font-size);
    }

    /* —— markdown / doc (md-layout.css aligned) —— */
    .doc :is(h1) {
      margin: 0 0 12px;
      font-size: clamp(2.4rem, 5vw, 3.25rem);
      font-weight: 400;
      letter-spacing: -0.02em;
      line-height: 1.1;
    }

    .doc :is(h1 + p) {
      margin: 0;
      max-width: 42rem;
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.6;
    }

    .doc-links {
      display: flex;
      flex-wrap: wrap;
      gap: 8px 20px;
      margin: 16px 0 28px;
      list-style: none;
      padding: 0;
    }

    .doc-links a {
      color: var(--md-sys-color-primary);
      font-weight: 500;
      text-decoration: none;
    }

    .doc-links a:hover {
      text-decoration: underline;
    }

    .doc :is(h2) {
      margin: 48px 0 16px;
      font-size: var(--catalog-title-l-font-size);
      font-weight: 700;
    }

    .doc--component .types-block h2 {
      margin-top: 8px;
    }

    .doc :is(h3) {
      margin: 28px 0 10px;
      font-size: var(--catalog-title-m-font-size);
      font-weight: 700;
    }

    .doc :is(p, li) {
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.65;
    }

    .doc a {
      color: var(--md-sys-color-primary);
    }

    .doc table {
      width: 100%;
      border-collapse: separate;
      border-spacing: 0;
      margin: 16px 0 28px;
      font-size: var(--catalog-body-m-font-size);
      overflow: hidden;
    }

    .doc th,
    .doc td {
      padding: 8px 16px;
      text-align: left;
      vertical-align: top;
      border-block-start: 1px solid var(--md-sys-color-outline-variant);
      border-inline-start: 1px solid var(--md-sys-color-outline-variant);
    }

    .doc tr td:last-of-type,
    .doc tr th:last-of-type {
      border-inline-end: 1px solid var(--md-sys-color-outline-variant);
    }

    .doc tr:last-of-type td {
      border-block-end: 1px solid var(--md-sys-color-outline-variant);
    }

    .doc th {
      background: var(--md-sys-color-surface-container);
      color: var(--md-sys-color-on-surface);
      font-weight: 500;
      font-size: 1.05em;
    }

    .doc tr:first-child th:first-child {
      border-start-start-radius: var(--catalog-shape-xl);
    }

    .doc tr:first-child th:last-child {
      border-start-end-radius: var(--catalog-shape-xl);
    }

    .doc tr:last-child td:first-child {
      border-end-start-radius: var(--catalog-shape-xl);
    }

    .doc tr:last-child td:last-child {
      border-end-end-radius: var(--catalog-shape-xl);
    }

    .doc :not(pre) > code {
      display: inline-flex;
      font-family: 'Roboto Mono', ui-monospace, monospace;
      font-size: 0.88em;
      padding: 4px;
      border-radius: 8px;
      background: var(--md-sys-color-surface-variant);
      color: var(--md-sys-color-on-surface);
    }

    .doc .types-block {
      margin: 0 0 8px;
    }

    /* Preview area — screenshots only; framed like catalog figures */
    .doc .demo-frame {
      margin: 0 0 8px;
      border: 1px solid var(--md-sys-color-outline);
      border-radius: var(--catalog-image-border-radius);
      overflow: hidden;
      background: var(--md-sys-color-surface);
    }

    .doc .demo-stage {
      display: grid;
      place-items: center;
      padding: 28px;
      min-height: 200px;
      background: var(--md-sys-color-surface);
    }

    .doc--component .demo-stage {
      min-height: 240px;
      padding: 40px 28px;
    }

    .doc .demo-stage img {
      max-width: min(100%, 640px);
      height: auto;
    }

    .doc .code-panel {
      margin: 12px 0 28px;
      border-radius: var(--catalog-shape-l);
      overflow: hidden;
      background: var(--md-sys-color-surface-container-low);
    }

    .doc .code-toolbar {
      display: flex;
      align-items: center;
      justify-content: space-between;
      padding: 4px 8px 0 14px;
    }

    .doc .code-lang {
      font-size: var(--catalog-label-s-font-size);
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

    /* —— responsive (material-web: collapse drawer ≤1500, hide toc ≤900) —— */
    @media (max-width: 900px) {
      .pane.toc {
        width: 0;
        max-width: 0;
        opacity: 0;
        margin: 0;
        padding: 0;
        pointer-events: none;
        overflow: hidden;
        border: 0;
      }
    }

    @media (max-width: 1500px) {
      .menu-btn {
        display: inline-flex;
      }

      .spacer {
        min-width: 0;
      }

      .panes {
        max-width: calc(100% - var(--_pane-margin-inline-start) - var(--_pane-margin-inline-end));
      }

      :host {
        --_pane-margin-inline-start: var(--catalog-spacing-xl);
      }

      .sidenav {
        transform: translateX(-100%);
        border-radius: 0 var(--catalog-shape-xl) var(--catalog-shape-xl) 0;
        width: var(--_drawer-width);
        max-width: var(--_drawer-width);
      }

      .sidenav .scroll-wrapper {
        opacity: 0;
        transition: opacity 0.3s cubic-bezier(0.3, 0, 0, 1);
      }

      .drawer-open .sidenav {
        transform: translateX(0);
      }

      .drawer-open .sidenav .scroll-wrapper {
        opacity: 1;
      }

      .scrim {
        display: block;
        position: fixed;
        inset: 0;
        z-index: 11;
        background: rgba(0, 0, 0, 0.32);
        opacity: 0;
        pointer-events: none;
        transition: opacity 0.15s linear;
      }

      .drawer-open .scrim {
        opacity: 1;
        pointer-events: auto;
      }
    }

    @media (min-width: 1501px) {
      .menu-btn {
        display: none;
      }

      .sidenav {
        transform: none;
      }

      .sidenav .scroll-wrapper {
        opacity: 1;
      }
    }

    @media (min-width: 960px) {
      .hero {
        grid-template-columns: 1.05fr 0.95fr;
        align-items: center;
      }

      .grid {
        grid-template-columns: repeat(3, minmax(0, 1fr));
      }
    }

    @media (min-width: 1200px) {
      .grid {
        grid-template-columns: repeat(4, minmax(0, 1fr));
      }
    }

    @media (max-width: 600px) {
      .pane {
        border-end-start-radius: 0;
        border-end-end-radius: 0;
      }

      :host {
        --_pane-margin-block-end: 0px;
        --_pane-margin-inline-start: 0px;
        --_pane-margin-inline-end: 0px;
      }
    }

    @media (pointer: fine) {
      .pane .scroll-wrapper {
        scrollbar-color: var(--md-sys-color-primary) transparent;
        scrollbar-width: thin;
      }
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'genev4-app': Genev4App
  }
}
