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

public val Icons.Filled.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout =
            materialIcon(name = "Filled.Layout") {
            addPath(
                pathData = PathParser().parsePathString("M11 5C11 3.89543 10.1046 3 9 3H5C3.89543 3 3 3.89543 3 5V19C3 20.1046 3.89543 21 5 21H9C10.1046 21 11 20.1046 11 19V5ZM21 5C21 3.89543 20.1046 3 19 3H15C13.8954 3 13 3.89543 13 5V10C13 11.1046 13.8954 12 15 12H19C20.1046 12 21 11.1046 21 10V5ZM19 14C20.1046 14 21 14.8954 21 16V19C21 20.1046 20.1046 21 19 21H15C13.8954 21 13 20.1046 13 19V16C13 14.8954 13.8954 14 15 14H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _layout!!
    }

private var _layout: ImageVector? = null
