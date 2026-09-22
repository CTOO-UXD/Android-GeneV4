# Dialog

模态对话框。确认类场景用 `AlertDialog`；需要自定义布局时用带 `content` 的对话框变体（见源码）。

## 样式

| 元素 | 参数 | 说明 |
|---|---|---|
| 标题 | `title` | 简短标题 |
| 正文 | `text` | 说明文案 |
| 确认 | `confirmButton` | 主操作，常用 `TextButton` |
| 取消 | `dismissButton` | 次要操作 |
| 关闭 | `onDismissRequest` | 点外部 / 返回 |

## 示例

```kotlin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.genev4.AlertDialog
import com.genev4.Text
import com.genev4.TextButton

var open by remember { mutableStateOf(true) }

if (open) {
    AlertDialog(
        onDismissRequest = { open = false },
        title = { Text("确认删除？") },
        text = { Text("删除后无法恢复。") },
        confirmButton = {
            TextButton(onClick = { open = false }) { Text("删除") }
        },
        dismissButton = {
            TextButton(onClick = { open = false }) { Text("取消") }
        },
    )
}
```

须包在 `MaterialTheme` 内。

## API

见 [`AlertDialog.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AlertDialog.kt)。
