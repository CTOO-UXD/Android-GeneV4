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

## API

不写的用「不写时」那一列。带 `Card` 的入口是同一张卡片、不开弹窗，参数和对应的弹窗入口一样，另外用 `modifier` 定宽度。

### Modal

```kotlin
Modal(
    onDismissRequest = { open = false },
    confirmButton = {
        ModalDefaults.ConfirmButton(onClick = { open = false }, variant = ModalVariant.Neutral) {
            Text("确定")
        }
    },
    modifier = Modifier,
    dismissButton = {
        ModalDefaults.TextAction(onClick = { open = false }) { Text("取消") }
    },
    tertiaryButton = null,
    icon = null,
    title = { Text("标题") },
    subtitle = { Text("副标题") },
    text = { Text("正文") },
    showHeader = true,
    showIcon = true,
    showClose = false,
    width = ModalWidth.Narrow, // 或 Wide
    variant = ModalVariant.Neutral,
)
```

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `onDismissRequest` | 点外面、返回键，或点关闭 | 必填 |
| `confirmButton` | 右下角主按钮。用 `ModalDefaults.ConfirmButton`，或自己的 `Button` | 必填 |
| `modifier` | 加在卡片上 | 空 |
| `dismissButton` | 主按钮左边的取消。用 `ModalDefaults.TextAction` | 不画 |
| `tertiaryButton` | 底部最左侧。放「不再提醒」或「更多详情」 | 不画 |
| `icon` | 标题左侧的图标。传了就不用 `variant` 的默认图标 | 按 `variant` 画，Neutral 不画 |
| `title` | 标题 | 不画 |
| `subtitle` | 标题下的一行 | 不画 |
| `text` | 标题和底部之间的正文 | 不画 |
| `showHeader` | `false` 整段标题、图标、关闭都不画 | `true` |
| `showIcon` | `false` 不画左侧图标 | `true` |
| `showClose` | `false` 不画右上角关闭。关闭走 `onDismissRequest` | `true` |
| `width` | `Narrow`、`Wide` | `Narrow` |
| `variant` | 见下表 | `Neutral` |

`ModalCard` 多一个 `onClose`，默认空操作。弹窗版的关闭已经接到 `onDismissRequest`。

### ModalWidth

| 值 | 宽度 |
| --- | --- |
| `Narrow` | 优先 448，最大 448，最小 320 |
| `Wide` | 优先 640，最小 600，最大 1600 |

### ModalVariant

| 值 | 默认左侧图标 | `ConfirmButton` |
| --- | --- | --- |
| `Neutral` | 不画 | primary 填充 |
| `System` | 系统 | primary 填充 |
| `Informational` | 信息 | primary 填充 |
| `Success` | 成功 | primary 填充 |
| `Error` | 错误 | primary 填充。红色只在图标上 |
| `Destructive` | 警告 | error 填充 |

### ModalDefaults 的按钮

| 函数 | 做什么 | 参数 |
| --- | --- | --- |
| `ConfirmButton` | 填充主按钮 | `onClick`、`variant` 必填。`enabled` 默认 `true`。文案写在 content 里 |
| `TextAction` | 文字按钮，字色 `onSurface` | `onClick` 必填。`enabled` 默认 `true` |
| `TourActionButton` | 功能引导右下角 48 的圆形箭头 | `onClick` 必填。`enabled` 默认 `true`。没有文案 |

要别的尺寸、描边或浅色填充，把对应的 `Button` 放进同一个槽。

### LoadingModal

```kotlin
LoadingModal(
    onDismissRequest = { open = false },
    modifier = Modifier,
    size = LoadingModalSize.Large, // Medium、Small
    container = LoadingModalContainer.Modal, // 或 Inline
    phase = LoadingModalPhase.Progress, // 或 Success
    progress = null, // 0f..1f 为确定进度
    title = { Text("正在同步") },
    text = { Text("请稍等") },
    cancelButton = { Button(onClick = { open = false }) { Text("取消") } },
)
```

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `onDismissRequest` | 点外面或返回键。`Inline` 不挡页面，这个回调不会被遮罩触发 | 必填 |
| `size` | `Large`：图标在上。`Medium`：图标在左。`Small`：只有 48 的进度，不画标题和取消 | `Large` |
| `container` | `Modal`：弹窗，有阴影。`Inline`：嵌在页面里，没有遮罩和卡片底 | `Modal` |
| `phase` | `Progress`：转圈。`Success`：完成的勾 | `Progress` |
| `progress` | `0f` 到 `1f` 画确定进度。`null` 一直转 | `null` |
| `title` | 标题 | 不画 |
| `text` | 标题下的说明 | 不画 |
| `cancelButton` | 右下角取消。`Inline` 和 `Small` 不画 | 不画 |

### HeroModal

```kotlin
HeroModal(
    onDismissRequest = { open = false },
    hero = { /* 顶部图 */ },
    title = { Text("标题") },
    text = { Text("正文") },
    confirmButton = { Button(onClick = { open = false }) { Text("开始") } },
    dismissButton = { TextButton(onClick = { open = false }) { Text("稍后") } },
    size = HeroModalSize.Mobile, // Tablet、Desktop
    centered = true,
    showClose = true,
    footer = ModalFooter.Actions, // 或 Walkthrough
    step = 1,
    stepCount = 3,
    onPrevious = {},
    onNext = {},
)
```

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `onDismissRequest` | 点外面、返回键，或点关闭 | 必填 |
| `hero` | 顶部图 | 必填 |
| `title` | 标题 | 必填 |
| `text` | 标题下的正文 | 不画 |
| `confirmButton` | 主按钮。`Walkthrough` 时在圆点右边 | 不画 |
| `dismissButton` | 主按钮左边。只在 `footer = Actions` 时画 | 不画 |
| `size` | `Mobile` 316，按钮竖排。`Tablet` 500。`Desktop` 832。后两个按钮横排 | `Tablet` |
| `centered` | `true` 标题和正文居中。Mobile 始终靠左 | `true` |
| `showClose` | 关闭叠在图的右上角 | `true` |
| `footer` | `Actions`：取消加主按钮。`Walkthrough`：圆点加主按钮 | `Actions` |
| `step` | 当前步，从 1 开始。只影响圆点 | `1` |
| `stepCount` | 总步数，圆点最多 5 个 | `3` |
| `onPrevious` / `onNext` | 左右滑时调用。组件不自己改 `step` | 空操作 |

`HeroModalCard` 还可以 `showHero = false` 去掉顶图。关闭改走 `onClose`。

### FeatureTour

```kotlin
FeatureTour(
    onDismissRequest = { open = false },
    title = { Text("标题") },
    text = { Text("正文") },
    hero = { /* 可选顶图 */ },
    confirmButton = { Button(onClick = { open = false }) { Text("知道了") } },
    dismissButton = null,
    caretSide = ModalCaretSide.Start, // Top、Bottom、End
    caretAlign = ModalCaretAlign.Center, // Start、End
    centered = false,
    showClose = true,
    footer = ModalFooter.Walkthrough, // 或 Actions
    step = 1,
    stepCount = 3,
    onPrevious = {},
    onNext = {},
)
```

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `onDismissRequest` | 点外面、返回键，或点关闭 | 必填 |
| `title` | 标题 | 必填 |
| `text` | 正文 | 不画 |
| `hero` | 顶图。有 16 内边距、12 圆角，不铺满卡片 | 不画 |
| `confirmButton` | 右下角。文字按钮或 `ModalDefaults.TourActionButton`。不负责翻页 | 不画 |
| `dismissButton` | 主按钮左边。只在 `footer = Actions` 时画 | 不画 |
| `caretSide` | 箭头长在哪一边：`Top`、`Bottom`、`Start`、`End` | `Start` |
| `caretAlign` | 沿这条边的位置：`Start`、`Center`、`End` | `Center` |
| `centered` | 标题和正文居中 | `false` |
| `showClose` | 有顶图时叠在图的右上角，没有顶图时在卡片右上角 | `true` |
| `footer` | `Walkthrough`：圆点加主按钮，可左右滑。`Actions`：取消加主按钮，不能滑 | `Walkthrough` |
| `step` / `stepCount` | 圆点。最多 5 个 | `1` / `3` |
| `onPrevious` / `onNext` | 滑过约 48dp 时调用。把 `step` 加减一是调用方的事 | 空操作 |

`walkthroughArrows` 只为旧调用保留，不画箭头。翻页是左右滑。

钉在某个控件旁边用 `FeatureTourBox`，不挡页面。

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `expanded` | `true` 显示引导卡片 | 必填 |
| `onDismissRequest` | 点外面关闭 | 必填 |
| `caretSide` | 箭头指向锚点的那一边 | `Bottom` |
| `caretAlign` | `Start`、`Center`、`End` | `Center` |
| `tour` | 里面放 `FeatureTourCard` | 必填 |
| `content` | 被指向的控件 | 必填 |
