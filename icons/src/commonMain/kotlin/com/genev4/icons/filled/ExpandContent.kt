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

public val Icons.Filled.ExpandContent: ImageVector
    get() {
        if (_expandContent != null) {
            return _expandContent!!
        }
        _expandContent =
            materialIcon(name = "Filled.ExpandContent") {
            addPath(
                pathData = PathParser().parsePathString("M13 6.99951H17V10.9995H19V6.99951C19 5.89494 18.1046 4.99951 17 4.99951H13V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 16.9995H7L7 12.9995H5V16.9995C5 18.1041 5.89543 18.9995 7 18.9995H11V16.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _expandContent!!
    }

private var _expandContent: ImageVector? = null
