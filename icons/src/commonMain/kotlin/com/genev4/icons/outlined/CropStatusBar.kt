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

public val Icons.Outlined.CropStatusBar: ImageVector
    get() {
        if (_cropStatusBar != null) {
            return _cropStatusBar!!
        }
        _cropStatusBar =
            materialIcon(name = "Outlined.CropStatusBar") {
            addPath(
                pathData = PathParser().parsePathString("M7 20H17V17H21V19H19V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V19H3V17H7V20ZM9.90909 17V19H7.90909V17H9.90909ZM16.0909 17V19H14.0909V17H16.0909ZM13.0909 17V19H11.0909V17H13.0909ZM7 8V16H5V8H7ZM19 8V16H17V8H19ZM3 7V5H5V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V5H21V7H17V4H7V7H3ZM9.90909 5V7H7.90909V5H9.90909ZM16.0909 5V7H14.0909V5H16.0909ZM13.0909 5V7H11.0909V5H13.0909Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cropStatusBar!!
    }

private var _cropStatusBar: ImageVector? = null
