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

public val Icons.Filled.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout =
            materialIcon(name = "Filled.Logout") {
            addPath(
                pathData = PathParser().parsePathString("M7 2.99951H12V4.99951H7C5.89543 4.99951 5 5.89494 5 6.99951V16.9995C5 18.1041 5.89543 18.9995 7 18.9995H12V20.9995H7C4.79086 20.9995 3 19.2087 3 16.9995V6.99951C3 4.79037 4.79086 2.99951 7 2.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.5928 8.41686L17.1741 10.9992H9V12.9992H17.1746L14.5926 15.5831L16.0074 16.9968L20.295 12.7061C20.6852 12.3156 20.6852 11.6827 20.2949 11.2923L16.0072 7.00293L14.5928 8.41686Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _logout!!
    }

private var _logout: ImageVector? = null
