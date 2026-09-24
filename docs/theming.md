# 主题

GeneV4 的颜色、字体、形状都通过 `MaterialTheme` 的 CompositionLocal 下发。业务页应包在主题内，用 `MaterialTheme.colorScheme` / `typography` / `shapes` 取 token，避免写死色值。

## 默认明暗色

```kotlin
import com.genev4.MaterialTheme
import com.genev4.darkColorScheme
import com.genev4.lightColorScheme

MaterialTheme(colorScheme = lightColorScheme()) { /* 浅色 */ }

MaterialTheme(colorScheme = darkColorScheme()) { /* 深色 */ }
```

运行时切换（示例）：

```kotlin
var dark by remember { mutableStateOf(false) }

MaterialTheme(colorScheme = if (dark) darkColorScheme() else lightColorScheme()) {
    // UI
}
```

## 品牌色

基于默认 scheme 改主色等字段：

```kotlin
import androidx.compose.ui.graphics.Color
import com.genev4.MaterialTheme
import com.genev4.lightColorScheme

val brand = lightColorScheme(
    primary = Color(0xFF6C43C6),
    onPrimary = Color(0xFFFFFFFF),
    // 按需覆盖 secondary、error、surface 等
)

MaterialTheme(colorScheme = brand) {
    // UI
}
```

完整字段见源码 [`ColorScheme`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ColorScheme.kt) 的 KDoc。

## 注意

- 使用 `com.genev4.MaterialTheme` 包裹业务 UI。
- 组件默认色来自当前 `colorScheme`；个别组件可用 `colors = …Defaults.colors(...)` 微调，优先改主题而不是每个控件设死颜色。
