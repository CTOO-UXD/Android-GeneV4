# Chip

紧凑的选项或动作。筛选、输入、建议用不同变体，不要用按钮冒充。

## Types

![Chip](/components/chip.png)

## Usage

```kotlin
import com.genev4.AssistChip
import com.genev4.ElevatedAssistChip
import com.genev4.ElevatedFilterChip
import com.genev4.ElevatedSuggestionChip
import com.genev4.FilterChip
import com.genev4.InputChip
import com.genev4.SuggestionChip
import com.genev4.Text

AssistChip(onClick = { }, label = { Text("辅助") })
ElevatedAssistChip(onClick = { }, label = { Text("抬升辅助") })
FilterChip(selected = true, onClick = { }, label = { Text("筛选") })
ElevatedFilterChip(selected = false, onClick = { }, label = { Text("抬升筛选") })
InputChip(selected = true, onClick = { }, label = { Text("输入") })
SuggestionChip(onClick = { }, label = { Text("建议") })
ElevatedSuggestionChip(onClick = { }, label = { Text("抬升建议") })
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 辅助 | `AssistChip` | 触发一个轻动作 |
| 筛选 | `FilterChip` | 可切换的过滤条件 |
| 输入 | `InputChip` | 表示一段已输入内容 |
| 建议 | `SuggestionChip` | 推荐用户点一下 |
| 抬升 | `Elevated*` | 需要从表面浮起 |

## API

见 [`Chip.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Chip.kt)。常用：`onClick`、`label`、`selected`、`enabled`。
