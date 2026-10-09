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

public val Icons.Outlined.Battery80: ImageVector
    get() {
        if (_battery80 != null) {
            return _battery80!!
        }
        _battery80 =
            materialIcon(name = "Outlined.Battery80") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99902C9.94771 1.99902 9.5 2.44674 9.5 2.99902V3.49902H14.5V2.99902C14.5 2.44674 14.0523 1.99902 13.5 1.99902H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99902C6.89543 3.99902 6 4.89445 6 5.99902V19.999C6 21.1036 6.89543 21.999 8 21.999H16C17.1046 21.999 18 21.1036 18 19.999V5.99902C18 4.89445 17.1046 3.99902 16 3.99902H8ZM16 5.99902H8V8.79932L16 8.79932V5.99902Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _battery80!!
    }

private var _battery80: ImageVector? = null
