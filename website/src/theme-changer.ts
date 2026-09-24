import '@material/web/focus/md-focus-ring.js'
import '@material/web/icon/icon.js'
import '@material/web/iconbutton/icon-button.js'
import '@material/web/labs/segmentedbutton/outlined-segmented-button.js'
import '@material/web/labs/segmentedbuttonset/outlined-segmented-button-set.js'
import './hct-slider'

import type { MdOutlinedSegmentedButton } from '@material/web/labs/segmentedbutton/outlined-segmented-button.js'
import { LitElement, css, html, nothing } from 'lit'
import { customElement, property, query, queryAll, state } from 'lit/decorators.js'
import { live } from 'lit/directives/live.js'
import {
  changeColor,
  changeColorMode,
  getCurrentMode,
  getCurrentSeedColor,
  getCurrentThemeString,
  type ColorMode,
} from './lib/theme'
import { hctFromHex, hexFromHct } from './lib/material-color-helpers'
import type { HctSlider } from './hct-slider'

/**
 * Theme panel aligned with material-web catalog theme-changer.
 */
@customElement('theme-changer')
export class ThemeChanger extends LitElement {
  static override shadowRootOptions = {
    ...LitElement.shadowRootOptions,
    delegatesFocus: true,
  }

  @property({ type: Boolean, reflect: true }) open = false

  @state() private selectedColorMode: ColorMode = 'light'
  @state() private hexColor = '#6750a4'
  @state() private hue = 0
  @state() private chroma = 0
  @state() private tone = 0

  @query('input[type="color"]') private inputEl!: HTMLInputElement
  @queryAll('hct-slider') private sliders!: NodeListOf<HctSlider>

  connectedCallback() {
    super.connectedCallback()
    window.addEventListener('keydown', this.onKey)
  }

  disconnectedCallback() {
    window.removeEventListener('keydown', this.onKey)
    super.disconnectedCallback()
  }

  protected updated(changed: Map<string, unknown>) {
    if (changed.has('open') && this.open) {
      this.syncFromStorage()
    }
  }

  private syncFromStorage() {
    this.selectedColorMode = getCurrentMode()
    this.hexColor = getCurrentSeedColor()
    this.updateHctFromHex(this.hexColor)
  }

  private onKey = (e: KeyboardEvent) => {
    if (!e.defaultPrevented && e.key === 'Escape' && this.open) {
      e.preventDefault()
      this.close()
    }
  }

  private close() {
    this.open = false
    this.dispatchEvent(new Event('close'))
  }

  private updateHctFromHex(hexColor: string) {
    const hct = hctFromHex(hexColor)
    this.hue = hct.hue
    this.chroma = hct.chroma
    this.tone = hct.tone
  }

  private onSliderInput() {
    for (const slider of this.sliders) {
      this[slider.type] = slider.value
    }
    this.hexColor = hexFromHct(this.hue, this.chroma, this.tone)
    changeColor(this.hexColor)
  }

  private onHexPickerInput() {
    this.hexColor = this.inputEl.value
    this.updateHctFromHex(this.hexColor)
    changeColor(this.hexColor)
  }

  private onColorModeSelection(
    e: CustomEvent<{ button: MdOutlinedSegmentedButton; selected: boolean; index: number }>,
  ) {
    const value = e.detail.button.dataset.value as ColorMode
    this.selectedColorMode = value
    changeColorMode(value)
  }

  private async copyTheme() {
    const css = getCurrentThemeString()
    if (!css) return
    await navigator.clipboard?.writeText(css)
  }

  render() {
    if (!this.open) return nothing
    return html`
      <div class="scrim" @click=${this.close}></div>
      <div class="panel" role="dialog" aria-label="Theme Controls">
        <div id="head-wrapper">
          <h2>Theme Controls</h2>
          <md-icon-button aria-label="Copy theme CSS" @click=${this.copyTheme}>
            <md-icon>content_copy</md-icon>
          </md-icon-button>
          <md-icon-button aria-label="Close" @click=${this.close}>
            <md-icon>close</md-icon>
          </md-icon-button>
        </div>

        ${this.renderHexPicker()}
        ${this.renderHctPicker()}
        ${this.renderColorModePicker()}
      </div>
    `
  }

  private renderHexPicker() {
    return html`
      <div id="hex">
        <span class="label">Hex Source Color</span>
        <div class="input-wrapper" style="background:${this.hexColor}">
          <div class="overflow">
            <input
              type="color"
              .value=${live(this.hexColor)}
              aria-label="Hex source color"
              @input=${this.onHexPickerInput}
            />
          </div>
          <md-focus-ring for="hex"></md-focus-ring>
        </div>
      </div>
    `
  }

  private renderHctPicker() {
    return html`
      <div class="sliders">
        <hct-slider
          label="Hue"
          type="hue"
          .value=${this.hue}
          @input=${this.onSliderInput}
        ></hct-slider>
        <hct-slider
          label="Chroma"
          type="chroma"
          .value=${this.chroma}
          .color=${this.hexColor}
          @input=${this.onSliderInput}
        ></hct-slider>
        <hct-slider
          label="Tone"
          type="tone"
          .value=${this.tone}
          @input=${this.onSliderInput}
        ></hct-slider>
      </div>
    `
  }

  private renderColorModePicker() {
    return html`
      <md-outlined-segmented-button-set
        @segmented-button-set-selection=${this.onColorModeSelection}
      >
        ${this.renderModeButton('dark', 'dark_mode')}
        ${this.renderModeButton('auto', 'brightness_medium')}
        ${this.renderModeButton('light', 'light_mode')}
      </md-outlined-segmented-button-set>
    `
  }

  private renderModeButton(mode: ColorMode, icon: string) {
    return html`
      <md-outlined-segmented-button
        data-value=${mode}
        title=${mode}
        .selected=${live(this.selectedColorMode === mode)}
      >
        <md-icon slot="icon">${icon}</md-icon>
      </md-outlined-segmented-button>
    `
  }

  static styles = css`
    :host {
      display: contents;
      --_copy-button-button-size: 40px;
      --_copy-button-icon-size: 24px;
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
      width: min(340px, calc(100vw - 24px));
      padding: var(--catalog-spacing-m, 12px) var(--catalog-spacing-l, 16px);
      border-radius: var(--catalog-shape-xl, 28px);
      background: var(--md-sys-color-surface-container-high);
      color: var(--md-sys-color-on-surface);
      box-shadow: 0 8px 28px color-mix(in srgb, var(--md-sys-color-shadow) 28%, transparent);
      display: flex;
      flex-direction: column;
      gap: var(--catalog-spacing-l, 16px);
      box-sizing: border-box;
    }

    #head-wrapper {
      display: flex;
      align-items: center;
      justify-content: center;
      position: relative;
      min-height: var(--_copy-button-button-size);
    }

    h2 {
      margin: 0;
      text-align: center;
      font-size: 1.15rem;
      font-weight: 700;
      flex: 1;
    }

    #head-wrapper md-icon-button:first-of-type {
      position: absolute;
      inset-inline-end: 40px;
    }

    #head-wrapper md-icon-button:last-of-type {
      position: absolute;
      inset-inline-end: 0;
    }

    input {
      border: none;
      background: none;
    }

    .sliders,
    #hex {
      padding-inline: var(--catalog-spacing-m, 12px);
      border-radius: var(--catalog-shape-l, 16px);
      background-color: var(--md-sys-color-surface-variant);
      color: var(--md-sys-color-on-surface-variant);
      --md-slider-inactive-track-color: var(--md-sys-color-on-surface-variant);
    }

    hct-slider {
      display: block;
      margin-block: 24px;
    }

    #hex {
      display: flex;
      padding: 12px;
      align-items: center;
    }

    #hex .label {
      flex-grow: 1;
    }

    #hex .input-wrapper {
      box-sizing: border-box;
      width: 48px;
      height: 48px;
      border: 1px solid var(--md-sys-color-on-secondary-container);
      position: relative;
      border-radius: 50%;
    }

    #hex md-focus-ring {
      border-radius: 50%;
    }

    .overflow {
      width: 100%;
      height: 100%;
      overflow: hidden;
      border-radius: inherit;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    #hex input {
      min-width: 200%;
      min-height: 200%;
      cursor: pointer;
    }

    md-outlined-segmented-button-set {
      align-self: stretch;
    }

    @media (forced-colors: active) {
      #hex,
      .sliders {
        box-sizing: border-box;
        border: 1px solid CanvasText;
      }
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'theme-changer': ThemeChanger
  }
}
