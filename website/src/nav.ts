export type NavItem = { title: string; path: string; en?: string }
export type NavGroup = { title: string; items: NavItem[] }

export const basePath = '/Android-GeneV4/'

export const navGroups: NavGroup[] = [
  {
    title: 'Get started',
    items: [
      { title: '快速开始', en: 'Quick start', path: '/getting-started' },
      { title: '主题与颜色', en: 'Theming', path: '/theming' },
    ],
  },
  {
    title: 'Components',
    items: [
      { title: '概览', en: 'Overview', path: '/components/' },
      { title: '按钮', en: 'Button', path: '/components/button' },
      { title: '图标按钮', en: 'IconButton', path: '/components/icon-button' },
      { title: '浮动按钮', en: 'FAB', path: '/components/fab' },
      { title: '纸片', en: 'Chip', path: '/components/chip' },
      { title: '分段按钮', en: 'SegmentedButton', path: '/components/segmented-button' },
      { title: '输入框', en: 'TextField', path: '/components/text-field' },
      { title: '搜索', en: 'Search', path: '/components/search' },
      { title: '菜单', en: 'Menu', path: '/components/menu' },
      { title: '选择', en: 'Selection', path: '/components/selection' },
      { title: '滑条', en: 'Slider', path: '/components/slider' },
      { title: '卡片', en: 'Card', path: '/components/card' },
      { title: '列表', en: 'List', path: '/components/list' },
      { title: '标签页', en: 'Tabs', path: '/components/tabs' },
      { title: '底部导航', en: 'NavigationBar', path: '/components/navigation-bar' },
      { title: '侧栏导航', en: 'NavigationRail', path: '/components/navigation-rail' },
      { title: '应用栏', en: 'AppBar', path: '/components/app-bar' },
      { title: '脚手架', en: 'Scaffold', path: '/components/scaffold' },
      { title: '轮播', en: 'Carousel', path: '/components/carousel' },
      { title: '下拉刷新', en: 'PullToRefresh', path: '/components/pull-to-refresh' },
      { title: '提示', en: 'Tooltip', path: '/components/tooltip' },
      { title: '对话框', en: 'Dialog', path: '/components/dialog' },
      { title: '提示条', en: 'Snackbar', path: '/components/snackbar' },
      { title: '底部菜单', en: 'BottomSheet', path: '/components/bottom-sheet' },
      { title: '日期', en: 'DatePicker', path: '/components/date-picker' },
      { title: '时间', en: 'TimePicker', path: '/components/time-picker' },
    ],
  },
]

export const docFiles: Record<string, string> = {
  '/getting-started': 'getting-started.md',
  '/theming': 'theming.md',
  '/components/': 'components/index.md',
  '/components/button': 'components/button.md',
  '/components/icon-button': 'components/icon-button.md',
  '/components/fab': 'components/fab.md',
  '/components/chip': 'components/chip.md',
  '/components/segmented-button': 'components/segmented-button.md',
  '/components/text-field': 'components/text-field.md',
  '/components/search': 'components/search.md',
  '/components/menu': 'components/menu.md',
  '/components/selection': 'components/selection.md',
  '/components/slider': 'components/slider.md',
  '/components/card': 'components/card.md',
  '/components/list': 'components/list.md',
  '/components/tabs': 'components/tabs.md',
  '/components/navigation-bar': 'components/navigation-bar.md',
  '/components/navigation-rail': 'components/navigation-rail.md',
  '/components/app-bar': 'components/app-bar.md',
  '/components/scaffold': 'components/scaffold.md',
  '/components/carousel': 'components/carousel.md',
  '/components/pull-to-refresh': 'components/pull-to-refresh.md',
  '/components/tooltip': 'components/tooltip.md',
  '/components/dialog': 'components/dialog.md',
  '/components/snackbar': 'components/snackbar.md',
  '/components/bottom-sheet': 'components/bottom-sheet.md',
  '/components/date-picker': 'components/date-picker.md',
  '/components/time-picker': 'components/time-picker.md',
}

/** GitHub source for component catalog pages (material-web style “Source” link). */
export const componentSource: Record<string, string> = {
  '/components/button':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Button.kt',
  '/components/card':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Card.kt',
  '/components/dialog':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AlertDialog.kt',
  '/components/navigation-bar':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/NavigationBar.kt',
  '/components/scaffold':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Scaffold.kt',
  '/components/snackbar':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Snackbar.kt',
  '/components/text-field':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TextField.kt',
  '/components/icon-button':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/IconButton.kt',
  '/components/fab':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/FloatingActionButton.kt',
  '/components/chip':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Chip.kt',
  '/components/segmented-button':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SegmentedButton.kt',
  '/components/search':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SearchBar.kt',
  '/components/menu':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Menu.kt',
  '/components/selection':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Checkbox.kt',
  '/components/slider':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Slider.kt',
  '/components/list':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ListItem.kt',
  '/components/tabs':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TabRow.kt',
  '/components/navigation-rail':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/NavigationRail.kt',
  '/components/app-bar':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AppBar.kt',
  '/components/carousel':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/carousel/Carousel.kt',
  '/components/pull-to-refresh':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/pulltorefresh/PullToRefresh.kt',
  '/components/tooltip':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Tooltip.kt',
  '/components/bottom-sheet':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ModalBottomSheet.kt',
  '/components/date-picker':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/DatePicker.kt',
  '/components/time-picker':
    'https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TimePicker.kt',
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
