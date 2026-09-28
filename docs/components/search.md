# Search

停靠在内容上方的搜索条。展开后在尾部 lambda 里放结果列表。

## Types

![Search](/components/search.png)

## Usage

```kotlin
import com.genev4.DockedSearchBar
import com.genev4.ExperimentalMaterial3Api
import com.genev4.Text

@OptIn(ExperimentalMaterial3Api::class)
@Suppress("DEPRECATION")
DockedSearchBar(
    query = "杭州",
    onQueryChange = { },
    onSearch = { },
    active = false,
    onActiveChange = { },
    placeholder = { Text("搜索地点") },
) { }
```

须包在 `MaterialTheme` 内。`active = true` 时展开结果。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 停靠搜索 | `DockedSearchBar` | 嵌在页面里的搜索 |

## API

见 [`SearchBar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SearchBar.kt)。常用：`query`、`onQueryChange`、`onSearch`、`active`。
