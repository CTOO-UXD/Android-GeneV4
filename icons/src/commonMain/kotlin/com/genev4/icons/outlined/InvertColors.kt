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

public val Icons.Outlined.InvertColors: ImageVector
    get() {
        if (_invertColors != null) {
            return _invertColors!!
        }
        _invertColors =
            materialIcon(name = "Outlined.InvertColors") {
            addPath(
                pathData = PathParser().parsePathString("M21 18.9995C21 20.1041 20.1046 20.9995 19 20.9995L5 20.9995C3.89543 20.9995 3 20.1041 3 18.9995L3 4.99951C3 3.89494 3.89543 2.99951 5 2.99951L19 2.99951C20.1046 2.99951 21 3.89494 21 4.99951L21 18.9995ZM12 18.9995L5 18.9995L5 4.99951L12 4.99951L12 6.99951C9.23858 6.99951 7 9.23809 7 11.9995C7 14.7609 9.23858 16.9995 12 16.9995V18.9995ZM12 16.9995V6.99951C14.7614 6.99951 17 9.23809 17 11.9995C17 14.7609 14.7614 16.9995 12 16.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _invertColors!!
    }

private var _invertColors: ImageVector? = null
