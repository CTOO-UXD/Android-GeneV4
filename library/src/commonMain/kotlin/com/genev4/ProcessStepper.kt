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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Discrete progress through a short sequence of steps.
 *
 * Horizontal steps share the width and place [ProcessStep.label] under the node. Vertical steps
 * stack and place the label to the right of the node. [ProcessStepType] chooses a number, an icon,
 * or an empty circle. A completed step always draws a check, whatever the type.
 *
 * The connector after a step follows that step's [ProcessStepState]: 3dp after [ProcessStepState.Complete],
 * 1dp after [ProcessStepState.InProgress] and [ProcessStepState.Enabled], and 1dp in
 * [ColorScheme.outline] after [ProcessStepState.Disabled]. Each end of the line stops 4dp short of
 * the node. The last step has no connector.
 * Horizontal layout needs a bounded width.
 *
 * @param steps steps in order. An empty list draws nothing
 * @param modifier the [Modifier] to be applied to this stepper
 * @param orientation horizontal track or vertical stack
 * @param type what an incomplete node contains
 * @param showLabels whether each [ProcessStep.label] is drawn
 */
@Composable
fun ProcessStepper(
    steps: List<ProcessStep>,
    modifier: Modifier = Modifier,
    orientation: ProcessStepperOrientation = ProcessStepperOrientation.Horizontal,
    type: ProcessStepType = ProcessStepType.Number,
    showLabels: Boolean = true,
) {
    if (steps.isEmpty()) return
    when (orientation) {
        ProcessStepperOrientation.Horizontal ->
            HorizontalStepper(steps, type, showLabels, modifier)
        ProcessStepperOrientation.Vertical ->
            VerticalStepper(steps, type, showLabels, modifier)
    }
}

/** One step in a [ProcessStepper]. */
data class ProcessStep(
    val label: String,
    val state: ProcessStepState,
    val icon: ImageVector? = null,
)

/** Layout of a [ProcessStepper]. */
enum class ProcessStepperOrientation {
    Horizontal,
    Vertical,
}

/** What an incomplete step node shows. Completed nodes always show a check. */
enum class ProcessStepType {
    Number,
    Icon,
    Empty,
}

/** Progress of one step. These are not interaction states. */
enum class ProcessStepState {
    /** Finished. Filled node with a check, then a 3dp connector. */
    Complete,
    /** Current step. Filled node, then a 1dp connector. */
    InProgress,
    /** Not yet reached, still available. Outlined node, then a 1dp connector. */
    Enabled,
    /** Not available. Outlined in [ColorScheme.outline], then a 1dp outline connector. */
    Disabled,
}

@Composable
private fun HorizontalStepper(
    steps: List<ProcessStep>,
    type: ProcessStepType,
    showLabels: Boolean,
    modifier: Modifier,
) {
    val last = steps.lastIndex
    Row(modifier = modifier, verticalAlignment = Alignment.Top) {
        steps.forEachIndexed { index, step ->
            val isLast = index == last
            Column(modifier = if (isLast) Modifier else Modifier.weight(1f)) {
                Row(
                    modifier = if (isLast) Modifier else Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    StepNode(step, index, type)
                    if (!isLast) {
                        StepConnector(
                            state = step.state,
                            modifier = Modifier.weight(1f).widthIn(min = ConnectorMin),
                        )
                    }
                }
                if (showLabels) {
                    StepLabel(
                        step = step,
                        modifier =
                            Modifier.padding(top = LabelGap, end = LabelEnd)
                                .then(if (isLast) Modifier else Modifier.fillMaxWidth()),
                    )
                }
            }
        }
    }
}

@Composable
private fun VerticalStepper(
    steps: List<ProcessStep>,
    type: ProcessStepType,
    showLabels: Boolean,
    modifier: Modifier,
) {
    Column(modifier = modifier) {
        steps.forEachIndexed { index, step ->
            Row(
                modifier = Modifier.padding(start = NodeInset),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                StepNode(step, index, type)
                if (showLabels) {
                    StepLabel(
                        step = step,
                        modifier = Modifier.padding(start = LabelGap),
                    )
                }
            }
            if (index != steps.lastIndex) {
                Box(
                    modifier =
                        Modifier.padding(start = NodeInset)
                            .width(NodeSize)
                            .height(ConnectorMin),
                    contentAlignment = Alignment.Center,
                ) {
                    val thickness = connectorThickness(step.state)
                    Box(
                        Modifier.padding(vertical = ConnectorGap)
                            .width(thickness)
                            .fillMaxHeight()
                            .background(connectorColor(step.state))
                    )
                }
            }
        }
    }
}

@Composable
private fun StepNode(step: ProcessStep, index: Int, type: ProcessStepType) {
    val scheme = MaterialTheme.colorScheme
    val state = step.state
    val primary = scheme.primary
    val contentColor = nodeContentColor(state, scheme)
    val filled =
        state == ProcessStepState.Complete ||
            (state == ProcessStepState.InProgress && type != ProcessStepType.Empty)
    Box(
        modifier =
            Modifier.size(NodeSize)
                .then(if (filled) Modifier.background(primary, CircleShape) else Modifier)
                .then(
                    if (state == ProcessStepState.Complete) {
                        Modifier
                    } else {
                        Modifier.border(NodeBorder, stepBorderColor(state, scheme), CircleShape)
                    }
                ),
        contentAlignment = Alignment.Center,
    ) {
        when {
            state == ProcessStepState.Complete ->
                Icon(
                    imageVector = ProcessStepperIcons.Check,
                    contentDescription = "Completed",
                    modifier = Modifier.size(GlyphSize),
                    tint = scheme.onPrimary,
                )
            type == ProcessStepType.Number ->
                Text(
                    text = (index + 1).toString(),
                    color = contentColor,
                    style = NumberStyle,
                    textAlign = TextAlign.Center,
                )
            type == ProcessStepType.Icon && step.icon != null ->
                Icon(
                    imageVector = step.icon,
                    contentDescription = null,
                    modifier = Modifier.size(GlyphSize),
                    tint = contentColor,
                )
            type == ProcessStepType.Empty && state == ProcessStepState.InProgress ->
                Box(Modifier.size(EmptyDot).background(primary, CircleShape))
        }
    }
}

@Composable
private fun StepConnector(state: ProcessStepState, modifier: Modifier) {
    Box(
        modifier
            .padding(horizontal = ConnectorGap)
            .height(connectorThickness(state))
            .background(connectorColor(state))
    )
}

@Composable
private fun StepLabel(step: ProcessStep, modifier: Modifier) {
    Text(
        text = step.label,
        modifier = modifier,
        color = labelColor(step.state, MaterialTheme.colorScheme),
        style = LabelStyle,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}

private fun nodeContentColor(state: ProcessStepState, scheme: ColorScheme): Color =
    when (state) {
        ProcessStepState.Complete,
        ProcessStepState.InProgress -> scheme.onPrimary
        ProcessStepState.Enabled -> scheme.primary
        ProcessStepState.Disabled -> scheme.onSurfaceVariant
    }

private fun labelColor(state: ProcessStepState, scheme: ColorScheme): Color =
    if (state == ProcessStepState.Disabled) scheme.onSurfaceVariant else scheme.primary

private fun stepBorderColor(state: ProcessStepState, scheme: ColorScheme): Color =
    if (state == ProcessStepState.Disabled) scheme.outline else scheme.primary

@Composable
private fun connectorColor(state: ProcessStepState): Color {
    val scheme = MaterialTheme.colorScheme
    return if (state == ProcessStepState.Disabled) scheme.outline else scheme.primary
}

private fun connectorThickness(state: ProcessStepState): Dp =
    if (state == ProcessStepState.Complete) CompletedConnector else ActiveConnector

private val NumberStyle =
    TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.25.sp,
        textAlign = TextAlign.Center,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

private val LabelStyle =
    TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.1.sp,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

private fun icon(name: String, path: String): ImageVector =
    ImageVector.Builder(
            name = name,
            defaultWidth = GlyphSize,
            defaultHeight = GlyphSize,
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

private object ProcessStepperIcons {
    val Check: ImageVector by lazy {
        icon(
            "Filled.Check",
            "M22.778 6.7142L11.0719 18.4203C10.6814 18.8108 10.0482 18.8108 9.65771 18.4203L2.91992 11.6825L4.33414 10.2683L10.3648 16.299L21.3638 5.29999L22.778 6.7142Z",
        )
    }
}

private val NodeSize = 24.dp
private val NodeBorder = 2.dp
private val NodeInset = 4.dp
private val GlyphSize = 16.dp
private val EmptyDot = 12.dp
private val LabelGap = 8.dp
private val LabelEnd = 16.dp
private val ConnectorMin = 32.dp
private val ConnectorGap = 4.dp
private val CompletedConnector = 3.dp
private val ActiveConnector = 1.dp
