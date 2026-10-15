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
| 连线最短 | 32dp，对准圆心。两端各留 4dp，不贴到圆点。最后一步没有连线 |
| 竖排 | 圆点行左侧内收 4dp。无标签宽 28dp |

建议 3 到 10 步。标签保持短，长说明放在组件外面。同一条流程里不要混用数字、图标和空心。

完成、进行中、未开始的标签和未开始圆点用 `primary`。进行中和完成的圆点内容用 `onPrimary`。不可用用 `outline` 和 `onSurfaceVariant`。

## API

源码在 [`ProcessStepper.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ProcessStepper.kt)。组件一共就这些参数。不写的用「不写时」那一列；要换效果，改成同一格里列出的其他值。

### ProcessStepper

| 参数 | 可以传 | 不写时 |
|---|---|---|
| `steps` | `List<ProcessStep>`。建议 3 到 10 步。空列表什么都不画 | 必填 |
| `modifier` | 任意 `Modifier`。横排加上 `Modifier.fillMaxWidth()` | `Modifier` |
| `orientation` | `ProcessStepperOrientation.Horizontal`：标签在圆点下方。`ProcessStepperOrientation.Vertical`：标签在圆点右侧 | `Horizontal` |
| `type` | `ProcessStepType.Number`：序号。`ProcessStepType.Icon`：用每一步的 `icon`。`ProcessStepType.Empty`：空心。完成的那一步都画勾，不受这里影响 | `Number` |
| `showLabels` | `true`：画出 `label`。`false`：只留圆点和连线 | `true` |

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
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
        ProcessStep("支付", ProcessStepState.Enabled, Icons.Filled.Home),
        ProcessStep("完成", ProcessStepState.Disabled, Icons.Filled.Home),
    ),
    modifier = Modifier.fillMaxWidth(),
    orientation = ProcessStepperOrientation.Vertical, // 或 Horizontal
    type = ProcessStepType.Icon, // 或 Number、Empty
    showLabels = true, // 或 false
)
```

一条 `ProcessStepper` 里的步骤共用一个 `orientation`、一个 `type`、一个 `showLabels`。图标和进度按步骤各自写在 `ProcessStep` 上。

### ProcessStep

| 字段 | 可以传 | 不写时 |
|---|---|---|
| `label` | 任意短文案。`showLabels = false` 时不画，仍建议写上 | 必填 |
| `state` | `ProcessStepState.Complete`：已完成。`InProgress`：当前这步。`Enabled`：还没走到。`Disabled`：不可用。组件不会按下标自己推断 | 必填 |
| `icon` | 任意 `ImageVector`。只在 `type = Icon` 且这一步不是 `Complete` 时画出来 | `null`，圆点里不画图标 |

| `state` | 圆点 | 这一步后面的连线 |
|---|---|---|
| `Complete` | 实心，白色勾 | 3dp，`primary`。两端各留 4dp |
| `InProgress` | 数字、图标：实心，内容 `onPrimary`。空心：描边加一颗 12dp 实心圆 | 1dp，`primary` |
| `Enabled` | 2dp `primary` 描边，序号或图标用 `primary` | 1dp，`primary` |
| `Disabled` | 2dp `outline` 描边，内容 `onSurfaceVariant` | 1dp，`outline` |

最后一步没有连线。序号从 1 开始，由步骤在列表里的位置决定，不用自己传。
