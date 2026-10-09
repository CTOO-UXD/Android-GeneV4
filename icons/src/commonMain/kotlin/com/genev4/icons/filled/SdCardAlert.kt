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

public val Icons.Filled.SdCardAlert: ImageVector
    get() {
        if (_sdCardAlert != null) {
            return _sdCardAlert!!
        }
        _sdCardAlert =
            materialIcon(name = "Filled.SdCardAlert") {
            addPath(
                pathData = PathParser().parsePathString("M18 2C19.1046 2 20 2.89543 20 4V20C20 21.1046 19.1046 22 18 22H6C4.89543 22 4 21.1046 4 20V12L6 10V4C6 2.89543 6.89543 2 8 2H18ZM12 8V14H14V8H12ZM12 15V17H14V15H12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _sdCardAlert!!
    }

private var _sdCardAlert: ImageVector? = null
