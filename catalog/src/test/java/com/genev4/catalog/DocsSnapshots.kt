package com.genev4.catalog

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams.RenderingMode
import com.genev4.catalog.docs.AppBarDocsDemo
import com.genev4.catalog.docs.BottomSheetDocsDemo
import com.genev4.catalog.docs.ButtonDocsDemo
import com.genev4.catalog.docs.CarouselDocsDemo
import com.genev4.catalog.docs.CardDocsDemo
import com.genev4.catalog.docs.ChipDocsDemo
import com.genev4.catalog.docs.DatePickerDocsDemo
import com.genev4.catalog.docs.DialogDocsDemo
import com.genev4.catalog.docs.DocsTheme
import com.genev4.catalog.docs.FabDocsDemo
import com.genev4.catalog.docs.IconButtonDocsDemo
import com.genev4.catalog.docs.ListDocsDemo
import com.genev4.catalog.docs.MenuDocsDemo
import com.genev4.catalog.docs.NavigationBarDocsDemo
import com.genev4.catalog.docs.NavigationRailDocsDemo
import com.genev4.catalog.docs.PullToRefreshDocsDemo
import com.genev4.catalog.docs.ScaffoldDocsDemo
import com.genev4.catalog.docs.SearchDocsDemo
import com.genev4.catalog.docs.SegmentedButtonDocsDemo
import com.genev4.catalog.docs.SelectionDocsDemo
import com.genev4.catalog.docs.SliderDocsDemo
import com.genev4.catalog.docs.SnackbarDocsDemo
import com.genev4.catalog.docs.TabsDocsDemo
import com.genev4.catalog.docs.TextFieldDocsDemo
import com.genev4.catalog.docs.TimePickerDocsDemo
import com.genev4.catalog.docs.TooltipDocsDemo
import org.junit.Rule
import org.junit.Test

/**
 * Renders real GeneV4 composables for the documentation site.
 * Run: `gradlew :catalog:recordPaparazziDebug` then images land in docs/public/components/.
 * Opening the catalog App does **not** take screenshots.
 */
class DocsSnapshots {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5.copy(softButtons = false),
        theme = "android:Theme.Material.Light.NoActionBar",
        renderingMode = RenderingMode.SHRINK,
        maxPercentDifference = 1.0,
    )

    @Test
    fun button() {
        paparazzi.snapshot(name = "button") {
            DocsTheme { ButtonDocsDemo() }
        }
    }

    @Test
    fun card() {
        paparazzi.snapshot(name = "card") {
            DocsTheme { CardDocsDemo() }
        }
    }

    @Test
    fun textField() {
        paparazzi.snapshot(name = "text-field") {
            DocsTheme { TextFieldDocsDemo() }
        }
    }

    @Test
    fun navigationBar() {
        paparazzi.snapshot(name = "navigation-bar") {
            DocsTheme { NavigationBarDocsDemo() }
        }
    }

    @Test
    fun scaffold() {
        paparazzi.snapshot(name = "scaffold") {
            DocsTheme { ScaffoldDocsDemo() }
        }
    }

    @Test
    fun dialog() {
        paparazzi.snapshot(name = "dialog") {
            DocsTheme { DialogDocsDemo() }
        }
    }

    @Test
    fun snackbar() {
        paparazzi.snapshot(name = "snackbar") {
            DocsTheme { SnackbarDocsDemo() }
        }
    }

    @Test fun iconButton() = paparazzi.snapshot(name = "icon-button") { DocsTheme { IconButtonDocsDemo() } }
    @Test fun fab() = paparazzi.snapshot(name = "fab") { DocsTheme { FabDocsDemo() } }
    @Test fun chip() = paparazzi.snapshot(name = "chip") { DocsTheme { ChipDocsDemo() } }
    @Test fun segmentedButton() = paparazzi.snapshot(name = "segmented-button") { DocsTheme { SegmentedButtonDocsDemo() } }
    @Test fun selection() = paparazzi.snapshot(name = "selection") { DocsTheme { SelectionDocsDemo() } }
    @Test fun slider() = paparazzi.snapshot(name = "slider") { DocsTheme { SliderDocsDemo() } }
    @Test fun list() = paparazzi.snapshot(name = "list") { DocsTheme { ListDocsDemo() } }
    @Test fun tabs() = paparazzi.snapshot(name = "tabs") { DocsTheme { TabsDocsDemo() } }
    @Test fun navigationRail() = paparazzi.snapshot(name = "navigation-rail") { DocsTheme { NavigationRailDocsDemo() } }
    @Test fun appBar() = paparazzi.snapshot(name = "app-bar") { DocsTheme { AppBarDocsDemo() } }
    @Test fun menu() = paparazzi.snapshot(name = "menu") { DocsTheme { MenuDocsDemo() } }
    @Test fun search() = paparazzi.snapshot(name = "search") { DocsTheme { SearchDocsDemo() } }
    @Test fun datePicker() = paparazzi.snapshot(name = "date-picker") { DocsTheme { DatePickerDocsDemo() } }
    @Test fun timePicker() = paparazzi.snapshot(name = "time-picker") { DocsTheme { TimePickerDocsDemo() } }
    @Test fun carousel() = paparazzi.snapshot(name = "carousel") { DocsTheme { CarouselDocsDemo() } }
    @Test fun pullToRefresh() = paparazzi.snapshot(name = "pull-to-refresh") { DocsTheme { PullToRefreshDocsDemo() } }
    @Test fun tooltip() = paparazzi.snapshot(name = "tooltip") { DocsTheme { TooltipDocsDemo() } }
    @Test fun bottomSheet() = paparazzi.snapshot(name = "bottom-sheet") { DocsTheme { BottomSheetDocsDemo() } }
}
