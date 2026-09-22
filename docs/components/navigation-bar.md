---
title: NavigationBar
parent: Components
nav_order: 4
permalink: /components/navigation-bar/
---

# NavigationBar

底部导航栏，通常放在 `Scaffold(bottomBar = { ... })` 里。每一项用 `NavigationBarItem`。

## 样式

| 状态 | 参数 | 说明 |
|---|---|---|
| 选中 | `selected = true` | 当前页 |
| 未选中 | `selected = false` | 其他页 |
| 图标 + 文案 | `icon`、`label` | 常规底栏项 |

## 示例

```kotlin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.genev4.NavigationBar
import com.genev4.NavigationBarItem
import com.genev4.Text

var tab by remember { mutableIntStateOf(0) }
val labels = listOf("控件", "旅程", "个人")

NavigationBar {
    labels.forEachIndexed { index, label ->
        NavigationBarItem(
            selected = tab == index,
            onClick = { tab = index },
            icon = { Text(label.take(1)) },
            label = { Text(label) },
        )
    }
}
```

完整用法见仓库 `catalog` 的 [`CatalogApp.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/catalog/src/main/java/com/genev4/catalog/CatalogApp.kt)。

## API

见 [`NavigationBar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/NavigationBar.kt)。
