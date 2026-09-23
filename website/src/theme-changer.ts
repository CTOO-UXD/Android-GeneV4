import { LitElement, css, html } from 'lit'
import { customElement, property, state } from 'lit/decorators.js'
import '@material/web/iconbutton/icon-button.js'
import '@material/web/icon/icon.js'
import {
  changeColor,
  changeColorMode,
  getCurrentMode,
  getCurrentSeedColor,
  type ColorMode,
} from './lib/theme'
import { hctFromHex, hexFromHct } from './lib/material-color-helpers'

const PRESETS = ['#6750a4', '#006a6a', '#386a20', '#8b5000', '#ba1a1a', '#0061a4'] as const

@customElement('theme-changer')
export class ThemeChanger extends LitElement {
  @property({ type: Boolean, reflect: true }) open = false

  @state() private seed = DEFAULT_FROM_STORAGE()
  @state() private mode: ColorMode = 'light'
  @state() private hue = 0
  @state() private chroma = 0
  @state() private tone = 0

  connectedCallback() {
    super.connectedCallback()
    this.syncFromStorage()
    window.addEventListener('keydown', this.onKey)
  }

  disconnectedCallback() {
    window.removeEventListener('keydown', this.onKey)
    super.disconnectedCallback()
  }

  private syncFromStorage() {
    this.seed = getCurrentSeedColor()
    this.mode = getCurrentMode()
    this.syncHct(this.seed)
  }

  private syncHct(hex: string) {
    const hct = hctFromHex(hex)
    this.hue = Math.round(hct.hue)
    this.chroma = Math.round(hct.chroma)
    this.tone = Math.round(hct.tone)
  }

  private onKey = (e: KeyboardEvent) => {
    if (e.key === 'Escape' && this.open) {
      this.open = false
      this.dispatchEvent(new Event('close'))
    }
  }

  private setSeed(hex: string) {
    this.seed = hex
    this.syncHct(hex)
    changeColor(hex)
  }

  private onPickerInput(e: Event) {
    const hex = (e.target as HTMLInputElement).value
    this.setSeed(hex)
  }

  private onHctInput(kind: 'hue' | 'chroma' | 'tone', e: Event) {
    const value = Number((e.target as HTMLInputElement).value)
    this[kind] = value
    const hex = hexFromHct(this.hue, this.chroma, this.tone)
    this.seed = hex
    changeColor(hex)
  }

  private setMode(mode: ColorMode) {
    this.mode = mode
    changeColorMode(mode)
  }

  private close() {
    this.open = false
    this.dispatchEvent(new Event('close'))
  }

  render() {
    if (!this.open) return html``
    return html`
      <div class="scrim" @click=${this.close}></div>
      <div class="panel" role="dialog" aria-label="Theme controls">
        <div class="head">
          <h2>Theme</h2>
          <md-icon-button aria-label="Close" @click=${this.close}>
            <md-icon>close</md-icon>
          </md-icon-button>
        </div>

        <label class="hex-row">
          <span>Source color</span>
          <span class="swatch-wrap" style="--swatch:${this.seed}">
            <input type="color" .value=${this.seed} @input=${this.onPickerInput} aria-label="Seed color" />
          </span>
        </label>

        <div class="presets">
          ${PRESETS.map(
            (c) => html`
              <button
                class="preset ${c.toLowerCase() === this.seed.toLowerCase() ? 'active' : ''}"
                style="background:${c}"
                aria-label=${`Preset ${c}`}
                @click=${() => this.setSeed(c)}
              ></button>
            `,
          )}
        </div>

        <label class="slider">
          <span>Hue <em>${this.hue}</em></span>
          <input
            type="range"
            min="0"
            max="360"
            .valueAsNumber=${this.hue}
            @input=${(e: Event) => this.onHctInput('hue', e)}
          />
        </label>
        <label class="slider">
          <span>Chroma <em>${this.chroma}</em></span>
          <input
            type="range"
            min="0"
            max="100"
            .valueAsNumber=${this.chroma}
            @input=${(e: Event) => this.onHctInput('chroma', e)}
          />
        </label>
        <label class="slider">
          <span>Tone <em>${this.tone}</em></span>
          <input
            type="range"
            min="0"
            max="100"
            .valueAsNumber=${this.tone}
            @input=${(e: Event) => this.onHctInput('tone', e)}
          />
        </label>

        <p class="mode-label">Color mode</p>
        <div class="modes">
          ${(['light', 'auto', 'dark'] as ColorMode[]).map(
            (m) => html`
              <button class="mode ${this.mode === m ? 'active' : ''}" @click=${() => this.setMode(m)}>
                <md-icon>${m === 'light' ? 'light_mode' : m === 'dark' ? 'dark_mode' : 'brightness_auto'}</md-icon>
                ${m}
              </button>
            `,
          )}
        </div>
      </div>
    `
  }

  static styles = css`
    :host {
      display: contents;
    }

    .scrim {
      position: fixed;
      inset: 0;
      z-index: 40;
      background: transparent;
    }

    .panel {
      position: fixed;
      z-index: 41;
      top: calc(var(--catalog-top-app-bar-height, 72px) + 8px);
      right: var(--catalog-spacing-l, 16px);
      width: min(320px, calc(100vw - 24px));
      padding: 16px;
      border-radius: var(--catalog-shape-xl, 28px);
      background: var(--md-sys-color-surface-container-high);
      color: var(--md-sys-color-on-surface);
      box-shadow: 0 8px 28px color-mix(in srgb, var(--md-sys-color-shadow) 28%, transparent);
      display: grid;
      gap: 14px;
    }

    .head {
      display: flex;
      align-items: center;
      justify-content: space-between;
    }

    h2 {
      margin: 0;
      font-size: 1.15rem;
      font-weight: 700;
    }

    .hex-row {
      display: flex;
      align-items: center;
      justify-content: space-between;
      gap: 12px;
      padding: 12px;
      border-radius: var(--catalog-shape-l, 16px);
      background: var(--md-sys-color-surface-variant);
      color: var(--md-sys-color-on-surface-variant);
      font-size: 0.92rem;
    }

    .swatch-wrap {
      width: 40px;
      height: 40px;
      border-radius: 50%;
      overflow: hidden;
      border: 1px solid var(--md-sys-color-outline);
      background: var(--swatch);
      position: relative;
    }

    .swatch-wrap input {
      position: absolute;
      inset: -25%;
      width: 150%;
      height: 150%;
      border: 0;
      padding: 0;
      cursor: pointer;
      opacity: 0;
    }

    .presets {
      display: flex;
      flex-wrap: wrap;
      gap: 8px;
    }

    .preset {
      width: 28px;
      height: 28px;
      border-radius: 50%;
      border: 2px solid transparent;
      cursor: pointer;
      padding: 0;
    }

    .preset.active {
      border-color: var(--md-sys-color-on-surface);
    }

    .slider {
      display: grid;
      gap: 6px;
      font-size: 0.85rem;
      color: var(--md-sys-color-on-surface-variant);
    }

    .slider span {
      display: flex;
      justify-content: space-between;
    }

    .slider em {
      font-style: normal;
      font-variant-numeric: tabular-nums;
      color: var(--md-sys-color-on-surface);
    }

    .slider input[type='range'] {
      width: 100%;
      accent-color: var(--md-sys-color-primary);
    }

    .mode-label {
      margin: 4px 0 0;
      font-size: 0.85rem;
      color: var(--md-sys-color-on-surface-variant);
    }

    .modes {
      display: grid;
      grid-template-columns: repeat(3, 1fr);
      gap: 6px;
    }

    .mode {
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 4px;
      padding: 10px 6px;
      border-radius: var(--catalog-shape-l, 16px);
      border: 1px solid var(--md-sys-color-outline-variant);
      background: transparent;
      color: var(--md-sys-color-on-surface);
      font-size: 0.75rem;
      text-transform: capitalize;
      cursor: pointer;
    }

    .mode.active {
      background: var(--md-sys-color-secondary-container);
      color: var(--md-sys-color-on-secondary-container);
      border-color: transparent;
    }

    .mode md-icon {
      font-size: 20px;
    }
  `
}

function DEFAULT_FROM_STORAGE() {
  try {
    return getCurrentSeedColor()
  } catch {
    return '#6750a4'
  }
}

declare global {
  interface HTMLElementTagNameMap {
    'theme-changer': ThemeChanger
  }
}
