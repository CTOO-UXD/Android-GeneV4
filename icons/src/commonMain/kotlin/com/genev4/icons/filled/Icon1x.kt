/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Filled.Icon1x: ImageVector
    get() {
        if (_icon1x != null) {
            return _icon1x!!
        }
        _icon1x =
            materialIcon(name = "Filled.Icon1x") {
            addPath(
                pathData = PathParser().parsePathString("M6 17V9H4V7H8V17H6ZM10.35 17L13.5 11.7L10.65 7H13L14.65 9.75L16.35 7H18.65L15.85 11.7L19 17H16.65L14.65 13.65L12.65 17H10.35Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _icon1x!!
    }

private var _icon1x: ImageVector? = null
