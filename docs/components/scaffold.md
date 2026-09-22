---
title: Scaffold
parent: Components
nav_order: 3
permalink: /components/scaffold/
---

# Scaffold

页面骨架：顶栏、底栏、FAB、内容区。新页面优先用 `Scaffold`，再往 `content` 里放业务 UI。

## 样式 / 槽位

| 槽位 | 参数 | 说明 |
|---|---|---|
| 顶栏 | `topBar` | `TopAppBar` 等 |
| 底栏 | `bottomBar` | `NavigationBar` 等 |
| FAB | `floatingActionButton` | `FloatingActionButton` 等 |
| 内容 | `content: (PaddingValues) -> Unit` | **必须**使用传入的 `PaddingValues`，避免被栏遮挡 |

## 示例

```kotlin
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.genev4.ExperimentalMaterial3Api
import com.genev4.FloatingActionButton
import com.genev4.NavigationBar
import com.genev4.NavigationBarItem
import com.genev4.Scaffold
import com.genev4.Text
import com.genev4.TopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleScaffold() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("标题") })
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = { },
                    icon = { Text("首页") },
                    label = { Text("首页") },
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) { Text("+") }
        },
    ) { innerPadding ->
        Text(
            "内容区",
            modifier = Modifier.padding(innerPadding),
        )
    }
}
```

须包在 `MaterialTheme` 内。底部导航细节见 [NavigationBar]({% link components/navigation-bar.md %})。

## API

见 [`Scaffold.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Scaffold.kt)。顶栏见 [`AppBar.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/AppBar.kt)。
