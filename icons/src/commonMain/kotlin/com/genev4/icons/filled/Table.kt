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

public val Icons.Filled.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table =
            materialIcon(name = "Filled.Table") {
            addPath(
                pathData = PathParser().parsePathString("M21 5C21 3.89543 20.1046 3 19 3H5C3.89543 3 3 3.89543 3 5V9H9H21V5ZM21 11H10V14H21V11ZM21 16H10V21H19C20.1046 21 21 20.1046 21 19V16ZM8 21V16H3V19C3 20.1046 3.89543 21 5 21H8ZM3 14H8V11H3V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _table!!
    }

private var _table: ImageVector? = null
