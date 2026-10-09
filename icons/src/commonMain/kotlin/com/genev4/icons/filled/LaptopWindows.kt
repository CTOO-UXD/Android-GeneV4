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

public val Icons.Filled.LaptopWindows: ImageVector
    get() {
        if (_laptopWindows != null) {
            return _laptopWindows!!
        }
        _laptopWindows =
            materialIcon(name = "Filled.LaptopWindows") {
            addPath(
                pathData = PathParser().parsePathString("M19 5.99951H5V13.9995H19V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 4.99951C2 3.89494 2.89543 2.99951 4 2.99951H20C21.1046 2.99951 22 3.89494 22 4.99951V14.9995C22 16.1041 21.1046 16.9995 20 16.9995V17.9995H24V19.9995H0V17.9995H4L4 16.9995C2.89543 16.9995 2 16.1041 2 14.9995V4.99951ZM20 4.99951V14.9995H4V4.99951H20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptopWindows!!
    }

private var _laptopWindows: ImageVector? = null
