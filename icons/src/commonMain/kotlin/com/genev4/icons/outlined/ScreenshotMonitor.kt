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

public val Icons.Outlined.ScreenshotMonitor: ImageVector
    get() {
        if (_screenshotMonitor != null) {
            return _screenshotMonitor!!
        }
        _screenshotMonitor =
            materialIcon(name = "Outlined.ScreenshotMonitor") {
            addPath(
                pathData = PathParser().parsePathString("M6 6H9V7.5H6.5V10H5V7C5 6.44772 5.44772 6 6 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 12H17.5V14.5H15V16H18C18.5523 16 19 15.5523 19 15V12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 5C2 3.89543 2.89543 3 4 3H20C21.1046 3 22 3.89543 22 5V17C22 18.1046 21.1046 19 20 19H16V20C16 20.5523 15.5523 21 15 21H9C8.44772 21 8 20.5523 8 20V19H4C2.89543 19 2 18.1046 2 17V5ZM4 5H20V17H4V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _screenshotMonitor!!
    }

private var _screenshotMonitor: ImageVector? = null
