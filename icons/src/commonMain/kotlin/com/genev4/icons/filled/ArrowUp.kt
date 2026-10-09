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

public val Icons.Filled.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp =
            materialIcon(name = "Filled.ArrowUp") {
            addPath(
                pathData = PathParser().parsePathString("M3.98901 14.3624L10.5863 7.7652C11.3673 6.98415 12.6336 6.98415 13.4147 7.7652L20.012 14.3625L18.5978 15.7767L12.0005 9.17941L5.40323 15.7767L3.98901 14.3624Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
