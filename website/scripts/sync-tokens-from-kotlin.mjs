import fs from 'node:fs'
import path from 'node:path'
import { fileURLToPath } from 'node:url'

const __dirname = path.dirname(fileURLToPath(import.meta.url))
const websiteRoot = path.resolve(__dirname, '..')
const repoRoot = path.resolve(websiteRoot, '..')
const tokensDir = path.join(
  repoRoot,
  'library/src/commonMain/kotlin/com/genev4/tokens',
)
const outFile = path.join(websiteRoot, 'src/styles/tokens.css')

function read(name) {
  return fs.readFileSync(path.join(tokensDir, name), 'utf8')
}

function parsePalette(source) {
  const palette = {}
  const re =
    /val\s+(\w+)\s*=\s*Color\(\s*red\s*=\s*(\d+)\s*,\s*green\s*=\s*(\d+)\s*,\s*blue\s*=\s*(\d+)\s*\)/g
  for (const match of source.matchAll(re)) {
    const [, name, r, g, b] = match
    const hex =
      '#' +
      [r, g, b]
        .map((n) => Number(n).toString(16).padStart(2, '0'))
        .join('')
    palette[name] = hex
  }
  return palette
}

function parseScheme(source) {
  const scheme = {}
  const re = /val\s+(\w+)\s*=\s*(?:PaletteTokens\.(\w+)|(\w+))/g
  for (const match of source.matchAll(re)) {
    const [, role, paletteRef, alias] = match
    scheme[role] = paletteRef ? { type: 'palette', ref: paletteRef } : { type: 'alias', ref: alias }
  }
  return scheme
}

function resolveScheme(scheme, palette) {
  const resolved = {}
  const visit = (role, stack = []) => {
    if (resolved[role]) return resolved[role]
    if (stack.includes(role)) {
      throw new Error(`Circular token alias: ${[...stack, role].join(' → ')}`)
    }
    const entry = scheme[role]
    if (!entry) throw new Error(`Missing scheme role: ${role}`)
    if (entry.type === 'palette') {
      const hex = palette[entry.ref]
      if (!hex) throw new Error(`Missing palette tone: ${entry.ref} (for ${role})`)
      resolved[role] = hex
      return hex
    }
    resolved[role] = visit(entry.ref, [...stack, role])
    return resolved[role]
  }
  for (const role of Object.keys(scheme)) visit(role)
  return resolved
}

function toCssName(role) {
  return (
    '--md-sys-color-' +
    role
      .replace(/([a-z0-9])([A-Z])/g, '$1-$2')
      .replace(/([A-Z])([A-Z][a-z])/g, '$1-$2')
      .toLowerCase()
  )
}

function block(selector, colors, colorScheme) {
  const lines = Object.keys(colors)
    .sort()
    .map((role) => `  ${toCssName(role)}: ${colors[role]};`)
  // Compose ColorScheme has no Shadow; Material Web still uses it.
  if (!colors.Shadow && colors.Scrim) {
    lines.push(`  --md-sys-color-shadow: ${colors.Scrim};`)
  }
  lines.sort()
  return `${selector} {\n  color-scheme: ${colorScheme};\n${lines.join('\n')}\n}`
}

const palette = parsePalette(read('PaletteTokens.kt'))
const light = resolveScheme(parseScheme(read('ColorLightTokens.kt')), palette)
const dark = resolveScheme(parseScheme(read('ColorDarkTokens.kt')), palette)

const css = `/* GENERATED from library ColorLight/DarkTokens + PaletteTokens. Do not edit. */
/* Run: npm run tokens:sync */

${block(':root, [data-color-scheme="light"]', light, 'light')}

${block('[data-color-scheme="dark"]', dark, 'dark')}
`

fs.writeFileSync(outFile, css)
console.log(`Wrote ${path.relative(repoRoot, outFile)}`)
console.log(`  light primary ${light.Primary}, dark primary ${dark.Primary}`)
