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

public val Icons.Outlined.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp =
            materialIcon(name = "Outlined.ArrowUp") {
            addPath(
                pathData = PathParser().parsePathString("M3.98901 14.3625L10.5863 7.76526C11.3673 6.98421 12.6336 6.98421 13.4147 7.76526L20.012 14.3626L18.5978 15.7768L12.0005 9.17947L5.40323 15.7767L3.98901 14.3625Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
