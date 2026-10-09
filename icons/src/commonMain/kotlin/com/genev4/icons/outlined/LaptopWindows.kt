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

public val Icons.Outlined.LaptopWindows: ImageVector
    get() {
        if (_laptopWindows != null) {
            return _laptopWindows!!
        }
        _laptopWindows =
            materialIcon(name = "Outlined.LaptopWindows") {
            addPath(
                pathData = PathParser().parsePathString("M4 2.99951C2.89543 2.99951 2 3.89494 2 4.99951V14.9995C2 16.1041 2.89543 16.9995 4 16.9995L4 17.9995H0V19.9995H24V17.9995H20V16.9995C21.1046 16.9995 22 16.1041 22 14.9995V4.99951C22 3.89494 21.1046 2.99951 20 2.99951H4ZM20 4.99951H4V14.9995H20V4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptopWindows!!
    }

private var _laptopWindows: ImageVector? = null
