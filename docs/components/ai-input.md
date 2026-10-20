# AiInput

用来发起对话的输入条。宽屏用底栏，窄屏用上下两行的容器。语音和思考是状态，不要另做一个输入框。

悬停和焦点随指针出现，不是单独的参数，下面的图不单独拍这两态。页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Types

### 底栏

空内容时发送禁用。有文字时出现清除，发送可用。思考时文字收成一行并省略，清除变灰，发送变成停止。

![底栏](/components/ai-input.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.AiInput
import com.genev4.AiInputLayout
import com.genev4.AiInputPhase

AiInput(
    value = "",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "Help me find travel inspiration for Italy on a budget. I will be traveling with three adults and two children.",
    onValueChange = {},
    onSend = {},
    onStop = {},
    phase = AiInputPhase.Thinking,
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)
```

### 容器

窄屏把文字放在上面，加号、麦克风和发送放在下面。发送在卡片内。

![容器](/components/ai-input-container.png)

```kotlin
AiInput(
    value = "",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.Container,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.Container,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "Help me find travel inspiration for Italy on a budget. I will be traveling with three adults and two children.",
    onValueChange = {},
    onSend = {},
    onStop = {},
    phase = AiInputPhase.Thinking,
    layout = AiInputLayout.Container,
    modifier = Modifier.fillMaxWidth(),
)
```

### 听写 · 底栏

正在听时描边换成渐变，麦克风填充，发送保持禁用，不显示清除。有识别文字时仍是同一状态。超过可见行数后在文字右侧滚动。

![底栏听写](/components/ai-input-listening.png)

```kotlin
AiInput(
    value = "",
    onValueChange = {},
    onSend = {},
    phase = AiInputPhase.Listening,
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    phase = AiInputPhase.Listening,
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "Help me find travel inspiration for Italy on a budget. I will be traveling with three adults and two children. We are looking for good food, good times and good scenery. Help me find travel inspiration for Italy on a budget. I will be traveling with three adults and two children. We are looking for good food, good times and good scenery.",
    onValueChange = {},
    onSend = {},
    phase = AiInputPhase.Listening,
    layout = AiInputLayout.BottomBar,
    modifier = Modifier.fillMaxWidth(),
)
```

### 听写 · 容器

![容器听写](/components/ai-input-container-listening.png)

```kotlin
AiInput(
    value = "",
    onValueChange = {},
    onSend = {},
    phase = AiInputPhase.Listening,
    layout = AiInputLayout.Container,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    phase = AiInputPhase.Listening,
    layout = AiInputLayout.Container,
    modifier = Modifier.fillMaxWidth(),
)
```

### 附件和多行 · 底栏

`files` 里的文件排成芯片，放不下就换行。图片用 `attachments` 画在芯片后面。默认最多露出 3 行，再长就滚动。

![底栏附件和多行](/components/ai-input-attachments.png)

```kotlin
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import com.genev4.AiInputFile
import com.genev4.AiInputImageAttachment

val files = listOf(
    AiInputFile("file-1", "File Name", "File Type"),
    AiInputFile("file-2", "File Name", "File Type"),
    AiInputFile("file-3", "File Name", "File Type"),
    AiInputFile("file-4", "File Name", "File Type"),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.BottomBar,
    files = files,
    modifier = Modifier.fillMaxWidth(),
)

AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.BottomBar,
    attachments = {
        listOf(0xFF8EB4FF, 0xFFC4B5FD, 0xFFF5C4D4, 0xFFB7E4C7).forEach { color ->
            AiInputImageAttachment(
                painter = ColorPainter(Color(color)),
                contentDescription = null,
                onRemove = {},
            )
        }
    },
    modifier = Modifier.fillMaxWidth(),
)
```

### 附件和多行 · 容器

窄屏上芯片和图片会再换一行。

![容器附件和多行](/components/ai-input-container-attachments.png)

```kotlin
AiInput(
    value = "This is input text",
    onValueChange = {},
    onSend = {},
    layout = AiInputLayout.Container,
    files = files,
    modifier = Modifier.fillMaxWidth(),
)
```

## Usage

传入 `files` / `onFilesChange` 后，点加号会打开系统文件选择器，选中的真实文件会显示成芯片。组件不负责把文件发到服务器；在 `onSend` 里用 `files` 的 `uri`、`name`、`type` 上传即可。图片缩略图继续放在 `attachments`。

```kotlin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.genev4.AiInput
import com.genev4.AiInputFile
import com.genev4.AiInputLayout
import com.genev4.AiInputPhase

var prompt by remember { mutableStateOf("") }
var phase by remember { mutableStateOf(AiInputPhase.Text) }
var files by remember { mutableStateOf(emptyList<AiInputFile>()) }

AiInput(
    value = prompt,
    onValueChange = { prompt = it },
    onSend = {
        // 在这里把 prompt 和 files 发到你的接口
        phase = AiInputPhase.Thinking
    },
    onStop = { phase = AiInputPhase.Text },
    onClear = { prompt = "" },
    phase = phase,
    layout = AiInputLayout.BottomBar,
    files = files,
    onFilesChange = { files = it },
)
```

## Spec

| 变体 | 参数 | 何时用 |
|---|---|---|
| 底栏 | `layout = BottomBar`（默认） | 宽屏一行：加号、输入、麦克风在卡片内，发送在外 |
| 容器 | `layout = Container` | 窄屏：文字在上，操作行在下，发送在卡片内 |
| 语音 | `phase = Listening` | 正在听，发送保持禁用，不显示清除 |
| 思考 | `phase = Thinking` | 正在生成，文字收成一行，清除禁用，发送变成停止 |
| 多行 | `maxLines`（默认 3） | 露出这么多行，更长的内容在文字右侧滚动 |
| 选文件 | `files` + `onFilesChange` | 加号打开系统选择器，芯片显示真实文件 |
| 图片 | `attachments` | 缩略图画在 `files` 后面，用 `AiInputImageAttachment` |
| 工具条 | `toolbar` | 加号后面的操作，空则不显示 |

悬停是卡片上的一层浅色。焦点是沿卡片圆角的一圈描边。空内容时发送禁用。每个 `AiInput` 使用各自的 `files` 状态。

## API

见 [`AiInput.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AiInput.kt)。常用：`value` / `onValueChange`、`onSend`、`phase`、`layout`、`maxLines`、`files` / `onFilesChange`、`attachments`、`disclaimer`。
