package com.genev4.catalog

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.genev4.Icon
import com.genev4.MaterialTheme
import com.genev4.NavigationBar
import com.genev4.NavigationBarItem
import com.genev4.Scaffold
import com.genev4.Text
import com.genev4.darkColorScheme
import com.genev4.lightColorScheme

private data class CatalogTab(val label: String, val icon: ImageVector)

@Composable
fun CatalogApp() {
    var dark by remember { mutableStateOf(false) }
    var tab by remember { mutableIntStateOf(0) }
    val tabs = listOf(
        CatalogTab("控件", Icons.Filled.List),
        CatalogTab("旅程", Icons.Filled.DateRange),
        CatalogTab("个人", Icons.Filled.Person),
    )

    MaterialTheme(colorScheme = if (dark) darkColorScheme() else lightColorScheme()) {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    tabs.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = tab == index,
                            onClick = { tab = index },
                            icon = { Icon(item.icon, contentDescription = item.label) },
                            label = { Text(item.label) },
                        )
                    }
                }
            },
        ) { inner ->
            when (tab) {
                0 -> ComponentGallery(Modifier.padding(inner))
                1 -> TripScene(Modifier.padding(inner))
                else -> AccountScene(
                    modifier = Modifier.padding(inner),
                    dark = dark,
                    onDarkChange = { dark = it },
                )
            }
        }
    }
}
