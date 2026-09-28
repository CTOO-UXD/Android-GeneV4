# NavigationRail

侧栏、短底栏和常驻抽屉。手机底栏见 [NavigationBar](/components/navigation-bar)。

## Types

![NavigationRail](/components/navigation-rail.png)

## Usage

```kotlin
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.ui.unit.dp
import com.genev4.NavigationRail
import com.genev4.NavigationRailItem
import com.genev4.Text

NavigationRail(windowInsets = WindowInsets(0.dp)) {
    NavigationRailItem(
        selected = true,
        onClick = { },
        icon = { Text("家") },
        label = { Text("家") },
    )
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。短底栏用 `ShortNavigationBar` + `ShortNavigationBarItem`。常驻抽屉用 `PermanentDrawerSheet` + `NavigationDrawerItem`。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 侧栏 | `NavigationRail` | 竖屏左侧目的地 |
| 短底栏 | `ShortNavigationBar` | 更矮的底部目的地 |
| 抽屉 | `PermanentDrawerSheet` | 一直可见的目的地列表 |

## API

见 [`NavigationRail.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/NavigationRail.kt)、[`ShortNavigationBar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ShortNavigationBar.kt)、[`NavigationDrawer.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/NavigationDrawer.kt)。
