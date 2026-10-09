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

public val Icons.Filled.MobileOff: ImageVector
    get() {
        if (_mobileOff != null) {
            return _mobileOff!!
        }
        _mobileOff =
            materialIcon(name = "Filled.MobileOff") {
            addPath(
                pathData = PathParser().parsePathString("M18.4973 21.3247L20.092 22.9194L21.5062 21.5052L1.70718 1.70618L0.292969 3.12039L5 7.82742V19.9988C5 21.1034 5.89543 21.9988 7 21.9988H17C17.5959 21.9988 18.1309 21.7382 18.4973 21.3247Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 3.99881V16.1706L5.50247 2.6731C5.86888 2.25951 6.404 1.99881 7 1.99881H17C18.1046 1.99881 19 2.89424 19 3.99881Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _mobileOff!!
    }

private var _mobileOff: ImageVector? = null
