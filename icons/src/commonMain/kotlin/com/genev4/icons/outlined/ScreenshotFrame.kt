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

public val Icons.Outlined.ScreenshotFrame: ImageVector
    get() {
        if (_screenshotFrame != null) {
            return _screenshotFrame!!
        }
        _screenshotFrame =
            materialIcon(name = "Outlined.ScreenshotFrame") {
            addPath(
                pathData = PathParser().parsePathString("M10 2H8C6.34315 2 5 3.34315 5 5V7H7V5C7 4.44772 7.44771 4 8 4H10V2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 4V2H16C17.6569 2 19 3.34315 19 5V7H17V5C17 4.44772 16.5523 4 16 4H14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 20H16C16.5523 20 17 19.5523 17 19V17H19V19C19 20.6569 17.6569 22 16 22H14V20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M7 17V19C7 19.5523 7.44772 20 8 20H10V22H8C6.34315 22 5 20.6569 5 19V17H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _screenshotFrame!!
    }

private var _screenshotFrame: ImageVector? = null
