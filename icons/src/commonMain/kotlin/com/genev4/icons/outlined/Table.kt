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

public val Icons.Outlined.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table =
            materialIcon(name = "Outlined.Table") {
            addPath(
                pathData = PathParser().parsePathString("M19 3C20.1046 3 21 3.89543 21 5V19C21 20.1046 20.1046 21 19 21H5C3.89543 21 3 20.1046 3 19V5C3 3.89543 3.89543 3 5 3H19ZM8 16H5V19H8V16ZM19 16H10V19H19V16ZM5 11V14H8V11H5ZM19 5H5V9H19V5ZM10 14H19V11H10V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _table!!
    }

private var _table: ImageVector? = null
