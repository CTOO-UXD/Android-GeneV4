# IconButton

图标操作。四种容器权重。内容放 `Icon`，图标来自 `genev4-icons`，见 [图标](/icons)。

## Types

![IconButton](/components/icon-button.png)

## Usage

```kotlin
import com.genev4.FilledIconButton
import com.genev4.FilledTonalIconButton
import com.genev4.Icon
import com.genev4.IconButton
import com.genev4.OutlinedIconButton
import com.genev4.icons.Icons

IconButton(onClick = { }) {
    Icon(Icons.Filled.AccountCircle, contentDescription = "账号")
}
FilledIconButton(onClick = { }) {
    Icon(Icons.Filled.Add, contentDescription = "添加")
}
FilledTonalIconButton(onClick = { }) {
    Icon(Icons.Outlined.AccountCircle, contentDescription = "账号")
}
OutlinedIconButton(onClick = { }) {
    Icon(Icons.Outlined.Add, contentDescription = "添加")
}
```

依赖见 [快速开始](/getting-started)。

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 标准 | `IconButton` | 工具栏里的轻操作 |
| 填充 | `FilledIconButton` | 需要主色容器 |
| 色调 | `FilledTonalIconButton` | 次强调 |
| 描边 | `OutlinedIconButton` | 需要边界但不抢主按钮 |

## API

见 [`IconButton.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/IconButton.kt)。常用：`onClick`、`enabled`、`colors`、`content`。
