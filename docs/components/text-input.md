# TextInput

单行短输入、多行长文本，以及带行内操作的输入。标签画在框内。悬停、按下和焦点随交互出现，不要为它们各做一个组件。错误态用 `isError`。

Material 的填充和描边输入仍然是 [TextField](/components/text-field)。

## Types

### 单行

从上到下：空标签、placeholder、聚焦已填写（带清除）、聚焦错误（带清除）、辅助说明、下拉、禁用。清除图标只在聚焦时出现。

![单行](/components/text-input.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.TextInput

var name by remember { mutableStateOf("") }

TextInput(
    value = name,
    onValueChange = { name = it },
    label = "姓名",
    placeholder = "怎么称呼",
    isError = name == "error",
    supportingText = if (name == "error") "校验失败提示" else "选填",
    modifier = Modifier.fillMaxWidth(),
)
```

### 多行

从上到下：空标签、已填写、无标签、错误。

![多行](/components/text-area.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.TextArea

var note by remember { mutableStateOf("") }

TextArea(
    value = note,
    onValueChange = { note = it },
    label = "备注",
    modifier = Modifier.fillMaxWidth(),
)
```

### 行内操作

从上到下：空内容（发送禁用）、聚焦已填写（清除 + 描边发送）、聚焦错误（清除 + 红色描边发送）。

![行内操作](/components/action-input.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.ActionInput

var message by remember { mutableStateOf("") }

ActionInput(
    value = message,
    onValueChange = { message = it },
    onAction = { message = "" },
    label = "发送",
    modifier = Modifier.fillMaxWidth(),
)
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | 入口 | 何时用 |
|---|---|---|
| 单行 | `TextInput` | 姓名、邮箱、数字 |
| 多行 | `TextArea` | 评论、备注、说明 |
| 行内操作 | `ActionInput` | 写一句就提交 |
| 错误 | `isError = true` + `supportingText` | 校验失败，带错误图标 |
| 辅助说明 | `supportingText` | 框下方的说明 |
| 清除 | `showClear`（默认开） | 聚焦后出现灰色 ×，点一下清空 |
| 发送 | `ActionInput` | 描边纸飞机；错误时红色 |
| 下拉 | `showDropdown` | 箭头。展开、聚焦或按下时朝上 |
| 隐藏标签 | `TextArea(showLabel = false)` | 多行框不要标签 |
| 禁用 | `enabled = false` | 整块淡到 38% |

空且未聚焦、又没有 placeholder 时，标签用正文大号并垂直居中。有 placeholder、有内容或聚焦后，标签缩成小号，贴在文字上面。单行高 56，圆角 12，描边保持 1dp。多行至少 96，文字变长后框跟着长。操作按钮在内容为空时保持禁用。

## API

见 [`TextInput.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/TextInput.kt)。常用：`value` / `onValueChange`、`label`、`placeholder`、`supportingText`、`isError`、`showClear`、`showDropdown`、`enabled`。`ActionInput` 另有 `onAction`。
