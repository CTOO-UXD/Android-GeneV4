# List

列表行、徽章和分割线。滑动删除用 `SwipeToDismissBox` 包住一行。

## Types

![List](/components/list.png)

## Usage

```kotlin
import com.genev4.Badge
import com.genev4.BadgedBox
import com.genev4.HorizontalDivider
import com.genev4.ListItem
import com.genev4.Text

BadgedBox(badge = { Badge { Text("3") } }) {
    Text("收件箱")
}
ListItem(
    headlineContent = { Text("两行列表") },
    supportingContent = { Text("辅助说明") },
    trailingContent = { Text("12:30") },
)
HorizontalDivider()
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 徽章 | `BadgedBox` + `Badge` | 图标或文字上的数量 |
| 列表行 | `ListItem` | 标题、辅助文字、尾部 |
| 分割线 | `HorizontalDivider` / `VerticalDivider` | 分隔内容 |
| 滑动 | `SwipeToDismissBox` | 滑开后出现背景操作 |

## API

见 [`ListItem.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ListItem.kt)、[`Badge.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Badge.kt)、[`Divider.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Divider.kt)、[`SwipeToDismissBox.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SwipeToDismissBox.kt)。
