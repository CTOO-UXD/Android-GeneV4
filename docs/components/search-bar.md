# Search Bar

记忆和知识库里的搜索条。宽屏把提交放在输入区外面，结果留在同一张卡片里。窄屏把麦克风和提交都放进输入区，结果是下面单独的卡片。

停靠展开的搜索仍然是 [Search](/components/search)。跟 Qira 对话用 [AiInput](/components/ai-input)。

## Types

空内容是麦克风。有文字时麦克风换成清除，提交变成 `primary`。

### 宽屏 · 空

![宽屏空内容](/components/search-bar.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.SearchBar

SearchBar(
    value = "",
    onValueChange = {},
    onSearch = {},
    modifier = Modifier.fillMaxWidth(),
)
```

### 宽屏 · 有结果

结果画在同一张圆角 32 的卡片里。选中的那一行用 `primaryContainer`。

![宽屏有结果](/components/search-bar-default-results.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.SearchBar
import com.genev4.SearchResult

SearchBar(
    value = "This is input text",
    onValueChange = {},
    onSearch = {},
    results = listOf(
        SearchResult("Menu item", selected = true),
        SearchResult("Menu item"),
    ),
    modifier = Modifier.fillMaxWidth(),
)
```

### 窄屏 · 空

麦克风和提交都在输入区里面，提交是 40dp。

![窄屏空内容](/components/search-bar-mobile.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.SearchBar
import com.genev4.SearchBarLayout

SearchBar(
    value = "",
    onValueChange = {},
    onSearch = {},
    layout = SearchBarLayout.Mobile,
    modifier = Modifier.fillMaxWidth(),
)
```

### 窄屏 · 有结果

结果是搜索条下面单独的白卡片，间距 8。

![窄屏有结果](/components/search-bar-mobile-results.png)

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.SearchBar
import com.genev4.SearchBarLayout
import com.genev4.SearchResult

SearchBar(
    value = "This is input text",
    onValueChange = {},
    onSearch = {},
    layout = SearchBarLayout.Mobile,
    results = listOf(
        SearchResult("Menu item", selected = true),
        SearchResult("Menu item"),
    ),
    modifier = Modifier.fillMaxWidth(),
)
```

## Usage

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.genev4.SearchBar
import com.genev4.SearchBarLayout
import com.genev4.SearchResult

var query by remember { mutableStateOf("") }
val suggestions = listOf("西湖", "灵隐", "九溪")
val matches =
    if (query.isBlank()) {
        emptyList()
    } else {
        suggestions.filter { it.contains(query) }.mapIndexed { index, label ->
            SearchResult(label, selected = index == 0)
        }
    }

SearchBar(
    value = query,
    onValueChange = { query = it },
    onSearch = { /* 用 query 搜索 */ },
    onMicClick = { /* 打开语音 */ },
    layout = SearchBarLayout.Default, // 窄屏用 Mobile
    results = matches,
    onResultClick = { query = matches[it].label },
    modifier = Modifier.fillMaxWidth(),
)
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。需要有限宽度，组件会铺满，最宽 908dp。

## Spec

| 项 | 宽屏 `Default` | 窄屏 `Mobile` |
|---|---|---|
| 外壳 | 圆角 32，内边距 8，`surface` 70% | 圆角 32，内边距 4，`surface` 80% |
| 输入区 | 圆角 24，最低 48，`surface` 80% | 同一层里，最低 48 |
| 条高 | 空内容 64 | 空内容 56 |
| 最宽 | 908 | 随父级，示意宽 362 |
| 放大镜 | 24，左侧内边距 12 | 同左 |
| 文字 | 14 / 20，字距 0.25。占位 `onSurfaceVariant`，输入 `onSurface` | 同左 |
| 空内容尾部 | 40 麦克风 | 40 麦克风，再加 40 提交，间距 8 |
| 有文字尾部 | 40 清除，底色 `surfaceContainerHigh` | 40 清除，再加 40 提交 |
| 提交 | 48，在输入区外面，间距 12。空内容跟外壳同色，有文字为 `primary` | 40，在输入区里面 |
| 结果 | 留在外壳里，间距 4 | 单独卡片，圆角 16，`surfaceBright`，间距 8 |
| 结果行 | 最低 48，圆角 12，左右 12。选中行 `primaryContainer`，字重 Semibold | 同左 |

外壳用半透明 `surface` 代替设计稿里的背景模糊。阴影是一圈很浅的黑色。

## API

源码在 [`SearchBarComponent.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/SearchBarComponent.kt)。不写的用「不写时」那一列。

### SearchBar

| 参数 | 可以传 | 不写时 |
|---|---|---|
| `value` | 当前输入 | 必填 |
| `onValueChange` | 文字变化时调用 | 必填 |
| `onSearch` | 点提交，或键盘搜索 | 必填 |
| `modifier` | 任意 `Modifier`。加上 `Modifier.fillMaxWidth()` | `Modifier` |
| `layout` | `SearchBarLayout.Default`：提交在外面，结果在卡片内。`SearchBarLayout.Mobile`：提交在里面，结果是下面的卡片 | `Default` |
| `placeholder` | 空内容时的占位 | `What are you looking for?` |
| `results` | `List<SearchResult>`。空列表不画菜单 | `emptyList()` |
| `onResultClick` | 点某一行，参数是它在 `results` 里的下标 | 空操作 |
| `onMicClick` | 点麦克风。只有 `value` 为空时看得到麦克风 | 空操作 |
| `onClear` | 点清除。`null` 会把 `value` 清成空字符串 | `null` |
| `enabled` | `true`：可输入。`false`：整条变淡，不能点 | `true` |

```kotlin
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.genev4.SearchBar
import com.genev4.SearchBarLayout
import com.genev4.SearchResult

SearchBar(
    value = "西湖",
    onValueChange = {},
    onSearch = {},
    modifier = Modifier.fillMaxWidth(),
    layout = SearchBarLayout.Mobile, // 或 Default
    placeholder = "想找什么？",
    results = listOf(
        SearchResult("西湖", selected = true),
        SearchResult("灵隐"),
    ),
    onResultClick = {},
    onMicClick = {},
    onClear = {},
    enabled = true, // 或 false
)
```

有文字时麦克风换成清除，提交从半透明圆变成 `primary`。这是由 `value` 是否为空决定的，没有单独的状态参数。

### SearchResult

| 字段 | 可以传 | 不写时 |
|---|---|---|
| `label` | 这一行的文案 | 必填 |
| `selected` | `true`：`primaryContainer` 底，Semibold。`false`：透明底，Regular | `false` |

哪一行选中由调用方写在 `selected` 上。组件不会把第一行自动当成选中。
