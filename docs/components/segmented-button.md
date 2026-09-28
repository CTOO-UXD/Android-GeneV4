# SegmentedButton

同一行里互斥或多选的分段。单选用 `selected`，多选用 `checked`。

## Types

![SegmentedButton](/components/segmented-button.png)

## Usage

```kotlin
import com.genev4.MultiChoiceSegmentedButtonRow
import com.genev4.SegmentedButton
import com.genev4.SegmentedButtonDefaults
import com.genev4.SingleChoiceSegmentedButtonRow
import com.genev4.Text

val labels = listOf("列表", "地图", "日历")
SingleChoiceSegmentedButtonRow {
    labels.forEachIndexed { index, label ->
        SegmentedButton(
            selected = index == 0,
            onClick = { },
            shape = SegmentedButtonDefaults.itemShape(index, labels.size),
            label = { Text(label) },
        )
    }
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。多选换成 `MultiChoiceSegmentedButtonRow`，按钮参数用 `checked` / `onCheckedChange`。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 单选 | `SingleChoiceSegmentedButtonRow` | 只能选一段 |
| 多选 | `MultiChoiceSegmentedButtonRow` | 可以同时选多段 |

## API

见 [`SegmentedButton.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SegmentedButton.kt)。`itemShape` 负责首尾圆角。
