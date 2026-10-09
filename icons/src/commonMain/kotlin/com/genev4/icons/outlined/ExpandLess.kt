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

public val Icons.Outlined.ExpandLess: ImageVector
    get() {
        if (_expandLess != null) {
            return _expandLess!!
        }
        _expandLess =
            materialIcon(name = "Outlined.ExpandLess") {
            addPath(
                pathData = PathParser().parsePathString("M5.98193 14.001L10.5851 9.3978C11.3662 8.61675 12.6325 8.61675 13.4136 9.3978L18.0168 14.0011L16.6026 15.4153L11.9993 10.812L7.39615 15.4152L5.98193 14.001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _expandLess!!
    }

private var _expandLess: ImageVector? = null
