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

public val Icons.Filled.CropStatusBar: ImageVector
    get() {
        if (_cropStatusBar != null) {
            return _cropStatusBar!!
        }
        _cropStatusBar =
            materialIcon(name = "Filled.CropStatusBar") {
            addPath(
                pathData = PathParser().parsePathString("M17 5H7V7H6H5H3V5H5V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V5H21V7H19H18H17V5ZM5 16V8H7V16H5ZM7 19V17H6H5H3V19H5V20C5 21.1046 5.89543 22 7 22H17C18.1046 22 19 21.1046 19 20V19H21V17H19H18H17V19H7ZM17 8V16H19V8H17ZM10 7H8V5H10V7ZM13 7H11V5H13V7ZM16 7H14V5H16V7ZM10 19H8V17H10V19ZM13 19H11V17H13V19ZM16 19H14V17H16V19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cropStatusBar!!
    }

private var _cropStatusBar: ImageVector? = null
