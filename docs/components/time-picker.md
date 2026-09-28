# TimePicker

选择时分。状态用 `rememberTimePickerState()`。

## Types

![TimePicker](/components/time-picker.png)

## Usage

```kotlin
import com.genev4.ExperimentalMaterial3Api
import com.genev4.TimePicker
import com.genev4.rememberTimePickerState

@OptIn(ExperimentalMaterial3Api::class)
TimePicker(
    state = rememberTimePickerState(initialHour = 9, initialMinute = 30, is24Hour = true),
)
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 时钟 | `TimePicker` | 选一个时间 |

## API

见 [`TimePicker.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TimePicker.kt)。当前值在 `state.hour` 和 `state.minute`。
