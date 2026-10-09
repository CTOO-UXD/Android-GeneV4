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

public val Icons.Outlined.SplitscreenTop: ImageVector
    get() {
        if (_splitscreenTop != null) {
            return _splitscreenTop!!
        }
        _splitscreenTop =
            materialIcon(name = "Outlined.SplitscreenTop") {
            addPath(
                pathData = PathParser().parsePathString("M5 3C3.89543 3 3 3.89543 3 5V9C3 10.1046 3.89543 11 5 11H19C20.1046 11 21 10.1046 21 9V5C21 3.89543 20.1046 3 19 3H5ZM19 13C20.1046 13 21 13.8954 21 15V19C21 20.1046 20.1046 21 19 21H5C3.89543 21 3 20.1046 3 19V15C3 13.8954 3.89543 13 5 13H19ZM19 15H5V19H19V15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _splitscreenTop!!
    }

private var _splitscreenTop: ImageVector? = null
