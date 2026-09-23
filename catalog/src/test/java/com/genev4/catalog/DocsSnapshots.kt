package com.genev4.catalog

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams.RenderingMode
import com.genev4.catalog.docs.ButtonDocsDemo
import com.genev4.catalog.docs.CardDocsDemo
import com.genev4.catalog.docs.DialogDocsDemo
import com.genev4.catalog.docs.DocsTheme
import com.genev4.catalog.docs.NavigationBarDocsDemo
import com.genev4.catalog.docs.ScaffoldDocsDemo
import com.genev4.catalog.docs.SnackbarDocsDemo
import com.genev4.catalog.docs.TextFieldDocsDemo
import org.junit.Rule
import org.junit.Test

/**
 * Renders real GeneV4 composables for the documentation site.
 * Run: `gradlew :catalog:recordPaparazziDebug` then images land in website/public/components/.
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
}
