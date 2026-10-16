/*
 * Copyright 2026 The GeneV4 Authors
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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Grouped menu panel. Material's anchored menu is [DropdownMenu].
 *
 * One [MenusGroup] is a single 16dp card. Two or more groups are separate 8dp cards with a 2dp
 * gap, clipped to the same 16dp outer shape. [MenusTheme.Standard] uses [ColorScheme.surfaceContainer].
 * [MenusTheme.Vibrant] uses [ColorScheme.tertiaryContainer]. A selected row uses
 * [ColorScheme.primaryFixed]. Give this a width; the design samples are 208dp.
 *
 * @param groups cards inside this menu, top to bottom. One group is a single card
 * @param modifier the [Modifier] to be applied to this menu
 * @param theme standard neutral card or vibrant tertiary card
 * @param maxHeight limits the panel and shows a scrollbar once the groups are taller
 */
@Composable
fun Menus(
    groups: List<MenusGroup>,
    modifier: Modifier = Modifier,
    theme: MenusTheme = MenusTheme.Standard,
    maxHeight: Dp = Dp.Unspecified,
) {
    val scheme = MaterialTheme.colorScheme
    val container = menusContainerColor(theme, scheme)
    val multiple = groups.size > 1
    val scrollable = maxHeight != Dp.Unspecified
    val scroll = rememberScrollState()
    val shape = MenusMetrics.OuterShape
    Box(
        modifier
            .widthIn(min = MenusMetrics.MinWidth)
            .then(if (scrollable) Modifier.heightIn(max = maxHeight) else Modifier)
            .menusShadow(shape)
            .clip(shape)
            .then(if (multiple) Modifier else Modifier.background(container, shape)),
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .then(if (scrollable) Modifier.verticalScroll(scroll) else Modifier)
                .then(if (multiple) Modifier else Modifier.padding(vertical = MenusMetrics.ListPadding)),
            verticalArrangement = if (multiple) Arrangement.spacedBy(MenusMetrics.GroupGap) else Arrangement.Top,
        ) {
            groups.forEach { group ->
                MenusGroupCard(
                    group = group,
                    theme = theme,
                    container = if (multiple) container else Color.Transparent,
                    shape = if (multiple) MenusMetrics.GroupShape else MenusMetrics.ItemShape,
                )
            }
        }
        if (scrollable && scroll.maxValue > 0) {
            // matchParentSize follows the card height and does not stretch the card.
            Box(Modifier.matchParentSize()) {
                MenusScrollbar(
                    scrollOffset = scroll.value,
                    scrollMax = scroll.maxValue,
                    modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                )
            }
        }
    }
}

/** Neutral card or tertiary card for [Menus]. */
enum class MenusTheme {
    /** [ColorScheme.surfaceContainer] cards, [ColorScheme.onSurface] labels. */
    Standard,

    /** [ColorScheme.tertiaryContainer] cards, [ColorScheme.onTertiaryContainer] labels. */
    Vibrant,
}

/** One card inside [Menus]. [label] is the optional section title above [items]. */
data class MenusGroup(
    val items: List<MenusItem>,
    val label: String? = null,
)

/**
 * One row inside a [MenusGroup].
 *
 * @param text the label
 * @param selected draws a [ColorScheme.primaryFixed] row
 * @param enabled `false` fades the row to 38% and ignores clicks
 * @param leading optional 20dp icon before [text]
 * @param indent reserves 20dp before [text] when [leading] is null, so labels line up
 * @param trailing optional 20dp icon after [text]
 * @param trailingText optional shortcut or status before [trailing]
 * @param divider draws a hairline under the row
 * @param onClick called when the row is pressed
 */
data class MenusItem(
    val text: String,
    val selected: Boolean = false,
    val enabled: Boolean = true,
    val leading: ImageVector? = null,
    val indent: Boolean = false,
    val trailing: ImageVector? = null,
    val trailingText: String? = null,
    val divider: Boolean = false,
    val onClick: () -> Unit = {},
)

@Composable
private fun MenusGroupCard(
    group: MenusGroup,
    theme: MenusTheme,
    container: Color,
    shape: Shape,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .then(if (container == Color.Transparent) Modifier else Modifier.background(container, shape).clip(shape))
            .padding(vertical = if (container == Color.Transparent) 0.dp else MenusMetrics.ListPadding),
    ) {
        if (group.label != null) {
            MenusLabel(group.label, theme)
        }
        group.items.forEach { item -> MenusItemRow(item, theme) }
    }
}

@Composable
private fun MenusLabel(text: String, theme: MenusTheme) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(MenusMetrics.LabelHeight)
            .padding(start = MenusMetrics.RowPadding, end = MenusMetrics.RowPadding, top = MenusMetrics.LabelBottom),
        contentAlignment = Alignment.CenterStart,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = menusContentColor(theme, MaterialTheme.colorScheme),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun MenusItemRow(item: MenusItem, theme: MenusTheme) {
    val scheme = MaterialTheme.colorScheme
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()
    val focused by interaction.collectIsFocusedAsState()
    val content = if (item.selected) scheme.onPrimaryFixed else menusContentColor(theme, scheme)
    val shape = if (item.selected) MenusMetrics.SelectedShape else MenusMetrics.ItemShape
    val overlay =
        when {
            !item.enabled -> null
            hovered || pressed -> scheme.onSurface.copy(alpha = MenusMetrics.HoverAlpha)
            focused -> scheme.onSurface.copy(alpha = MenusMetrics.FocusAlpha)
            else -> null
        }
    Column(Modifier.fillMaxWidth().padding(horizontal = MenusMetrics.ItemInset, vertical = MenusMetrics.ItemInsetY)) {
        Row(
            modifier =
                Modifier.fillMaxWidth()
                    .height(MenusMetrics.RowHeight)
                    .alpha(if (item.enabled) 1f else MenusMetrics.DisabledAlpha)
                    .clip(shape)
                    .then(
                        if (item.selected) Modifier.background(scheme.primaryFixed, shape) else Modifier,
                    )
                    .then(if (overlay != null) Modifier.background(overlay, shape) else Modifier)
                    .then(
                        if (focused && item.enabled) {
                            Modifier.border(MenusMetrics.FocusWidth, scheme.secondary, shape)
                        } else {
                            Modifier
                        },
                    )
                    .clickable(
                        interactionSource = interaction,
                        indication = ripple(),
                        enabled = item.enabled,
                        onClick = item.onClick,
                    )
                    .padding(MenusMetrics.RowPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(MenusMetrics.RowGap),
        ) {
            if (item.leading != null) {
                Icon(
                    imageVector = item.leading,
                    contentDescription = null,
                    modifier = Modifier.size(MenusMetrics.IconSize),
                    tint = content,
                )
            } else if (item.indent) {
                Box(Modifier.size(MenusMetrics.IconSize))
            }
            Text(
                text = item.text,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.labelLarge,
                color = content,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (item.trailingText != null) {
                Text(
                    text = item.trailingText,
                    style = MaterialTheme.typography.labelLarge,
                    color = scheme.onSurfaceVariant,
                    maxLines = 1,
                )
            }
            if (item.trailing != null) {
                Icon(
                    imageVector = item.trailing,
                    contentDescription = null,
                    modifier = Modifier.size(MenusMetrics.IconSize),
                    tint = content,
                )
            }
        }
        if (item.divider) {
            HorizontalDivider(
                modifier = Modifier.padding(top = MenusMetrics.DividerSpace),
                thickness = MenusMetrics.DividerThickness,
                color = scheme.outlineVariant,
            )
        }
    }
}

@Composable
private fun MenusScrollbar(
    scrollOffset: Int,
    scrollMax: Int,
    modifier: Modifier = Modifier,
) {
    BoxWithConstraints(
        modifier
            .padding(end = MenusMetrics.ScrollbarEnd, top = MenusMetrics.ScrollbarInset, bottom = MenusMetrics.ScrollbarInset)
            .width(MenusMetrics.ScrollbarTrack),
    ) {
        val thumb = maxHeight * MenusMetrics.ScrollbarThumbFraction
        val travel = (maxHeight - thumb).coerceAtLeast(0.dp)
        val offset = travel * (scrollOffset / scrollMax.toFloat())
        Box(
            Modifier
                .offset(y = offset)
                .width(MenusMetrics.ScrollbarThickness)
                .height(thumb)
                .align(Alignment.TopCenter)
                .background(MaterialTheme.colorScheme.outline, RoundedCornerShape(50)),
        )
    }
}

private fun menusContainerColor(theme: MenusTheme, scheme: ColorScheme): Color =
    when (theme) {
        MenusTheme.Standard -> scheme.surfaceContainer
        MenusTheme.Vibrant -> scheme.tertiaryContainer
    }

private fun menusContentColor(theme: MenusTheme, scheme: ColorScheme): Color =
    when (theme) {
        MenusTheme.Standard -> scheme.onSurface
        MenusTheme.Vibrant -> scheme.onTertiaryContainer
    }

private fun Modifier.menusShadow(shape: Shape): Modifier =
    shadow(
            elevation = MenusMetrics.ShadowElevation,
            shape = shape,
            ambientColor = Color.Black.copy(alpha = MenusMetrics.ShadowAmbient),
            spotColor = Color.Black.copy(alpha = MenusMetrics.ShadowSpot),
        )
        .shadow(
            elevation = MenusMetrics.ShadowTight,
            shape = shape,
            ambientColor = Color.Black.copy(alpha = MenusMetrics.ShadowTightAlpha),
            spotColor = Color.Black.copy(alpha = MenusMetrics.ShadowTightAlpha),
        )

private object MenusMetrics {
    val MinWidth = 112.dp
    val OuterShape = RoundedCornerShape(16.dp)
    val GroupShape = RoundedCornerShape(8.dp)
    val ItemShape = RoundedCornerShape(4.dp)
    val SelectedShape = RoundedCornerShape(12.dp)
    val ListPadding = 2.dp
    val GroupGap = 2.dp
    val ItemInset = 4.dp
    val ItemInsetY = 2.dp
    val RowHeight = 44.dp
    val RowPadding = 12.dp
    val RowGap = 8.dp
    val IconSize = 20.dp
    val LabelHeight = 32.dp
    val LabelBottom = 6.dp
    val FocusWidth = 2.dp
    val DividerThickness = 1.dp
    val DividerSpace = 2.dp
    val ShadowElevation = 8.dp
    val ShadowTight = 3.dp
    val ScrollbarThickness = 4.dp
    val ScrollbarTrack = 12.dp
    val ScrollbarEnd = 4.dp
    val ScrollbarInset = 12.dp
    const val ScrollbarThumbFraction = 0.35f
    const val HoverAlpha = 0.08f
    const val FocusAlpha = 0.10f
    const val DisabledAlpha = 0.38f
    const val ShadowAmbient = 0.15f
    const val ShadowSpot = 0.15f
    const val ShadowTightAlpha = 0.30f
}
