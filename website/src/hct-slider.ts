import '@material/web/slider/slider.js'
import type { MdSlider } from '@material/web/slider/slider.js'
import { LitElement, css, html } from 'lit'
import { customElement, property } from 'lit/decorators.js'
import { styleMap } from 'lit/directives/style-map.js'
import { hctFromHex, hexFromHct } from './lib/material-color-helpers'

type Range = [number, number]

const HUE_RANGE: Range = [0, 360]
const CHROMA_RANGE: Range = [0, 150]
const TONE_RANGE: Range = [0, 100]

/**
 * HCT slider with preview gradient — matches material-web catalog hct-slider.
 *
 * @fires input
 */
@customElement('hct-slider')
export class HctSlider extends LitElement {
  @property({ type: String }) label = ''
  @property({ type: Number }) value = 0
  /** Base color for chroma gradient (current seed). */
  @property({ type: String }) color = ''
  @property({ type: String }) type: 'hue' | 'chroma' | 'tone' = 'hue'

  override render() {
    let range = HUE_RANGE
    if (this.type === 'chroma') range = CHROMA_RANGE
    else if (this.type === 'tone') range = TONE_RANGE

    return html`
      <section>
        <div id="label">${this.label}</div>
        <md-slider
          .min=${range[0]}
          .max=${range[1]}
          .value=${this.value}
          @input=${this.onInput}
        ></md-slider>
        <div
          id="gradient"
          class=${this.type}
          style=${styleMap({ backgroundImage: this.buildGradient() })}
        ></div>
      </section>
    `
  }

  private onInput(e: Event) {
    const target = e.target as MdSlider
    this.value = target.value as number
    this.dispatchEvent(new Event('input'))
  }

  private buildGradient() {
    const numStops = 100
    let linearGradientString = 'linear-gradient(to right'

    if (this.type === 'hue') {
      for (let i = 0; i < numStops; i++) {
        const hue = (HUE_RANGE[1] / numStops) * i
        const hex = hexFromHct(hue, 100, 50)
        linearGradientString += `, ${hex} ${i}%`
      }
    } else if (this.type === 'chroma') {
      const hue = hctFromHex(this.color || '#000').hue
      for (let i = 0; i < numStops; i++) {
        const chroma = (CHROMA_RANGE[1] / numStops) * i
        const hex = hexFromHct(hue, chroma, 50)
        linearGradientString += `, ${hex} ${i}%`
      }
    } else {
      for (let i = 0; i < numStops; i++) {
        const tone = (TONE_RANGE[1] / numStops) * i
        const hex = hexFromHct(0, 0, tone)
        linearGradientString += `, ${hex} ${i}%`
      }
    }

    return `${linearGradientString})`
  }

  static override styles = css`
    section {
      display: flex;
      flex-direction: column;
    }

    #gradient {
      height: 24px;
      border-radius: 12px;
      border: 1px solid currentColor;
      box-sizing: border-box;
    }

    #gradient.chroma {
      will-change: background;
    }

    #label,
    #gradient {
      margin-inline: calc(var(--md-slider-handle-width, 20px) / 2);
    }
  `
}

declare global {
  interface HTMLElementTagNameMap {
    'hct-slider': HctSlider
  }
}
