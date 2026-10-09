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

public val Icons.Filled.ArrowDropUp: ImageVector
    get() {
        if (_arrowDropUp != null) {
            return _arrowDropUp!!
        }
        _arrowDropUp =
            materialIcon(name = "Filled.ArrowDropUp") {
            addPath(
                pathData = PathParser().parsePathString("M10.5851 9.39826C11.3662 8.61721 12.6325 8.61721 13.4136 9.39826L18.0168 14.0015L16.6026 15.4157L11.9993 10.8125L12.7065 10.1054L7.39615 15.4157L5.98193 14.0015L10.5851 9.39826Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDropUp!!
    }

private var _arrowDropUp: ImageVector? = null
