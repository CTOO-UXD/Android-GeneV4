type WithStylesheet = typeof globalThis & {
  [stylesheetName: string]: CSSStyleSheet | undefined
}

/**
 * Applies a stringified Material theme CSS to document via constructable stylesheet.
 * Mirrors material-web catalog apply-theme-string.
 */
export function applyThemeString(
  doc: DocumentOrShadowRoot,
  themeString: string,
  ssName = 'material-theme',
) {
  let sheet = (globalThis as WithStylesheet)[ssName]
  if (!sheet) {
    sheet = new CSSStyleSheet()
    ;(globalThis as WithStylesheet)[ssName] = sheet
    doc.adoptedStyleSheets = [...doc.adoptedStyleSheets, sheet]
  }

  const surfaceContainer = themeString.match(/--md-sys-color-surface-container:(.+?);/)?.[1]
  if (surfaceContainer) {
    document.querySelector('meta[name="theme-color"]')?.setAttribute('content', surfaceContainer.trim())
  }

  sheet.replaceSync(themeString)
  localStorage.setItem(ssName, themeString)
}

/** Drop the injected theme sheet so stylesheet defaults (global.css) apply. */
export function clearThemeString(doc: DocumentOrShadowRoot, ssName = 'material-theme') {
  const sheet = (globalThis as WithStylesheet)[ssName]
  if (sheet) {
    doc.adoptedStyleSheets = doc.adoptedStyleSheets.filter((item) => item !== sheet)
    delete (globalThis as WithStylesheet)[ssName]
  }
  localStorage.removeItem(ssName)
}
