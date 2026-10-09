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

public val Icons.Filled.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft =
            materialIcon(name = "Filled.ChevronLeft") {
            addPath(
                pathData = PathParser().parsePathString("M14.002 18.0184L9.39877 13.4152C8.61773 12.6342 8.61773 11.3678 9.39877 10.5868L14.002 5.98352L15.4163 7.39773L10.813 12.001L15.4162 16.6042L14.002 18.0184Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
