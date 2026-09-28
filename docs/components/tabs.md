# Tabs

同一页面里的主次分组。主标签用 `PrimaryTabRow`，次级用 `SecondaryTabRow`。

## Types

![Tabs](/components/tabs.png)

## Usage

```kotlin
import com.genev4.PrimaryTabRow
import com.genev4.Tab
import com.genev4.Text

val labels = listOf("概览", "行程", "花费")
PrimaryTabRow(selectedTabIndex = 0) {
    labels.forEachIndexed { index, label ->
        Tab(selected = index == 0, onClick = { }, text = { Text(label) })
    }
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。次级标签换成 `SecondaryTabRow`。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 主标签 | `PrimaryTabRow` | 页面级分区 |
| 次标签 | `SecondaryTabRow` | 主标签下面的再分组 |

## API

见 [`TabRow.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TabRow.kt)、[`Tab.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Tab.kt)。
