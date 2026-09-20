package com.genev4.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import com.genev4.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.genev4.AssistChip
import com.genev4.BadgedBox
import com.genev4.Badge
import com.genev4.BottomAppBar
import com.genev4.Button
import com.genev4.Card
import com.genev4.Checkbox
import com.genev4.CircularProgressIndicator
import com.genev4.DatePicker
import com.genev4.DockedSearchBar
import com.genev4.DrawerValue
import com.genev4.DropdownMenu
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
import com.genev4.MaterialTheme
import com.genev4.ModalBottomSheet
import com.genev4.ModalDrawerSheet
import com.genev4.ModalNavigationDrawer
import com.genev4.MultiChoiceSegmentedButtonRow
import com.genev4.NavigationDrawerItem
import com.genev4.NavigationRail
import com.genev4.NavigationRailItem
import com.genev4.OutlinedButton
import com.genev4.OutlinedCard
import com.genev4.OutlinedIconButton
import com.genev4.OutlinedSecureTextField
import com.genev4.OutlinedTextField
import com.genev4.PlainTooltip
import com.genev4.PrimaryTabRow
import com.genev4.RadioButton
import com.genev4.RangeSlider
import com.genev4.SecondaryTabRow
import com.genev4.SecureTextField
import com.genev4.SegmentedButton
import com.genev4.SegmentedButtonDefaults
import com.genev4.ShortNavigationBar
import com.genev4.ShortNavigationBarItem
import com.genev4.SingleChoiceSegmentedButtonRow
import com.genev4.Slider
import com.genev4.SmallFloatingActionButton
import com.genev4.Snackbar
import com.genev4.SuggestionChip
import com.genev4.SwipeToDismissBox
import com.genev4.Switch
import com.genev4.Tab
import com.genev4.Text
import com.genev4.TextButton
import com.genev4.TextField
import com.genev4.TimePicker
import com.genev4.TooltipAnchorPosition
import com.genev4.TooltipBox
import com.genev4.TooltipDefaults
import com.genev4.TriStateCheckbox
import com.genev4.VerticalDivider
import com.genev4.carousel.HorizontalMultiBrowseCarousel
import com.genev4.carousel.rememberCarouselState
import com.genev4.rememberDatePickerState
import com.genev4.rememberDrawerState
import com.genev4.rememberModalBottomSheetState
import com.genev4.rememberSwipeToDismissBoxState
import com.genev4.rememberTimePickerState
import com.genev4.rememberTooltipState
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun ComponentGallery(modifier: Modifier = Modifier) {
    var filled by remember { mutableStateOf("") }
    var outlined by remember { mutableStateOf("") }
    val password = rememberTextFieldState()
    val outlinedPassword = rememberTextFieldState()
    var checked by remember { mutableStateOf(true) }
    var tri by remember { mutableStateOf(ToggleableState.Indeterminate) }
    var switched by remember { mutableStateOf(true) }
    var radio by remember { mutableIntStateOf(0) }
    var slider by remember { mutableFloatStateOf(0.45f) }
    var range by remember { mutableStateOf(0.2f..0.7f) }
    var filter by remember { mutableStateOf(true) }
    var inputChip by remember { mutableStateOf(true) }
    var segment by remember { mutableIntStateOf(0) }
    var multi by remember { mutableStateOf(setOf(0)) }
    var tab by remember { mutableIntStateOf(0) }
    var secondaryTab by remember { mutableIntStateOf(1) }
    var menu by remember { mutableStateOf(false) }
    var exposed by remember { mutableStateOf(false) }
    var exposedValue by remember { mutableStateOf("杭州") }
    var search by remember { mutableStateOf("") }
    var searchActive by remember { mutableStateOf(false) }
    var sheet by remember { mutableStateOf(false) }
    var refreshing by remember { mutableStateOf(false) }
    var rail by remember { mutableIntStateOf(0) }
    var shortBar by remember { mutableIntStateOf(0) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val dismissState = rememberSwipeToDismissBoxState()
    val carouselState = rememberCarouselState { 4 }
    val dateState = rememberDatePickerState()
    val timeState = rememberTimePickerState(initialHour = 9, initialMinute = 30, is24Hour = true)
    val tooltipState = rememberTooltipState()
    val places = listOf("西湖", "灵隐", "九溪", "河坊街")

    ModalNavigationDrawer(
        modifier = modifier,
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(
                    "目录",
                    modifier = Modifier.padding(horizontal = 28.dp, vertical = 16.dp),
                    style = MaterialTheme.typography.titleMedium,
                )
                listOf("按钮", "输入", "导航", "反馈").forEachIndexed { index, label ->
                    NavigationDrawerItem(
                        label = { Text(label) },
                        selected = index == 0,
                        onClick = { scope.launch { drawerState.close() } },
                    )
                }
            }
        },
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(28.dp),
        ) {
            item {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("组件", style = MaterialTheme.typography.headlineMedium)
                    Text(
                        "库里的常用控件。点按可以切换状态。",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
            item {
                Section("按钮") {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(onClick = {}) { Text("填充") }
                        Button(onClick = {}, enabled = false) { Text("禁用") }
                        ElevatedButton(onClick = {}) { Text("抬升") }
                        FilledTonalButton(onClick = {}) { Text("色调") }
                        OutlinedButton(onClick = {}) { Text("描边") }
                        TextButton(onClick = {}) { Text("文字") }
                    }
                }
            }
            item {
                Section("图标按钮") {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        IconButton(onClick = {}) { Text("常") }
                        FilledIconButton(onClick = {}) { Text("填") }
                        FilledTonalIconButton(onClick = {}) { Text("调") }
                        OutlinedIconButton(onClick = {}) { Text("边") }
                    }
                }
            }
            item {
                Section("浮动按钮") {
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        itemVerticalAlignment = Alignment.CenterVertically,
                    ) {
                        SmallFloatingActionButton(onClick = {}) { Text("小") }
                        FloatingActionButton(onClick = {}) { Text("+") }
                        LargeFloatingActionButton(onClick = {}) { Text("大") }
                        ExtendedFloatingActionButton(onClick = {}) { Text("扩展") }
                    }
                }
            }
            item {
                Section("纸片") {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        AssistChip(onClick = {}, label = { Text("辅助") })
                        ElevatedAssistChip(onClick = {}, label = { Text("抬升辅助") })
                        FilterChip(selected = filter, onClick = { filter = !filter }, label = { Text("筛选") })
                        ElevatedFilterChip(selected = !filter, onClick = { filter = !filter }, label = { Text("抬升筛选") })
                        InputChip(selected = inputChip, onClick = { inputChip = !inputChip }, label = { Text("输入") })
                        SuggestionChip(onClick = {}, label = { Text("建议") })
                        ElevatedSuggestionChip(onClick = {}, label = { Text("抬升建议") })
                    }
                }
            }
            item {
                Section("分段按钮") {
                    val labels = listOf("列表", "地图", "日历")
                    SingleChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
                        labels.forEachIndexed { index, label ->
                            SegmentedButton(
                                selected = segment == index,
                                onClick = { segment = index },
                                shape = SegmentedButtonDefaults.itemShape(index, labels.size),
                                label = { Text(label) },
                            )
                        }
                    }
                    val checks = listOf("步行", "地铁")
                    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
                        checks.forEachIndexed { index, label ->
                            SegmentedButton(
                                checked = index in multi,
                                onCheckedChange = { on ->
                                    multi = if (on) multi + index else multi - index
                                },
                                shape = SegmentedButtonDefaults.itemShape(index, checks.size),
                                label = { Text(label) },
                            )
                        }
                    }
                }
            }
            item {
                Section("文本框") {
                    TextField(
                        value = filled,
                        onValueChange = { filled = it },
                        label = { Text("填充") },
                        modifier = Modifier.fillMaxWidth(),
                    )
                    OutlinedTextField(
                        value = outlined,
                        onValueChange = { outlined = it },
                        label = { Text("描边") },
                        isError = outlined == "error",
                        supportingText = { if (outlined == "error") Text("输入 error 查看错误态") },
                        modifier = Modifier.fillMaxWidth(),
                    )
                    SecureTextField(
                        state = password,
                        label = { Text("密码") },
                        modifier = Modifier.fillMaxWidth(),
                    )
                    OutlinedSecureTextField(
                        state = outlinedPassword,
                        label = { Text("描边密码") },
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
            item {
                Section("搜索") {
                    @Suppress("DEPRECATION")
                    DockedSearchBar(
                        query = search,
                        onQueryChange = { search = it },
                        onSearch = { searchActive = false },
                        active = searchActive,
                        onActiveChange = { searchActive = it },
                        placeholder = { Text("搜索地点") },
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        places.filter { search.isBlank() || it.contains(search) }.forEach { place ->
                            ListItem(
                                headlineContent = { Text(place) },
                                modifier = Modifier.fillMaxWidth(),
                            )
                        }
                    }
                }
            }
            item {
                Section("下拉") {
                    Box {
                        OutlinedButton(onClick = { menu = true }) { Text("打开菜单") }
                        DropdownMenu(
                            expanded = menu,
                            onDismissRequest = { menu = false },
                            properties = PopupProperties(focusable = true),
                        ) {
                            DropdownMenuItem(text = { Text("编辑") }, onClick = { menu = false })
                            DropdownMenuItem(text = { Text("分享") }, onClick = { menu = false })
                            DropdownMenuItem(text = { Text("删除") }, onClick = { menu = false })
                        }
                    }
                    ExposedDropdownMenuBox(expanded = exposed, onExpandedChange = { exposed = it }) {
                        OutlinedTextField(
                            value = exposedValue,
                            onValueChange = {},
                            readOnly = true,
                            label = { Text("城市") },
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = exposed) },
                            modifier = Modifier
                                .menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable)
                                .fillMaxWidth(),
                        )
                        ExposedDropdownMenu(expanded = exposed, onDismissRequest = { exposed = false }) {
                            listOf("杭州", "上海", "京都").forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        exposedValue = option
                                        exposed = false
                                    },
                                )
                            }
                        }
                    }
                }
            }
            item {
                Section("选择") {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(checked = checked, onCheckedChange = { checked = it })
                        Text("复选")
                        Checkbox(checked = false, onCheckedChange = null, enabled = false)
                        Text("禁用")
                        TriStateCheckbox(
                            state = tri,
                            onClick = {
                                tri = when (tri) {
                                    ToggleableState.Off -> ToggleableState.Indeterminate
                                    ToggleableState.Indeterminate -> ToggleableState.On
                                    ToggleableState.On -> ToggleableState.Off
                                }
                            },
                        )
                        Text("三态")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Switch(checked = switched, onCheckedChange = { switched = it })
                        Text("开关")
                        Switch(checked = false, onCheckedChange = null, enabled = false)
                        Text("禁用")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        listOf("上午", "下午").forEachIndexed { index, label ->
                            RadioButton(selected = radio == index, onClick = { radio = index })
                            Text(label)
                        }
                    }
                }
            }
            item {
                Section("滑条与进度") {
                    Text("进度 ${(slider * 100).toInt()}%")
                    Slider(value = slider, onValueChange = { slider = it })
                    Text("区间")
                    RangeSlider(value = range, onValueChange = { range = it })
                    LinearProgressIndicator(progress = { slider }, modifier = Modifier.fillMaxWidth())
                    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                    CircularProgressIndicator(progress = { slider })
                    CircularProgressIndicator()
                }
            }
            item {
                Section("卡片") {
                    Card(Modifier.fillMaxWidth()) {
                        Text("填充卡片", Modifier.padding(16.dp))
                    }
                    ElevatedCard(Modifier.fillMaxWidth()) {
                        Text("抬升卡片", Modifier.padding(16.dp))
                    }
                    OutlinedCard(Modifier.fillMaxWidth()) {
                        Text("描边卡片", Modifier.padding(16.dp))
                    }
                }
            }
            item {
                Section("列表、徽章、分割线") {
                    BadgedBox(badge = { Badge { Text("3") } }) {
                        Text("收件箱", style = MaterialTheme.typography.titleMedium)
                    }
                    ListItem(
                        overlineContent = { Text("今天") },
                        headlineContent = { Text("两行列表") },
                        supportingContent = { Text("辅助说明") },
                        trailingContent = { Text("12:30") },
                    )
                    HorizontalDivider()
                    Row(Modifier.height(24.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("左")
                        VerticalDivider(Modifier.padding(horizontal = 12.dp))
                        Text("右")
                    }
                    SwipeToDismissBox(
                        state = dismissState,
                        backgroundContent = {
                            Box(Modifier.fillMaxSize().padding(horizontal = 16.dp), contentAlignment = Alignment.CenterEnd) {
                                Text("删除")
                            }
                        },
                    ) {
                        ListItem(headlineContent = { Text("滑动这项") }, supportingContent = { Text("向一侧滑开") })
                    }
                }
            }
            item {
                Section("标签页") {
                    PrimaryTabRow(selectedTabIndex = tab) {
                        listOf("概览", "行程", "花费").forEachIndexed { index, label ->
                            Tab(selected = tab == index, onClick = { tab = index }, text = { Text(label) })
                        }
                    }
                    SecondaryTabRow(selectedTabIndex = secondaryTab) {
                        listOf("全部", "未完成").forEachIndexed { index, label ->
                            Tab(selected = secondaryTab == index, onClick = { secondaryTab = index }, text = { Text(label) })
                        }
                    }
                }
            }
            item {
                Section("导航") {
                    Button(onClick = { scope.launch { drawerState.open() } }) { Text("打开抽屉") }
                    Row(Modifier.height(220.dp)) {
                        NavigationRail {
                            listOf("家", "搜", "我").forEachIndexed { index, label ->
                                NavigationRailItem(
                                    selected = rail == index,
                                    onClick = { rail = index },
                                    icon = { Text(label) },
                                    label = { Text(label) },
                                )
                            }
                        }
                        Text(
                            "侧栏选中「${listOf("家", "搜", "我")[rail]}」",
                            modifier = Modifier.padding(16.dp),
                        )
                    }
                    ShortNavigationBar(windowInsets = androidx.compose.foundation.layout.WindowInsets(0.dp)) {
                        listOf("消息", "行程").forEachIndexed { index, label ->
                            ShortNavigationBarItem(
                                selected = shortBar == index,
                                onClick = { shortBar = index },
                                icon = { Text(label.take(1)) },
                                label = { Text(label) },
                            )
                        }
                    }
                    BottomAppBar(
                        windowInsets = androidx.compose.foundation.layout.WindowInsets(0.dp),
                        actions = {
                            TextButton(onClick = {}) { Text("归档") }
                            TextButton(onClick = {}) { Text("更多") }
                        },
                    )
                }
            }
            item {
                Section("轮播") {
                    HorizontalMultiBrowseCarousel(
                        state = carouselState,
                        preferredItemWidth = 180.dp,
                        modifier = Modifier.fillMaxWidth().height(132.dp),
                        itemSpacing = 8.dp,
                    ) { index ->
                        ElevatedCard(
                            Modifier
                                .height(120.dp)
                                .fillMaxWidth()
                                .maskClip(MaterialTheme.shapes.large),
                        ) {
                            Box(Modifier.fillMaxSize().padding(16.dp), contentAlignment = Alignment.BottomStart) {
                                Text(places[index], style = MaterialTheme.typography.titleLarge)
                            }
                        }
                    }
                }
            }
            item {
                Section("下拉刷新") {
                    PullToRefreshBox(
                        isRefreshing = refreshing,
                        onRefresh = { refreshing = !refreshing },
                        modifier = Modifier.fillMaxWidth().height(140.dp),
                    ) {
                        Column(
                            Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState())
                                .padding(16.dp),
                        ) {
                            Text(if (refreshing) "正在刷新，再拉一次结束" else "下拉这个区域")
                            Text("行程会在这里更新", color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                    }
                }
            }
            item {
                Section("提示、对话框、底部菜单") {
                    TooltipBox(
                        positionProvider = TooltipDefaults.rememberTooltipPositionProvider(
                            TooltipAnchorPosition.Above,
                        ),
                        tooltip = { PlainTooltip { Text("长按或悬停") } },
                        state = tooltipState,
                    ) {
                        Button(onClick = {}) { Text("带提示的按钮") }
                    }
                    Snackbar(action = { TextButton(onClick = {}) { Text("撤销") } }) {
                        Text("已保存更改")
                    }
                    Button(onClick = { sheet = true }) { Text("打开底部菜单") }
                }
            }
            item {
                Section("日期") {
                    DatePicker(state = dateState)
                }
            }
            item {
                Section("时间") {
                    TimePicker(state = timeState)
                }
            }
        }
    }

    if (sheet) {
        ModalBottomSheet(
            onDismissRequest = { sheet = false },
            sheetState = rememberModalBottomSheetState(),
        ) {
            Column(Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("底部菜单", style = MaterialTheme.typography.titleLarge)
                Text("用来确认、挑选或补充一小段操作。")
                Button(onClick = { sheet = false }, modifier = Modifier.fillMaxWidth()) { Text("知道了") }
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(title, style = MaterialTheme.typography.titleLarge)
        content()
    }
}
