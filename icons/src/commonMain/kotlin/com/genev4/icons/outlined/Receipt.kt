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

public val Icons.Outlined.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt =
            materialIcon(name = "Outlined.Receipt") {
            addPath(
                pathData = PathParser().parsePathString("M19 3C20.1046 3 21 3.89543 21 5V21L16 19L12 21L8 19L3 21V5C3 3.89543 3.89543 3 5 3H19ZM19 5H5V18.046L8.09111 16.8095L12 18.764L15.9089 16.8095L19 18.046V5ZM7 8H17V10H7V8ZM7 12H15V14H7V12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _receipt!!
    }

private var _receipt: ImageVector? = null
