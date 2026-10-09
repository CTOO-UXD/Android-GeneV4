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

public val Icons.Outlined.BatteryAlert: ImageVector
    get() {
        if (_batteryAlert != null) {
            return _batteryAlert!!
        }
        _batteryAlert =
            materialIcon(name = "Outlined.BatteryAlert") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 2C9.94772 2 9.5 2.44772 9.5 3V3.5H14.5V3C14.5 2.44772 14.0523 2 13.5 2H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 14.5V8.5H11V14.5H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 15.5V17.5H13V15.5H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 4C17.1046 4 18 4.89543 18 6V20C18 21.1046 17.1046 22 16 22H8C6.89543 22 6 21.1046 6 20V6C6 4.89543 6.89543 4 8 4H16ZM16 6H8V20H16V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryAlert!!
    }

private var _batteryAlert: ImageVector? = null
