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

public val Icons.Filled.SplitscreenRight: ImageVector
    get() {
        if (_splitscreenRight != null) {
            return _splitscreenRight!!
        }
        _splitscreenRight =
            materialIcon(name = "Filled.SplitscreenRight") {
            addPath(
                pathData = PathParser().parsePathString("M11 19C11 20.1046 10.1046 21 9 21H5C3.89543 21 3 20.1046 3 19V5C3 3.89543 3.89543 3 5 3H9C10.1046 3 11 3.89543 11 5V19ZM9 19V5H5V19H9ZM21 5C21 3.89543 20.1046 3 19 3H15C13.8954 3 13 3.89543 13 5V19C13 20.1046 13.8954 21 15 21H19C20.1046 21 21 20.1046 21 19V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _splitscreenRight!!
    }

private var _splitscreenRight: ImageVector? = null
