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

public val Icons.Outlined.SplitscreenLeft: ImageVector
    get() {
        if (_splitscreenLeft != null) {
            return _splitscreenLeft!!
        }
        _splitscreenLeft =
            materialIcon(name = "Outlined.SplitscreenLeft") {
            addPath(
                pathData = PathParser().parsePathString("M11 5C11 3.89543 10.1046 3 9 3H5C3.89543 3 3 3.89543 3 5V19C3 20.1046 3.89543 21 5 21H9C10.1046 21 11 20.1046 11 19V5ZM21 19C21 20.1046 20.1046 21 19 21H15C13.8954 21 13 20.1046 13 19V5C13 3.89543 13.8954 3 15 3H19C20.1046 3 21 3.89543 21 5V19ZM19 19V5H15V19H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _splitscreenLeft!!
    }

private var _splitscreenLeft: ImageVector? = null
