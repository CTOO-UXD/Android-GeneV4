# Menus

分组菜单面板。一组是一张圆角 16 的卡片。两组、三组拆成圆角 8 的卡片，中间留 2dp，外轮廓仍是 16。

锚在按钮上的单列菜单仍然是 [Menu](/components/menu)。点某一行不会再弹出下一级，行尾的图标只是这一行的尾部内容。

## Types

### Standard · 一组

底色 `surfaceContainer`，字色 `onSurface`。前面是 20dp 图标，后面是 20dp 图标。

![Standard 一组](/components/menus.png)

```kotlin
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Menus
import com.genev4.MenusGroup
import com.genev4.MenusIcons
import com.genev4.MenusItem

Menus(
    groups = listOf(
        MenusGroup(
            items = List(6) {
                MenusItem(
                    text = "Label",
                    leading = MenusIcons.Star,
                    trailing = MenusIcons.Caret,
                )
            },
        ),
    ),
    modifier = Modifier.width(208.dp),
)
```

### Standard · 多组

打开时几张卡片一起出现。选中行是 `primaryFixed`，圆角 12。

![Standard 多组](/components/menus-groups.png)

```kotlin
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Menus
import com.genev4.MenusGroup
import com.genev4.MenusIcons
import com.genev4.MenusItem

Menus(
    groups = listOf(
        MenusGroup(
            items = listOf(
                MenusItem(text = "Label", trailing = MenusIcons.Caret),
                MenusItem(text = "Label", selected = true, trailing = MenusIcons.Check),
                MenusItem(text = "Label", trailing = MenusIcons.Caret),
            ),
        ),
        MenusGroup(
            items = listOf(
                MenusItem(text = "Label", trailing = MenusIcons.Caret),
                MenusItem(text = "Label", trailing = MenusIcons.Caret),
            ),
        ),
    ),
    modifier = Modifier.width(208.dp),
)
```

### Vibrant

底色 `tertiaryContainer`，字色 `onTertiaryContainer`。

![Vibrant](/components/menus-vibrant.png)

```kotlin
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Menus
import com.genev4.MenusGroup
import com.genev4.MenusIcons
import com.genev4.MenusItem
import com.genev4.MenusTheme

Menus(
    groups = listOf(
        MenusGroup(
            items = List(4) {
                MenusItem(
                    text = "Label",
                    leading = MenusIcons.Star,
                    trailing = MenusIcons.Caret,
                )
            },
        ),
        MenusGroup(
            items = List(4) {
                MenusItem(
                    text = "Label",
                    leading = MenusIcons.Star,
                    trailing = MenusIcons.Caret,
                )
            },
        ),
    ),
    theme = MenusTheme.Vibrant,
    modifier = Modifier.width(208.dp),
)
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。宽度跟锚点走，设计示意是 208dp。

## Usage

锚在输入框、色调按钮或图标按钮下面。打开时菜单整组一起出现，不是点某一行再弹下一级。

### 输入框

左边是普通输入，列表超出 `maxHeight` 时出现滚动条，选中行前面是勾。右边是带搜索图标的输入，行前有图标。

![输入框](/components/menus-usage.png)

```kotlin
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Icon
import com.genev4.Menus
import com.genev4.MenusGroup
import com.genev4.MenusIcons
import com.genev4.MenusItem
import com.genev4.OutlinedTextField
import com.genev4.Text
import com.genev4.icons.Icons
import com.genev4.icons.filled.Close
import com.genev4.icons.filled.Search

Row(
    horizontalArrangement = Arrangement.spacedBy(24.dp),
    verticalAlignment = Alignment.Top,
) {
    Column(Modifier.width(208.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        OutlinedTextField(
            value = "Input",
            onValueChange = {},
            label = { Text("Label") },
            trailingIcon = { Icon(Icons.Filled.Close, contentDescription = null) },
            modifier = Modifier.fillMaxWidth(),
        )
        Menus(
            groups = listOf(
                MenusGroup(
                    items = List(8) { index ->
                        MenusItem(
                            text = "Label",
                            selected = index == 2,
                            leading = if (index == 2) MenusIcons.Check else null,
                            indent = index != 2,
                        )
                    },
                ),
            ),
            maxHeight = 196.dp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
    Column(Modifier.width(208.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        OutlinedTextField(
            value = "Input",
            onValueChange = {},
            label = { Text("Label") },
            leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
            trailingIcon = { Icon(Icons.Filled.Close, contentDescription = null) },
            modifier = Modifier.fillMaxWidth(),
        )
        Menus(
            groups = listOf(
                MenusGroup(
                    items = List(4) { index ->
                        MenusItem(
                            text = "Label",
                            selected = index == 2,
                            leading = if (index == 2) MenusIcons.StarFilled else MenusIcons.Star,
                        )
                    },
                ),
            ),
            modifier = Modifier.fillMaxWidth(),
        )
    }
}
```

### 按钮

左边是色调按钮，行上有前导和尾部图标。右边是图标按钮，两组卡片一起出现。

![按钮](/components/menus-usage-anchors.png)

```kotlin
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.FilledIconButton
import com.genev4.FilledTonalButton
import com.genev4.Icon
import com.genev4.Menus
import com.genev4.MenusGroup
import com.genev4.MenusIcons
import com.genev4.MenusItem
import com.genev4.Text

var pick by remember { mutableIntStateOf(1) }

Row(
    horizontalArrangement = Arrangement.spacedBy(24.dp),
    verticalAlignment = Alignment.Top,
) {
    Column(Modifier.width(208.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        FilledTonalButton(onClick = {}) {
            Icon(MenusIcons.Star, contentDescription = null)
            Text("Label")
        }
        Menus(
            groups = listOf(
                MenusGroup(
                    items = List(4) {
                        MenusItem(
                            text = "Label",
                            leading = MenusIcons.Star,
                            trailing = MenusIcons.Caret,
                        )
                    },
                ),
            ),
            modifier = Modifier.fillMaxWidth(),
        )
    }
    Column(Modifier.width(208.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        FilledIconButton(onClick = {}) {
            Icon(MenusIcons.Star, contentDescription = null)
        }
        Menus(
            groups = listOf(
                MenusGroup(
                    items = List(3) { index ->
                        MenusItem(
                            text = "Label",
                            selected = index == pick,
                            trailing = if (index == pick) MenusIcons.Check else MenusIcons.Caret,
                            onClick = { pick = index },
                        )
                    },
                ),
                MenusGroup(
                    items = List(2) {
                        MenusItem(text = "Label", trailing = MenusIcons.Caret)
                    },
                ),
            ),
            modifier = Modifier.fillMaxWidth(),
        )
    }
}
```

`Menus` 本身只画面板。锚点、弹出层和点外面关闭由调用方处理，和 [Menu](/components/menu) 一样。需要限制高度时传 `maxHeight`，超出才会出现滚动条。

## Spec

| 项 | Standard | Vibrant |
|---|---|---|
| 一组 | 圆角 16，`surfaceContainer`，字 `onSurface` | 圆角 16，`tertiaryContainer`，字 `onTertiaryContainer` |
| 多组 | 每张圆角 8，间距 2，外轮廓 16 | 同左，颜色换成 Vibrant |
| 行 | 外圈左右 4、上下 2，里面高 44、内边距 12、间距 8 | 同左 |
| 图标 | 20 | 同左 |
| 文字 | `labelLarge`，14 / 20，Medium，字距 0.1 | 同左 |
| 选中 | `primaryFixed`，圆角 12，字 `onPrimaryFixed` | 同左 |
| 悬停、按下 | `onSurface` 8% | 同左 |
| 聚焦 | `onSurface` 10%，再加 2dp `secondary` 描边 | 同左 |
| 禁用 | 内容 38%，点不了 | 同左 |
| 组标题 | 可选，高 32，上 6、左右 12 | 同左 |
| 尾部文字 | `onSurfaceVariant` | 同左 |
| 滚动条 | 超出 `maxHeight` 才出现。拇指宽 4，颜色 `outline`，靠右 4 | 同左 |

阴影是一圈浅黑。字体用主题的 `labelLarge`，不是设计稿里的 Montserrat。

## API

源码在 [`Menus.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Menus.kt)。不写的用「不写时」那一列。

### Menus

```kotlin
Menus(
    groups = listOf(MenusGroup(items = listOf(MenusItem(text = "Label")))),
    modifier = Modifier.width(208.dp),
    theme = MenusTheme.Standard, // 或 Vibrant
    maxHeight = 320.dp, // 不写则按内容增高，不滚动
)
```

| 参数 | 可以传 | 不写时 |
|---|---|---|
| `groups` | 从上到下的 [MenusGroup]。一个是一张卡片，多个中间留 2dp | 必填 |
| `modifier` | 宽度放这里。示意宽 208 | 空 |
| `theme` | `Standard`、`Vibrant` | `Standard` |
| `maxHeight` | 限制高度并出现滚动条 | 不限制 |

### MenusTheme

| 值 | 样子 |
|---|---|
| `Standard` | `surfaceContainer` / `onSurface` |
| `Vibrant` | `tertiaryContainer` / `onTertiaryContainer` |

### MenusGroup

| 字段 | 可以传 | 不写时 |
|---|---|---|
| `items` | 这一组里的 [MenusItem] | 必填 |
| `label` | 组标题。空字符串也会画出来 | 不画标题 |

### MenusItem

| 字段 | 可以传 | 不写时 |
|---|---|---|
| `text` | 这一行的文案 | 必填 |
| `selected` | `true`：`primaryFixed`，圆角 12。`false`：不铺底，圆角 4 | `false` |
| `enabled` | `true`、`false`。`false` 时 38% 透明，不响应点击 | `true` |
| `leading` | 20dp 图标。示意用 `MenusIcons.Star`，选中用 `MenusIcons.StarFilled` | 不画 |
| `indent` | `true` 在没有 `leading` 时留 20dp，用来和有图标的行对齐 | `false` |
| `trailing` | 20dp 图标。示意用 `MenusIcons.Caret`，选中用 `MenusIcons.Check` | 不画 |
| `trailingText` | 图标前的短文字，颜色 `onSurfaceVariant` | 不画 |
| `divider` | `true` 在行下画一条分割线 | `false` |
| `onClick` | 按下这一行 | 空操作 |

哪一行选中由调用方写在 `selected` 上。组件不会自己记住选中项，也不会因为行尾有箭头再打开一块菜单。
