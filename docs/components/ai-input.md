# AiInput

用来发起对话的输入条。宽屏用底栏，窄屏用上下两行的容器。语音和思考是状态，不要另做一个输入框。

## Types

![AiInput](/components/ai-input.png)

## Usage

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

传入 `files` / `onFilesChange` 后，点加号会打开系统文件选择器，选中的真实文件会显示成芯片。组件不负责把文件发到服务器；在 `onSend` 里用 `files` 的 `uri`、`name`、`type` 上传即可。页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | 参数 | 何时用 |
|---|---|---|
| 底栏 | `layout = BottomBar`（默认） | 宽屏一行：加号、输入、麦克风在卡片内，发送在外 |
| 容器 | `layout = Container` | 窄屏：文字在上，操作行在下，发送在卡片内 |
| 语音 | `phase = Listening` | 正在听，发送保持禁用 |
| 思考 | `phase = Thinking` | 正在生成，发送变成停止 |
| 选文件 | `files` + `onFilesChange` | 加号打开系统选择器，芯片显示真实文件 |
| 自定义附件 | `attachments` | 额外的图片缩略图等，画在 `files` 后面 |
| 工具条 | `toolbar` | 加号后面的操作，空则不显示 |

悬停和焦点随交互出现，不是单独的参数。空内容时发送禁用。每个 `AiInput` 使用各自的 `files` 状态。

## API

见 [`AiInput.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AiInput.kt)。常用：`value` / `onValueChange`、`onSend`、`phase`、`layout`、`files` / `onFilesChange`、`disclaimer`。
