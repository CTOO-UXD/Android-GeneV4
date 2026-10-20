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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.genev4.internal.rememberAiInputFilePicker

/**
 * A file chosen through [AiInput]'s built-in picker. Pass the list with [AiInput]'s `files` /
 * `onFilesChange`. Network upload stays in the host app.
 */
@Immutable
data class AiInputFile(
    val uri: String,
    val name: String,
    val type: String,
)

/**
 * Where the send action sits.
 *
 * [BottomBar] keeps the field on one row and places the send button outside the card, aligned to
 * the bottom. [Container] stacks the text above an action row and keeps the send button inside the
 * card. Use [Container] for narrow widths.
 */
enum class AiInputLayout {
    BottomBar,
    Container,
}

/**
 * What the field is doing.
 *
 * [Text] is typing. [Listening] shows the voice chrome and keeps send disabled. [Thinking] locks
 * the draft and turns send into stop.
 */
enum class AiInputPhase {
    Text,
    Listening,
    Thinking,
}

/**
 * Prompt field for starting a chat. Empty, hover, and focus come from interaction. Pass
 * [onFilesChange] to let the + button open the system file picker and show chips for [files].
 *
 * @param value the input text to be shown in the field
 * @param onValueChange the callback that is triggered when the input service updates the text
 * @param onSend called when the send button or the keyboard send action is used
 * @param modifier the [Modifier] to be applied to this input
 * @param layout [AiInputLayout.BottomBar] for a wide single row, [AiInputLayout.Container] for a
 *   stacked narrow field
 * @param phase [AiInputPhase] of the conversation around this field
 * @param onStop called when the action button is pressed during [AiInputPhase.Thinking]
 * @param onAddClick called when the leading add button is pressed and [onFilesChange] is null
 * @param onMicClick called when the microphone button is pressed
 * @param onClear called when the clear button is pressed
 * @param enabled controls the enabled state of this input
 * @param readOnly controls the editable state of the text. Thinking and listening are always
 *   read-only
 * @param placeholder shown when [value] is empty and [phase] is [AiInputPhase.Text]
 * @param listeningPlaceholder shown when [value] is empty and [phase] is [AiInputPhase.Listening]
 * @param disclaimer caption under the field. Null hides it
 * @param maxLines how many lines stay visible before the field scrolls. [AiInputPhase.Thinking]
 *   stays on one line and ellipsizes
 * @param files files shown as chips when using the built-in picker
 * @param onFilesChange when non-null, the + button opens the system picker and reports the new list
 * @param attachmentMimeTypes MIME types accepted by the built-in picker
 * @param attachments extra content drawn after [files], such as [AiInputImageAttachment]
 * @param toolbar content drawn after the add button. Null hides it
 * @param suggestion content drawn in front of the text, such as a highlighted prompt prefix
 * @param colors [AiInputColors] used for the container, text, and voice chrome
 * @param shape shape of the input card
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AiInput(
    value: String,
    onValueChange: (String) -> Unit,
    onSend: () -> Unit,
    modifier: Modifier = Modifier,
    layout: AiInputLayout = AiInputLayout.BottomBar,
    phase: AiInputPhase = AiInputPhase.Text,
    onStop: () -> Unit = {},
    onAddClick: () -> Unit = {},
    onMicClick: () -> Unit = {},
    onClear: () -> Unit = {},
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placeholder: String = "Ask anything or search...",
    listeningPlaceholder: String = "I'm listening...",
    disclaimer: String? = "AI can make mistakes and may not be suitable for some minors.",
    maxLines: Int = 3,
    files: List<AiInputFile> = emptyList(),
    onFilesChange: ((List<AiInputFile>) -> Unit)? = null,
    attachmentMimeTypes: List<String> = AiInputDefaults.AttachmentMimeTypes,
    attachments: (@Composable () -> Unit)? = null,
    toolbar: (@Composable () -> Unit)? = null,
    suggestion: (@Composable () -> Unit)? = null,
    colors: AiInputColors = AiInputDefaults.colors(),
    shape: Shape = AiInputDefaults.ContainerShape,
) {
    val fieldInteraction = remember { MutableInteractionSource() }
    val hoverInteraction = remember { MutableInteractionSource() }
    val focused by fieldInteraction.collectIsFocusedAsState()
    val hovered by hoverInteraction.collectIsHoveredAsState()
    val listening = phase == AiInputPhase.Listening
    val thinking = phase == AiInputPhase.Thinking
    val canSend = enabled && phase == AiInputPhase.Text && value.isNotBlank()
    val showClear = value.isNotEmpty() && !listening
    val containerLayout = layout == AiInputLayout.Container
    val textReadOnly = readOnly || phase != AiInputPhase.Text
    val placeholderText = if (listening) listeningPlaceholder else placeholder
    val textMaxLines = if (thinking) 1 else maxLines
    val textStyle =
        MaterialTheme.typography.bodyMedium.merge(TextStyle(color = colors.textColor))
    val launchFilePicker =
        rememberAiInputFilePicker(attachmentMimeTypes) { picked ->
            onFilesChange?.invoke((files + picked).distinctBy { it.uri })
        }
    val handleAddClick: () -> Unit = {
        if (onFilesChange != null) {
            launchFilePicker()
        } else {
            onAddClick()
        }
    }
    val showAttachments = files.isNotEmpty() || attachments != null

    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            AiInputCard(
                modifier = Modifier.weight(1f),
                shape = shape,
                colors = colors,
                listening = listening,
                showHover = hovered && enabled && !listening,
                showFocus = focused && enabled && !listening,
                hoverInteraction = hoverInteraction,
            ) {
                Column {
                    if (showAttachments) {
                        FlowRow(
                            modifier =
                                Modifier.fillMaxWidth()
                                    .widthIn(max = AiInputDefaults.AttachmentMaxWidth)
                                    .padding(start = 12.dp, end = 12.dp, top = 12.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            files.forEach { file ->
                                AiInputFileAttachment(
                                    name = file.name,
                                    type = file.type,
                                    onRemove = {
                                        onFilesChange?.invoke(files.filterNot { it.uri == file.uri })
                                    },
                                )
                            }
                            attachments?.invoke()
                        }
                    }
                    if (containerLayout) {
                        AiInputText(
                            value = value,
                            onValueChange = onValueChange,
                            enabled = enabled,
                            readOnly = textReadOnly,
                            textStyle = textStyle,
                            placeholder = placeholderText,
                            placeholderColor = colors.placeholderColor,
                            cursorColor = colors.cursorColor,
                            maxLines = textMaxLines,
                            contentPadding = PaddingValues(0.dp),
                            fieldMinHeight = AiInputDefaults.ContainerTextMinHeight,
                            onSend = { if (canSend) onSend() },
                            interactionSource = fieldInteraction,
                            suggestion = suggestion,
                            modifier =
                                Modifier.fillMaxWidth()
                                    .padding(
                                        start = 16.dp,
                                        end = 4.dp,
                                        top = if (!showAttachments) 12.dp else 0.dp,
                                    ),
                        )
                        Spacer(Modifier.height(8.dp))
                        AiInputActions(
                            layout = layout,
                            enabled = enabled,
                            showClear = showClear,
                            clearEnabled = enabled && !thinking,
                            micEnabled = enabled && !thinking,
                            micActive = listening,
                            canSend = canSend,
                            thinking = thinking,
                            colors = colors,
                            toolbar = toolbar,
                            onAddClick = handleAddClick,
                            onMicClick = onMicClick,
                            onClear = onClear,
                            onSend = onSend,
                            onStop = onStop,
                        )
                    } else {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Bottom,
                        ) {
                            AiInputAddButton(enabled = enabled, onClick = handleAddClick)
                            if (toolbar != null) {
                                Spacer(Modifier.width(4.dp))
                                toolbar()
                            }
                            Spacer(Modifier.width(4.dp))
                            AiInputText(
                                value = value,
                                onValueChange = onValueChange,
                                enabled = enabled,
                                readOnly = textReadOnly,
                                textStyle = textStyle,
                                placeholder = placeholderText,
                                placeholderColor = colors.placeholderColor,
                                cursorColor = colors.cursorColor,
                                maxLines = textMaxLines,
                                contentPadding = PaddingValues(vertical = 14.dp),
                                fieldMinHeight = 0.dp,
                                onSend = { if (canSend) onSend() },
                                interactionSource = fieldInteraction,
                                suggestion = suggestion,
                                modifier = Modifier.weight(1f),
                            )
                            Spacer(Modifier.width(4.dp))
                            if (showClear) {
                                AiInputClearButton(
                                    enabled = enabled && !thinking,
                                    onClick = onClear,
                                )
                            }
                            AiInputMicButton(
                                enabled = enabled && !thinking,
                                active = listening,
                                onClick = onMicClick,
                            )
                        }
                    }
                }
            }
            if (layout == AiInputLayout.BottomBar) {
                AiInputActionButton(
                    thinking = thinking,
                    enabled = if (thinking) enabled else canSend,
                    colors = colors,
                    size = AiInputDefaults.SendButtonSize,
                    onSend = onSend,
                    onStop = onStop,
                )
            }
        }
        if (disclaimer != null) {
            Text(
                text = disclaimer,
                modifier =
                    Modifier.fillMaxWidth()
                        .padding(
                            end = if (layout == AiInputLayout.BottomBar) AiInputDefaults.DisclaimerEndInset else 0.dp,
                            top = 4.dp,
                            bottom = 4.dp,
                        ),
                style = MaterialTheme.typography.bodySmall,
                color = colors.disclaimerColor,
                textAlign = TextAlign.Center,
                maxLines = 1,
                softWrap = false,
                overflow = TextOverflow.Visible,
            )
        }
    }
}

/** File chip used inside [AiInput]'s attachment slot. */
@Composable
fun AiInputFileAttachment(
    name: String,
    type: String,
    onRemove: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector = AiInputIcons.File,
) {
    val scheme = MaterialTheme.colorScheme
    val shape = RoundedCornerShape(16.dp)
    Row(
        modifier =
            modifier
                .height(48.dp)
                .widthIn(max = 212.dp)
                .border(BorderStroke(1.dp, Color.Black.copy(alpha = 0.12f)), shape)
                .clip(shape)
                .background(scheme.secondaryFixed)
                .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = Modifier.size(32.dp).clip(CircleShape).background(Color.White),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = scheme.onSecondaryFixed,
            )
        }
        Column(modifier = Modifier.weight(1f, fill = false).widthIn(max = 116.dp)) {
            Text(
                text = name,
                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Medium),
                color = scheme.onSecondaryFixed,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = type,
                style = MaterialTheme.typography.bodySmall,
                color = scheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        AiInputRemoveButton(onClick = onRemove, iconSize = 24.dp)
    }
}

/** Image thumbnail used inside [AiInput]'s attachment slot. */
@Composable
fun AiInputImageAttachment(
    painter: Painter,
    contentDescription: String?,
    onRemove: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier.size(96.dp)) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop,
        )
        AiInputRemoveButton(
            onClick = onRemove,
            iconSize = 12.dp,
            buttonSize = 20.dp,
            modifier = Modifier.align(Alignment.TopEnd).padding(4.dp),
        )
    }
}

/** Colors used by [AiInput]. */
@Immutable
class AiInputColors(
    val containerColor: Color,
    val textColor: Color,
    val placeholderColor: Color,
    val disclaimerColor: Color,
    val cursorColor: Color,
    val focusIndicatorColor: Color,
    val hoverOverlayColor: Color,
    val sendContainerColor: Color,
    val sendContentColor: Color,
    val sendDisabledContainerColor: Color,
    val sendDisabledContentColor: Color,
    val listeningContainerColor: Color,
    val listeningBorderColors: List<Color>,
) {
    fun copy(
        containerColor: Color = this.containerColor,
        textColor: Color = this.textColor,
        placeholderColor: Color = this.placeholderColor,
        disclaimerColor: Color = this.disclaimerColor,
        cursorColor: Color = this.cursorColor,
        focusIndicatorColor: Color = this.focusIndicatorColor,
        hoverOverlayColor: Color = this.hoverOverlayColor,
        sendContainerColor: Color = this.sendContainerColor,
        sendContentColor: Color = this.sendContentColor,
        sendDisabledContainerColor: Color = this.sendDisabledContainerColor,
        sendDisabledContentColor: Color = this.sendDisabledContentColor,
        listeningContainerColor: Color = this.listeningContainerColor,
        listeningBorderColors: List<Color> = this.listeningBorderColors,
    ): AiInputColors =
        AiInputColors(
            containerColor = containerColor,
            textColor = textColor,
            placeholderColor = placeholderColor,
            disclaimerColor = disclaimerColor,
            cursorColor = cursorColor,
            focusIndicatorColor = focusIndicatorColor,
            hoverOverlayColor = hoverOverlayColor,
            sendContainerColor = sendContainerColor,
            sendContentColor = sendContentColor,
            sendDisabledContainerColor = sendDisabledContainerColor,
            sendDisabledContentColor = sendDisabledContentColor,
            listeningContainerColor = listeningContainerColor,
            listeningBorderColors = listeningBorderColors,
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AiInputColors) return false
        return containerColor == other.containerColor &&
            textColor == other.textColor &&
            placeholderColor == other.placeholderColor &&
            disclaimerColor == other.disclaimerColor &&
            cursorColor == other.cursorColor &&
            focusIndicatorColor == other.focusIndicatorColor &&
            hoverOverlayColor == other.hoverOverlayColor &&
            sendContainerColor == other.sendContainerColor &&
            sendContentColor == other.sendContentColor &&
            sendDisabledContainerColor == other.sendDisabledContainerColor &&
            sendDisabledContentColor == other.sendDisabledContentColor &&
            listeningContainerColor == other.listeningContainerColor &&
            listeningBorderColors == other.listeningBorderColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + textColor.hashCode()
        result = 31 * result + placeholderColor.hashCode()
        result = 31 * result + disclaimerColor.hashCode()
        result = 31 * result + cursorColor.hashCode()
        result = 31 * result + focusIndicatorColor.hashCode()
        result = 31 * result + hoverOverlayColor.hashCode()
        result = 31 * result + sendContainerColor.hashCode()
        result = 31 * result + sendContentColor.hashCode()
        result = 31 * result + sendDisabledContainerColor.hashCode()
        result = 31 * result + sendDisabledContentColor.hashCode()
        result = 31 * result + listeningContainerColor.hashCode()
        result = 31 * result + listeningBorderColors.hashCode()
        return result
    }
}

/** Default measurements and colors for [AiInput]. */
object AiInputDefaults {
    val ContainerCorner = 24.dp
    val ContainerShape = RoundedCornerShape(ContainerCorner)
    val FieldMinHeight = 48.dp
    val ContainerTextMinHeight = 32.dp
    val SendButtonSize = 48.dp
    val ContainerSendButtonSize = 40.dp
    val DisclaimerEndInset = 60.dp
    val AttachmentMaxWidth = 600.dp
    val IconSize = 24.dp
    val AttachmentMimeTypes = listOf("*/*")

    /** Selected microphone fill. Design token: Gradients/Button Active. */
    val ActiveMicBrush =
        Brush.linearGradient(
            listOf(
                Color(0xFF5C8DFF),
                Color(0xFFA079FF),
                Color(0xFFD06AD6),
            )
        )

    private val ListeningBorder =
        listOf(
            Color(0xFFFF7257),
            Color(0xFFEB6296),
            Color(0xFFD06AD6),
            Color(0xFFA079FF),
            Color(0xFF5C8DFF),
        )

    @Composable
    fun colors(
        containerColor: Color = MaterialTheme.colorScheme.surfaceContainerLowest,
        textColor: Color = MaterialTheme.colorScheme.onSurface,
        placeholderColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
        disclaimerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
        cursorColor: Color = MaterialTheme.colorScheme.primary,
        focusIndicatorColor: Color = MaterialTheme.colorScheme.surfaceTint,
        hoverOverlayColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.10f),
        sendContainerColor: Color = MaterialTheme.colorScheme.primary,
        sendContentColor: Color = MaterialTheme.colorScheme.onPrimary,
        sendDisabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.10f),
        sendDisabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
        listeningContainerColor: Color = Color(0x29825BDE),
        listeningBorderColors: List<Color> = ListeningBorder,
    ): AiInputColors =
        AiInputColors(
            containerColor = containerColor,
            textColor = textColor,
            placeholderColor = placeholderColor,
            disclaimerColor = disclaimerColor,
            cursorColor = cursorColor,
            focusIndicatorColor = focusIndicatorColor,
            hoverOverlayColor = hoverOverlayColor,
            sendContainerColor = sendContainerColor,
            sendContentColor = sendContentColor,
            sendDisabledContainerColor = sendDisabledContainerColor,
            sendDisabledContentColor = sendDisabledContentColor,
            listeningContainerColor = listeningContainerColor,
            listeningBorderColors = listeningBorderColors,
        )
}

@Composable
private fun AiInputCard(
    shape: Shape,
    colors: AiInputColors,
    listening: Boolean,
    showHover: Boolean,
    showFocus: Boolean,
    hoverInteraction: MutableInteractionSource,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val borderBrush = Brush.horizontalGradient(colors.listeningBorderColors)
    Box(
        modifier =
            modifier
                .drawBehind {
                    if (showFocus) {
                        val outset = 4.dp.toPx()
                        val corner =
                            if (shape is RoundedCornerShape) {
                                shape.topStart.toPx(Size(size.width, size.height), this)
                            } else {
                                AiInputDefaults.ContainerCorner.toPx()
                            }
                        drawRoundRect(
                            color = colors.focusIndicatorColor,
                            topLeft = Offset(-outset, -outset),
                            size = Size(size.width + outset * 2, size.height + outset * 2),
                            cornerRadius = CornerRadius(corner + outset),
                            style = Stroke(width = 2.dp.toPx()),
                        )
                    }
                }
                .hoverable(hoverInteraction)
                .then(
                    if (listening) {
                        Modifier.border(width = 2.dp, brush = borderBrush, shape = shape)
                    } else {
                        Modifier
                    }
                )
                .clip(shape)
                .background(colors.containerColor)
                .then(if (listening) Modifier.background(colors.listeningContainerColor) else Modifier)
                .drawWithContent {
                    if (showHover) {
                        drawRect(colors.hoverOverlayColor)
                    }
                    drawContent()
                },
        content = { content() },
    )
}

@Composable
private fun AiInputText(
    value: String,
    onValueChange: (String) -> Unit,
    enabled: Boolean,
    readOnly: Boolean,
    textStyle: TextStyle,
    placeholder: String,
    placeholderColor: Color,
    cursorColor: Color,
    maxLines: Int,
    contentPadding: PaddingValues,
    fieldMinHeight: Dp,
    onSend: () -> Unit,
    interactionSource: MutableInteractionSource,
    suggestion: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
) {
    val scrollable = maxLines > 1
    val scroll = rememberScrollState()
    val density = LocalDensity.current
    val lineHeight = textStyle.lineHeight.let { if (it == TextUnit.Unspecified) 20.sp else it }
    val maxFieldHeight =
        contentPadding.calculateTopPadding() +
            contentPadding.calculateBottomPadding() +
            with(density) { lineHeight.toDp() } * maxLines +
            16.dp
    val overflows = scrollable && scroll.maxValue > 8f * density.density
    Box(modifier.then(if (scrollable) Modifier.clipToBounds() else Modifier)) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier =
            Modifier.fillMaxWidth()
                .then(
                    if (scrollable) {
                        Modifier.heightIn(max = maxFieldHeight).verticalScroll(scroll)
                    } else {
                        Modifier
                    },
                )
                .padding(end = if (overflows) 12.dp else 0.dp),
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        cursorBrush = SolidColor(cursorColor),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
        keyboardActions = KeyboardActions(onSend = { onSend() }),
        singleLine = !scrollable,
        maxLines = if (scrollable) Int.MAX_VALUE else 1,
        interactionSource = interactionSource,
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier.fillMaxWidth().padding(contentPadding),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (suggestion != null) {
                    suggestion()
                    Spacer(Modifier.width(4.dp))
                }
                Box(
                    modifier = Modifier.weight(1f).heightIn(min = fieldMinHeight),
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
            }
        },
    )
        if (overflows) {
            Box(
                Modifier.align(Alignment.CenterEnd)
                    .padding(end = 2.dp)
                    .width(4.dp)
                    .height(32.dp)
                    .background(
                        MaterialTheme.colorScheme.outline,
                        RoundedCornerShape(50),
                    ),
            )
        }
    }
}

@Composable
private fun AiInputActions(
    layout: AiInputLayout,
    enabled: Boolean,
    showClear: Boolean,
    clearEnabled: Boolean,
    micEnabled: Boolean,
    micActive: Boolean,
    canSend: Boolean,
    thinking: Boolean,
    colors: AiInputColors,
    toolbar: (@Composable () -> Unit)?,
    onAddClick: () -> Unit,
    onMicClick: () -> Unit,
    onClear: () -> Unit,
    onSend: () -> Unit,
    onStop: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 2.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier.padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            AiInputAddButton(enabled = enabled, onClick = onAddClick)
            if (toolbar != null) {
                toolbar()
            }
        }
        Spacer(Modifier.weight(1f))
        Row(
            modifier = Modifier.padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (showClear) {
                AiInputClearButton(enabled = clearEnabled, onClick = onClear)
            }
            AiInputMicButton(enabled = micEnabled, active = micActive, onClick = onMicClick)
            if (layout == AiInputLayout.Container) {
                AiInputActionButton(
                    thinking = thinking,
                    enabled = if (thinking) enabled else canSend,
                    colors = colors,
                    size = AiInputDefaults.ContainerSendButtonSize,
                    onSend = onSend,
                    onStop = onStop,
                )
            }
        }
    }
}

@Composable
private fun AiInputAddButton(enabled: Boolean, onClick: () -> Unit) {
    IconButton(onClick = onClick, enabled = enabled) {
        Icon(
            imageVector = AiInputIcons.Add,
            contentDescription = "Add",
            modifier = Modifier.size(AiInputDefaults.IconSize),
        )
    }
}

@Composable
private fun AiInputClearButton(enabled: Boolean, onClick: () -> Unit) {
    FilledTonalIconButton(onClick = onClick, enabled = enabled) {
        Icon(
            imageVector = AiInputIcons.Close,
            contentDescription = "Clear",
            modifier = Modifier.size(AiInputDefaults.IconSize),
        )
    }
}

@Composable
private fun AiInputMicButton(enabled: Boolean, active: Boolean, onClick: () -> Unit) {
    if (active) {
        Box(
            modifier =
                Modifier.size(AiInputDefaults.FieldMinHeight)
                    .clickable(enabled = enabled, role = Role.Button, onClick = onClick),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier =
                    Modifier.size(AiInputDefaults.ContainerSendButtonSize)
                        .clip(CircleShape)
                        .background(AiInputDefaults.ActiveMicBrush),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = AiInputIcons.Mic,
                    contentDescription = "Microphone",
                    modifier = Modifier.size(AiInputDefaults.IconSize),
                    tint = Color.White,
                )
            }
        }
    } else {
        IconButton(onClick = onClick, enabled = enabled) {
            Icon(
                imageVector = AiInputIcons.Mic,
                contentDescription = "Microphone",
                modifier = Modifier.size(AiInputDefaults.IconSize),
            )
        }
    }
}

@Composable
private fun AiInputActionButton(
    thinking: Boolean,
    enabled: Boolean,
    colors: AiInputColors,
    size: Dp,
    onSend: () -> Unit,
    onStop: () -> Unit,
) {
    val container = if (enabled) colors.sendContainerColor else colors.sendDisabledContainerColor
    val content = if (enabled) colors.sendContentColor else colors.sendDisabledContentColor
    Box(
        modifier =
            Modifier.size(size)
                .clip(CircleShape)
                .background(container)
                .clickable(
                    enabled = enabled,
                    role = Role.Button,
                    onClick = if (thinking) onStop else onSend,
                ),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = if (thinking) AiInputIcons.Stop else AiInputIcons.Send,
            contentDescription = if (thinking) "Stop" else "Send",
            modifier = Modifier.size(AiInputDefaults.IconSize),
            tint = content,
        )
    }
}

@Composable
private fun AiInputRemoveButton(
    onClick: () -> Unit,
    iconSize: Dp,
    modifier: Modifier = Modifier,
    buttonSize: Dp = 32.dp,
) {
    Box(
        modifier =
            modifier
                .size(buttonSize)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .clickable(onClick = onClick, role = Role.Button),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = AiInputIcons.Close,
            contentDescription = "Remove",
            modifier = Modifier.size(iconSize),
            tint = MaterialTheme.colorScheme.onSecondaryContainer,
        )
    }
}

private object AiInputIcons {
    val Add: ImageVector = icon("AiInput.Add", "M13 3.5V11H20.5V13H13V20.5H11V13H3.5V11H11V3.5H13Z")
    val Close: ImageVector =
        icon(
            "AiInput.Close",
            "M18.3641 4.2218L19.7783 5.63602L13.4139 11.9998L19.7783 18.3639L18.3641 19.7782L11.9999 13.4138L5.63614 19.7782L4.22192 18.3639L10.5859 11.9998L4.22192 5.63602L5.63614 4.2218L11.9999 10.5858L18.3641 4.2218Z",
            fillType = PathFillType.EvenOdd,
        )
    val Mic: ImageVector =
        icon(
            "AiInput.Mic",
            "M11.9998 3C10.3429 3 8.99976 4.34315 8.99976 6V10C8.99976 11.6569 10.3429 13 11.9998 13C13.6566 13 14.9998 11.6569 14.9998 10V6C14.9998 4.34315 13.6566 3 11.9998 3ZM11.9998 1C14.7612 1 16.9998 3.23858 16.9998 6V10C16.9998 12.7614 14.7612 15 11.9998 15C9.23833 15 6.99976 12.7614 6.99976 10V6C6.99976 3.23858 9.23833 1 11.9998 1ZM3.05469 11H5.07065C5.55588 14.3923 8.47329 17 11.9998 17C15.5262 17 18.4436 14.3923 18.9289 11H20.9448C20.4837 15.1716 17.1714 18.4839 12.9998 18.9451V23H10.9998V18.9451C6.82814 18.4839 3.51584 15.1716 3.05469 11Z",
        )
    val Stop: ImageVector =
        icon(
            "AiInput.Stop",
            "M7 5H17A2 2 0 0 1 19 7V17A2 2 0 0 1 17 19H7A2 2 0 0 1 5 17V7A2 2 0 0 1 7 5Z",
        )
    val File: ImageVector =
        icon(
            "AiInput.File",
            "M3 1H9.2L13 4.8V15H3V1ZM9 2V5H12",
            viewport = 16f,
        )
    val Send: ImageVector =
        icon(
            "AiInput.Send",
            "M4 11H16.17L10.58 5.41L12 4L20 12L12 20L10.59 18.59L16.17 13H4V11Z",
        )

    private fun icon(
        name: String,
        path: String,
        viewport: Float = 24f,
        fillType: PathFillType = PathFillType.NonZero,
    ): ImageVector =
        ImageVector.Builder(
                name = name,
                defaultWidth = viewport.dp,
                defaultHeight = viewport.dp,
                viewportWidth = viewport,
                viewportHeight = viewport,
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
