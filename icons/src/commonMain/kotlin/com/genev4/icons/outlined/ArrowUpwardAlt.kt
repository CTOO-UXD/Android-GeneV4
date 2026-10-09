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

public val Icons.Outlined.ArrowUpwardAlt: ImageVector
    get() {
        if (_arrowUpwardAlt != null) {
            return _arrowUpwardAlt!!
        }
        _arrowUpwardAlt =
            materialIcon(name = "Outlined.ArrowUpwardAlt") {
            addPath(
                pathData = PathParser().parsePathString("M10.5866 6.4112L6.00098 10.9968L7.41519 12.411L11.0009 8.8253L11.0008 17.9982L13.0008 17.9982L13.0009 8.82551L16.5899 12.4145L18.0041 11.0003L13.415 6.4112C12.6339 5.63015 11.3676 5.63015 10.5866 6.4112Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowUpwardAlt!!
    }

private var _arrowUpwardAlt: ImageVector? = null
