# PullToRefresh

下拉刷新一块可滚动内容。`isRefreshing` 为真时显示指示器。

## Types

![PullToRefresh](/components/pull-to-refresh.png)

## Usage

```kotlin
import com.genev4.ExperimentalMaterial3Api
import com.genev4.Text
import com.genev4.pulltorefresh.PullToRefreshBox

@OptIn(ExperimentalMaterial3Api::class)
PullToRefreshBox(
    isRefreshing = false,
    onRefresh = { },
) {
    Text("下拉这个区域")
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。内容需要能滚动，下拉才会触发。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 下拉刷新 | `PullToRefreshBox` | 重新加载当前列表 |

## API

见 [`PullToRefresh.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/pulltorefresh/PullToRefresh.kt)。
