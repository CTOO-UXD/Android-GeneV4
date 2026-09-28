# IconButton

图标操作。四种容器权重；内容放图标，截图里用文字代替图标。

## Types

![IconButton](/components/icon-button.png)

## Usage

```kotlin
import com.genev4.FilledIconButton
import com.genev4.FilledTonalIconButton
import com.genev4.IconButton
import com.genev4.OutlinedIconButton
import com.genev4.Text

IconButton(onClick = { }) { Text("常") }
FilledIconButton(onClick = { }) { Text("填") }
FilledTonalIconButton(onClick = { }) { Text("调") }
OutlinedIconButton(onClick = { }) { Text("边") }
```

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
