/*
 * Copyright 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.genev4

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.paneTitle
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.genev4.internal.Icons
import com.genev4.internal.ProvideContentColorTextStyle
import com.genev4.internal.Strings
import com.genev4.internal.getString
import com.genev4.tokens.ElevationTokens
import kotlin.math.max
import kotlin.math.min

/** Narrow stacks actions. Wide places them on the trailing edge. */
enum class ModalWidth {
    Narrow,
    Wide,
}

/** Semantic color of the leading icon and the confirm button. */
enum class ModalVariant {
    Neutral,
    System,
    Informational,
    Success,
    Error,
    Destructive,
}

/** Loading modal scale. Small is only the progress mark. */
enum class LoadingModalSize {
    Large,
    Medium,
    Small,
}

/** Modal draws a dialog. Inline draws the same card in the page. */
enum class LoadingModalContainer {
    Modal,
    Inline,
}

/** In-progress spinner, or the completed check. */
enum class LoadingModalPhase {
    Progress,
    Success,
}

/** Hero card width from the design: phone, tablet, desktop. */
enum class HeroModalSize {
    Mobile,
    Tablet,
    Desktop,
}

/** Footer of a hero or feature tour. */
enum class ModalFooter {
    Actions,
    Walkthrough,
}

/** Which edge of a feature tour grows the caret. */
enum class ModalCaretSide {
    Top,
    Bottom,
    Start,
    End,
}

/** Where along that edge the caret sits. */
enum class ModalCaretAlign {
    Start,
    Center,
    End,
}

/**
 * Gene confirmation modal.
 *
 * Narrow prefers 448dp (max 448). Wide prefers 640dp. Actions sit on the
 * trailing edge. [AlertDialog] stays the Material dialog.
 */
@Composable
fun Modal(
    onDismissRequest: () -> Unit,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    tertiaryButton: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    subtitle: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    showHeader: Boolean = true,
    showIcon: Boolean = true,
    showClose: Boolean = true,
    width: ModalWidth = ModalWidth.Narrow,
    variant: ModalVariant = ModalVariant.Neutral,
    properties: DialogProperties = ModalDefaults.dialogProperties,
) {
    ModalDialog(onDismissRequest = onDismissRequest, properties = properties) { available ->
        ModalCard(
            confirmButton = confirmButton,
            modifier = modifier.width(resolvedModalWidth(available, width)),
            dismissButton = dismissButton,
            tertiaryButton = tertiaryButton,
            icon = icon,
            title = title,
            subtitle = subtitle,
            text = text,
            showHeader = showHeader,
            showIcon = showIcon,
            showClose = showClose,
            onClose = onDismissRequest,
            width = width,
            variant = variant,
        )
    }
}

/** The confirmation card without a dialog window. */
@Composable
fun ModalCard(
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null,
    tertiaryButton: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    subtitle: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    showHeader: Boolean = true,
    showIcon: Boolean = true,
    showClose: Boolean = true,
    onClose: () -> Unit = {},
    width: ModalWidth = ModalWidth.Narrow,
    variant: ModalVariant = ModalVariant.Neutral,
) {
    val leading = when {
        !showIcon -> null
        icon != null -> icon
        variant == ModalVariant.Neutral -> null
        else -> {
            { ModalLeadingIcon(variant) }
        }
    }
    Surface(
        modifier = modifier,
        shape = ModalDefaults.shape,
        color = ModalDefaults.containerColor,
        shadowElevation = ModalDefaults.ShadowElevation,
    ) {
        Column(Modifier.fillMaxWidth()) {
            if (showHeader && (title != null || subtitle != null || leading != null || showClose)) {
                ModalHeader(
                    title = title,
                    subtitle = subtitle,
                    icon = leading,
                    showClose = showClose,
                    onClose = onClose,
                )
            }
            if (text != null) {
                ProvideContentColorTextStyle(
                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    textStyle = MaterialTheme.typography.bodyMedium,
                ) {
                    Box(Modifier.fillMaxWidth().padding(horizontal = ModalDefaults.ContentInset)) {
                        text()
                    }
                }
            }
            Box(Modifier.padding(ModalDefaults.SectionPadding)) {
                ModalActionRow(
                    stacked = false,
                    confirmButton = confirmButton,
                    dismissButton = dismissButton,
                    tertiaryButton = tertiaryButton,
                )
            }
        }
    }
}

/**
 * Progress modal. [LoadingModalContainer.Inline] stays in the page and does not open a window.
 */
@Composable
fun LoadingModal(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    size: LoadingModalSize = LoadingModalSize.Large,
    container: LoadingModalContainer = LoadingModalContainer.Modal,
    phase: LoadingModalPhase = LoadingModalPhase.Progress,
    progress: Float? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    cancelButton: @Composable (() -> Unit)? = null,
    properties: DialogProperties = ModalDefaults.dialogProperties,
) {
    val elevated = container == LoadingModalContainer.Modal
    if (container == LoadingModalContainer.Modal) {
        ModalDialog(onDismissRequest = onDismissRequest, properties = properties) { available ->
            LoadingModalCard(
                modifier = modifier.width(resolvedLoadingWidth(available, size)),
                size = size,
                elevated = elevated,
                phase = phase,
                progress = progress,
                title = title,
                text = text,
                cancelButton = cancelButton,
            )
        }
    } else {
        LoadingModalCard(
            modifier = modifier.width(preferredLoadingWidth(size)),
            size = size,
            elevated = elevated,
            phase = phase,
            progress = progress,
            title = title,
            text = text,
            cancelButton = cancelButton,
        )
    }
}

/** Loading card without a dialog window. Use for inline layouts and docs. */
@Composable
fun LoadingModalCard(
    modifier: Modifier = Modifier,
    size: LoadingModalSize = LoadingModalSize.Large,
    elevated: Boolean = true,
    phase: LoadingModalPhase = LoadingModalPhase.Progress,
    progress: Float? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    cancelButton: @Composable (() -> Unit)? = null,
) {
    LoadingModalCardImpl(
        modifier = modifier,
        size = size,
        elevated = elevated,
        phase = phase,
        progress = progress,
        title = title,
        text = text,
        cancelButton = cancelButton,
    )
}

/** Hero modal. [hero] is the top visual: illustration, image, or custom content. */
@Composable
fun HeroModal(
    onDismissRequest: () -> Unit,
    hero: @Composable () -> Unit,
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: @Composable (() -> Unit)? = null,
    confirmButton: @Composable (() -> Unit)? = null,
    dismissButton: @Composable (() -> Unit)? = null,
    size: HeroModalSize = HeroModalSize.Tablet,
    centered: Boolean = true,
    showClose: Boolean = true,
    footer: ModalFooter = ModalFooter.Actions,
    step: Int = 1,
    stepCount: Int = 3,
    onPrevious: () -> Unit = {},
    onNext: () -> Unit = {},
    walkthroughArrows: Boolean = true,
    properties: DialogProperties = ModalDefaults.dialogProperties,
) {
    ModalDialog(onDismissRequest = onDismissRequest, properties = properties) { available ->
        HeroModalCard(
            hero = hero,
            title = title,
            modifier = modifier.width(resolvedHeroWidth(available, size)),
            text = text,
            confirmButton = confirmButton,
            dismissButton = dismissButton,
            size = size,
            centered = centered,
            showClose = showClose,
            onClose = onDismissRequest,
            footer = footer,
            step = step,
            stepCount = stepCount,
            onPrevious = onPrevious,
            onNext = onNext,
            walkthroughArrows = walkthroughArrows,
        )
    }
}

/** The hero card without a dialog window. */
@Composable
fun HeroModalCard(
    hero: @Composable () -> Unit,
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: @Composable (() -> Unit)? = null,
    confirmButton: @Composable (() -> Unit)? = null,
    dismissButton: @Composable (() -> Unit)? = null,
    size: HeroModalSize = HeroModalSize.Tablet,
    centered: Boolean = true,
    showHero: Boolean = true,
    showClose: Boolean = true,
    onClose: () -> Unit = {},
    footer: ModalFooter = ModalFooter.Actions,
    step: Int = 1,
    stepCount: Int = 3,
    onPrevious: () -> Unit = {},
    onNext: () -> Unit = {},
    walkthroughArrows: Boolean = true,
) {
    // Paging is a horizontal swipe. This flag stays so existing call sites still compile.
    if (walkthroughArrows) Unit
    val heroHeight = when (size) {
        HeroModalSize.Mobile -> 240.dp
        HeroModalSize.Tablet -> 220.dp
        HeroModalSize.Desktop -> 160.dp
    }
    Surface(
        modifier = modifier,
        shape = ModalDefaults.shape,
        color = ModalDefaults.containerColor,
        shadowElevation = ModalDefaults.ShadowElevation,
    ) {
        Column(Modifier.fillMaxWidth()) {
            if (showHero) {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(heroHeight)
                        .background(MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.12f)),
                ) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { hero() }
                    if (showClose) {
                        ModalCloseButton(
                            onClick = onClose,
                            modifier = Modifier.align(Alignment.TopEnd).padding(8.dp),
                        )
                    }
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment =
                    if (centered && size != HeroModalSize.Mobile) {
                        Alignment.CenterHorizontally
                    } else {
                        Alignment.Start
                    },
            ) {
                if (!showHero && showClose) {
                    Box(Modifier.fillMaxWidth()) {
                        ModalCloseButton(
                            onClick = onClose,
                            modifier = Modifier.align(Alignment.CenterEnd),
                        )
                    }
                }
                ProvideContentColorTextStyle(
                    contentColor = MaterialTheme.colorScheme.onSurface,
                    textStyle = MaterialTheme.typography.headlineMedium,
                ) {
                    Box(Modifier.fillMaxWidth()) { title() }
                }
                if (text != null) {
                    ProvideContentColorTextStyle(
                        contentColor = MaterialTheme.colorScheme.onSurface,
                        textStyle = MaterialTheme.typography.bodyLarge,
                    ) {
                        Box(Modifier.fillMaxWidth().padding(bottom = 4.dp)) { text() }
                    }
                }
            }
            Box(
                Modifier.padding(
                    start = if (size == HeroModalSize.Mobile) 32.dp else 16.dp,
                    end = if (size == HeroModalSize.Mobile) 20.dp else 16.dp,
                    top = 16.dp,
                    bottom = if (size == HeroModalSize.Mobile) 20.dp else 16.dp,
                ),
            ) {
                ModalFooterRow(
                    stacked = size == HeroModalSize.Mobile,
                    footer = footer,
                    confirmButton = confirmButton,
                    dismissButton = dismissButton,
                    step = step,
                    stepCount = stepCount,
                )
            }
        }
    }
}

/**
 * Feature tour card in a dialog. The caret is decoration on the card.
 * The footer button is [confirmButton], the same slot as [Modal] and [HeroModal]:
 * pass a text button or [ModalDefaults.TourActionButton]. It does not change the step.
 * To pin the same card to a control, use [FeatureTourBox].
 */
@Composable
fun FeatureTour(
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: @Composable (() -> Unit)? = null,
    hero: @Composable (() -> Unit)? = null,
    confirmButton: @Composable (() -> Unit)? = null,
    dismissButton: @Composable (() -> Unit)? = null,
    caretSide: ModalCaretSide = ModalCaretSide.Start,
    caretAlign: ModalCaretAlign = ModalCaretAlign.Center,
    centered: Boolean = false,
    showClose: Boolean = true,
    footer: ModalFooter = ModalFooter.Walkthrough,
    step: Int = 1,
    stepCount: Int = 3,
    onPrevious: () -> Unit = {},
    onNext: () -> Unit = {},
    walkthroughArrows: Boolean = true,
    properties: DialogProperties = ModalDefaults.dialogProperties,
) {
    ModalDialog(onDismissRequest = onDismissRequest, properties = properties) { available ->
        FeatureTourCard(
            title = title,
            modifier = modifier.width(resolvedHeroWidth(available, HeroModalSize.Tablet)),
            text = text,
            hero = hero,
            confirmButton = confirmButton,
            dismissButton = dismissButton,
            caretSide = caretSide,
            caretAlign = caretAlign,
            centered = centered,
            showClose = showClose,
            onClose = onDismissRequest,
            footer = footer,
            step = step,
            stepCount = stepCount,
            onPrevious = onPrevious,
            onNext = onNext,
            walkthroughArrows = walkthroughArrows,
        )
    }
}

/** Feature tour card. [modifier] should give it a width; the dialog and [FeatureTourBox] do. */
@Composable
fun FeatureTourCard(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: @Composable (() -> Unit)? = null,
    hero: @Composable (() -> Unit)? = null,
    confirmButton: @Composable (() -> Unit)? = null,
    dismissButton: @Composable (() -> Unit)? = null,
    caretSide: ModalCaretSide = ModalCaretSide.Start,
    caretAlign: ModalCaretAlign = ModalCaretAlign.Center,
    centered: Boolean = false,
    showClose: Boolean = true,
    onClose: () -> Unit = {},
    footer: ModalFooter = ModalFooter.Walkthrough,
    step: Int = 1,
    stepCount: Int = 3,
    onPrevious: () -> Unit = {},
    onNext: () -> Unit = {},
    walkthroughArrows: Boolean = true,
) {
    // Paging is a horizontal swipe. This flag stays so existing call sites still compile.
    if (walkthroughArrows) Unit
    val containerColor = ModalDefaults.containerColor
    val caret = ModalDefaults.CaretSize
    val layoutDirection = LocalLayoutDirection.current
    val density = LocalDensity.current
    var drag by remember { mutableFloatStateOf(0f) }
    val gesture =
        if (footer == ModalFooter.Walkthrough) {
            Modifier.pointerInput(step, stepCount, onPrevious, onNext) {
                val threshold = with(density) { 48.dp.toPx() }
                detectHorizontalDragGestures(
                    onHorizontalDrag = { _, amount -> drag += amount },
                    onDragCancel = { drag = 0f },
                    onDragEnd = {
                        when {
                            drag <= -threshold && step < stepCount -> onNext()
                            drag >= threshold && step > 1 -> onPrevious()
                        }
                        drag = 0f
                    },
                )
            }
        } else {
            Modifier
        }
    Box(modifier.then(gesture)) {
        Surface(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(
                        start = if (caretSide == ModalCaretSide.Start) caret else 0.dp,
                        top = if (caretSide == ModalCaretSide.Top) caret else 0.dp,
                        end = if (caretSide == ModalCaretSide.End) caret else 0.dp,
                        bottom = if (caretSide == ModalCaretSide.Bottom) caret else 0.dp,
                    ),
            shape = ModalDefaults.shape,
            color = containerColor,
            shadowElevation = ModalDefaults.ShadowElevation,
        ) {
            Column(Modifier.fillMaxWidth()) {
                if (hero != null) {
                    Box(Modifier.padding(16.dp)) {
                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(ModalDefaults.TourVisualHeight)
                                .clip(RoundedCornerShape(ModalDefaults.TourVisualCorner))
                                .background(
                                    MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.12f),
                                ),
                            contentAlignment = Alignment.Center,
                        ) {
                            hero()
                            if (showClose) {
                                ModalCloseButton(
                                    onClick = onClose,
                                    modifier = Modifier.align(Alignment.TopEnd).padding(4.dp),
                                )
                            }
                        }
                    }
                } else if (showClose) {
                    Box(Modifier.fillMaxWidth().padding(8.dp)) {
                        ModalCloseButton(
                            onClick = onClose,
                            modifier = Modifier.align(Alignment.CenterEnd),
                        )
                    }
                }
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(top = if (hero != null) 0.dp else 16.dp, bottom = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment =
                        if (centered) Alignment.CenterHorizontally else Alignment.Start,
                ) {
                    ProvideContentColorTextStyle(
                        contentColor = MaterialTheme.colorScheme.onSurface,
                        textStyle = MaterialTheme.typography.headlineMedium,
                    ) {
                        Box(Modifier.fillMaxWidth()) { title() }
                    }
                    if (text != null) {
                        ProvideContentColorTextStyle(
                            contentColor = MaterialTheme.colorScheme.onSurface,
                            textStyle = MaterialTheme.typography.bodyLarge,
                        ) {
                            Box(Modifier.fillMaxWidth().padding(bottom = 4.dp)) { text() }
                        }
                    }
                }
                if (footer == ModalFooter.Walkthrough) {
                    WalkthroughFooter(
                        step = step,
                        stepCount = stepCount,
                        confirmButton = confirmButton,
                    )
                } else {
                    Box(
                        Modifier.padding(
                            start = 32.dp,
                            end = 20.dp,
                            top = 16.dp,
                            bottom = 20.dp,
                        ),
                    ) {
                        ModalActionRow(
                            stacked = false,
                            confirmButton = confirmButton,
                            dismissButton = dismissButton,
                            tertiaryButton = null,
                        )
                    }
                }
            }
        }
        ModalCaret(
            side = caretSide,
            align = caretAlign,
            color = containerColor,
            layoutDirection = layoutDirection,
            modifier = Modifier.matchParentSize(),
        )
    }
}

/**
 * Pins a feature tour to [content]. The caret on [caretSide] points at the anchor.
 * This does not dim the rest of the page; use [FeatureTour] when the tour should block it.
 */
@Composable
fun FeatureTourBox(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    caretSide: ModalCaretSide = ModalCaretSide.Bottom,
    caretAlign: ModalCaretAlign = ModalCaretAlign.Center,
    tour: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    val density = LocalDensity.current
    val positionProvider = remember(density, caretSide, caretAlign) {
        FeatureTourPositionProvider(
            density = density,
            side = caretSide,
            align = caretAlign,
        )
    }
    Box(modifier) {
        content()
        if (expanded) {
            Popup(
                popupPositionProvider = positionProvider,
                onDismissRequest = onDismissRequest,
                properties = PopupProperties(focusable = true),
            ) {
                Box(Modifier.widthIn(max = ModalDefaults.HeroTabletWidth)) {
                    tour()
                }
            }
        }
    }
}

/** Widths, shape, and button colors shared by the modal family. */
object ModalDefaults {
    val SectionPadding = 16.dp
    val ContentInset = 20.dp
    val SectionGap = 16.dp
    val Corner = 24.dp
    val NarrowMin = 320.dp
    val NarrowMax = 448.dp
    val NarrowPreferred = 448.dp
    val WideMin = 600.dp
    val WidePreferred = 640.dp
    val WideMax = 1600.dp
    val LoadingLargeWidth = 460.dp
    val LoadingMediumWidth = 320.dp
    val LoadingSmallSize = 80.dp
    val HeroMobileWidth = 316.dp
    val HeroTabletWidth = 500.dp
    val HeroDesktopWidth = 832.dp
    val CaretSize = 26.dp
    val TourVisualHeight = 248.dp
    val TourVisualCorner = 12.dp
    val ShadowElevation = ElevationTokens.Level3

    val dialogProperties: DialogProperties
        get() = DialogProperties(usePlatformDefaultWidth = false)

    val shape: RoundedCornerShape
        get() = RoundedCornerShape(Corner)

    val containerColor: Color
        @Composable get() = MaterialTheme.colorScheme.surface

    @Composable
    fun ConfirmButton(
        onClick: () -> Unit,
        variant: ModalVariant,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable RowScope.() -> Unit,
    ) {
        val scheme = MaterialTheme.colorScheme
        // Error only changes the leading icon; Destructive uses the error filled button.
        val colors =
            if (variant == ModalVariant.Destructive) {
                ButtonDefaults.buttonColors(
                    containerColor = scheme.error,
                    contentColor = scheme.onError,
                )
            } else {
                ButtonDefaults.buttonColors()
            }
        Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            colors = colors,
            content = content,
        )
    }

    @Composable
    fun TextAction(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable RowScope.() -> Unit,
    ) {
        TextButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            colors = ButtonDefaults.textButtonColors(
                contentColor = MaterialTheme.colorScheme.onSurface,
            ),
            content = content,
        )
    }

    /** The 48dp round button on the feature-tour footer in the design. */
    @Composable
    fun TourActionButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
    ) {
        FilledIconButton(
            onClick = onClick,
            modifier = modifier.size(48.dp),
            enabled = enabled,
            shape = CircleShape,
        ) {
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
            )
        }
    }
}

@Composable
private fun ModalDialog(
    onDismissRequest: () -> Unit,
    properties: DialogProperties,
    content: @Composable (available: Dp) -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest, properties = properties) {
        val pane = getString(Strings.Dialog)
        Box(
            Modifier
                .fillMaxSize()
                .padding(24.dp)
                .semantics { paneTitle = pane },
            contentAlignment = Alignment.Center,
        ) {
            BoxWithConstraints(Modifier.fillMaxWidth()) {
                content(maxWidth)
            }
        }
    }
}

@Composable
private fun ModalHeader(
    title: @Composable (() -> Unit)?,
    subtitle: @Composable (() -> Unit)?,
    icon: @Composable (() -> Unit)?,
    showClose: Boolean,
    onClose: () -> Unit,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(ModalDefaults.SectionPadding),
        verticalAlignment = Alignment.Top,
    ) {
        Row(
            Modifier.weight(1f).padding(end = 8.dp),
            verticalAlignment = Alignment.Top,
        ) {
            if (icon != null) {
                Box(
                    Modifier.padding(top = 4.dp, end = 4.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    icon()
                }
            }
            Column(Modifier.padding(start = if (icon != null) 4.dp else 0.dp, top = 8.dp)) {
                if (title != null) {
                    ProvideContentColorTextStyle(
                        contentColor = MaterialTheme.colorScheme.onSurface,
                        textStyle = MaterialTheme.typography.titleMedium,
                    ) {
                        title()
                    }
                }
                if (subtitle != null) {
                    ProvideContentColorTextStyle(
                        contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        textStyle = MaterialTheme.typography.bodyMedium,
                    ) {
                        Box(Modifier.padding(bottom = 4.dp, top = 0.dp)) { subtitle() }
                    }
                }
            }
        }
        if (showClose) {
            ModalCloseButton(onClick = onClose)
        }
    }
}

@Composable
private fun FullWidth(content: @Composable () -> Unit) {
    Layout(content = content, modifier = Modifier.fillMaxWidth()) { measurables, constraints ->
        val width = constraints.maxWidth
        val placeable = measurables.firstOrNull()?.measure(
            androidx.compose.ui.unit.Constraints(width, width, 0, constraints.maxHeight),
        )
        val height = placeable?.height ?: 0
        layout(width, height) { placeable?.place(0, 0) }
    }
}

@Composable
private fun ModalActionRow(
    stacked: Boolean,
    confirmButton: @Composable (() -> Unit)?,
    dismissButton: @Composable (() -> Unit)?,
    tertiaryButton: @Composable (() -> Unit)?,
) {
    if (stacked) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            if (confirmButton != null) {
                FullWidth { confirmButton() }
            }
            if (dismissButton != null) {
                FullWidth { dismissButton() }
            }
            if (tertiaryButton != null) {
                FullWidth { tertiaryButton() }
            }
        }
    } else {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (tertiaryButton != null) {
                Box(Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                    tertiaryButton()
                }
            } else {
                Box(Modifier.weight(1f))
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (dismissButton != null) dismissButton()
                if (confirmButton != null) confirmButton()
            }
        }
    }
}

@Composable
private fun ModalFooterRow(
    stacked: Boolean,
    footer: ModalFooter,
    confirmButton: @Composable (() -> Unit)?,
    dismissButton: @Composable (() -> Unit)?,
    step: Int,
    stepCount: Int,
) {
    if (footer == ModalFooter.Walkthrough) {
        WalkthroughFooter(
            step = step,
            stepCount = stepCount,
            confirmButton = confirmButton,
        )
    } else if (confirmButton != null || dismissButton != null) {
        ModalActionRow(
            stacked = stacked,
            confirmButton = confirmButton,
            dismissButton = dismissButton,
            tertiaryButton = null,
        )
    }
}

@Composable
private fun WalkthroughFooter(
    step: Int,
    stepCount: Int,
    confirmButton: @Composable (() -> Unit)?,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 20.dp, top = 20.dp, bottom = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        PaginationDots(step = step, stepCount = stepCount)
        if (confirmButton != null) confirmButton()
    }
}

@Composable
private fun PaginationDots(step: Int, stepCount: Int) {
    val count = stepCount.coerceIn(1, 5)
    val active = (step - 1).coerceIn(0, count - 1)
    val activeColor = MaterialTheme.colorScheme.onSurface
    val inactiveColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        repeat(count) { index ->
            if (index == active) {
                Box(
                    Modifier
                        .size(width = 24.dp, height = 8.dp)
                        .clip(CircleShape)
                        .background(activeColor),
                )
            } else {
                Box(
                    Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(inactiveColor),
                )
            }
        }
    }
}

@Composable
private fun LoadingModalCardImpl(
    modifier: Modifier,
    size: LoadingModalSize,
    elevated: Boolean,
    phase: LoadingModalPhase,
    progress: Float?,
    title: @Composable (() -> Unit)?,
    text: @Composable (() -> Unit)?,
    cancelButton: @Composable (() -> Unit)?,
) {
    if (size == LoadingModalSize.Small) {
        if (elevated) {
            Surface(
                modifier = modifier.size(ModalDefaults.LoadingSmallSize),
                shape = ModalDefaults.shape,
                color = ModalDefaults.containerColor,
                shadowElevation = ModalDefaults.ShadowElevation,
            ) {
                Box(contentAlignment = Alignment.Center) {
                    LoadingMark(phase = phase, progress = progress, markSize = 48.dp)
                }
            }
        } else {
            Box(modifier.padding(16.dp), contentAlignment = Alignment.Center) {
                LoadingMark(phase = phase, progress = progress, markSize = 48.dp)
            }
        }
        return
    }
    val body: @Composable () -> Unit = {
        Column(Modifier.fillMaxWidth()) {
            LoadingModalBody(
                size = size,
                phase = phase,
                progress = progress,
                title = title,
                text = text,
            )
            if (elevated && cancelButton != null) {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 12.dp),
                    contentAlignment = Alignment.CenterEnd,
                ) {
                    cancelButton()
                }
            }
        }
    }
    if (elevated) {
        Surface(
            modifier = modifier,
            shape = ModalDefaults.shape,
            color = ModalDefaults.containerColor,
            shadowElevation = ModalDefaults.ShadowElevation,
            content = body,
        )
    } else {
        Box(modifier, content = { body() })
    }
}

@Composable
private fun LoadingModalBody(
    size: LoadingModalSize,
    phase: LoadingModalPhase,
    progress: Float?,
    title: @Composable (() -> Unit)?,
    text: @Composable (() -> Unit)?,
) {
    val titleStyle =
        if (size == LoadingModalSize.Large) {
            MaterialTheme.typography.headlineSmall
        } else {
            MaterialTheme.typography.titleMedium
        }
    val textBlock: @Composable () -> Unit = {
        Column(
            Modifier.padding(
                start = 8.dp,
                top = 8.dp,
            ),
            verticalArrangement = Arrangement.spacedBy(if (size == LoadingModalSize.Large) 4.dp else 2.dp),
        ) {
            if (title != null) {
                ProvideContentColorTextStyle(
                    contentColor = MaterialTheme.colorScheme.onSurface,
                    textStyle = titleStyle,
                ) {
                    title()
                }
            }
            if (text != null) {
                ProvideContentColorTextStyle(
                    contentColor = MaterialTheme.colorScheme.onSurface,
                    textStyle = MaterialTheme.typography.bodyMedium,
                ) {
                    Box(Modifier.padding(bottom = 4.dp)) { text() }
                }
            }
        }
    }
    if (size == LoadingModalSize.Large) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            LoadingMark(phase = phase, progress = progress, markSize = 48.dp)
            textBlock()
        }
    } else {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 20.dp),
            verticalAlignment = Alignment.Top,
        ) {
            LoadingMark(phase = phase, progress = progress, markSize = 48.dp)
            Box(Modifier.weight(1f)) { textBlock() }
        }
    }
}

@Composable
private fun LoadingMark(phase: LoadingModalPhase, progress: Float?, markSize: Dp) {
    if (phase == LoadingModalPhase.Success) {
        Icon(
            ModalStatusIcons.Success,
            contentDescription = null,
            modifier = Modifier.size(markSize),
            tint = Color.Unspecified,
        )
    } else if (progress != null) {
        CircularProgressIndicator(
            progress = { progress.coerceIn(0f, 1f) },
            modifier = Modifier.size(markSize),
        )
    } else {
        CircularProgressIndicator(modifier = Modifier.size(markSize))
    }
}

@Composable
private fun ModalLeadingIcon(variant: ModalVariant) {
    val image =
        when (variant) {
            ModalVariant.Neutral -> return
            ModalVariant.System -> ModalStatusIcons.System
            ModalVariant.Informational -> ModalStatusIcons.Info
            ModalVariant.Success -> ModalStatusIcons.Success
            ModalVariant.Error -> ModalStatusIcons.Error
            ModalVariant.Destructive -> ModalStatusIcons.Warning
        }
    Icon(
        image,
        contentDescription = null,
        modifier = Modifier.size(24.dp),
        tint = Color.Unspecified,
    )
}

@Composable
private fun ModalCloseButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
    ) {
        Icon(Icons.Filled.Close, contentDescription = getString(Strings.SnackbarDismiss))
    }
}

@Composable
private fun ModalCaret(
    side: ModalCaretSide,
    align: ModalCaretAlign,
    color: Color,
    layoutDirection: LayoutDirection,
    modifier: Modifier = Modifier,
) {
    Canvas(modifier) {
        val pad = ModalDefaults.CaretSize.toPx()
        val baseHalf = 21.dp.toPx()
        val centerInset = 69.dp.toPx()
        val tuck = 1.dp.toPx()
        val startIsLeft = layoutDirection == LayoutDirection.Ltr
        val onLeft = when (side) {
            ModalCaretSide.Start -> startIsLeft
            ModalCaretSide.End -> !startIsLeft
            else -> false
        }
        val onRight = when (side) {
            ModalCaretSide.End -> startIsLeft
            ModalCaretSide.Start -> !startIsLeft
            else -> false
        }
        val path = Path()
        when {
            side == ModalCaretSide.Top -> {
                val x = caretCenter(size.width, align, centerInset, baseHalf)
                addCaret(path, x, pad, pointingUp = true, tuck = tuck)
            }
            side == ModalCaretSide.Bottom -> {
                val x = caretCenter(size.width, align, centerInset, baseHalf)
                addCaret(path, x, size.height - pad, pointingUp = false, tuck = tuck)
            }
            onLeft -> {
                val y = caretCenter(size.height, align, centerInset, baseHalf)
                addCaret(path, pad, y, pointingUp = null, tuck = tuck, toStart = true)
            }
            onRight -> {
                val y = caretCenter(size.height, align, centerInset, baseHalf)
                addCaret(path, size.width - pad, y, pointingUp = null, tuck = tuck, toStart = false)
            }
        }
        drawPath(path, color)
    }
}

/** Tail from the design: 42dp base, about 24dp long, tip slightly rounded. */
private fun DrawScope.addCaret(
    path: Path,
    edgeX: Float,
    edgeY: Float,
    pointingUp: Boolean?,
    tuck: Float,
    toStart: Boolean = true,
) {
    val base = 21.dp.toPx()
    val alongA = 1.191.dp.toPx()
    val alongB = 1.921.dp.toPx()
    val outA = 24.087.dp.toPx()
    val outB = 24.060.dp.toPx()
    val bendA = 25.071.dp.toPx()
    val bendB = 25.058.dp.toPx()
    val bendAlong = 0.382.dp.toPx()
    val bendAlongB = 1.129.dp.toPx()
    if (pointingUp != null) {
        val tip = if (pointingUp) -1f else 1f
        val inner = if (pointingUp) tuck else -tuck
        path.moveTo(edgeX - base, edgeY + inner)
        path.lineTo(edgeX - alongA, edgeY + tip * outA)
        path.cubicTo(
            edgeX - bendAlong,
            edgeY + tip * bendA,
            edgeX + bendAlongB,
            edgeY + tip * bendB,
            edgeX + alongB,
            edgeY + tip * outB,
        )
        path.lineTo(edgeX + base, edgeY + inner)
    } else {
        val tip = if (toStart) -1f else 1f
        val inner = if (toStart) tuck else -tuck
        path.moveTo(edgeX + inner, edgeY + base)
        path.lineTo(edgeX + tip * outA, edgeY + alongA)
        path.cubicTo(
            edgeX + tip * bendA,
            edgeY + bendAlong,
            edgeX + tip * bendB,
            edgeY - bendAlongB,
            edgeX + tip * outB,
            edgeY - alongB,
        )
        path.lineTo(edgeX + inner, edgeY - base)
    }
    path.close()
}

private fun DrawScope.caretCenter(
    length: Float,
    align: ModalCaretAlign,
    insetCenter: Float,
    baseHalf: Float,
): Float {
    val minCenter = baseHalf
    val maxCenter = (length - baseHalf).coerceAtLeast(minCenter)
    return when (align) {
        ModalCaretAlign.Start -> insetCenter.coerceIn(minCenter, maxCenter)
        ModalCaretAlign.End -> (length - insetCenter).coerceIn(minCenter, maxCenter)
        ModalCaretAlign.Center -> (length / 2f).coerceIn(minCenter, maxCenter)
    }
}

private fun resolvedModalWidth(available: Dp, width: ModalWidth): Dp {
    if (available <= 0.dp) return 0.dp
    return when (width) {
        ModalWidth.Narrow ->
            ModalDefaults.NarrowPreferred.coerceAtMost(available).coerceAtLeast(
                ModalDefaults.NarrowMin.coerceAtMost(available),
            )
        ModalWidth.Wide ->
            when {
                available >= ModalDefaults.WidePreferred -> ModalDefaults.WidePreferred
                else -> available.coerceAtMost(ModalDefaults.WideMax)
            }
    }
}

private fun preferredLoadingWidth(size: LoadingModalSize): Dp = when (size) {
    LoadingModalSize.Large -> ModalDefaults.LoadingLargeWidth
    LoadingModalSize.Medium -> ModalDefaults.LoadingMediumWidth
    LoadingModalSize.Small -> ModalDefaults.LoadingSmallSize
}

private fun resolvedLoadingWidth(available: Dp, size: LoadingModalSize): Dp =
    preferredLoadingWidth(size).coerceAtMost(available)

private fun resolvedHeroWidth(available: Dp, size: HeroModalSize): Dp {
    val preferred = when (size) {
        HeroModalSize.Mobile -> ModalDefaults.HeroMobileWidth
        HeroModalSize.Tablet -> ModalDefaults.HeroTabletWidth
        HeroModalSize.Desktop -> ModalDefaults.HeroDesktopWidth
    }
    return preferred.coerceAtMost(available)
}

@Immutable
private class FeatureTourPositionProvider(
    private val density: Density,
    private val side: ModalCaretSide,
    private val align: ModalCaretAlign,
) : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize,
    ): IntOffset {
        val gap = with(density) { 8.dp.roundToPx() }
        val startIsLeft = layoutDirection == LayoutDirection.Ltr
        val placeOnRight = when (side) {
            ModalCaretSide.Start -> startIsLeft
            ModalCaretSide.End -> !startIsLeft
            else -> false
        }
        val placeOnLeft = when (side) {
            ModalCaretSide.End -> startIsLeft
            ModalCaretSide.Start -> !startIsLeft
            else -> false
        }
        val x = when {
            side == ModalCaretSide.Top || side == ModalCaretSide.Bottom ->
                crossOffset(
                    anchorStart = anchorBounds.left,
                    anchorSize = anchorBounds.width,
                    popupSize = popupContentSize.width,
                    align = align,
                )
            placeOnRight -> anchorBounds.right + gap
            placeOnLeft -> anchorBounds.left - popupContentSize.width - gap
            else -> anchorBounds.left
        }
        val y = when {
            side == ModalCaretSide.Top -> anchorBounds.bottom + gap
            side == ModalCaretSide.Bottom -> anchorBounds.top - popupContentSize.height - gap
            else ->
                crossOffset(
                    anchorStart = anchorBounds.top,
                    anchorSize = anchorBounds.height,
                    popupSize = popupContentSize.height,
                    align = align,
                )
        }
        val maxX = max(0, windowSize.width - popupContentSize.width)
        val maxY = max(0, windowSize.height - popupContentSize.height)
        return IntOffset(x.coerceIn(0, maxX), y.coerceIn(0, maxY))
    }
}

private fun crossOffset(anchorStart: Int, anchorSize: Int, popupSize: Int, align: ModalCaretAlign): Int =
    when (align) {
        ModalCaretAlign.Start -> anchorStart
        ModalCaretAlign.End -> anchorStart + anchorSize - popupSize
        ModalCaretAlign.Center -> anchorStart + (anchorSize - popupSize) / 2
    }

private object ModalStatusColors {
    val Info = Color(0xFF1A73E8)
    val Success = Color(0xFF1E8E3E)
    val Warning = Color(0xFFE8A317)
    val WarningFill = Color(0xFFFFF3CD)
    val Error = Color(0xFFD93025)
    val System = Color(0xFF6C43C6)
}

private object ModalStatusIcons {
    val Info: ImageVector by lazy {
        ImageVector.Builder(
            name = "Modal.Info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(ModalStatusColors.Info)) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
    }

    val Success: ImageVector by lazy {
        ImageVector.Builder(
            name = "Modal.Success",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(ModalStatusColors.Success)) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(10f, 14.17f)
                lineTo(7.41f, 11.59f)
                lineTo(6f, 13f)
                lineToRelative(4f, 4f)
                lineToRelative(8f, -8f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.build()
    }

    val Warning: ImageVector by lazy {
        ImageVector.Builder(
            name = "Modal.Warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(ModalStatusColors.WarningFill)) {
                moveTo(12f, 5.99f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
                close()
            }
            path(fill = SolidColor(ModalStatusColors.Warning)) {
                moveTo(1f, 21f)
                horizontalLineToRelative(22f)
                lineTo(12f, 2f)
                close()
                moveTo(12f, 6.99f)
                lineTo(18.53f, 19f)
                horizontalLineTo(5.47f)
                close()
                moveTo(11f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
    }

    val Error: ImageVector by lazy {
        ImageVector.Builder(
            name = "Modal.Error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(ModalStatusColors.Error)) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
    }

    val System: ImageVector by lazy {
        ImageVector.Builder(
            name = "Modal.System",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(ModalStatusColors.System)) {
                moveTo(12f, 2f)
                lineTo(22f, 12f)
                lineTo(12f, 22f)
                lineTo(2f, 12f)
                close()
                moveTo(12f, 6.5f)
                lineTo(6.5f, 12f)
                lineTo(12f, 17.5f)
                lineTo(17.5f, 12f)
                close()
            }
        }.build()
    }
}
