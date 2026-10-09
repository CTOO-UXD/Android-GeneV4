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

public val Icons.Outlined.ArrowDropUp: ImageVector
    get() {
        if (_arrowDropUp != null) {
            return _arrowDropUp!!
        }
        _arrowDropUp =
            materialIcon(name = "Outlined.ArrowDropUp") {
            addPath(
                pathData = PathParser().parsePathString("M10.5851 9.39823C11.3662 8.61718 12.6325 8.61718 13.4136 9.39823L18.0168 14.0015L16.6026 15.4157L11.9993 10.8124L12.7065 10.1053L7.39615 15.4156L5.98193 14.0014L10.5851 9.39823Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDropUp!!
    }

private var _arrowDropUp: ImageVector? = null
