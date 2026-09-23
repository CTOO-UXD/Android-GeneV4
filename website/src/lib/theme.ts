import { applyMaterialTheme, themeFromSourceColor } from './material-color-helpers'

/** Default GeneV4 purple seed (Material baseline primary). */
export const DEFAULT_SEED = '#6750a4'

export type ColorMode = 'light' | 'dark' | 'auto'

function applyThemeFromColor(color: string, isDark: boolean) {
  applyMaterialTheme(document, themeFromSourceColor(color, isDark))
  document.documentElement.style.colorScheme = isDark ? 'dark' : 'light'
  document.documentElement.dataset.colorScheme = isDark ? 'dark' : 'light'
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

/** Apply saved theme, or generate default. Call early to avoid FOUC. */
export function initTheme() {
  const saved = localStorage.getItem('material-theme')
  const mode = getCurrentMode()
  const seed = getCurrentSeedColor()

  // Prefer regenerating from seed so tokens stay in sync with MCU version
  applyThemeFromColor(seed, isModeDark(mode, false))
  if (!saved) {
    // ensure seed persisted for next visit
    saveSeedColor(seed)
    saveColorMode(mode)
  }

  window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', () => {
    if (getCurrentMode() === 'auto') {
      applyThemeFromColor(getCurrentSeedColor(), isModeDark('auto'))
    }
  })
}
