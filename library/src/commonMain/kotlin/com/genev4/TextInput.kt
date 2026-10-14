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
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.genev4.tokens.PaletteTokens

/**
 * Single-line field for short values such as a name, email, or number.
 *
 * The label sits inside the border. It is body large and centered while the field is empty,
 * unfocused, and has no [placeholder]. Focus, a [placeholder], or text shrinks it to body small
 * above the value. Hover, press, and focus are interaction states. The border stays 1dp.
 *
 * [showClear] draws a clear icon while the field is focused. [showDropdown] draws an arrow that
 * points up while focused, pressed, or [dropdownExpanded].
 *
 * @param value the input text to be shown
 * @param onValueChange called when the input service updates the text
 * @param modifier the [Modifier] to be applied to this field
 * @param enabled controls the enabled state. Disabled fields fade to 38%
 * @param readOnly controls the editable state of the text
 * @param isError whether the field is in the error state
 * @param label label drawn inside the field. Empty hides it
 * @param placeholder shown under the label when [value] is empty
 * @param supportingText caption under the field. With [isError], it is drawn as the error message
 * @param showClear whether the clear icon is available while focused
 * @param onClear called after a clear, in addition to [onValueChange] with an empty string
 * @param showDropdown whether the dropdown arrow is shown
 * @param dropdownExpanded whether the arrow points up. Focus and press also point it up
 * @param onDropdownClick called when the dropdown arrow is clicked
 * @param keyboardOptions software keyboard options
 * @param keyboardActions when the input service emits an IME action
 * @param interactionSource hoisted [MutableInteractionSource] for this field
 */
@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    label: String = "",
    placeholder: String = "",
    supportingText: String? = null,
    showClear: Boolean = true,
    onClear: (() -> Unit)? = null,
    showDropdown: Boolean = false,
    dropdownExpanded: Boolean = false,
    onDropdownClick: () -> Unit = {},
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource? = null,
) {
    GeneInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        label = label,
        showLabel = true,
        placeholder = placeholder,
        supportingText = supportingText,
        singleLine = true,
        showClear = showClear,
        onClear = onClear,
        showDropdown = showDropdown,
        dropdownExpanded = dropdownExpanded,
        onDropdownClick = onDropdownClick,
        showAction = false,
        onAction = {},
        actionEnabled = false,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
    )
}

/**
 * Multi-line field for longer text such as a comment, note, or description.
 *
 * The box is at least 96dp and grows with the text. [showLabel] hides the label without changing
 * the box. There is no clear icon and no dropdown.
 *
 * @param value the input text to be shown
 * @param onValueChange called when the input service updates the text
 * @param modifier the [Modifier] to be applied to this field
 * @param enabled controls the enabled state. Disabled fields fade to 38%
 * @param readOnly controls the editable state of the text
 * @param isError whether the field is in the error state
 * @param label label drawn inside the field
 * @param showLabel whether [label] is drawn
 * @param placeholder shown under the label when [value] is empty
 * @param supportingText caption under the field. With [isError], it is drawn as the error message
 * @param keyboardOptions software keyboard options
 * @param keyboardActions when the input service emits an IME action
 * @param interactionSource hoisted [MutableInteractionSource] for this field
 */
@Composable
fun TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    label: String = "",
    showLabel: Boolean = true,
    placeholder: String = "",
    supportingText: String? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource? = null,
) {
    GeneInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        label = label,
        showLabel = showLabel,
        placeholder = placeholder,
        supportingText = supportingText,
        singleLine = false,
        showClear = false,
        onClear = null,
        showDropdown = false,
        dropdownExpanded = false,
        onDropdownClick = {},
        showAction = false,
        onAction = {},
        actionEnabled = false,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
    )
}

/**
 * Single-line field with an inline action button, for a short entry that is submitted immediately.
 *
 * The action stays disabled until [value] is not empty, unless [actionEnabled] is set. An empty
 * field fades the button to 38%.
 *
 * @param value the input text to be shown
 * @param onValueChange called when the input service updates the text
 * @param onAction called when the action button or the keyboard send action is used
 * @param modifier the [Modifier] to be applied to this field
 * @param enabled controls the enabled state of the field. Disabled fields fade to 38%
 * @param readOnly controls the editable state of the text
 * @param isError whether the field is in the error state
 * @param label label drawn inside the field. Empty hides it
 * @param placeholder shown under the label when [value] is empty
 * @param supportingText caption under the field. With [isError], it is drawn as the error message
 * @param showClear whether the clear icon is available while focused
 * @param onClear called after a clear, in addition to [onValueChange] with an empty string
 * @param actionEnabled whether the action button can be pressed. Defaults to non-empty [value]
 * @param keyboardOptions software keyboard options
 * @param keyboardActions when the input service emits an IME action. The default send action calls
 *   [onAction] when the button is enabled
 * @param interactionSource hoisted [MutableInteractionSource] for this field
 */
@Composable
fun ActionInput(
    value: String,
    onValueChange: (String) -> Unit,
    onAction: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    label: String = "",
    placeholder: String = "",
    supportingText: String? = null,
    showClear: Boolean = true,
    onClear: (() -> Unit)? = null,
    actionEnabled: Boolean = enabled && value.isNotEmpty(),
    keyboardOptions: KeyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
    keyboardActions: KeyboardActions = KeyboardActions(onSend = { if (actionEnabled) onAction() }),
    interactionSource: MutableInteractionSource? = null,
) {
    GeneInput(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        label = label,
        showLabel = true,
        placeholder = placeholder,
        supportingText = supportingText,
        singleLine = true,
        showClear = showClear,
        onClear = onClear,
        showDropdown = false,
        dropdownExpanded = false,
        onDropdownClick = {},
        showAction = true,
        onAction = onAction,
        actionEnabled = actionEnabled,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
    )
}

@Composable
private fun GeneInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    readOnly: Boolean,
    isError: Boolean,
    label: String,
    showLabel: Boolean,
    placeholder: String,
    supportingText: String?,
    singleLine: Boolean,
    showClear: Boolean,
    onClear: (() -> Unit)?,
    showDropdown: Boolean,
    dropdownExpanded: Boolean,
    onDropdownClick: () -> Unit,
    showAction: Boolean,
    onAction: () -> Unit,
    actionEnabled: Boolean,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    interactionSource: MutableInteractionSource?,
) {
    val scheme = MaterialTheme.colorScheme
    val focusRequester = remember { FocusRequester() }
    val fieldInteraction = interactionSource ?: remember { MutableInteractionSource() }
    val openInteraction = remember { MutableInteractionSource() }
    val focused by fieldInteraction.collectIsFocusedAsState()
    val hovered by fieldInteraction.collectIsHoveredAsState()
    val pressed by fieldInteraction.collectIsPressedAsState()
    val floated = focused || value.isNotEmpty() || placeholder.isNotEmpty()
    val accent =
        when {
            !enabled -> scheme.onSurface.copy(alpha = DisabledContentAlpha)
            isError -> scheme.error
            else -> scheme.primary
        }
    val inputColor =
        if (enabled) scheme.onSurface else scheme.onSurface.copy(alpha = DisabledContentAlpha)
    val placeholderColor =
        when {
            !enabled -> scheme.onSurface.copy(alpha = DisabledContentAlpha)
            focused -> PlaceholderMuted
            else -> scheme.onSurfaceVariant
        }
    val disabledSurface = scheme.onSurface.copy(alpha = DisabledSurfaceAlpha)
    val hasSecondaryLine = value.isNotEmpty() || placeholder.isNotEmpty()
    val borderColor =
        when {
            !enabled && hasSecondaryLine -> disabledSurface
            !enabled -> scheme.outlineVariant
            isError -> scheme.error
            focused || pressed || hovered -> scheme.primary
            else -> scheme.outlineVariant
        }
    val overlay =
        when {
            !enabled -> disabledSurface
            isError && (focused || pressed) -> PaletteTokens.Error80.copy(alpha = PressedOverlayAlpha)
            isError && hovered -> PaletteTokens.Error80.copy(alpha = HoverOverlayAlpha)
            focused || pressed -> PaletteTokens.Primary80.copy(alpha = PressedOverlayAlpha)
            hovered -> PaletteTokens.Primary80.copy(alpha = HoverOverlayAlpha)
            else -> Color.Transparent
        }
    val iconTint = if (isError) scheme.error else scheme.onSurface
    val shape = TextInputShape
    val bodyLarge = MaterialTheme.typography.bodyLarge
    val bodySmall = MaterialTheme.typography.bodySmall
    val inputStyle = bodyLarge.merge(TextStyle(color = inputColor))

    Column(modifier.alpha(if (enabled) 1f else DisabledOpacity)) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier =
                Modifier.fillMaxWidth()
                    .focusRequester(focusRequester)
                    .hoverable(fieldInteraction, enabled)
                    .background(scheme.surfaceBright, shape)
                    .background(overlay, shape)
                    .border(FieldBorderWidth, borderColor, shape)
                    .then(
                        if (singleLine) {
                            Modifier.height(SingleLineHeight)
                        } else {
                            Modifier.heightIn(min = AreaMinHeight)
                        }
                    ),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = inputStyle,
            cursorBrush = SolidColor(if (isError) scheme.error else scheme.primary),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = if (singleLine) 1 else Int.MAX_VALUE,
            interactionSource = fieldInteraction,
            decorationBox = { innerTextField ->
                Row(
                    modifier =
                        Modifier.fillMaxWidth()
                            .then(if (singleLine) Modifier.fillMaxHeight() else Modifier)
                            .clickable(
                                interactionSource = openInteraction,
                                indication = null,
                                enabled = enabled,
                                onClick = { focusRequester.requestFocus() },
                            )
                            .padding(
                                start = HorizontalPadding,
                                end = if (singleLine) TrailingPadding else HorizontalPadding,
                                top = if (singleLine) 0.dp else AreaVerticalPadding,
                                bottom = if (singleLine) 0.dp else AreaVerticalPadding,
                            ),
                    verticalAlignment =
                        if (singleLine) Alignment.CenterVertically else Alignment.Top,
                ) {
                    Column(Modifier.weight(1f)) {
                        if (floated && showLabel && label.isNotEmpty()) {
                            Text(
                                text = label,
                                style = bodySmall,
                                color = accent,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        Box(
                            Modifier.fillMaxWidth().heightIn(min = InputLineHeight),
                            contentAlignment = Alignment.CenterStart,
                        ) {
                            if (value.isEmpty() && !floated && showLabel && label.isNotEmpty()) {
                                Text(
                                    text = label,
                                    style = bodyLarge,
                                    color = accent,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            if (value.isEmpty() && floated && placeholder.isNotEmpty()) {
                                Text(
                                    text = placeholder,
                                    style = bodyLarge,
                                    color = placeholderColor,
                                    maxLines = if (singleLine) 1 else Int.MAX_VALUE,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            innerTextField()
                        }
                    }
                    if (showClear && focused && enabled) {
                        TrailingIcon(
                            icon = TextInputIcons.Cancel,
                            contentDescription = "Clear",
                            tint = iconTint,
                            onClick = {
                                onValueChange("")
                                onClear?.invoke()
                            },
                        )
                    }
                    if (showDropdown) {
                        val expanded = dropdownExpanded || focused || pressed
                        TrailingIcon(
                            icon = if (expanded) TextInputIcons.ArrowDropUp else TextInputIcons.ArrowDropDown,
                            contentDescription = "Dropdown",
                            tint = iconTint,
                            onClick = onDropdownClick,
                            enabled = enabled,
                        )
                    }
                    if (showAction) {
                        TrailingIcon(
                            icon = TextInputIcons.Send,
                            contentDescription = "Send",
                            tint = scheme.primary,
                            onClick = onAction,
                            enabled = enabled && actionEnabled,
                            dimmed = enabled && !actionEnabled,
                            buttonSize = ActionButtonSize,
                        )
                    }
                }
            },
        )
        if (supportingText != null) {
            if (isError) {
                Row(
                    Modifier.fillMaxWidth().padding(start = ErrorSupportingStart, end = HorizontalPadding),
                    verticalAlignment = Alignment.Top,
                ) {
                    Icon(
                        imageVector = TextInputIcons.Error,
                        contentDescription = null,
                        modifier = Modifier.padding(top = SupportingVerticalPadding).size(ErrorIconSize),
                        tint = scheme.error,
                    )
                    Text(
                        text = supportingText,
                        modifier =
                            Modifier.weight(1f)
                                .padding(
                                    start = SupportingIconGap,
                                    top = SupportingVerticalPadding,
                                    bottom = SupportingVerticalPadding,
                                ),
                        style = bodySmall,
                        color = scheme.error,
                    )
                }
            } else {
                Text(
                    text = supportingText,
                    modifier =
                        Modifier.fillMaxWidth()
                            .padding(
                                horizontal = HorizontalPadding,
                                vertical = SupportingVerticalPadding,
                            ),
                    style = bodySmall,
                    color = scheme.onSurfaceVariant,
                )
            }
        }
    }
}

@Composable
private fun TrailingIcon(
    icon: ImageVector,
    contentDescription: String,
    tint: Color,
    onClick: () -> Unit,
    enabled: Boolean = true,
    dimmed: Boolean = false,
    buttonSize: Dp = TrailingSlot,
) {
    val interaction = remember { MutableInteractionSource() }
    Box(Modifier.size(TrailingSlot), contentAlignment = Alignment.Center) {
        Box(
            modifier =
                Modifier.size(buttonSize)
                    .alpha(if (dimmed) DisabledOpacity else 1f)
                    .clickable(
                        onClick = onClick,
                        enabled = enabled,
                        role = Role.Button,
                        interactionSource = interaction,
                        indication = ripple(bounded = false, radius = buttonSize / 2),
                    ),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                modifier = Modifier.size(IconSize),
                tint = tint,
            )
        }
    }
}

private fun icon(name: String, path: String): ImageVector =
    ImageVector.Builder(
            name = name,
            defaultWidth = IconSize,
            defaultHeight = IconSize,
            viewportWidth = 24f,
            viewportHeight = 24f,
        )
        .apply {
            addPath(
                pathData = PathParser().parsePathString(path).toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
        }
        .build()

private object TextInputIcons {
    val Cancel: ImageVector by lazy {
        icon(
            "Filled.Cancel",
            "M22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12ZM4 12C4 7.58172 7.58172 4 12 4C16.4183 4 20 7.58172 20 12C20 16.4183 16.4183 20 12 20C7.58172 20 4 16.4183 4 12ZM13.432 12.0207L16.2595 14.8519L14.8444 16.2652L12.0187 13.4358L9.193 16.2652L7.77788 14.8519L10.6054 12.0207L7.77788 9.18958L9.193 7.77627L12.0187 10.6056L14.8444 7.77627L16.2595 9.18958L13.432 12.0207Z",
        )
    }
    val ArrowDropDown: ImageVector by lazy {
        icon(
            "Filled.ArrowDropDown",
            "M10.5862 14.6019L5.98291 9.99866L7.39712 8.58444L12.0004 13.1877L16.6036 8.58451L18.0178 9.99873L13.4146 14.6019C12.6336 15.383 11.3672 15.383 10.5862 14.6019Z",
        )
    }
    val ArrowDropUp: ImageVector by lazy {
        icon(
            "Filled.ArrowDropUp",
            "M10.5851 9.39826C11.3662 8.61721 12.6325 8.61721 13.4136 9.39826L18.0168 14.0015L16.6026 15.4157L11.9993 10.8125L12.7065 10.1054L7.39615 15.4157L5.98193 14.0015L10.5851 9.39826Z",
        )
    }
    val Error: ImageVector by lazy {
        icon(
            "Filled.Error",
            "M22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22C17.5228 22 22 17.5228 22 12ZM11 17V15H13V17H11ZM11 7L11 14H13L13 7H11Z",
        )
    }
    val Send: ImageVector by lazy {
        icon(
            "Filled.Send",
            "M4.39827 3.60715C4.27259 3.55257 4.13702 3.52441 4 3.52441C3.44772 3.52441 3 3.97213 3 4.52441V10V10.0275L12.0737 12L3 13.9726V14V19.4756C3 19.6127 3.02816 19.7482 3.08273 19.8739C3.30269 20.3805 3.89168 20.6129 4.39827 20.3929L21.6154 12.9173C21.8479 12.8163 22.0334 12.6308 22.1344 12.3983C22.3543 11.8917 22.122 11.3027 21.6154 11.0828L4.39827 3.60715Z",
        )
    }
}

private val TextInputShape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
private val SingleLineHeight = 56.dp
private val AreaMinHeight = 96.dp
private val InputLineHeight = 24.dp
private val HorizontalPadding = 16.dp
private val TrailingPadding = 8.dp
private val AreaVerticalPadding = 12.dp
private val SupportingVerticalPadding = 2.dp
private val ErrorSupportingStart = 8.dp
private val SupportingIconGap = 4.dp
private val TrailingSlot = 48.dp
private val ActionButtonSize = 40.dp
private val IconSize = 24.dp
private val ErrorIconSize = 16.dp
private val FieldBorderWidth = 1.dp
private const val DisabledOpacity = 0.38f
private const val DisabledContentAlpha = 0.38f
private const val DisabledSurfaceAlpha = 0.12f
private const val HoverOverlayAlpha = 0.12f
private const val PressedOverlayAlpha = 0.18f
private val PlaceholderMuted = Color(0xFF92908F)
