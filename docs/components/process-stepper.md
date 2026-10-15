# ProcessStepper

分步进度。标出用户在一条短流程里走到哪一步。横排标签在圆点下方，竖排标签在圆点右侧。圆点可以是序号、图标或空心。完成的那一步一律画勾。

连续进度仍然是 [Slider](/components/slider) 里的线性进度和环形进度。

## Types

每张图上面是带标签，下面或右侧是不带标签。四步分别是完成、进行中、未开始、不可用。

### 横排 · 数字

![横排数字](/components/process-stepper-horizontal-number.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepper

val labels = listOf("填写", "确认", "支付", "完成")
val current = 1

ProcessStepper(
    steps = labels.mapIndexed { index, label ->
        ProcessStep(
            label = label,
            state = when {
                index < current -> ProcessStepState.Complete
                index == current -> ProcessStepState.InProgress
                else -> ProcessStepState.Enabled
            },
        )
    },
    modifier = Modifier.fillMaxWidth(),
)
```

### 横排 · 图标

图标由每一步的 `icon` 传入。完成态不画这个图标，改画勾。

![横排图标](/components/process-stepper-horizontal-icon.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepType
import com.genev4.ProcessStepper
import com.genev4.icons.Icons
import com.genev4.icons.filled.Home

ProcessStepper(
    steps = listOf(
        ProcessStep("填写", ProcessStepState.Complete, Icons.Filled.Home),
        ProcessStep("确认", ProcessStepState.InProgress, Icons.Filled.Home),
    ),
    type = ProcessStepType.Icon,
    modifier = Modifier.fillMaxWidth(),
)
```

### 横排 · 空心

进行中的空心圆点里面有一颗实心圆。完成态仍然是勾。

![横排空心](/components/process-stepper-horizontal-empty.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepType
import com.genev4.ProcessStepper

ProcessStepper(
    steps = listOf(
        ProcessStep("填写", ProcessStepState.Complete),
        ProcessStep("确认", ProcessStepState.InProgress),
        ProcessStep("支付", ProcessStepState.Enabled),
    ),
    type = ProcessStepType.Empty,
    modifier = Modifier.fillMaxWidth(),
)
```

### 竖排 · 数字

![竖排数字](/components/process-stepper-vertical-number.png)

```kotlin
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepper
import com.genev4.ProcessStepperOrientation

ProcessStepper(
    steps = listOf(
        ProcessStep("填写", ProcessStepState.Complete),
        ProcessStep("确认", ProcessStepState.InProgress),
        ProcessStep("支付", ProcessStepState.Enabled),
        ProcessStep("完成", ProcessStepState.Disabled),
    ),
    orientation = ProcessStepperOrientation.Vertical,
)
```

### 竖排 · 图标

![竖排图标](/components/process-stepper-vertical-icon.png)

```kotlin
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepType
import com.genev4.ProcessStepper
import com.genev4.ProcessStepperOrientation
import com.genev4.icons.Icons
import com.genev4.icons.filled.Home

ProcessStepper(
    steps = listOf(
        ProcessStep("填写", ProcessStepState.Complete, Icons.Filled.Home),
        ProcessStep("确认", ProcessStepState.InProgress, Icons.Filled.Home),
    ),
    orientation = ProcessStepperOrientation.Vertical,
    type = ProcessStepType.Icon,
)
```

### 竖排 · 空心

![竖排空心](/components/process-stepper-vertical-empty.png)

```kotlin
import com.genev4.ProcessStep
import com.genev4.ProcessStepState
import com.genev4.ProcessStepType
import com.genev4.ProcessStepper
import com.genev4.ProcessStepperOrientation

ProcessStepper(
    steps = listOf(
        ProcessStep("填写", ProcessStepState.Complete),
        ProcessStep("确认", ProcessStepState.InProgress),
        ProcessStep("支付", ProcessStepState.Enabled),
    ),
    orientation = ProcessStepperOrientation.Vertical,
    type = ProcessStepType.Empty,
)
```

`showLabels = false` 只留圆点和连线。横排需要有限宽度，一般加上 `Modifier.fillMaxWidth()`。

## Spec

| 项 | 值 |
|---|---|
| 圆点 | 24dp，全圆 |
| 描边 | 2dp。完成态是实心，没有描边 |
| 序号 | 12 / 16，Semibold，字距 0.25 |
| 标签 | 16 / 22，Semibold，字距 0.1。和圆点间距 8，横排右侧留 16 |
| 图标、勾 | 16dp |
| 空心进行中 | 圆点里再放一颗 12dp 实心圆 |
| 完成连线 | 3dp，`primary` |
| 进行中、未开始连线 | 1dp，`primary` |
| 不可用连线 | 1dp，`outline` |
| 连线最短 | 32dp，对准圆心。最后一步没有连线 |
| 竖排 | 圆点行左侧内收 4dp。无标签宽 28dp |

建议 3 到 10 步。标签保持短，长说明放在组件外面。同一条流程里不要混用数字、图标和空心。

完成、进行中、未开始的标签和未开始圆点用 `primary`。进行中和完成的圆点内容用 `onPrimary`。不可用用 `outline` 和 `onSurfaceVariant`。

## API

见 [`ProcessStepper.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ProcessStepper.kt)。
