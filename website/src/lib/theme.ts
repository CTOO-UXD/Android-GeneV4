import { clearThemeString } from './apply-theme-string'
import { applyMaterialTheme, themeFromSourceColor } from './material-color-helpers'

/** Default GeneV4 primary — keep in sync with ColorLightTokens.Primary / PaletteTokens.Primary40. */
export const DEFAULT_SEED = '#6c43c6'

export type ColorMode = 'light' | 'dark' | 'auto'

/** Library light/dark CSS in tokens.css; only custom seeds use MCU. */
function isLibraryDefault(color: string) {
  return color.toLowerCase() === DEFAULT_SEED.toLowerCase()
}

function applyThemeFromColor(color: string, isDark: boolean) {
  if (isLibraryDefault(color)) {
    clearThemeString(document)
  } else {
    applyMaterialTheme(document, themeFromSourceColor(color, isDark))
  }
  document.documentElement.style.colorScheme = isDark ? 'dark' : 'light'
  document.documentElement.dataset.colorScheme = isDark ? 'dark' : 'light'
  const surface =
    getComputedStyle(document.documentElement)
      .getPropertyValue('--md-sys-color-surface-container')
      .trim() || undefined
  if (surface) {
    document.querySelector('meta[name="theme-color"]')?.setAttribute('content', surface)
  }
  window.dispatchEvent(new Event('theme-changed'))
}

export function isModeDark(mode: ColorMode, saveAutoMode = true): boolean {
  let isDark = mode === 'dark'
  if (mode === 'auto') {
    isDark = window.matchMedia('(prefers-color-scheme: dark)').matches
    if (saveAutoMode) {
      localStorage.setItem('last-auto-color-mode', isDark ? 'dark' : 'light')
    }
  }
  return isDark
}

export function getCurrentMode(): ColorMode {
  return (localStorage.getItem('color-mode') as ColorMode | null) ?? 'light'
}

export function getCurrentSeedColor(): string {
  return localStorage.getItem('seed-color') ?? DEFAULT_SEED
}

/** Current stringified Material theme CSS from localStorage (for copy). */
export function getCurrentThemeString(): string | null {
  return localStorage.getItem('material-theme')
}

export function saveColorMode(mode: ColorMode) {
  localStorage.setItem('color-mode', mode)
}

export function saveSeedColor(color: string) {
  localStorage.setItem('seed-color', color)
}

export function changeColor(color: string) {
  applyThemeFromColor(color, isModeDark(getCurrentMode()))
  saveSeedColor(color)
}

export function changeColorMode(mode: ColorMode) {
  applyThemeFromColor(getCurrentSeedColor(), isModeDark(mode))
  saveColorMode(mode)
}

export function changeColorAndMode(color: string, mode: ColorMode) {
  applyThemeFromColor(color, isModeDark(mode))
  saveSeedColor(color)
  saveColorMode(mode)
}

/** Apply saved theme, or library tokens.css defaults. Call early to avoid FOUC. */
export function initTheme() {
  const saved = localStorage.getItem('material-theme')
  const mode = getCurrentMode()
  const seed = getCurrentSeedColor()

  applyThemeFromColor(seed, isModeDark(mode, false))
  if (!saved) {
    saveSeedColor(seed)
    saveColorMode(mode)
  }

  window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', () => {
    if (getCurrentMode() === 'auto') {
      applyThemeFromColor(getCurrentSeedColor(), isModeDark('auto'))
    }
  })
}
