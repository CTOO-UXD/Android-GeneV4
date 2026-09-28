# BottomSheet

从底部升起的菜单，用来确认或补充一小段操作。

## Types

![BottomSheet](/components/bottom-sheet.png)

## Usage

```kotlin
import com.genev4.Button
import com.genev4.ExperimentalMaterial3Api
import com.genev4.ModalBottomSheet
import com.genev4.Text
import com.genev4.rememberModalBottomSheetState

@OptIn(ExperimentalMaterial3Api::class)
ModalBottomSheet(
    onDismissRequest = { },
    sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
) {
    Text("底部菜单")
    Button(onClick = { }) { Text("知道了") }
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。关掉时在 `onDismissRequest` 里把控制显示的状态设为 false。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 模态 | `ModalBottomSheet` | 盖住当前页面的短流程 |

## API

见 [`ModalBottomSheet.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ModalBottomSheet.kt)。
