# Modal

Gene 的模态家族。确认、加载、Hero、功能引导各是一个入口，复制对应那一块的代码。Material 的确认框仍然是 [Dialog](/components/dialog)。页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Types

### 确认

窄屏最大 448，宽屏优先 640。左列 Narrow、右列 Wide；每列六种语义。Neutral、System、Destructive 没有右上角关闭，带深色「取消」。Informational、Success、Error 有关闭，没有取消：Informational 左侧是「不再提醒」，Error 左侧是「更多详情」，Success 只有主按钮。取消和关闭都是 `onSurface`，不是主色。只有 Destructive 的主按钮是红色。

![确认](/components/modal-default.png)

```kotlin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.genev4.Modal
import com.genev4.ModalDefaults
import com.genev4.ModalVariant
import com.genev4.ModalWidth
import com.genev4.Text

var open by remember { mutableStateOf(true) }

if (open) {
    Modal(
        onDismissRequest = { open = false },
        width = ModalWidth.Narrow, // 或 Wide
        variant = ModalVariant.Destructive,
        showClose = false,
        title = { Text("删除行程？") },
        text = { Text("删除后无法恢复。") },
        confirmButton = {
            ModalDefaults.ConfirmButton(
                onClick = { open = false },
                variant = ModalVariant.Destructive,
            ) { Text("删除") }
        },
        dismissButton = {
            ModalDefaults.TextAction(onClick = { open = false }) { Text("取消") }
        },
    )
}
```

### 加载

从上到下是 Large Modal、Large Inline、Medium Modal、Medium Inline，再是 Small Modal / Small Inline。`Modal` 带卡片阴影和取消按钮；`Inline` 嵌在页面里，没有遮罩和卡片底。Large 上下排版，Medium 图标在左、文案在右。

![加载](/components/modal-loading.png)

```kotlin
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.genev4.Button
import com.genev4.LoadingModal
import com.genev4.LoadingModalContainer
import com.genev4.LoadingModalSize
import com.genev4.Text

var open by remember { mutableStateOf(true) }

LoadingModal(
    onDismissRequest = { open = false },
    size = LoadingModalSize.Large,
    container = LoadingModalContainer.Modal,
    title = { Text("正在同步") },
    text = { Text("请稍等，行程马上就好。") },
    cancelButton = { Button(onClick = { open = false }) { Text("取消") } },
)

LoadingModal(
    onDismissRequest = { open = false },
    size = LoadingModalSize.Medium,
    container = LoadingModalContainer.Inline,
    title = { Text("正在上传") },
    text = { Text("文件会保存在这台设备上。") },
)

LoadingModal(
    onDismissRequest = { open = false },
    size = LoadingModalSize.Small,
)
```

### Hero

安卓文档只展示 Mobile（316）。图放在 `hero` 槽里。

![Hero](/components/modal-hero.png)

```kotlin
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.genev4.Button
import com.genev4.HeroModal
import com.genev4.HeroModalSize
import com.genev4.MaterialTheme
import com.genev4.Text
import com.genev4.TextButton

var open by remember { mutableStateOf(true) }

if (open) {
    HeroModal(
        onDismissRequest = { open = false },
        size = HeroModalSize.Mobile,
        hero = {
            Box(
                Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center,
            ) { Text("Feature") }
        },
        title = { Text("认识新的行程") },
        text = { Text("把一天的安排收在同一张卡片里。") },
        confirmButton = { Button(onClick = { open = false }) { Text("开始") } },
        dismissButton = { TextButton(onClick = { open = false }) { Text("稍后") } },
    )
}
```

### 功能引导

顶图有 16 内边距和 12 圆角，不铺满卡片。指示箭头贴在圆角外面，底边 42、伸出约 24，用 `caretSide` 和 `caretAlign`（前、中、后）定位。左右滑换步，圆点只跟着 `step`。右下角按钮和确认框一样，放在 `confirmButton` 里，文字由调用方写，不看当前是第几页。截图左侧是文字按钮，右侧把同一槽换成 `ModalDefaults.TourActionButton`。要钉在某个控件旁边，用 `FeatureTourBox`。

![功能引导](/components/modal-tour.png)

```kotlin
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.genev4.Button
import com.genev4.FeatureTour
import com.genev4.MaterialTheme
import com.genev4.ModalDefaults
import com.genev4.ModalCaretAlign
import com.genev4.ModalCaretSide
import com.genev4.Text

var open by remember { mutableStateOf(true) }

if (open) {
    FeatureTour(
        onDismissRequest = { open = false },
        caretSide = ModalCaretSide.Start,
        caretAlign = ModalCaretAlign.Center,
        hero = {
            Box(
                Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center,
            ) { Text("Feature") }
        },
        title = { Text("从这里添加行程") },
        text = { Text("左右滑可以看到下一步。") },
        step = 2,
        stepCount = 3,
        onNext = { /* 调用方自己把 step 加一 */ },
        confirmButton = { Button(onClick = { open = false }) { Text("知道了") } },
        // confirmButton = { ModalDefaults.TourActionButton(onClick = { open = false }) },
    )
}
```

## Spec

| 种类 | 入口 | 何时用 |
| --- | --- | --- |
| 确认 | `Modal` / `ModalCard` | Narrow / Wide × 六种语义。Destructive 主按钮用 error |
| 加载 | `LoadingModal` / `LoadingModalCard` | Large / Medium / Small。`Inline` 嵌在页面里，不挡页面 |
| Hero | `HeroModal` / `HeroModalCard` | 带顶部插图的引导或说明 |
| 功能引导 | `FeatureTour` / `FeatureTourCard` / `FeatureTourBox` | 指向界面某一处的分步引导 |

见 [`Modal.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Modal.kt)。常用：`Modal`、`LoadingModal`、`HeroModal`、`FeatureTour`、`FeatureTourBox`。
