package com.genev4.catalog.docs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.AlertDialog
import com.genev4.Button
import com.genev4.Card
import com.genev4.ElevatedButton
import com.genev4.ElevatedCard
import com.genev4.ExperimentalMaterial3Api
import com.genev4.FilledTonalButton
import com.genev4.FloatingActionButton
import com.genev4.MaterialTheme
import com.genev4.NavigationBar
import com.genev4.NavigationBarItem
import com.genev4.OutlinedButton
import com.genev4.OutlinedCard
import com.genev4.OutlinedTextField
import com.genev4.Scaffold
import com.genev4.Snackbar
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.TextField
import com.genev4.TopAppBar
import com.genev4.lightColorScheme

/** Shared theme wrapper for docs screenshots and gallery-style demos. */
@Composable
fun DocsTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = lightColorScheme()) {
        content()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ButtonDocsDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Button(onClick = {}) { Text("填充") }
        Button(onClick = {}, enabled = false) { Text("禁用") }
        ElevatedButton(onClick = {}) { Text("抬升") }
        FilledTonalButton(onClick = {}) { Text("色调") }
        OutlinedButton(onClick = {}) { Text("描边") }
        TextButton(onClick = {}) { Text("文字") }
    }
}

@Composable
fun CardDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).width(320.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Text("填充卡片", modifier = Modifier.padding(16.dp))
        }
        ElevatedCard(modifier = Modifier.fillMaxWidth()) {
            Text("抬升卡片", modifier = Modifier.padding(16.dp))
        }
        OutlinedCard(modifier = Modifier.fillMaxWidth()) {
            Text("描边卡片", modifier = Modifier.padding(16.dp))
        }
    }
}

@Composable
fun TextFieldDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).width(360.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        TextField(
            value = "杭州",
            onValueChange = {},
            label = { Text("填充") },
            modifier = Modifier.fillMaxWidth(),
        )
        OutlinedTextField(
            value = "error",
            onValueChange = {},
            label = { Text("描边") },
            isError = true,
            supportingText = { Text("校验失败提示") },
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Composable
fun NavigationBarDocsDemo(modifier: Modifier = Modifier) {
    val labels = listOf("控件", "旅程", "个人")
    NavigationBar(modifier = modifier) {
        labels.forEachIndexed { index, label ->
            NavigationBarItem(
                selected = index == 0,
                onClick = {},
                icon = { Text(label.take(1)) },
                label = { Text(label) },
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDocsDemo(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.width(360.dp),
        topBar = { TopAppBar(title = { Text("标题") }) },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = { Text("首") },
                    label = { Text("首页") },
                )
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = { Text("我") },
                    label = { Text("我的") },
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) { Text("+") }
        },
    ) { innerPadding ->
        Text("内容区", modifier = Modifier.padding(innerPadding).padding(16.dp))
    }
}

@Composable
fun DialogDocsDemo(modifier: Modifier = Modifier) {
    // Snapshot shows the dialog host surface; AlertDialog draws above.
    Column(modifier = modifier.width(360.dp).padding(8.dp)) {
        AlertDialog(
            onDismissRequest = {},
            title = { Text("确认删除？") },
            text = { Text("删除后无法恢复。") },
            confirmButton = {
                TextButton(onClick = {}) { Text("删除") }
            },
            dismissButton = {
                TextButton(onClick = {}) { Text("取消") }
            },
        )
    }
}

@Composable
fun SnackbarDocsDemo(modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(16.dp).width(360.dp)) {
        Snackbar(
            action = { Text("撤销") },
        ) {
            Text("已保存")
        }
    }
}
