# Menu

锚在按钮上的菜单，以及只读输入框上的暴露式下拉。

## Types

![Menu](/components/menu.png)

## Usage

```kotlin
import androidx.compose.ui.Modifier
import com.genev4.DropdownMenu
import com.genev4.DropdownMenuItem
import com.genev4.ExperimentalMaterial3Api
import com.genev4.ExposedDropdownMenu
import com.genev4.ExposedDropdownMenuAnchorType
import com.genev4.ExposedDropdownMenuBox
import com.genev4.ExposedDropdownMenuDefaults
import com.genev4.OutlinedTextField
import com.genev4.Text

DropdownMenu(expanded = true, onDismissRequest = { }) {
    DropdownMenuItem(text = { Text("编辑") }, onClick = { })
    DropdownMenuItem(text = { Text("分享") }, onClick = { })
}

@OptIn(ExperimentalMaterial3Api::class)
ExposedDropdownMenuBox(expanded = true, onExpandedChange = { }) {
    OutlinedTextField(
        value = "杭州",
        onValueChange = { },
        readOnly = true,
        label = { Text("城市") },
        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = true) },
        modifier = Modifier.menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable),
    )
    ExposedDropdownMenu(expanded = true, onDismissRequest = { }) {
        DropdownMenuItem(text = { Text("杭州") }, onClick = { })
    }
}
```

页面外层包一层 `MaterialTheme`，见 [快速开始](/getting-started)。菜单一般锚在触发它的按钮上。

## Spec

| 变体 | Composable | 何时用 |
|---|---|---|
| 菜单 | `DropdownMenu` | 少量操作 |
| 暴露式下拉 | `ExposedDropdownMenuBox` | 从一组值里选一个 |

## API

见 [`Menu.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/Menu.kt)、[`ExposedDropdownMenu.kt`](https://github.com/CTOO-UXD/Android-GeneV4/blob/main/library/src/commonMain/kotlin/com/genev4/ExposedDropdownMenu.kt)。
