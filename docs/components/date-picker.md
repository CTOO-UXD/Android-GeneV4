# DatePicker

选择一天。状态用 `rememberDatePickerState()`。

## Types

![DatePicker](/components/date-picker.png)

## Usage

```kotlin
import com.genev4.DatePicker
import com.genev4.ExperimentalMaterial3Api
import com.genev4.rememberDatePickerState

@OptIn(ExperimentalMaterial3Api::class)
DatePicker(state = rememberDatePickerState())
```

须包在 `MaterialTheme` 内。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 日历 | `DatePicker` | 选一个日期 |

## API

见 [`DatePicker.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/DatePicker.kt)。选中值在 `state.selectedDateMillis`。
