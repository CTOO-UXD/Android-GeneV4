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

public val Icons.Filled.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer =
            materialIcon(name = "Filled.Computer") {
            addPath(
                pathData = PathParser().parsePathString("M5 4.99951C3.89543 4.99951 3 5.89494 3 6.99951V15.9995H21V6.99951C21 5.89494 20.1046 4.99951 19 4.99951H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M1 18.9995H23V16.9995H1V18.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _computer!!
    }

private var _computer: ImageVector? = null
