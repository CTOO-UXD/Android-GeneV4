/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.Icon1x: ImageVector
    get() {
        if (_icon1x != null) {
            return _icon1x!!
        }
        _icon1x =
            materialIcon(name = "Outlined.Icon1x") {
            addPath(
                pathData = PathParser().parsePathString("M2 14V6H0V4H4V14H2ZM6.35 14L9.5 8.7L6.65 4H9L10.65 6.75L12.35 4H14.65L11.85 8.7L15 14H12.65L10.65 10.65L8.65 14H6.35Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _icon1x!!
    }

private var _icon1x: ImageVector? = null
