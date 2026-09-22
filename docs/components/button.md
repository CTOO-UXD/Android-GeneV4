---
title: Button
parent: Components
nav_order: 1
permalink: /components/button/
---

# Button

主操作按钮。按视觉权重选择变体；禁用用 `enabled = false`，不要另做一个灰色按钮组件。

## 样式

| 变体 | Composable | 何时用 |
|---|---|---|
| 填充 | `Button` | 页面主操作 |
| 禁用 | `Button(..., enabled = false)` | 不可点 |
| 抬升 | `ElevatedButton` | 需要轻微浮起 |
| 色调 | `FilledTonalButton` | 次主操作 |
| 描边 | `OutlinedButton` | 次要操作 |
| 文字 | `TextButton` | 最轻操作（对话框取消等） |

## 示例

```kotlin
import com.genev4.Button
import com.genev4.ElevatedButton
import com.genev4.FilledTonalButton
import com.genev4.OutlinedButton
import com.genev4.Text
import com.genev4.TextButton

Button(onClick = { }) { Text("填充") }
Button(onClick = { }, enabled = false) { Text("禁用") }
ElevatedButton(onClick = { }) { Text("抬升") }
FilledTonalButton(onClick = { }) { Text("色调") }
OutlinedButton(onClick = { }) { Text("描边") }
TextButton(onClick = { }) { Text("文字") }
```

须包在 `MaterialTheme` 内，见 [快速开始]({% link getting-started.md %})。

## API

完整参数见源码 [`Button.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Button.kt)（IDE 悬停亦可）。常用：`onClick`、`enabled`、`colors`、`contentPadding`、`content`。
