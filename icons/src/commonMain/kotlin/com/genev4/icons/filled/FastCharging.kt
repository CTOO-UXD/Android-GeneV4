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

public val Icons.Filled.FastCharging: ImageVector
    get() {
        if (_fastCharging != null) {
            return _fastCharging!!
        }
        _fastCharging =
            materialIcon(name = "Filled.FastCharging") {
            addPath(
                pathData = PathParser().parsePathString("M15.6667 9.99951L16.5 0.999512L9 13.9995H12.3333L11.5 22.9995L19 9.99951H15.6667Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 7.41618L9 1.99951L4 9.58285H6L5.5 14.9995L10 7.41618H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fastCharging!!
    }

private var _fastCharging: ImageVector? = null
