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

public val Icons.Outlined.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard =
            materialIcon(name = "Outlined.Dashboard") {
            addPath(
                pathData = PathParser().parsePathString("M9 21C10.1046 21 11 20.1046 11 19V16C11 14.8954 10.1046 14 9 14H5C3.89543 14 3 14.8954 3 16V19C3 20.1046 3.89543 21 5 21H9ZM9 19H5V16H9V19ZM19 21C20.1046 21 21 20.1046 21 19V13C21 11.8954 20.1046 11 19 11H15C13.8954 11 13 11.8954 13 13V19C13 20.1046 13.8954 21 15 21H19ZM19 19H15V13H19V19ZM21 8C21 9.10457 20.1046 10 19 10H15C13.8954 10 13 9.10457 13 8V5C13 3.89543 13.8954 3 15 3H19C20.1046 3 21 3.89543 21 5V8ZM15 8H19V5H15V8ZM9 13C10.1046 13 11 12.1046 11 11V5C11 3.89543 10.1046 3 9 3H5C3.89543 3 3 3.89543 3 5V11C3 12.1046 3.89543 13 5 13H9ZM9 11H5V5H9V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
