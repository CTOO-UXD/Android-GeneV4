export type NavItem = { title: string; path: string; en?: string }
export type NavGroup = { title: string; items: NavItem[] }

export const basePath = '/Android-GeneV4/'

export const navGroups: NavGroup[] = [
  {
    title: '开始使用',
    items: [
      { title: '快速开始', path: '/getting-started' },
      { title: '主题与颜色', path: '/theming' },
    ],
  },
  {
    title: '组件',
    items: [
      { title: '概览', path: '/components/' },
      { title: '按钮', en: 'Button', path: '/components/button' },
      { title: '卡片', en: 'Card', path: '/components/card' },
      { title: '对话框', en: 'Dialog', path: '/components/dialog' },
      { title: '底部导航', en: 'NavigationBar', path: '/components/navigation-bar' },
      { title: '脚手架', en: 'Scaffold', path: '/components/scaffold' },
      { title: '提示条', en: 'Snackbar', path: '/components/snackbar' },
      { title: '输入框', en: 'TextField', path: '/components/text-field' },
    ],
  },
]

export const docFiles: Record<string, string> = {
  '/getting-started': 'getting-started.md',
  '/theming': 'theming.md',
  '/components/': 'components/index.md',
  '/components/button': 'components/button.md',
  '/components/card': 'components/card.md',
  '/components/dialog': 'components/dialog.md',
  '/components/navigation-bar': 'components/navigation-bar.md',
  '/components/scaffold': 'components/scaffold.md',
  '/components/snackbar': 'components/snackbar.md',
  '/components/text-field': 'components/text-field.md',
}

export function normalizePath(pathname: string): string {
  let path = pathname
  if (path.startsWith(basePath)) {
    path = path.slice(basePath.length - 1) || '/'
  }
  if (!path.startsWith('/')) path = `/${path}`
  if (path === '/components') return '/components/'
  if (path.length > 1 && path.endsWith('/') && path !== '/components/') {
    path = path.slice(0, -1)
  }
  return path || '/'
}

export function href(path: string): string {
  if (path.startsWith('http')) return path
  const clean = path.startsWith('/') ? path.slice(1) : path
  return `${basePath}${clean}`
}
