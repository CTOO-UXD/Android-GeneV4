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

public val Icons.Outlined.ViewDay: ImageVector
    get() {
        if (_viewDay != null) {
            return _viewDay!!
        }
        _viewDay =
            materialIcon(name = "Outlined.ViewDay") {
            addPath(
                pathData = PathParser().parsePathString("M20 4C20 2.89543 19.1046 2 18 2H6C4.89543 2 4 2.89543 4 4V5C4 6.10457 4.89543 7 6 7H18C19.1046 7 20 6.10457 20 5V4ZM6 4H18V5H6V4ZM20 10C20 8.89543 19.1046 8 18 8H6C4.89543 8 4 8.89543 4 10V14C4 15.1046 4.89543 16 6 16H18C19.1046 16 20 15.1046 20 14V10ZM6 10H18V14H6V10ZM18 17C19.1046 17 20 17.8954 20 19V20C20 21.1046 19.1046 22 18 22H6C4.89543 22 4 21.1046 4 20V19C4 17.8954 4.89543 17 6 17H18ZM18 19H6V20H18V19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _viewDay!!
    }

private var _viewDay: ImageVector? = null
