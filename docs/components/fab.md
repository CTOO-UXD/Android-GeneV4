# FAB

浮动操作按钮，放页面上最主要的一个动作。

## Types

![FAB](/components/fab.png)

## Usage

```kotlin
import com.genev4.ExtendedFloatingActionButton
import com.genev4.FloatingActionButton
import com.genev4.LargeFloatingActionButton
import com.genev4.SmallFloatingActionButton
import com.genev4.Text

SmallFloatingActionButton(onClick = { }) { Text("小") }
FloatingActionButton(onClick = { }) { Text("+") }
LargeFloatingActionButton(onClick = { }) { Text("大") }
ExtendedFloatingActionButton(onClick = { }) { Text("扩展") }
```

须包在 `MaterialTheme` 内。通常放在 `Scaffold` 的 `floatingActionButton`。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 小 | `SmallFloatingActionButton` | 空间紧 |
| 默认 | `FloatingActionButton` | 常规主操作 |
| 大 | `LargeFloatingActionButton` | 需要更大点击区域 |
| 扩展 | `ExtendedFloatingActionButton` | 图标加文字 |

## API

见 [`FloatingActionButton.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/FloatingActionButton.kt)。常用：`onClick`、`containerColor`、`content`。
