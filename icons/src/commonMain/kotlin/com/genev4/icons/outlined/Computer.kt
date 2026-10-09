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

public val Icons.Outlined.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer =
            materialIcon(name = "Outlined.Computer") {
            addPath(
                pathData = PathParser().parsePathString("M3 6.99951C3 5.89494 3.89543 4.99951 5 4.99951H19C20.1046 4.99951 21 5.89494 21 6.99951V16.9995H23V18.9995H1V16.9995H3V6.99951ZM5 6.99951H19V15.9995H5V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _computer!!
    }

private var _computer: ImageVector? = null
