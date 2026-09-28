# AppBar

页面顶栏和底栏。和内容区一起用时，优先放进 [Scaffold](/components/scaffold)。

## Types

![AppBar](/components/app-bar.png)

## Usage

```kotlin
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.ui.unit.dp
import com.genev4.BottomAppBar
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.TopAppBar

TopAppBar(
    title = { Text("顶栏") },
    windowInsets = WindowInsets(0.dp),
)
BottomAppBar(
    windowInsets = WindowInsets(0.dp),
    actions = {
        TextButton(onClick = { }) { Text("归档") }
    },
)
```

须包在 `MaterialTheme` 内。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 顶栏 | `TopAppBar` | 标题和操作 |
| 底栏 | `BottomAppBar` | 底部一组动作 |

## API

见 [`AppBar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AppBar.kt)。常用：`title`、`navigationIcon`、`actions`、`windowInsets`。
