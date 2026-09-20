package com.genev4.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Badge
import com.genev4.BasicAlertDialog
import com.genev4.CenterAlignedTopAppBar
import com.genev4.DropdownMenuItem
import com.genev4.ElevatedCard
import com.genev4.ExperimentalMaterial3Api
import com.genev4.ExposedDropdownMenuBox
import com.genev4.ExposedDropdownMenuDefaults
import com.genev4.HorizontalDivider
import com.genev4.ListItem
import com.genev4.MaterialTheme
import com.genev4.OutlinedButton
import com.genev4.OutlinedTextField
import com.genev4.Scaffold
import com.genev4.SnackbarHost
import com.genev4.SnackbarHostState
import com.genev4.Surface
import com.genev4.Switch
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.ExposedDropdownMenuAnchorType
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountScene(
    dark: Boolean,
    onDarkChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var notices by remember { mutableStateOf(true) }
    var reminders by remember { mutableStateOf(true) }
    var city by remember { mutableStateOf("杭州") }
    var cityMenu by remember { mutableStateOf(false) }
    var confirmExit by remember { mutableStateOf(false) }
    val cities = listOf("杭州", "上海", "京都", "成都")

    Scaffold(
        modifier = modifier,
        snackbarHost = { SnackbarHost(snackbar) },
        topBar = {
            CenterAlignedTopAppBar(title = { Text("个人") })
        },
    ) { inner ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(inner),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                ElevatedCard(Modifier.fillMaxWidth()) {
                    Column(
                        Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text("林晚", style = MaterialTheme.typography.headlineSmall)
                            Badge { Text("专业版") }
                        }
                        Text(
                            "genev4.design · 已使用 128 天",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                        TextButton(onClick = {
                            scope.launch { snackbar.showSnackbar("资料页还在准备") }
                        }) { Text("编辑资料") }
                    }
                }
            }
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    listOf("行程" to "12", "收藏" to "28", "足迹" to "6").forEach { (label, value) ->
                        Surface(
                            modifier = Modifier.weight(1f),
                            shape = MaterialTheme.shapes.large,
                            color = MaterialTheme.colorScheme.secondaryContainer,
                        ) {
                            Column(Modifier.padding(16.dp)) {
                                Text(value, style = MaterialTheme.typography.headlineSmall)
                                Text(label, style = MaterialTheme.typography.labelLarge)
                            }
                        }
                    }
                }
            }
            item { Text("偏好", style = MaterialTheme.typography.titleLarge) }
            item {
                ListItem(
                    headlineContent = { Text("消息通知") },
                    supportingContent = { Text("行程变更和同行留言") },
                    trailingContent = {
                        Switch(checked = notices, onCheckedChange = { notices = it })
                    },
                )
                HorizontalDivider()
                ListItem(
                    headlineContent = { Text("出发提醒") },
                    supportingContent = { Text("提前两小时通知集合") },
                    trailingContent = {
                        Switch(checked = reminders, onCheckedChange = { reminders = it })
                    },
                )
            }
            item {
                ExposedDropdownMenuBox(
                    expanded = cityMenu,
                    onExpandedChange = { cityMenu = it },
                ) {
                    OutlinedTextField(
                        value = city,
                        onValueChange = {},
                        readOnly = true,
                        label = { Text("默认城市") },
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = cityMenu) },
                        modifier = Modifier
                            .menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable)
                            .fillMaxWidth(),
                    )
                    ExposedDropdownMenu(
                        expanded = cityMenu,
                        onDismissRequest = { cityMenu = false },
                    ) {
                        cities.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    city = option
                                    cityMenu = false
                                    scope.launch { snackbar.showSnackbar("默认城市已改为 $option") }
                                },
                            )
                        }
                    }
                }
            }
            item { Text("外观", style = MaterialTheme.typography.titleLarge) }
            item {
                ListItem(
                    headlineContent = { Text("深色模式") },
                    supportingContent = { Text("作用于整个 Catalog") },
                    trailingContent = {
                        Switch(checked = dark, onCheckedChange = onDarkChange)
                    },
                )
            }
            item { Text("账户", style = MaterialTheme.typography.titleLarge) }
            item {
                ListItem(
                    headlineContent = { Text("隐私与数据") },
                    supportingContent = { Text("行程只保存在本地") },
                )
                HorizontalDivider()
                ListItem(
                    headlineContent = { Text("关于 GeneV4") },
                    supportingContent = { Text("组件库 0.1.0") },
                )
            }
            item {
                OutlinedButton(
                    onClick = { confirmExit = true },
                    modifier = Modifier.fillMaxWidth(),
                ) { Text("退出登录") }
            }
        }
    }

    if (confirmExit) {
        BasicAlertDialog(onDismissRequest = { confirmExit = false }) {
            Surface(shape = MaterialTheme.shapes.extraLarge) {
                Column(
                    Modifier.padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    Text("退出登录", style = MaterialTheme.typography.headlineSmall)
                    Text("本地行程会保留，下次登录还能看到。")
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        TextButton(onClick = { confirmExit = false }) { Text("取消") }
                        TextButton(onClick = {
                            confirmExit = false
                            scope.launch { snackbar.showSnackbar("已退出") }
                        }) { Text("退出") }
                    }
                }
            }
        }
    }
}
