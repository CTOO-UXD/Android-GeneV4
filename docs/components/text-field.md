---
title: TextField
parent: Components
nav_order: 2
permalink: /components/text-field/
---

# TextField

单行/多行文本输入。填充与描边是两种样式；错误态用 `isError`，不要换一个「红色输入框」组件。

## 样式

| 变体 | Composable | 何时用 |
|---|---|---|
| 填充 | `TextField` | 表单主输入 |
| 描边 | `OutlinedTextField` | 更轻的边框样式 |
| 错误 | `isError = true` + `supportingText` | 校验失败 |
| 密码 | `SecureTextField` / `OutlinedSecureTextField` | 密文输入 |

## 示例

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.OutlinedTextField
import com.genev4.Text
import com.genev4.TextField

var filled by remember { mutableStateOf("") }
var outlined by remember { mutableStateOf("") }

TextField(
    value = filled,
    onValueChange = { filled = it },
    label = { Text("填充") },
    modifier = Modifier.fillMaxWidth(),
)

OutlinedTextField(
    value = outlined,
    onValueChange = { outlined = it },
    label = { Text("描边") },
    isError = outlined == "error",
    supportingText = {
        if (outlined == "error") Text("校验失败提示")
    },
    modifier = Modifier.fillMaxWidth(),
)
```

须包在 `MaterialTheme` 内。

## API

见 [`TextField.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TextField.kt)、[`OutlinedTextField.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/OutlinedTextField.kt)。常用：`value` / `onValueChange`、`label`、`isError`、`supportingText`、`enabled`、`readOnly`。
