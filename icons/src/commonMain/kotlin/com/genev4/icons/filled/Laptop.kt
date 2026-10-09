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

public val Icons.Filled.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop =
            materialIcon(name = "Filled.Laptop") {
            addPath(
                pathData = PathParser().parsePathString("M5 5.99951H19V14.9995H5V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 2.99951C2.89543 2.99951 2 3.89494 2 4.99951V15.9995C2 17.1041 2.89543 17.9995 4 17.9995H0C0 19.1041 0.89543 19.9995 2 19.9995H22C23.1046 19.9995 24 19.1041 24 17.9995H20C21.1046 17.9995 22 17.1041 22 15.9995V4.99951C22 3.89494 21.1046 2.99951 20 2.99951H4ZM20 4.99951H4V15.9995L20 15.9995V4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptop!!
    }

private var _laptop: ImageVector? = null
