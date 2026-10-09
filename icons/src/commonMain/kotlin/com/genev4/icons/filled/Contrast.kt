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

public val Icons.Filled.Contrast: ImageVector
    get() {
        if (_contrast != null) {
            return _contrast!!
        }
        _contrast =
            materialIcon(name = "Filled.Contrast") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.99951C6.47715 1.99951 2 6.47666 2 11.9995C2 17.5224 6.47715 21.9995 12 21.9995C17.5229 21.9995 22 17.5224 22 11.9995C22 6.47666 17.5229 1.99951 12 1.99951ZM11 4.06141C7.05369 4.5535 4 7.91989 4 11.9995C4 16.0791 7.05369 19.4455 11 19.9376V4.06141Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _contrast!!
    }

private var _contrast: ImageVector? = null
