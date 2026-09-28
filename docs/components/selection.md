# Selection

勾选、开关和单选。三态复选用于「部分子项已选」。

## Types

![Selection](/components/selection.png)

## Usage

```kotlin
import androidx.compose.ui.state.ToggleableState
import com.genev4.Checkbox
import com.genev4.RadioButton
import com.genev4.Switch
import com.genev4.Text
import com.genev4.TriStateCheckbox

Checkbox(checked = true, onCheckedChange = { })
TriStateCheckbox(state = ToggleableState.Indeterminate, onClick = { })
Switch(checked = true, onCheckedChange = { })
RadioButton(selected = true, onClick = { })
```

须包在 `MaterialTheme` 内。禁用时把回调设为 `null` 并传 `enabled = false`。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 复选 | `Checkbox` | 多项可同时选 |
| 三态 | `TriStateCheckbox` | 父项反映子项的部分选中 |
| 开关 | `Switch` | 立即生效的开/关 |
| 单选 | `RadioButton` | 一组里只选一个 |

## API

见 [`Checkbox.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Checkbox.kt)、[`Switch.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Switch.kt)、[`RadioButton.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/RadioButton.kt)。
