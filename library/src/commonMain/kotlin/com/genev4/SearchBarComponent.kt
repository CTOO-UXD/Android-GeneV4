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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Search bar for Memory and Knowledge. Material's expandable search is [DockedSearchBar].
 * Conversation input is [AiInput].
 *
 * [SearchBarLayout.Default] is the wide bar: a translucent shell, the field inside it, and a 48dp
 * submit button beside the field. Results, when [results] is not empty, stay inside that shell.
 * [SearchBarLayout.Mobile] keeps the microphone and a 40dp submit button inside the field, and
 * draws results as a separate card underneath.
 *
 * An empty field shows the microphone. Text replaces it with clear, and turns submit from the
 * translucent circle to [ColorScheme.primary]. The shell uses a translucent [ColorScheme.surface]
 * in place of the design's backdrop blur. Give this a bounded width; it fills that width up to 908dp.
 *
 * @param value the input text to be shown in the field
 * @param onValueChange the callback that is triggered when the input service updates the text
 * @param onSearch called when the submit button or the keyboard search action is used
 * @param modifier the [Modifier] to be applied to this search bar
 * @param layout wide shell or narrow shell
 * @param placeholder shown when [value] is empty
 * @param results suggestion rows. Empty hides the menu
 * @param onResultClick called with the index of the pressed row in [results]
 * @param onMicClick called when the microphone is pressed. The microphone is only shown while
 *   [value] is empty
 * @param onClear called when clear is pressed. Null clears [value]
 * @param enabled controls the enabled state of this search bar
 */
@Composable
fun SearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    modifier: Modifier = Modifier,
    layout: SearchBarLayout = SearchBarLayout.Default,
    placeholder: String = "What are you looking for?",
    results: List<SearchResult> = emptyList(),
    onResultClick: (Int) -> Unit = {},
    onMicClick: () -> Unit = {},
    onClear: (() -> Unit)? = null,
    enabled: Boolean = true,
) {
    val scheme = MaterialTheme.colorScheme
    val hasText = value.isNotEmpty()
    val blur = scheme.surface.copy(alpha = SearchBarMetrics.ShellAlpha)
    val blurHigh = scheme.surface.copy(alpha = SearchBarMetrics.FieldAlpha)
    val textStyle =
        MaterialTheme.typography.bodyMedium.copy(
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.25.sp,
            color = scheme.onSurface,
            platformStyle = PlatformTextStyle(includeFontPadding = false),
        )
    val clear = onClear ?: { onValueChange("") }
    val root =
        modifier
            .fillMaxWidth()
            .widthIn(max = SearchBarMetrics.MaxWidth)
            .alpha(if (enabled) 1f else SearchBarMetrics.DisabledAlpha)

    if (layout == SearchBarLayout.Mobile) {
        Column(root, verticalArrangement = Arrangement.spacedBy(SearchBarMetrics.MobileMenuGap)) {
            SearchBarField(
                value = value,
                onValueChange = onValueChange,
                onSearch = onSearch,
                placeholder = placeholder,
                textStyle = textStyle,
                placeholderColor = scheme.onSurfaceVariant,
                cursorColor = scheme.primary,
                enabled = enabled,
                modifier =
                    Modifier.fillMaxWidth()
                        .qtSurface(SearchBarMetrics.ShellShape, blurHigh, SearchBarMetrics.ShellElevation)
                        .padding(SearchBarMetrics.MobilePadding)
                        .qtSurface(SearchBarMetrics.FieldShape, blurHigh, 0.dp),
                trailing = {
                    SearchBarSideButton(
                        hasText = hasText,
                        enabled = enabled,
                        idleContainer = blurHigh,
                        onMicClick = onMicClick,
                        onClear = clear,
                    )
                    SearchBarSubmitButton(
                        hasText = hasText,
                        enabled = enabled,
                        idleContainer = blurHigh,
                        size = SearchBarMetrics.MobileSubmitSize,
                        onSearch = onSearch,
                    )
                },
            )
            if (results.isNotEmpty()) {
                SearchBarMenu(
                    results = results,
                    onResultClick = onResultClick,
                    textStyle = textStyle,
                    enabled = enabled,
                    modifier =
                        Modifier.fillMaxWidth()
                            .qtSurface(
                                SearchBarMetrics.MenuShape,
                                scheme.surfaceBright,
                                SearchBarMetrics.MenuElevation,
                                spotAlpha = SearchBarMetrics.MenuSpotAlpha,
                            )
                            .padding(horizontal = SearchBarMetrics.MobileMenuInset)
                            .padding(vertical = SearchBarMetrics.MenuListPadding),
                )
            }
        }
    } else {
        Column(
            root
                .qtSurface(SearchBarMetrics.ShellShape, blur, SearchBarMetrics.ShellElevation)
                .padding(SearchBarMetrics.ShellPadding),
            verticalArrangement = Arrangement.spacedBy(SearchBarMetrics.ResultsGap),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(SearchBarMetrics.SubmitGap),
            ) {
                SearchBarField(
                    value = value,
                    onValueChange = onValueChange,
                    onSearch = onSearch,
                    placeholder = placeholder,
                    textStyle = textStyle,
                    placeholderColor = scheme.onSurfaceVariant,
                    cursorColor = scheme.primary,
                    enabled = enabled,
                    modifier =
                        Modifier.weight(1f)
                            .qtSurface(SearchBarMetrics.FieldShape, blurHigh, 0.dp),
                    trailing = {
                        SearchBarSideButton(
                            hasText = hasText,
                            enabled = enabled,
                            idleContainer = blurHigh,
                            onMicClick = onMicClick,
                            onClear = clear,
                        )
                    },
                )
                SearchBarSubmitButton(
                    hasText = hasText,
                    enabled = enabled,
                    idleContainer = blurHigh,
                    size = SearchBarMetrics.SubmitSize,
                    onSearch = onSearch,
                )
            }
            if (results.isNotEmpty()) {
                SearchBarMenu(
                    results = results,
                    onResultClick = onResultClick,
                    textStyle = textStyle,
                    enabled = enabled,
                    modifier = Modifier.fillMaxWidth().padding(vertical = SearchBarMetrics.MenuListPadding),
                )
            }
        }
    }
}

/** Wide shell or narrow shell for [SearchBar]. */
enum class SearchBarLayout {
    /** Submit sits outside the field. Results stay inside the shell. */
    Default,

    /** Submit sits inside the field. Results are a separate card. */
    Mobile,
}

/** One row in a [SearchBar] suggestion menu. */
@Immutable
data class SearchResult(
    val label: String,
    val selected: Boolean = false,
)

/** Measurements for [SearchBar]. */
private object SearchBarMetrics {
    val MaxWidth = 908.dp
    val ShellShape = RoundedCornerShape(32.dp)
    val FieldShape = RoundedCornerShape(24.dp)
    val MenuShape = RoundedCornerShape(16.dp)
    val ItemShape = RoundedCornerShape(12.dp)
    val ShellPadding = 8.dp
    val MobilePadding = 4.dp
    val FieldMinHeight = 48.dp
    val SubmitGap = 12.dp
    val ResultsGap = 4.dp
    val MobileMenuGap = 8.dp
    val MobileMenuInset = 4.dp
    val MenuListPadding = 4.dp
    val ItemMinHeight = 48.dp
    val ItemPadding = 12.dp
    val LeadingInset = 12.dp
    val FieldGap = 4.dp
    val TrailingPadding = 4.dp
    val TrailingGap = 8.dp
    val SideButtonSize = 40.dp
    val SubmitSize = 48.dp
    val MobileSubmitSize = 40.dp
    val IconSize = 24.dp
    val ShellElevation = 4.dp
    val MenuElevation = 3.dp
    const val ShellAlpha = 0.7f
    const val FieldAlpha = 0.8f
    const val ShadowAlpha = 0.12f
    const val MenuSpotAlpha = 0.30f
    const val DisabledAlpha = 0.38f
}

@Composable
private fun SearchBarField(
    value: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    placeholder: String,
    textStyle: TextStyle,
    placeholderColor: Color,
    cursorColor: Color,
    enabled: Boolean,
    trailing: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interaction = remember { MutableInteractionSource() }
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        textStyle = textStyle,
        cursorBrush = SolidColor(cursorColor),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearch() }),
        singleLine = true,
        interactionSource = interaction,
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier.fillMaxWidth().heightIn(min = SearchBarMetrics.FieldMinHeight),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(SearchBarMetrics.FieldGap),
            ) {
                Icon(
                    imageVector = SearchBarIcons.Search,
                    contentDescription = null,
                    modifier =
                        Modifier.padding(horizontal = SearchBarMetrics.LeadingInset)
                            .size(SearchBarMetrics.IconSize),
                    tint = MaterialTheme.colorScheme.onSurface,
                )
                Box(
                    modifier = Modifier.weight(1f).heightIn(min = SearchBarMetrics.FieldMinHeight),
                    contentAlignment = Alignment.CenterStart,
                ) {
                    if (value.isEmpty()) {
                        Text(
                            text = placeholder,
                            style = textStyle,
                            color = placeholderColor,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    innerTextField()
                }
                Row(
                    modifier = Modifier.padding(SearchBarMetrics.TrailingPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(SearchBarMetrics.TrailingGap),
                ) {
                    trailing()
                }
            }
        },
    )
}

@Composable
private fun SearchBarSideButton(
    hasText: Boolean,
    enabled: Boolean,
    idleContainer: Color,
    onMicClick: () -> Unit,
    onClear: () -> Unit,
) {
    val scheme = MaterialTheme.colorScheme
    if (hasText) {
        SearchBarIconButton(
            icon = SearchBarIcons.Close,
            contentDescription = "Clear",
            container = scheme.surfaceContainerHigh,
            content = scheme.onSurface,
            size = SearchBarMetrics.SideButtonSize,
            enabled = enabled,
            onClick = onClear,
        )
    } else {
        SearchBarIconButton(
            icon = SearchBarIcons.Mic,
            contentDescription = "Microphone",
            container = idleContainer,
            content = scheme.onSurface,
            size = SearchBarMetrics.SideButtonSize,
            enabled = enabled,
            onClick = onMicClick,
        )
    }
}

@Composable
private fun SearchBarSubmitButton(
    hasText: Boolean,
    enabled: Boolean,
    idleContainer: Color,
    size: Dp,
    onSearch: () -> Unit,
) {
    val scheme = MaterialTheme.colorScheme
    SearchBarIconButton(
        icon = SearchBarIcons.ArrowForward,
        contentDescription = "Submit",
        container = if (hasText) scheme.primary else idleContainer,
        content = if (hasText) scheme.onPrimary else scheme.onSurface,
        size = size,
        enabled = enabled,
        onClick = onSearch,
    )
}

@Composable
private fun SearchBarIconButton(
    icon: ImageVector,
    contentDescription: String,
    container: Color,
    content: Color,
    size: Dp,
    enabled: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier =
            Modifier.size(size)
                .background(container, CircleShape)
                .clickable(enabled = enabled, role = Role.Button, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(SearchBarMetrics.IconSize),
            tint = content,
        )
    }
}

@Composable
private fun SearchBarMenu(
    results: List<SearchResult>,
    onResultClick: (Int) -> Unit,
    textStyle: TextStyle,
    enabled: Boolean,
    modifier: Modifier = Modifier,
) {
    val scheme = MaterialTheme.colorScheme
    Column(modifier) {
        results.forEachIndexed { index, result ->
            val selected = result.selected
            Box(
                modifier =
                    Modifier.fillMaxWidth()
                        .heightIn(min = SearchBarMetrics.ItemMinHeight)
                        .background(
                            if (selected) scheme.primaryContainer else Color.Transparent,
                            SearchBarMetrics.ItemShape,
                        )
                        .clickable(enabled = enabled, role = Role.Button, onClick = { onResultClick(index) })
                        .padding(horizontal = SearchBarMetrics.ItemPadding),
                contentAlignment = Alignment.CenterStart,
            ) {
                Text(
                    text = result.label,
                    style =
                        textStyle.copy(
                            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
                            color = if (selected) scheme.onPrimaryContainer else scheme.onSurface,
                        ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

private fun Modifier.qtSurface(
    shape: Shape,
    color: Color,
    elevation: Dp,
    spotAlpha: Float = SearchBarMetrics.ShadowAlpha,
): Modifier {
    val shadowed =
        if (elevation > 0.dp) {
            shadow(
                elevation = elevation,
                shape = shape,
                ambientColor = Color.Black.copy(alpha = SearchBarMetrics.ShadowAlpha),
                spotColor = Color.Black.copy(alpha = spotAlpha),
            )
        } else {
            this
        }
    return shadowed.background(color, shape)
}

private object SearchBarIcons {
    val Search: ImageVector =
        icon(
            "SearchBar.Search",
            "M11 3C15.4183 3 19 6.58172 19 11C19 12.8487 18.3729 14.551 17.3199 15.9056L22.1924 20.7782L20.7782 22.1924L15.9056 17.3199C14.551 18.3729 12.8487 19 11 19C6.58172 19 3 15.4183 3 11C3 6.58172 6.58172 3 11 3ZM11 5C7.68629 5 5 7.68629 5 11C5 14.3137 7.68629 17 11 17C14.3137 17 17 14.3137 17 11C17 7.68629 14.3137 5 11 5Z",
            PathFillType.EvenOdd,
        )
    val Mic: ImageVector =
        icon(
            "SearchBar.Mic",
            "M6 12C6 15.3137 8.68629 18 12 18C15.3137 18 18 15.3137 18 12H20C20 16.0793 16.9468 19.4455 13.001 19.938L13 22H11L11 19.9381C7.05371 19.446 4 16.0796 4 12H6ZM12 2C14.2091 2 16 3.79086 16 6V12C16 14.2091 14.2091 16 12 16C9.79086 16 8 14.2091 8 12V6C8 3.79086 9.79086 2 12 2Z",
        )
    val Close: ImageVector =
        icon(
            "SearchBar.Close",
            "M18.3641 4.2218L19.7783 5.63602L13.4139 11.9998L19.7783 18.3639L18.3641 19.7782L11.9999 13.4138L5.63614 19.7782L4.22192 18.3639L10.5859 11.9998L4.22192 5.63602L5.63614 4.2218L11.9999 10.5858L18.3641 4.2218Z",
            PathFillType.EvenOdd,
        )
    val ArrowForward: ImageVector =
        icon(
            "SearchBar.ArrowForward",
            "M18.5912 10.585L11.9939 3.98767L10.5797 5.40188L16.177 10.9992L3.98242 10.9992V12.9992L16.177 12.9992L10.5797 18.5965L11.9939 20.0107L18.5912 13.4134C19.3723 12.6324 19.3723 11.366 18.5912 10.585Z",
        )

    private fun icon(
        name: String,
        path: String,
        fillType: PathFillType = PathFillType.NonZero,
    ): ImageVector =
        ImageVector.Builder(
                name = name,
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
            .apply {
                addPath(
                    pathData = PathParser().parsePathString(path).toNodes(),
                    fill = SolidColor(Color.Black),
                    pathFillType = fillType,
                )
            }
            .build()
}
