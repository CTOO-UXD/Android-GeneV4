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

public val Icons.Filled.Splitscreen: ImageVector
    get() {
        if (_splitscreen != null) {
            return _splitscreen!!
        }
        _splitscreen =
            materialIcon(name = "Filled.Splitscreen") {
            addPath(
                pathData = PathParser().parsePathString("M19 3C20.1046 3 21 3.89543 21 5V9C21 10.1046 20.1046 11 19 11H5C3.89543 11 3 10.1046 3 9V5C3 3.89543 3.89543 3 5 3H19ZM19 13C20.1046 13 21 13.8954 21 15V19C21 20.1046 20.1046 21 19 21H5C3.89543 21 3 20.1046 3 19V15C3 13.8954 3.89543 13 5 13H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _splitscreen!!
    }

private var _splitscreen: ImageVector? = null
