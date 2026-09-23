import path from 'node:path'
import { fileURLToPath } from 'node:url'
import { defineConfig } from 'vitepress'

const websiteRoot = path.resolve(fileURLToPath(new URL('.', import.meta.url)), '..')

export default defineConfig({
  lang: 'zh-CN',
  title: 'GeneV4',
  description: 'Android Jetpack Compose 组件库',
  srcDir: '../docs',
  srcExclude: ['README.md', 'PUBLISH.md', 'PARITY.md', 'UPSTREAM.md', 'PACKAGE.md'],
  // Markdown lives in ../docs; public assets must sit next to that tree or absolute
  // image paths like /components/button.png fail to resolve during build.
  publicDir: path.resolve(websiteRoot, '../docs/public'),
  outDir: './.vitepress/dist',
  base: '/Android-GeneV4/',
  vite: {
    server: {
      fs: { allow: [websiteRoot, path.resolve(websiteRoot, '..')] }
    },
    resolve: {
      alias: {
        vue: path.join(websiteRoot, 'node_modules/vue')
      }
    }
  },
  cleanUrls: true,
  ignoreDeadLinks: true,
  lastUpdated: true,
  head: [
    ['link', { rel: 'icon', href: '/Android-GeneV4/favicon.svg' }],
    ['meta', { name: 'theme-color', content: '#6750A4' }]
  ],
  themeConfig: {
    logo: '/logo.svg',
    siteTitle: 'GeneV4',
    nav: [
      { text: '指南', link: '/getting-started' },
      { text: '组件', link: '/components/' },
      { text: '主题', link: '/theming' },
      {
        text: '0.1.0',
        items: [
          { text: 'Maven Central', link: 'https://central.sonatype.com/artifact/io.github.ctoo-uxd/genev4' }
        ]
      }
    ],
    sidebar: [
      {
        text: '开始使用',
        items: [
          { text: '快速开始', link: '/getting-started' },
          { text: '主题与颜色', link: '/theming' }
        ]
      },
      {
        text: '组件',
        items: [
          { text: '概览', link: '/components/' },
          { text: 'Button', link: '/components/button' },
          { text: 'Card', link: '/components/card' },
          { text: 'Dialog', link: '/components/dialog' },
          { text: 'NavigationBar', link: '/components/navigation-bar' },
          { text: 'Scaffold', link: '/components/scaffold' },
          { text: 'Snackbar', link: '/components/snackbar' },
          { text: 'TextField', link: '/components/text-field' }
        ]
      }
    ],
    socialLinks: [
      { icon: 'github', link: 'https://github.com/CTOO-UXD/Android-GeneV4' }
    ],
    search: { provider: 'local' },
    outline: { level: [2, 3], label: '本页目录' },
    lastUpdated: { text: '上次更新' },
    docFooter: { prev: '上一页', next: '下一页' },
    returnToTopLabel: '回到顶部',
    sidebarMenuLabel: '菜单',
    darkModeSwitchLabel: '外观',
    footer: {
      message: 'Released under the Apache-2.0 License',
      copyright: 'GeneV4 · CTOO-UXD'
    }
  }
})
