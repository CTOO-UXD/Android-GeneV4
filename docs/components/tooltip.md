# Tooltip

悬停或长按时出现的短说明。

## Types

![Tooltip](/components/tooltip.png)

## Usage

```kotlin
import com.genev4.Button
import com.genev4.ExperimentalMaterial3Api
import com.genev4.PlainTooltip
import com.genev4.Text
import com.genev4.TooltipAnchorPosition
import com.genev4.TooltipBox
import com.genev4.TooltipDefaults
import com.genev4.rememberTooltipState

@OptIn(ExperimentalMaterial3Api::class)
TooltipBox(
    positionProvider = TooltipDefaults.rememberTooltipPositionProvider(TooltipAnchorPosition.Above),
    tooltip = { PlainTooltip { Text("长按或悬停") } },
    state = rememberTooltipState(),
) {
    Button(onClick = { }) { Text("带提示的按钮") }
}
```

须包在 `MaterialTheme` 内。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 纯文本提示 | `TooltipBox` + `PlainTooltip` | 补充一个控件的含义 |

## API

见 [`Tooltip.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Tooltip.kt)。
