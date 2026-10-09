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

public val Icons.Filled.Ipad: ImageVector
    get() {
        if (_ipad != null) {
            return _ipad!!
        }
        _ipad =
            materialIcon(name = "Filled.Ipad") {
            addPath(
                pathData = PathParser().parsePathString("M8 1.99951C5.79086 1.99951 4 3.79037 4 5.99951V17.9995C4 20.2087 5.79086 21.9995 8 21.9995H16C18.2091 21.9995 20 20.2087 20 17.9995V5.99951C20 3.79037 18.2091 1.99951 16 1.99951H8ZM12 19.0151C12.8284 19.0151 13.5 18.3436 13.5 17.5151C13.5 16.6867 12.8284 16.0151 12 16.0151C11.1716 16.0151 10.5 16.6867 10.5 17.5151C10.5 18.3436 11.1716 19.0151 12 19.0151Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _ipad!!
    }

private var _ipad: ImageVector? = null
