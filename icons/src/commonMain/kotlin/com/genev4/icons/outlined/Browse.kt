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

public val Icons.Outlined.Browse: ImageVector
    get() {
        if (_browse != null) {
            return _browse!!
        }
        _browse =
            materialIcon(name = "Outlined.Browse") {
            addPath(
                pathData = PathParser().parsePathString("M9 3C10.1046 3 11 3.89543 11 5V8C11 9.10457 10.1046 10 9 10H5C3.89543 10 3 9.10457 3 8V5C3 3.89543 3.89543 3 5 3H9ZM9 5H5V8H9V5ZM19 3C20.1046 3 21 3.89543 21 5V11C21 12.1046 20.1046 13 19 13H15C13.8954 13 13 12.1046 13 11V5C13 3.89543 13.8954 3 15 3H19ZM19 5H15V11H19V5ZM21 16C21 14.8954 20.1046 14 19 14H15C13.8954 14 13 14.8954 13 16V19C13 20.1046 13.8954 21 15 21H19C20.1046 21 21 20.1046 21 19V16ZM15 16H19V19H15V16ZM9 11C10.1046 11 11 11.8954 11 13V19C11 20.1046 10.1046 21 9 21H5C3.89543 21 3 20.1046 3 19V13C3 11.8954 3.89543 11 5 11H9ZM9 13H5V19H9V13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _browse!!
    }

private var _browse: ImageVector? = null
