import './styles/global.css'
import { styles as typescaleStyles } from '@material/web/typography/md-typescale-styles.js'
import { initTheme } from './lib/theme'
import './app'
import './theme-changer'

initTheme()
document.adoptedStyleSheets.push(typescaleStyles.styleSheet)
