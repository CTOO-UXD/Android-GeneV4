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

public val Icons.Outlined.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop =
            materialIcon(name = "Outlined.Laptop") {
            addPath(
                pathData = PathParser().parsePathString("M2 4.99951C2 3.89494 2.89543 2.99951 4 2.99951H20C21.1046 2.99951 22 3.89494 22 4.99951V15.9995C22 17.1041 21.1046 17.9995 20 17.9995H24C24 19.1041 23.1046 19.9995 22 19.9995H2C0.89543 19.9995 0 19.1041 0 17.9995H4C2.89543 17.9995 2 17.1041 2 15.9995V4.99951ZM4 4.99951H20V15.9995L4 15.9995V4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptop!!
    }

private var _laptop: ImageVector? = null
