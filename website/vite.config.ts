import { defineConfig, type Plugin } from 'vite'
import path from 'node:path'
import fs from 'node:fs'
import { fileURLToPath } from 'node:url'

const root = path.dirname(fileURLToPath(import.meta.url))

function spaFallback(): Plugin {
  return {
    name: 'genev4-spa-fallback',
    closeBundle() {
      const out = path.resolve(root, 'dist')
      const index = path.join(out, 'index.html')
      if (fs.existsSync(index)) {
        fs.copyFileSync(index, path.join(out, '404.html'))
      }
    },
  }
}

export default defineConfig({
  base: '/Android-GeneV4/',
  plugins: [spaFallback()],
  publicDir: path.resolve(root, '../docs/public'),
  resolve: {
    alias: {
      '@': path.resolve(root, 'src'),
      '@docs': path.resolve(root, '../docs'),
    },
  },
  server: {
    fs: {
      allow: [root, path.resolve(root, '..')],
    },
  },
  build: {
    outDir: 'dist',
    emptyOutDir: true,
  },
})
