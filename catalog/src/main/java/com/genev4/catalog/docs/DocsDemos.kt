package com.genev4.catalog.docs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.genev4.AlertDialog
import com.genev4.AssistChip
import com.genev4.Badge
import com.genev4.BadgedBox
import com.genev4.BottomAppBar
import com.genev4.Button
import com.genev4.Card
import com.genev4.Checkbox
import com.genev4.CircularProgressIndicator
import com.genev4.DatePicker
import com.genev4.DockedSearchBar
import com.genev4.DropdownMenuItem
import com.genev4.ElevatedAssistChip
import com.genev4.ElevatedButton
import com.genev4.ElevatedCard
import com.genev4.ElevatedFilterChip
import com.genev4.ElevatedSuggestionChip
import com.genev4.ExperimentalMaterial3Api
import com.genev4.ExposedDropdownMenuAnchorType
import com.genev4.ExposedDropdownMenuBox
import com.genev4.ExposedDropdownMenuDefaults
import com.genev4.ExtendedFloatingActionButton
import com.genev4.FilledIconButton
import com.genev4.FilledTonalButton
import com.genev4.FilledTonalIconButton
import com.genev4.FilterChip
import com.genev4.FloatingActionButton
import com.genev4.HorizontalDivider
import com.genev4.IconButton
import com.genev4.InputChip
import com.genev4.LargeFloatingActionButton
import com.genev4.LinearProgressIndicator
import com.genev4.ListItem
import com.genev4.BottomSheetDefaults
import com.genev4.MaterialTheme
import com.genev4.MenuDefaults
import com.genev4.MultiChoiceSegmentedButtonRow
import com.genev4.NavigationDrawerItem
import com.genev4.NavigationBar
import com.genev4.NavigationBarItem
import com.genev4.NavigationRail
import com.genev4.NavigationRailItem
import com.genev4.OutlinedButton
import com.genev4.OutlinedCard
import com.genev4.OutlinedIconButton
import com.genev4.OutlinedSecureTextField
import com.genev4.OutlinedTextField
import com.genev4.PermanentDrawerSheet
import com.genev4.PrimaryTabRow
import com.genev4.RadioButton
import com.genev4.RangeSlider
import com.genev4.Scaffold
import com.genev4.SecureTextField
import com.genev4.SecondaryTabRow
import com.genev4.SegmentedButton
import com.genev4.SegmentedButtonDefaults
import com.genev4.ShortNavigationBar
import com.genev4.ShortNavigationBarItem
import com.genev4.SingleChoiceSegmentedButtonRow
import com.genev4.Slider
import com.genev4.SmallFloatingActionButton
import com.genev4.Snackbar
import com.genev4.Surface
import com.genev4.SwipeToDismissBox
import com.genev4.SuggestionChip
import com.genev4.Switch
import com.genev4.Tab
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.TooltipDefaults
import com.genev4.TextField
import com.genev4.TimePicker
import com.genev4.TopAppBar
import com.genev4.TriStateCheckbox
import com.genev4.VerticalDivider
import com.genev4.carousel.HorizontalMultiBrowseCarousel
import com.genev4.carousel.rememberCarouselState
import com.genev4.lightColorScheme
import com.genev4.pulltorefresh.PullToRefreshBox
import com.genev4.rememberDatePickerState
import com.genev4.rememberSwipeToDismissBoxState
import com.genev4.rememberTimePickerState

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

@OptIn(ExperimentalMaterial3Api::class)
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
        SecureTextField(
            state = rememberTextFieldState("secret"),
            label = { Text("密码") },
            modifier = Modifier.fillMaxWidth(),
        )
        OutlinedSecureTextField(
            state = rememberTextFieldState(),
            label = { Text("描边密码") },
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun IconButtonDocsDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        IconButton(onClick = {}) { Text("常") }
        FilledIconButton(onClick = {}) { Text("填") }
        FilledTonalIconButton(onClick = {}) { Text("调") }
        OutlinedIconButton(onClick = {}) { Text("边") }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FabDocsDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        SmallFloatingActionButton(onClick = {}) { Text("小") }
        FloatingActionButton(onClick = {}) { Text("+") }
        LargeFloatingActionButton(onClick = {}) { Text("大") }
        ExtendedFloatingActionButton(onClick = {}) { Text("扩展") }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ChipDocsDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        AssistChip(onClick = {}, label = { Text("辅助") })
        ElevatedAssistChip(onClick = {}, label = { Text("抬升辅助") })
        FilterChip(selected = true, onClick = {}, label = { Text("筛选") })
        ElevatedFilterChip(selected = false, onClick = {}, label = { Text("抬升筛选") })
        InputChip(selected = true, onClick = {}, label = { Text("输入") })
        SuggestionChip(onClick = {}, label = { Text("建议") })
        ElevatedSuggestionChip(onClick = {}, label = { Text("抬升建议") })
    }
}

@Composable
fun SegmentedButtonDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).width(360.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        val labels = listOf("列表", "地图", "日历")
        SingleChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
            labels.forEachIndexed { index, label ->
                SegmentedButton(
                    selected = index == 0,
                    onClick = {},
                    shape = SegmentedButtonDefaults.itemShape(index, labels.size),
                    label = { Text(label) },
                )
            }
        }
        val checks = listOf("步行", "地铁")
        MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
            checks.forEachIndexed { index, label ->
                SegmentedButton(
                    checked = index == 0,
                    onCheckedChange = {},
                    shape = SegmentedButtonDefaults.itemShape(index, checks.size),
                    label = { Text(label) },
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SelectionDocsDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            itemVerticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = true, onCheckedChange = {})
            Text("复选")
            Checkbox(checked = false, onCheckedChange = null, enabled = false)
            Text("禁用")
            TriStateCheckbox(state = ToggleableState.Indeterminate, onClick = {})
            Text("三态")
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            itemVerticalAlignment = Alignment.CenterVertically,
        ) {
            Switch(checked = true, onCheckedChange = {})
            Text("开关")
            Switch(checked = false, onCheckedChange = null, enabled = false)
            Text("禁用")
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            itemVerticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(selected = true, onClick = {})
            Text("上午")
            RadioButton(selected = false, onClick = {})
            Text("下午")
        }
    }
}

@Composable
fun SliderDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).width(360.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Slider(value = 0.4f, onValueChange = {})
        RangeSlider(value = 0.2f..0.8f, onValueChange = {})
        LinearProgressIndicator(progress = { 0.4f }, modifier = Modifier.fillMaxWidth())
        CircularProgressIndicator(progress = { 0.4f })
    }
}

@Composable
fun ListDocsDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier.width(360.dp).padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        BadgedBox(badge = { Badge { Text("3") } }) {
            Text("收件箱")
        }
        ListItem(
            headlineContent = { Text("两行列表") },
            supportingContent = { Text("辅助说明") },
            trailingContent = { Text("12:30") },
        )
        HorizontalDivider()
        Row(
            modifier = Modifier.height(32.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("左")
            VerticalDivider()
            Text("右")
        }
        SwipeToDismissBox(
            state = rememberSwipeToDismissBoxState(),
            backgroundContent = {
                Box(Modifier.fillMaxSize().padding(horizontal = 16.dp), contentAlignment = Alignment.CenterEnd) {
                    Text("删除")
                }
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            ListItem(
                headlineContent = { Text("滑动这项") },
                supportingContent = { Text("向一侧滑开") },
            )
        }
    }
}

@Composable
fun TabsDocsDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier.width(360.dp)) {
        PrimaryTabRow(selectedTabIndex = 0) {
            listOf("概览", "行程", "花费").forEachIndexed { index, label ->
                Tab(selected = index == 0, onClick = {}, text = { Text(label) })
            }
        }
        SecondaryTabRow(selectedTabIndex = 0) {
            listOf("全部", "未完成").forEachIndexed { index, label ->
                Tab(selected = index == 0, onClick = {}, text = { Text(label) })
            }
        }
    }
}

@Composable
fun NavigationRailDocsDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier.width(360.dp)) {
        Row(Modifier.height(140.dp).fillMaxWidth()) {
            NavigationRail(windowInsets = WindowInsets(0.dp)) {
                listOf("家", "搜").forEachIndexed { index, label ->
                    NavigationRailItem(
                        selected = index == 0,
                        onClick = {},
                        icon = { Text(label) },
                        label = { Text(label) },
                    )
                }
            }
            Text("侧栏内容", modifier = Modifier.padding(16.dp))
        }
        PermanentDrawerSheet(
            Modifier.fillMaxWidth().height(120.dp),
            windowInsets = WindowInsets(0.dp),
        ) {
            NavigationDrawerItem(label = { Text("收件箱") }, selected = true, onClick = {})
            NavigationDrawerItem(label = { Text("已发送") }, selected = false, onClick = {})
        }
        ShortNavigationBar(windowInsets = WindowInsets(0.dp)) {
            listOf("消息", "行程").forEachIndexed { index, label ->
                ShortNavigationBarItem(
                    selected = index == 0,
                    onClick = {},
                    icon = { Text(label.take(1)) },
                    label = { Text(label) },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarDocsDemo(modifier: Modifier = Modifier) {
    Column(modifier = modifier.width(360.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        TopAppBar(
            title = { Text("顶栏") },
            windowInsets = WindowInsets(0.dp),
        )
        BottomAppBar(
            windowInsets = WindowInsets(0.dp),
            actions = {
                TextButton(onClick = {}) { Text("归档") }
            },
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp).width(280.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        OutlinedButton(onClick = {}) { Text("打开菜单") }
        Surface(
            shape = MenuDefaults.shape,
            color = MenuDefaults.containerColor,
            shadowElevation = MenuDefaults.ShadowElevation,
        ) {
            Column {
                DropdownMenuItem(text = { Text("编辑") }, onClick = {})
                DropdownMenuItem(text = { Text("分享") }, onClick = {})
            }
        }
        ExposedDropdownMenuBox(expanded = false, onExpandedChange = {}) {
            OutlinedTextField(
                value = "杭州",
                onValueChange = {},
                readOnly = true,
                label = { Text("城市") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = false) },
                modifier = Modifier.menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable).fillMaxWidth(),
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchDocsDemo(modifier: Modifier = Modifier) {
    @Suppress("DEPRECATION")
    DockedSearchBar(
        query = "杭州",
        onQueryChange = {},
        onSearch = {},
        active = false,
        onActiveChange = {},
        placeholder = { Text("搜索地点") },
        modifier = modifier.padding(16.dp).width(360.dp),
    ) {}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerDocsDemo(modifier: Modifier = Modifier) {
    DatePicker(
        state = rememberDatePickerState(initialSelectedDateMillis = 1_756_684_800_000L),
        modifier = modifier.width(360.dp),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerDocsDemo(modifier: Modifier = Modifier) {
    TimePicker(
        state = rememberTimePickerState(initialHour = 9, initialMinute = 30, is24Hour = true),
        modifier = modifier.padding(16.dp),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselDocsDemo(modifier: Modifier = Modifier) {
    val places = listOf("西湖", "灵隐", "九溪", "河坊街")
    HorizontalMultiBrowseCarousel(
        state = rememberCarouselState { places.size },
        preferredItemWidth = 180.dp,
        modifier = modifier.padding(16.dp).width(360.dp).height(132.dp),
        itemSpacing = 8.dp,
    ) { index ->
        ElevatedCard(Modifier.height(120.dp).fillMaxWidth().maskClip(MaterialTheme.shapes.large)) {
            Box(Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.Center) {
                Text(places[index])
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshDocsDemo(modifier: Modifier = Modifier) {
    PullToRefreshBox(
        isRefreshing = false,
        onRefresh = {},
        modifier = modifier.padding(16.dp).width(360.dp).height(140.dp),
    ) {
        Column(
            Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text("下拉这个区域")
            Text("行程会在这里更新")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TooltipDocsDemo(modifier: Modifier = Modifier) {
    Column(
        modifier.padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Surface(
            shape = TooltipDefaults.plainTooltipContainerShape,
            color = TooltipDefaults.plainTooltipContainerColor,
            contentColor = TooltipDefaults.plainTooltipContentColor,
        ) {
            Text("长按或悬停", modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp))
        }
        Button(onClick = {}) { Text("带提示的按钮") }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetDocsDemo(modifier: Modifier = Modifier) {
    Box(modifier.width(360.dp).height(280.dp)) {
        Box(Modifier.fillMaxSize().background(BottomSheetDefaults.ScrimColor))
        Text("页面内容", Modifier.padding(16.dp))
        Surface(
            modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth(),
            shape = BottomSheetDefaults.ExpandedShape,
            color = BottomSheetDefaults.ContainerColor,
            shadowElevation = BottomSheetDefaults.Elevation,
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                BottomSheetDefaults.DragHandle()
                Column(
                    Modifier.padding(start = 24.dp, end = 24.dp, bottom = 24.dp).fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    Text("底部菜单")
                    Text("用来确认、挑选或补充一小段操作。")
                    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) { Text("知道了") }
                }
            }
        }
    }
}
