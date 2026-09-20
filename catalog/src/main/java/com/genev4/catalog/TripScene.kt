package com.genev4.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.genev4.Button
import com.genev4.ElevatedCard
import com.genev4.ExperimentalMaterial3Api
import com.genev4.ExtendedFloatingActionButton
import com.genev4.LargeTopAppBar
import com.genev4.LinearProgressIndicator
import com.genev4.ListItem
import com.genev4.MaterialTheme
import com.genev4.ModalBottomSheet
import com.genev4.OutlinedTextField
import com.genev4.Scaffold
import com.genev4.SegmentedButton
import com.genev4.SegmentedButtonDefaults
import com.genev4.SingleChoiceSegmentedButtonRow
import com.genev4.SnackbarHost
import com.genev4.SnackbarHostState
import com.genev4.SuggestionChip
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.rememberModalBottomSheetState
import kotlinx.coroutines.launch

private data class Stop(
    val id: Int,
    val day: Int,
    val time: String,
    val title: String,
    val detail: String,
    val done: Boolean,
)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun TripScene(modifier: Modifier = Modifier) {
    val snackbar = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var day by remember { mutableIntStateOf(0) }
    var showSheet by remember { mutableStateOf(false) }
    var draft by remember { mutableStateOf("") }
    var note by remember { mutableStateOf("傍晚沿湖滨路走回酒店，避开断桥人流。") }
    val stops = remember {
        listOf(
            Stop(1, 0, "08:40", "抵达杭州东", "地铁 1 号线到龙翔桥", true),
            Stop(2, 0, "10:00", "西湖游船", "从湖滨码头上船，约 50 分钟", true),
            Stop(3, 0, "14:30", "灵隐寺", "飞来峰步道，预留两小时", false),
            Stop(4, 0, "18:30", "河坊街晚餐", "楼外楼或就近小馆", false),
            Stop(5, 1, "09:00", "中国美术学院", "象山校区，看建筑与展厅", false),
            Stop(6, 1, "13:00", "九溪烟树", "沿溪步行到龙井", false),
            Stop(7, 1, "17:20", "返程", "杭州东 18:05 的车", false),
        ).toMutableStateList()
    }
    val visible = stops.filter { it.day == day }
    val done = visible.count { it.done }
    val progress = if (visible.isEmpty()) 0f else done / visible.size.toFloat()
    val days = listOf("周六", "周日")

    Scaffold(
        modifier = modifier,
        snackbarHost = { SnackbarHost(snackbar) },
        topBar = {
            LargeTopAppBar(
                title = {
                    Column {
                        Text("杭州周末")
                        Text(
                            "9月21日 – 9月22日 · 两人",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                },
                actions = {
                    TextButton(onClick = {
                        scope.launch { snackbar.showSnackbar("行程链接已复制") }
                    }) { Text("分享") }
                },
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(onClick = { showSheet = true }) {
                Text("添加安排")
            }
        },
    ) { inner ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(inner),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 96.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                SingleChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
                    days.forEachIndexed { index, label ->
                        SegmentedButton(
                            shape = SegmentedButtonDefaults.itemShape(index, days.size),
                            selected = day == index,
                            onClick = { day = index },
                            label = { Text(label) },
                        )
                    }
                }
            }
            item {
                ElevatedCard(Modifier.fillMaxWidth()) {
                    Column(
                        Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        Text(
                            if (day == 0) "西湖与灵隐" else "象山与九溪",
                            style = MaterialTheme.typography.headlineSmall,
                        )
                        Text(
                            if (day == 0) "步行约 6.2 公里，市内无需包车。"
                            else "上午看建筑，下午沿溪走，晚上回东站。",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier.fillMaxWidth(),
                        )
                        Text(
                            "已完成 $done / ${visible.size}",
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary,
                        )
                        FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            val tags = if (day == 0) listOf("游船", "寺庙", "夜市") else listOf("校园", "徒步", "返程")
                            tags.forEach { tag ->
                                SuggestionChip(onClick = {}, label = { Text(tag) })
                            }
                        }
                    }
                }
            }
            item {
                Text("当日安排", style = MaterialTheme.typography.titleLarge)
            }
            items(visible, key = { it.id }) { stop ->
                ListItem(
                    overlineContent = { Text(stop.time) },
                    headlineContent = { Text(stop.title) },
                    supportingContent = { Text(stop.detail) },
                    trailingContent = {
                        TextButton(onClick = {
                            val index = stops.indexOfFirst { it.id == stop.id }
                            if (index >= 0) {
                                val next = stop.copy(done = !stop.done)
                                stops[index] = next
                                scope.launch {
                                    snackbar.showSnackbar(if (next.done) "已完成 ${stop.title}" else "已改回待办")
                                }
                            }
                        }) { Text(if (stop.done) "完成" else "待办") }
                    },
                )
            }
            item {
                Text("备注", style = MaterialTheme.typography.titleLarge)
            }
            item {
                OutlinedTextField(
                    value = note,
                    onValueChange = { note = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("给同行的人") },
                    supportingText = { Text("保存在这台设备上") },
                    minLines = 3,
                )
            }
            item { Spacer(Modifier.height(8.dp)) }
        }
    }

    if (showSheet) {
        ModalBottomSheet(
            onDismissRequest = { showSheet = false },
            sheetState = rememberModalBottomSheetState(),
        ) {
            Column(
                Modifier.padding(horizontal = 24.dp).padding(bottom = 32.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Text("新的安排", style = MaterialTheme.typography.titleLarge)
                Text(
                    "加到${days[day]}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                OutlinedTextField(
                    value = draft,
                    onValueChange = { draft = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("要做什么") },
                    singleLine = true,
                )
                Button(
                    onClick = {
                        val title = draft.trim()
                        if (title.isEmpty()) return@Button
                        stops += Stop(
                            id = (stops.maxOfOrNull { it.id } ?: 0) + 1,
                            day = day,
                            time = "待定",
                            title = title,
                            detail = "刚刚添加",
                            done = false,
                        )
                        draft = ""
                        showSheet = false
                        scope.launch { snackbar.showSnackbar("已加入${days[day]}") }
                    },
                    modifier = Modifier.fillMaxWidth(),
                ) { Text("加入行程") }
            }
        }
    }
}
