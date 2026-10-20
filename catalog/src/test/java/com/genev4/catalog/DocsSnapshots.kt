package com.genev4.catalog

import androidx.compose.runtime.Composable
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams.RenderingMode
import com.genev4.catalog.docs.AlertBannerDocsDemo
import com.genev4.catalog.docs.AlertBannerElevatedDocsDemo
import com.genev4.catalog.docs.AlertBannerOptionsDocsDemo
import com.genev4.catalog.docs.AiInputAttachmentsDocsDemo
import com.genev4.catalog.docs.AiInputContainerAttachmentsDocsDemo
import com.genev4.catalog.docs.AiInputContainerDocsDemo
import com.genev4.catalog.docs.AiInputContainerListeningDocsDemo
import com.genev4.catalog.docs.AiInputDocsDemo
import com.genev4.catalog.docs.AiInputListeningDocsDemo
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
import com.genev4.catalog.docs.MenusDocsDemo
import com.genev4.catalog.docs.MenusGroupsDocsDemo
import com.genev4.catalog.docs.MenusUsageAnchorsDocsDemo
import com.genev4.catalog.docs.MenusUsageFieldsDocsDemo
import com.genev4.catalog.docs.MenusVibrantDocsDemo
import com.genev4.catalog.docs.ModalCatalogDocsDemo
import com.genev4.catalog.docs.ModalDefaultDocsDemo
import com.genev4.catalog.docs.ModalHeroDocsDemo
import com.genev4.catalog.docs.ModalLoadingDocsDemo
import com.genev4.catalog.docs.ModalTourDocsDemo
import com.genev4.catalog.docs.NavigationBarDocsDemo
import com.genev4.catalog.docs.NavigationRailDocsDemo
import com.genev4.catalog.docs.PullToRefreshDocsDemo
import com.genev4.catalog.docs.ScaffoldDocsDemo
import com.genev4.catalog.docs.SearchBarDefaultDocsDemo
import com.genev4.catalog.docs.SearchBarDefaultResultsDocsDemo
import com.genev4.catalog.docs.SearchBarMobileDocsDemo
import com.genev4.catalog.docs.SearchBarMobileResultsDocsDemo
import com.genev4.catalog.docs.SearchDocsDemo
import com.genev4.catalog.docs.SegmentedButtonDocsDemo
import com.genev4.catalog.docs.SelectionDocsDemo
import com.genev4.catalog.docs.ProcessStepperHorizontalEmptyDocsDemo
import com.genev4.catalog.docs.ProcessStepperHorizontalIconDocsDemo
import com.genev4.catalog.docs.ProcessStepperHorizontalNumberDocsDemo
import com.genev4.catalog.docs.ProcessStepperVerticalEmptyDocsDemo
import com.genev4.catalog.docs.ProcessStepperVerticalIconDocsDemo
import com.genev4.catalog.docs.ProcessStepperVerticalNumberDocsDemo
import com.genev4.catalog.docs.SliderDocsDemo
import com.genev4.catalog.docs.SnackbarDocsDemo
import com.genev4.catalog.docs.TabsDocsDemo
import com.genev4.catalog.docs.ActionInputDocsDemo
import com.genev4.catalog.docs.TextAreaDocsDemo
import com.genev4.catalog.docs.TextFieldDocsDemo
import com.genev4.catalog.docs.TextInputDocsDemo
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
    fun aiInput() = aiInputShot("ai-input") { AiInputDocsDemo() }

    @Test
    fun aiInputContainer() = aiInputShot("ai-input-container") { AiInputContainerDocsDemo() }

    @Test
    fun aiInputListening() = aiInputShot("ai-input-listening") { AiInputListeningDocsDemo() }

    @Test
    fun aiInputContainerListening() =
        aiInputShot("ai-input-container-listening") { AiInputContainerListeningDocsDemo() }

    @Test
    fun aiInputAttachments() = aiInputShot("ai-input-attachments") { AiInputAttachmentsDocsDemo() }

    @Test
    fun aiInputContainerAttachments() =
        aiInputShot("ai-input-container-attachments") { AiInputContainerAttachmentsDocsDemo() }

    private fun aiInputShot(name: String, content: @Composable () -> Unit) {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 2400, screenHeight = 4200))
        paparazzi.snapshot(name = name) { DocsTheme { content() } }
    }

    @Test
    fun textField() {
        paparazzi.snapshot(name = "text-field") {
            DocsTheme { TextFieldDocsDemo() }
        }
    }

    @Test
    fun textInput() {
        paparazzi.snapshot(name = "text-input") {
            DocsTheme { TextInputDocsDemo() }
        }
    }

    @Test
    fun textArea() {
        paparazzi.snapshot(name = "text-area") {
            DocsTheme { TextAreaDocsDemo() }
        }
    }

    @Test
    fun actionInput() {
        paparazzi.snapshot(name = "action-input") {
            DocsTheme { ActionInputDocsDemo() }
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
    @Test
    fun processStepper() =
        paparazzi.snapshot(name = "process-stepper") {
            DocsTheme { ProcessStepperHorizontalNumberDocsDemo() }
        }

    @Test
    fun processStepperHorizontalNumber() =
        paparazzi.snapshot(name = "process-stepper-horizontal-number") {
            DocsTheme { ProcessStepperHorizontalNumberDocsDemo() }
        }
    @Test
    fun processStepperHorizontalIcon() =
        paparazzi.snapshot(name = "process-stepper-horizontal-icon") {
            DocsTheme { ProcessStepperHorizontalIconDocsDemo() }
        }
    @Test
    fun processStepperHorizontalEmpty() =
        paparazzi.snapshot(name = "process-stepper-horizontal-empty") {
            DocsTheme { ProcessStepperHorizontalEmptyDocsDemo() }
        }
    @Test
    fun processStepperVerticalNumber() =
        paparazzi.snapshot(name = "process-stepper-vertical-number") {
            DocsTheme { ProcessStepperVerticalNumberDocsDemo() }
        }
    @Test
    fun processStepperVerticalIcon() =
        paparazzi.snapshot(name = "process-stepper-vertical-icon") {
            DocsTheme { ProcessStepperVerticalIconDocsDemo() }
        }
    @Test
    fun processStepperVerticalEmpty() =
        paparazzi.snapshot(name = "process-stepper-vertical-empty") {
            DocsTheme { ProcessStepperVerticalEmptyDocsDemo() }
        }
    @Test fun list() = paparazzi.snapshot(name = "list") { DocsTheme { ListDocsDemo() } }
    @Test fun tabs() = paparazzi.snapshot(name = "tabs") { DocsTheme { TabsDocsDemo() } }
    @Test fun navigationRail() = paparazzi.snapshot(name = "navigation-rail") { DocsTheme { NavigationRailDocsDemo() } }
    @Test fun appBar() = paparazzi.snapshot(name = "app-bar") { DocsTheme { AppBarDocsDemo() } }
    @Test fun menu() = paparazzi.snapshot(name = "menu") { DocsTheme { MenuDocsDemo() } }

    @Test
    fun menus() = paparazzi.snapshot(name = "menus") { DocsTheme { MenusDocsDemo() } }

    @Test
    fun menusGroups() = paparazzi.snapshot(name = "menus-groups") { DocsTheme { MenusGroupsDocsDemo() } }

    @Test
    fun menusVibrant() = paparazzi.snapshot(name = "menus-vibrant") { DocsTheme { MenusVibrantDocsDemo() } }

    @Test
    fun menusUsageFields() {
        // Two 208dp anchors plus padding are wider than Pixel 5.
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 1800, screenHeight = 1600))
        paparazzi.snapshot(name = "menus-usage") { DocsTheme { MenusUsageFieldsDocsDemo() } }
    }

    @Test
    fun menusUsageAnchors() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 1800, screenHeight = 1600))
        paparazzi.snapshot(name = "menus-usage-anchors") {
            DocsTheme { MenusUsageAnchorsDocsDemo() }
        }
    }

    @Test fun search() = paparazzi.snapshot(name = "search") { DocsTheme { SearchDocsDemo() } }

    @Test
    fun searchBar() = paparazzi.snapshot(name = "search-bar") { DocsTheme { SearchBarDefaultDocsDemo() } }

    @Test
    fun searchBarDefaultResults() =
        paparazzi.snapshot(name = "search-bar-default-results") {
            DocsTheme { SearchBarDefaultResultsDocsDemo() }
        }

    @Test
    fun searchBarMobile() =
        paparazzi.snapshot(name = "search-bar-mobile") { DocsTheme { SearchBarMobileDocsDemo() } }

    @Test
    fun searchBarMobileResults() =
        paparazzi.snapshot(name = "search-bar-mobile-results") {
            DocsTheme { SearchBarMobileResultsDocsDemo() }
        }
    @Test fun datePicker() = paparazzi.snapshot(name = "date-picker") { DocsTheme { DatePickerDocsDemo() } }
    @Test fun timePicker() = paparazzi.snapshot(name = "time-picker") { DocsTheme { TimePickerDocsDemo() } }
    @Test fun carousel() = paparazzi.snapshot(name = "carousel") { DocsTheme { CarouselDocsDemo() } }
    @Test fun pullToRefresh() = paparazzi.snapshot(name = "pull-to-refresh") { DocsTheme { PullToRefreshDocsDemo() } }
    @Test
    fun alertBanner() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 2400, screenHeight = 3200))
        paparazzi.snapshot(name = "alert-banner") { DocsTheme { AlertBannerDocsDemo() } }
    }

    @Test
    fun alertBannerElevated() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 2400, screenHeight = 3200))
        paparazzi.snapshot(name = "alert-banner-elevated") {
            DocsTheme { AlertBannerElevatedDocsDemo() }
        }
    }

    @Test
    fun alertBannerOptions() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 2400, screenHeight = 3200))
        paparazzi.snapshot(name = "alert-banner-options") {
            DocsTheme { AlertBannerOptionsDocsDemo() }
        }
    }

    @Test fun tooltip() = paparazzi.snapshot(name = "tooltip") { DocsTheme { TooltipDocsDemo() } }
    @Test fun bottomSheet() = paparazzi.snapshot(name = "bottom-sheet") { DocsTheme { BottomSheetDocsDemo() } }

    @Test
    fun modal() = paparazzi.snapshot(name = "modal") { DocsTheme { ModalCatalogDocsDemo() } }

    @Test
    fun modalDefault() {
        // Narrow 448dp + Wide 640dp + gaps; Pixel 5 density ≈ 2.625.
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 3400, screenHeight = 6200))
        paparazzi.snapshot(name = "modal-default") { DocsTheme { ModalDefaultDocsDemo() } }
    }

    @Test
    fun modalLoading() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 1600, screenHeight = 4200))
        paparazzi.snapshot(name = "modal-loading") { DocsTheme { ModalLoadingDocsDemo() } }
    }

    @Test
    fun modalHero() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 1200, screenHeight = 2200))
        paparazzi.snapshot(name = "modal-hero") { DocsTheme { ModalHeroDocsDemo() } }
    }

    @Test
    fun modalTour() {
        paparazzi.unsafeUpdateConfig(modalDevice(screenWidth = 2800, screenHeight = 4200))
        paparazzi.snapshot(name = "modal-tour") { DocsTheme { ModalTourDocsDemo() } }
    }
}

private fun modalDevice(screenWidth: Int, screenHeight: Int) =
    DeviceConfig.PIXEL_5.copy(
        softButtons = false,
        screenWidth = screenWidth,
        screenHeight = screenHeight,
    )
