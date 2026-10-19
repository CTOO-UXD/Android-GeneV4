# Alert Banner

嵌在页面里的提示条，点关闭才消失。底部短时提示仍然是 [Snackbar](/components/snackbar)。页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Types

五种语义。Default 主按钮是 `primary`。其余四种主按钮是近黑填充。In-line 没有阴影。

![五种语义](/components/alert-banner.png)

```kotlin
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.AlertBanner
import com.genev4.AlertBannerDefaults
import com.genev4.AlertBannerScheme
import com.genev4.Text

Column(
    Modifier.width(740.dp),
    verticalArrangement = Arrangement.spacedBy(8.dp),
) {
    listOf(
        AlertBannerScheme.Default to "Alert Label",
        AlertBannerScheme.Informational to "Alert Label",
        AlertBannerScheme.Success to "Success!",
        AlertBannerScheme.Warning to "Warning:",
        AlertBannerScheme.Error to "Error:",
    ).forEach { (scheme, title) ->
        AlertBanner(
            onClose = {},
            modifier = Modifier.fillMaxWidth(),
            scheme = scheme,
            title = { Text(title) },
            text = { Text("Alert banner message") },
            primaryButton = {
                AlertBannerDefaults.PrimaryButton(onClick = {}, scheme = scheme) {
                    Text("Label")
                }
            },
        )
    }
}
```

`elevated = true` 加上和对话框同一档的阴影。底色不变。

![抬起](/components/alert-banner-elevated.png)

```kotlin
AlertBanner(
    onClose = {},
    modifier = Modifier.fillMaxWidth(),
    scheme = AlertBannerScheme.Informational, // 或 Default、Success、Warning、Error
    elevated = true,
    title = { Text("Alert Label") },
    text = { Text("Alert banner message") },
    primaryButton = {
        AlertBannerDefaults.PrimaryButton(
            onClick = {},
            scheme = AlertBannerScheme.Informational,
        ) { Text("Label") }
    },
)
```

## Usage

复选框和次按钮不传就不画。窄到文字区放不下 268dp 时，它们会换到下一行。

![复选框和两个按钮](/components/alert-banner-options.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.AlertBanner
import com.genev4.AlertBannerDefaults
import com.genev4.AlertBannerScheme
import com.genev4.Text

var hide by remember { mutableStateOf(false) }

AlertBanner(
    onClose = {},
    modifier = Modifier.fillMaxWidth(),
    scheme = AlertBannerScheme.Default,
    title = { Text("Alert Label") },
    text = { Text("Alert banner message") },
    checkbox = {
        AlertBannerDefaults.Checkbox(
            checked = hide,
            onCheckedChange = { hide = it },
            label = "Don't show this again",
        )
    },
    primaryButton = {
        AlertBannerDefaults.PrimaryButton(onClick = {}, scheme = AlertBannerScheme.Default) {
            Text("Label")
        }
    },
    secondaryButton = {
        AlertBannerDefaults.SecondaryButton(onClick = {}) { Text("Label") }
    },
)
```

## Spec

| 项 | 值 |
| --- | --- |
| 圆角 | 16 |
| 内边距 | 12。图标、文字、关闭之间 12 |
| 图标托 | 32 圆。Default 用 `surfaceContainer`，其余用 `surface`。图标 16 |
| 文字 | 标题 Semibold，说明 Regular。都是 14 / 20，字距 0.25，颜色 `onSurface` |
| 按钮 | 高 32，左右 16。主按钮在左，次按钮描边 1 |
| 复选框 | 高 24，框 18，描边 2，圆角 4。文案 12 / 16 |
| 关闭 | 32，图标 16 |
| 抬起 | `ElevationTokens.Level3`，6dp |

宽度跟父级走，示意宽 740。Success 底 `#A8F5A6`、Warning 底 `#FFDEAA`、近黑按钮 `#0E131E` 不在 `ColorScheme` 里，写在组件内部。字体用主题，不是设计稿里的 Montserrat。

## API

源码在 [`AlertBanner.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AlertBanner.kt)。不写的用「不写时」那一列。

### AlertBanner

| 参数 | 可以传 | 不写时 |
| --- | --- | --- |
| `onClose` | 点关闭 | 必填 |
| `modifier` | 宽度放在父级上。组件会铺满父级 | 空 |
| `scheme` | `Default`、`Informational`、`Success`、`Warning`、`Error` | `Default` |
| `elevated` | `true` 加阴影 | `false` |
| `icon` | 自己的 16dp 图标 | 该语义的默认图标 |
| `title` | 标题 | 不画 |
| `text` | 说明，可以换行 | 不画 |
| `checkbox` | 通常放 `AlertBannerDefaults.Checkbox` | 不画 |
| `primaryButton` | 通常放 `AlertBannerDefaults.PrimaryButton`，并把同一个 `scheme` 传进去 | 不画 |
| `secondaryButton` | 通常放 `AlertBannerDefaults.SecondaryButton` | 不画 |

### AlertBannerScheme

| 值 | 底色 | 主按钮 |
| --- | --- | --- |
| `Default` | `surface` | `primary` / `onPrimary` |
| `Informational` | `secondaryContainer` | 近黑填充 |
| `Success` | `#A8F5A6` | 近黑填充 |
| `Warning` | `#FFDEAA` | 近黑填充 |
| `Error` | `errorContainer` | 近黑填充 |

次按钮在每种语义上都是近黑描边。

### AlertBannerDefaults

| 函数 | 做什么 |
| --- | --- |
| `PrimaryButton` | 32dp 填充按钮。`onClick`、`scheme` 必填。`enabled` 默认 `true`。文案写在 content 里 |
| `SecondaryButton` | 32dp 描边按钮。`onClick` 必填 |
| `Checkbox` | `checked`、`onCheckedChange`、`label` 必填。`enabled` 默认 `true` |
