# Snackbar

底部短时提示，用于操作结果反馈（已保存、网络错误等）。通常配合 `SnackbarHost` + `Scaffold`。

## 样式

| 用法 | 说明 |
|---|---|
| 仅文案 | 短消息 |
| 带操作 | `actionLabel` / action 内容（如「撤销」） |
| 挂到 Scaffold | `snackbarHost = { SnackbarHost(hostState) }` |

## 示例

![组件效果](/components/snackbar.png)

```kotlin
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.genev4.Button
import com.genev4.Scaffold
import com.genev4.SnackbarDuration
import com.genev4.SnackbarHost
import com.genev4.SnackbarHostState
import com.genev4.Text
import kotlinx.coroutines.launch

val hostState = remember { SnackbarHostState() }
val scope = rememberCoroutineScope()

Scaffold(
    snackbarHost = { SnackbarHost(hostState) },
) { _ ->
    Button(
        onClick = {
            scope.launch {
                hostState.showSnackbar(
                    message = "已保存",
                    actionLabel = "撤销",
                    duration = SnackbarDuration.Short,
                )
            }
        },
    ) {
        Text("触发提示")
    }
}
```

## API

见 [`Snackbar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Snackbar.kt)、[`SnackbarHost.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SnackbarHost.kt)。
