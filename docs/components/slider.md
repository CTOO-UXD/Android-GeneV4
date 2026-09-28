# Slider

连续数值，以及确定进度和不确定进度。

## Types

![Slider](/components/slider.png)

## Usage

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.CircularProgressIndicator
import com.genev4.LinearProgressIndicator
import com.genev4.RangeSlider
import com.genev4.Slider

Slider(value = 0.4f, onValueChange = { })
RangeSlider(value = 0.2f..0.8f, onValueChange = { })
LinearProgressIndicator(progress = { 0.4f }, modifier = Modifier.fillMaxWidth())
CircularProgressIndicator(progress = { 0.4f })
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。不传 `progress` 的进度条是不确定态。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 滑条 | `Slider` | 调一个值 |
| 区间 | `RangeSlider` | 调起止两个值 |
| 线性进度 | `LinearProgressIndicator` | 横向进度 |
| 环形进度 | `CircularProgressIndicator` | 紧凑进度 |

## API

见 [`Slider.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Slider.kt)、[`ProgressIndicator.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ProgressIndicator.kt)。
