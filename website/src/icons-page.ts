import { LitElement, css, html } from 'lit'
import { customElement, state } from 'lit/decorators.js'
import { ICONS_VERSION, LIBRARY_VERSION } from './lib/versions'

type IconSet = 'filled' | 'outlined' | 'aifilled' | 'aioutlined'

type IconEntry = { file: string; name: string; kotlin: string; url: string }

const SETS: { id: IconSet; label: string; receiver: string }[] = [
  { id: 'filled', label: 'Standard 实心', receiver: 'Icons.Filled' },
  { id: 'outlined', label: 'Standard 线框', receiver: 'Icons.Outlined' },
  { id: 'aifilled', label: 'AI 实心', receiver: 'Icons.AiFilled' },
  { id: 'aioutlined', label: 'AI 线框', receiver: 'Icons.AiOutlined' },
]

function kotlinName(fileName: string): string {
  const parts = fileName.split(/[^0-9A-Za-z]+/).filter(Boolean)
  const pascal = parts.map((part) => part.slice(0, 1).toUpperCase() + part.slice(1)).join('')
  return /^\d/.test(pascal) ? `Icon${pascal}` : pascal
}

function loadSet(pattern: Record<string, string>, receiver: string): IconEntry[] {
  return Object.entries(pattern)
    .map(([path, url]) => {
      const file = path.split(/[/\\]/).pop()?.replace(/\.svg$/, '') ?? path
      const name = kotlinName(file)
      return { file, name, kotlin: `${receiver}.${name}`, url }
    })
    .sort((a, b) => a.name.localeCompare(b.name))
}

const catalogs: Record<IconSet, IconEntry[]> = {
  filled: loadSet(
    import.meta.glob('../../icons/svg/filled/*.svg', { query: '?url', import: 'default', eager: true }) as Record<string, string>,
    'Icons.Filled',
  ),
  outlined: loadSet(
    import.meta.glob('../../icons/svg/outlined/*.svg', { query: '?url', import: 'default', eager: true }) as Record<string, string>,
    'Icons.Outlined',
  ),
  aifilled: loadSet(
    import.meta.glob('../../icons/svg/aiFilled/*.svg', { query: '?url', import: 'default', eager: true }) as Record<string, string>,
    'Icons.AiFilled',
  ),
  aioutlined: loadSet(
    import.meta.glob('../../icons/svg/aiOutlined/*.svg', { query: '?url', import: 'default', eager: true }) as Record<string, string>,
    'Icons.AiOutlined',
  ),
}

@customElement('genev4-icons-page')
export class Genev4IconsPage extends LitElement {
  @state() private set: IconSet = 'filled'
  @state() private query = ''
  @state() private copied = ''

  private copyTimer = 0

  connectedCallback() {
    super.connectedCallback()
    document.title = 'Icons · GeneV4'
  }

  private call(entry: IconEntry): string {
    return `Icon(${entry.kotlin}, contentDescription = null)`
  }

  private async copy(entry: IconEntry) {
    const text = this.call(entry)
    try {
      await navigator.clipboard.writeText(text)
    } catch {
      return
    }
    this.copied = text
    window.clearTimeout(this.copyTimer)
    this.copyTimer = window.setTimeout(() => {
      if (this.copied === text) this.copied = ''
    }, 1600)
  }

  private get visible(): IconEntry[] {
    const q = this.query.trim().toLowerCase()
    const items = catalogs[this.set]
    if (!q) return items
    return items.filter((item) => item.file.includes(q) || item.name.toLowerCase().includes(q) || item.kotlin.toLowerCase().includes(q))
  }

  render() {
    const items = this.visible
    const total = catalogs[this.set].length
    return html`
      <header class="head">
        <h1>Icons</h1>
        <p>
          <code>Icon()</code> 在组件库里，矢量图在图标包。四个页签：Standard 实心 / 线框、AI 实心 / 线框。点击复制调用。
        </p>
        <pre class="usage"><code>implementation("io.github.ctoo-uxd:genev4:${LIBRARY_VERSION}")
implementation("io.github.ctoo-uxd:genev4-icons:${ICONS_VERSION}")

import com.genev4.Icon
import com.genev4.icons.Icons

Icon(Icons.Filled.AccountCircle, contentDescription = "账号")
Icon(Icons.Outlined.AccountCircle, contentDescription = "账号")
Icon(Icons.AiFilled.Globe, contentDescription = "地球")</code></pre>
      </header>
      <div class="toolbar">
        <div class="sets" role="tablist">
          ${SETS.map(
            (item) => html`
              <button
                role="tab"
                aria-selected=${this.set === item.id}
                class=${this.set === item.id ? 'on' : ''}
                @click=${() => (this.set = item.id)}
              >
                ${item.label}
                <span>${catalogs[item.id].length}</span>
              </button>
            `,
          )}
        </div>
        <input
          type="search"
          placeholder="搜索名称"
          .value=${this.query}
          @input=${(event: Event) => (this.query = (event.target as HTMLInputElement).value)}
        />
      </div>
      <p class="count">${items.length === total ? `${total} 个` : `${items.length} / ${total}`}</p>
      <div class="grid">
        ${items.map(
          (item) => html`
            <button class="cell" title=${this.call(item)} @click=${() => this.copy(item)}>
              <span class="glyph" style=${`--src: url("${item.url}")`}></span>
              <span class="name">${item.name}</span>
            </button>
          `,
        )}
      </div>
      <p class="toast" aria-live="polite">${this.copied ? `已复制 ${this.copied}` : ''}</p>
    `
  }

  static styles = css`
    :host {
      display: block;
      color: var(--md-sys-color-on-surface);
    }

    h1 {
      margin: 0 0 12px;
      font-size: clamp(2.4rem, 5vw, 3.25rem);
      font-weight: 400;
      letter-spacing: -0.02em;
      line-height: 1.1;
    }

    .head p {
      margin: 0;
      max-width: 42rem;
      color: var(--md-sys-color-on-surface-variant);
      line-height: 1.5;
    }

    .usage {
      margin: 16px 0 0;
      padding: 12px 16px;
      border-radius: 12px;
      background: var(--md-sys-color-surface-container-high);
      overflow: auto;
      font-size: 0.85rem;
    }

    .toolbar {
      display: flex;
      flex-wrap: wrap;
      gap: 12px;
      align-items: center;
      margin-top: 24px;
    }

    .sets {
      display: flex;
      flex-wrap: wrap;
      gap: 8px;
    }

    .sets button {
      display: inline-flex;
      gap: 6px;
      align-items: center;
      border: 1px solid var(--md-sys-color-outline-variant);
      background: var(--md-sys-color-surface);
      color: var(--md-sys-color-on-surface);
      border-radius: 999px;
      padding: 8px 12px;
      cursor: pointer;
    }

    .sets button.on {
      background: var(--md-sys-color-secondary-container);
      color: var(--md-sys-color-on-secondary-container);
      border-color: transparent;
    }

    .sets span {
      opacity: 0.7;
      font-size: 0.8rem;
    }

    input {
      min-width: min(100%, 220px);
      flex: 1;
      border: 1px solid var(--md-sys-color-outline);
      background: var(--md-sys-color-surface);
      color: inherit;
      border-radius: 12px;
      padding: 10px 12px;
      font: inherit;
    }

    .count {
      margin: 12px 0;
      color: var(--md-sys-color-on-surface-variant);
      font-size: 0.85rem;
    }

    .grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(112px, 1fr));
      gap: 8px;
    }

    .cell {
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 8px;
      min-height: 88px;
      padding: 12px 6px;
      border-radius: 12px;
      border: 1px solid var(--md-sys-color-outline-variant);
      background: var(--md-sys-color-surface);
      color: inherit;
      cursor: pointer;
      content-visibility: auto;
      contain-intrinsic-size: 112px 88px;
    }

    .cell:hover {
      background: var(--md-sys-color-surface-container-high);
    }

    .glyph {
      width: 24px;
      height: 24px;
      background: currentColor;
      -webkit-mask: var(--src) center / contain no-repeat;
      mask: var(--src) center / contain no-repeat;
    }

    .name {
      max-width: 100%;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
      font-size: 0.72rem;
      color: var(--md-sys-color-on-surface-variant);
    }

    .toast {
      position: sticky;
      bottom: 12px;
      min-height: 1.2em;
      margin: 12px 0 0;
      color: var(--md-sys-color-primary);
    }
  `
}
