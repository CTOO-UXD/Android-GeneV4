# Card

承载一块内容的容器。三种表面样式对应不同视觉权重。

## 样式

| 变体 | Composable | 何时用 |
|---|---|---|
| 填充 | `Card` | 默认内容块 |
| 抬升 | `ElevatedCard` | 需要阴影层次 |
| 描边 | `OutlinedCard` | 轻边框、扁平 |

## 示例

![组件效果](/components/card.png)

```kotlin
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Card
import com.genev4.ElevatedCard
import com.genev4.OutlinedCard
import com.genev4.Text

Card {
    Text("填充卡片", modifier = Modifier.padding(16.dp))
}
ElevatedCard {
    Text("抬升卡片", modifier = Modifier.padding(16.dp))
}
OutlinedCard {
    Text("描边卡片", modifier = Modifier.padding(16.dp))
}
```

可点击时使用带 `onClick` 的重载（见源码）。

## API

见 [`Card.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Card.kt)。
