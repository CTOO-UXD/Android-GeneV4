# Carousel

横向多卡片浏览。每一项的宽度由 `preferredItemWidth` 决定。

## Types

![Carousel](/components/carousel.png)

## Usage

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.ElevatedCard
import com.genev4.ExperimentalMaterial3Api
import com.genev4.MaterialTheme
import com.genev4.Text
import com.genev4.carousel.HorizontalMultiBrowseCarousel
import com.genev4.carousel.rememberCarouselState

val places = listOf("西湖", "灵隐", "九溪", "河坊街")

@OptIn(ExperimentalMaterial3Api::class)
HorizontalMultiBrowseCarousel(
    state = rememberCarouselState { places.size },
    preferredItemWidth = 180.dp,
    modifier = Modifier.fillMaxWidth().height(132.dp),
    itemSpacing = 8.dp,
) { index ->
    ElevatedCard(Modifier.height(120.dp).fillMaxWidth().maskClip(MaterialTheme.shapes.large)) {
        Text(places[index])
    }
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。`maskClip` 在轮播项作用域里。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 横向多览 | `HorizontalMultiBrowseCarousel` | 一屏露出多张卡片 |

## API

见 [`Carousel.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/carousel/Carousel.kt)。
