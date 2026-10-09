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

public val Icons.Outlined.Ipad: ImageVector
    get() {
        if (_ipad != null) {
            return _ipad!!
        }
        _ipad =
            materialIcon(name = "Outlined.Ipad") {
            addPath(
                pathData = PathParser().parsePathString("M12 19.0151C12.8284 19.0151 13.5 18.3436 13.5 17.5151C13.5 16.6867 12.8284 16.0151 12 16.0151C11.1716 16.0151 10.5 16.6867 10.5 17.5151C10.5 18.3436 11.1716 19.0151 12 19.0151Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 5.99951C4 3.79037 5.79086 1.99951 8 1.99951H16C18.2091 1.99951 20 3.79037 20 5.99951V17.9995C20 20.2087 18.2091 21.9995 16 21.9995H8C5.79086 21.9995 4 20.2087 4 17.9995V5.99951ZM8 3.99951H16C17.1046 3.99951 18 4.89494 18 5.99951V17.9995C18 19.1041 17.1046 19.9995 16 19.9995H8C6.89543 19.9995 6 19.1041 6 17.9995V5.99951C6 4.89494 6.89543 3.99951 8 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _ipad!!
    }

private var _ipad: ImageVector? = null
