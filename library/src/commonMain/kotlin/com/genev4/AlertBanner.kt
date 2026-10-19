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
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.genev4.internal.Icons
import com.genev4.internal.ProvideContentColorTextStyle
import com.genev4.internal.Strings
import com.genev4.internal.getString
import com.genev4.tokens.ElevationTokens

/** Container color and leading icon of an [AlertBanner]. */
enum class AlertBannerScheme {
    Default,
    Informational,
    Success,
    Warning,
    Error,
}

/**
 * Persistent page banner. It stays until [onClose]. A temporary bottom message is [Snackbar].
 *
 * [AlertBannerScheme.Default] uses [ColorScheme.primary] for the main button. The other schemes use
 * a near-black fill. Success and Warning containers are not on [ColorScheme]; Informational uses
 * [ColorScheme.secondaryContainer] and Error uses [ColorScheme.errorContainer].
 *
 * Width follows the parent. The sample width is 740dp. When the text column cannot keep 268dp, the
 * checkbox and buttons move to the next line.
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AlertBanner(
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
    scheme: AlertBannerScheme = AlertBannerScheme.Default,
    elevated: Boolean = false,
    icon: @Composable (() -> Unit)? = null,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    checkbox: @Composable (() -> Unit)? = null,
    primaryButton: @Composable (() -> Unit)? = null,
    secondaryButton: @Composable (() -> Unit)? = null,
) {
    val colors = MaterialTheme.colorScheme
    val container =
        when (scheme) {
            AlertBannerScheme.Default -> colors.surface
            AlertBannerScheme.Informational -> colors.secondaryContainer
            AlertBannerScheme.Success -> AlertBannerExtraColors.SuccessContainer
            AlertBannerScheme.Warning -> AlertBannerExtraColors.WarningContainer
            AlertBannerScheme.Error -> colors.errorContainer
        }
    val iconWell =
        if (scheme == AlertBannerScheme.Default) colors.surfaceContainer else colors.surface
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = AlertBannerDefaults.shape,
        color = container,
        shadowElevation = if (elevated) ElevationTokens.Level3 else 0.dp,
    ) {
        Row(
            Modifier.fillMaxWidth().padding(AlertBannerDefaults.Padding),
            horizontalArrangement = Arrangement.spacedBy(AlertBannerDefaults.Gap),
            verticalAlignment = Alignment.Top,
        ) {
            Box(Modifier.padding(top = AlertBannerDefaults.AccessoryTop)) {
                Box(
                    Modifier
                        .size(AlertBannerDefaults.IconWell)
                        .clip(CircleShape)
                        .background(iconWell),
                    contentAlignment = Alignment.Center,
                ) {
                    if (icon != null) {
                        icon()
                    } else {
                        Icon(
                            AlertBannerIcons.forScheme(scheme),
                            contentDescription = null,
                            modifier = Modifier.size(AlertBannerDefaults.IconSize),
                            tint =
                                if (scheme == AlertBannerScheme.Default) {
                                    colors.onSurface
                                } else {
                                    Color.Unspecified
                                },
                        )
                    }
                }
            }
            FlowRow(
                Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(AlertBannerDefaults.ContentGap),
                verticalArrangement = Arrangement.spacedBy(0.dp),
            ) {
                if (title != null || text != null) {
                    Column(
                        Modifier
                            .weight(1f)
                            .widthIn(min = AlertBannerDefaults.TextMinWidth)
                            .align(Alignment.CenterVertically),
                    ) {
                        if (title != null) {
                            ProvideContentColorTextStyle(
                                contentColor = colors.onSurface,
                                textStyle =
                                    MaterialTheme.typography.bodyMedium.copy(
                                        fontWeight = FontWeight.SemiBold,
                                        letterSpacing = 0.25.sp,
                                    ),
                            ) {
                                title()
                            }
                        }
                        if (text != null) {
                            ProvideContentColorTextStyle(
                                contentColor = colors.onSurface,
                                textStyle =
                                    MaterialTheme.typography.bodyMedium.copy(
                                        letterSpacing = 0.25.sp,
                                    ),
                            ) {
                                text()
                            }
                        }
                    }
                }
                if (checkbox != null) {
                    Box(Modifier.align(Alignment.CenterVertically)) { checkbox() }
                }
                if (primaryButton != null || secondaryButton != null) {
                    Row(
                        Modifier
                            .padding(vertical = AlertBannerDefaults.ButtonInset)
                            .align(Alignment.CenterVertically),
                        horizontalArrangement = Arrangement.spacedBy(AlertBannerDefaults.ButtonGap),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        if (primaryButton != null) primaryButton()
                        if (secondaryButton != null) secondaryButton()
                    }
                }
            }
            Box(
                Modifier
                    .padding(top = AlertBannerDefaults.AccessoryTop)
                    .size(AlertBannerDefaults.CloseSize)
                    .clip(CircleShape)
                    .clickable(onClick = onClose, role = Role.Button),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    Icons.Filled.Close,
                    contentDescription = getString(Strings.SnackbarDismiss),
                    modifier = Modifier.size(AlertBannerDefaults.IconSize),
                    tint = colors.onSurface,
                )
            }
        }
    }
}

/** Buttons and the compact checkbox used inside [AlertBanner]. */
object AlertBannerDefaults {
    val shape = RoundedCornerShape(16.dp)
    val Padding = 12.dp
    val Gap = 12.dp
    val ContentGap = 16.dp
    val AccessoryTop = 8.dp
    val IconWell = 32.dp
    val IconSize = 16.dp
    val CloseSize = 32.dp
    val TextMinWidth = 268.dp
    val ButtonHeight = 32.dp
    val ButtonInset = 8.dp
    val ButtonGap = 6.dp

    private val buttonLabel: TextStyle
        @Composable get() =
            MaterialTheme.typography.labelSmall.copy(
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 0.25.sp,
            )

    /** 32dp filled button. [scheme] picks purple or near-black. */
    @Composable
    fun PrimaryButton(
        onClick: () -> Unit,
        scheme: AlertBannerScheme,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable RowScope.() -> Unit,
    ) {
        val colors = MaterialTheme.colorScheme
        val container =
            if (scheme == AlertBannerScheme.Default) {
                colors.primary
            } else {
                AlertBannerExtraColors.Focus
            }
        val contentColor =
            if (scheme == AlertBannerScheme.Default) {
                colors.onPrimary
            } else {
                AlertBannerExtraColors.OnFocus
            }
        Button(
            onClick = onClick,
            modifier = modifier.height(ButtonHeight),
            enabled = enabled,
            elevation = null,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            colors =
                ButtonDefaults.buttonColors(
                    containerColor = container,
                    contentColor = contentColor,
                ),
        ) {
            val scope = this
            ProvideTextStyle(buttonLabel) { scope.content() }
        }
    }

    /** 32dp outlined button. The stroke is the same near-black on every scheme. */
    @Composable
    fun SecondaryButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        content: @Composable RowScope.() -> Unit,
    ) {
        OutlinedButton(
            onClick = onClick,
            modifier = modifier.height(ButtonHeight),
            enabled = enabled,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            border = BorderStroke(1.dp, AlertBannerExtraColors.Focus),
            colors =
                ButtonDefaults.outlinedButtonColors(
                    contentColor = AlertBannerExtraColors.Focus,
                ),
        ) {
            val scope = this
            ProvideTextStyle(buttonLabel) { scope.content() }
        }
    }

    /**
     * Checkbox and label on one line, 24dp tall. The box is 18dp with a 2dp stroke.
     * Pass this to [AlertBanner]'s `checkbox` slot.
     */
    @Composable
    fun Checkbox(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
    ) {
        val labelColor =
            MaterialTheme.colorScheme.onSurface.copy(alpha = if (enabled) 1f else 0.38f)
        Row(
            modifier
                .semantics { role = Role.Checkbox }
                .clickable(enabled = enabled, role = Role.Checkbox) { onCheckedChange(!checked) },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
                Box(
                    Modifier
                        .size(18.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(
                            if (checked) AlertBannerExtraColors.Focus else Color.Transparent,
                        )
                        .border(2.dp, AlertBannerExtraColors.Focus, RoundedCornerShape(4.dp)),
                )
                if (checked) {
                    Canvas(Modifier.size(12.dp)) {
                        val stroke =
                            Stroke(
                                width = 1.6.dp.toPx(),
                                cap = StrokeCap.Round,
                                join = StrokeJoin.Round,
                            )
                        drawPath(
                            Path().apply {
                                moveTo(size.width * 0.15f, size.height * 0.52f)
                                lineTo(size.width * 0.40f, size.height * 0.76f)
                                lineTo(size.width * 0.86f, size.height * 0.26f)
                            },
                            color = AlertBannerExtraColors.OnFocus,
                            style = stroke,
                        )
                    }
                }
            }
            Text(
                label,
                color = labelColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style =
                    MaterialTheme.typography.bodySmall.copy(
                        letterSpacing = 0.1.sp,
                    ),
            )
        }
    }
}

private object AlertBannerExtraColors {
    val SuccessContainer = Color(0xFFA8F5A6)
    val WarningContainer = Color(0xFFFFDEAA)
    val Focus = Color(0xFF0E131E)
    val OnFocus = Color.White
    val Info = Color(0xFF0156CF)
    val Success = Color(0xFF3E8643)
    val Warning = Color(0xFF9C6E03)
    val Error = Color(0xFFBA1A1A)
}

private object AlertBannerIcons {
    fun forScheme(scheme: AlertBannerScheme): ImageVector =
        when (scheme) {
            AlertBannerScheme.Default -> Default
            AlertBannerScheme.Informational -> Info
            AlertBannerScheme.Success -> Success
            AlertBannerScheme.Warning -> Warning
            AlertBannerScheme.Error -> Error
        }

    private val Default: ImageVector by lazy {
        alertIcon(
            name = "AlertBanner.Default",
            translationX = 0.5344f,
            translationY = 1.3424f,
            path =
                "M12.9961 0.94293L12.0533 0.000121117L10.1677 1.88574L11.1105 2.82855L12.9961 " +
                    "0.94293ZM8.78268 1.60307C8.8766 1.7338 8.94608 1.88046 8.98774 2.03595L10.7499 " +
                    "8.6126C10.9405 9.32388 10.5184 10.055 9.80714 10.2456C9.65165 10.2873 9.48991 " +
                    "10.3004 9.32973 10.2844L6.10203 9.96218L6.40724 11.3981C6.59862 12.2985 6.02388 " +
                    "13.1835 5.12352 13.3749C4.22316 13.5663 3.33813 12.9915 3.14675 12.0912L2.62038 " +
                    "9.61478L1.52925 9.50647C0.977379 9.45143 0.517209 9.06052 0.373667 8.52481L0.0455078 " +
                    "7.30011C-0.0980347 6.7644 0.105028 6.19578 0.55544 5.87218L6.92187 1.2982C7.51991 " +
                    "0.868539 8.35302 1.00503 8.78268 1.60307ZM4.01301 9.75361L4.70935 9.82314L5.10305 " +
                    "11.6753C5.14132 11.8554 5.02637 12.0324 4.8463 12.0707C4.66623 12.109 4.48922 " +
                    "11.994 4.45095 11.814L4.01301 9.75361ZM5.4445 4.00139L1.33341 6.95502L1.66157 " +
                    "8.17972L6.78926 8.69112L5.4445 4.00139ZM6.59462 3.17508L8.21716 8.83353L9.46205 " +
                    "8.95769L7.69984 2.38104L6.59462 3.17508ZM14.204 3.4725L11.6282 4.16268L11.9732 " +
                    "5.45058L14.549 4.7604L14.204 3.4725ZM12.192 6.8648L14.7678 7.55498L14.4227 " +
                    "8.84288L11.8469 8.1527L12.192 6.8648Z",
            fill = Color.Black,
        )
    }

    private val Info: ImageVector by lazy {
        alertIcon(
            name = "AlertBanner.Info",
            translationX = 1.3328f,
            translationY = 1.3328f,
            path =
                "M13.3333 6.66667C13.3333 2.98477 10.3486 0 6.66667 0C2.98477 0 0 2.98477 0 " +
                    "6.66667C0 10.3486 2.98477 13.3333 6.66667 13.3333C10.3486 13.3333 13.3333 " +
                    "10.3486 13.3333 6.66667ZM1.33333 6.66667C1.33333 3.72115 3.72115 1.33333 " +
                    "6.66667 1.33333C9.61218 1.33333 12 3.72115 12 6.66667C12 9.61218 9.61218 12 " +
                    "6.66667 12C3.72115 12 1.33333 9.61218 1.33333 6.66667ZM7.33333 3.33333V4.66667H6V3.33333H7.33333ZM7.33333 " +
                    "10V5.33333H6V10H7.33333Z",
            fill = AlertBannerExtraColors.Info,
        )
    }

    private val Success: ImageVector by lazy {
        alertIcon(
            name = "AlertBanner.Success",
            translationX = 1.3328f,
            translationY = 1.3328f,
            path =
                "M12 6.66667C12 9.61218 9.61218 12 6.66667 12C3.72115 12 1.33333 9.61218 1.33333 " +
                    "6.66667C1.33333 3.72115 3.72115 1.33333 6.66667 1.33333C9.61218 1.33333 12 " +
                    "3.72115 12 6.66667ZM13.3333 6.66667C13.3333 10.3486 10.3486 13.3333 6.66667 " +
                    "13.3333C2.98477 13.3333 0 10.3486 0 6.66667C0 2.98477 2.98477 0 6.66667 " +
                    "0C10.3486 0 13.3333 2.98477 13.3333 6.66667ZM9.49744 3.94324L5.89515 " +
                    "7.54552L4.01441 5.66479L3.0716 6.60759L5.42375 8.95974C5.6841 9.22009 " +
                    "6.10621 9.22009 6.36656 8.95974L10.4402 4.88605L9.49744 3.94324Z",
            fill = AlertBannerExtraColors.Success,
        )
    }

    private val Warning: ImageVector by lazy {
        alertIcon(
            name = "AlertBanner.Warning",
            translationX = 0.912f,
            translationY = 0.784f,
            path =
                "M7.72575 0.163066C7.9505 0.28566 8.13521 0.470369 8.2578 0.695124L14.0117 " +
                    "11.244C14.3644 11.8905 14.1262 12.7004 13.4797 13.053C13.2838 13.1598 13.0643 " +
                    "13.2158 12.8412 13.2158H1.33333C0.596954 13.2158 0 12.6189 0 11.8825C0 " +
                    "11.6594 0.0559778 11.4399 0.162806 11.244L5.91675 0.695124C6.26937 0.0486596 " +
                    "7.07928 -0.189551 7.72575 0.163066ZM7.08728 1.33359L1.33333 11.8825H12.8412L7.08728 " +
                    "1.33359ZM6.42061 8.54916V4.54916H7.75394V8.54916H6.42061ZM6.42061 10.5492V9.21582H7.75394V10.5492H6.42061Z",
            fill = AlertBannerExtraColors.Warning,
        )
    }

    private val Error: ImageVector by lazy {
        alertIcon(
            name = "AlertBanner.Error",
            translationX = 1.3328f,
            translationY = 1.3328f,
            path =
                "M13.3333 6.66667C13.3333 2.98477 10.3486 0 6.66667 0C2.98477 0 0 2.98477 0 " +
                    "6.66667C0 10.3486 2.98477 13.3333 6.66667 13.3333C10.3486 13.3333 13.3333 " +
                    "10.3486 13.3333 6.66667ZM1.33333 6.66667C1.33333 3.72115 3.72115 1.33333 " +
                    "6.66667 1.33333C9.61218 1.33333 12 3.72115 12 6.66667C12 9.61218 9.61218 12 " +
                    "6.66667 12C3.72115 12 1.33333 9.61218 1.33333 6.66667ZM6 10V8.66667H7.33333V10H6ZM6 " +
                    "3.33333L6 8H7.33333L7.33333 3.33333H6Z",
            fill = AlertBannerExtraColors.Error,
        )
    }
}

private fun alertIcon(
    name: String,
    translationX: Float,
    translationY: Float,
    path: String,
    fill: Color,
): ImageVector =
    ImageVector.Builder(
        name = name,
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f,
    ).apply {
        addPath(
            pathData = translatePath(path, translationX, translationY),
            fill = SolidColor(fill),
            pathFillType = PathFillType.EvenOdd,
        )
    }.build()

private fun translatePath(path: String, dx: Float, dy: Float): List<PathNode> =
    PathParser().parsePathString(path).toNodes().map { node ->
        when (node) {
            is PathNode.MoveTo -> PathNode.MoveTo(node.x + dx, node.y + dy)
            is PathNode.LineTo -> PathNode.LineTo(node.x + dx, node.y + dy)
            is PathNode.CurveTo ->
                PathNode.CurveTo(
                    node.x1 + dx,
                    node.y1 + dy,
                    node.x2 + dx,
                    node.y2 + dy,
                    node.x3 + dx,
                    node.y3 + dy,
                )
            is PathNode.HorizontalTo -> PathNode.HorizontalTo(node.x + dx)
            is PathNode.VerticalTo -> PathNode.VerticalTo(node.y + dy)
            else -> node
        }
    }
