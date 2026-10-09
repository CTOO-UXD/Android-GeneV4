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

public val Icons.Outlined.BatteryCharging100: ImageVector
    get() {
        if (_batteryCharging100 != null) {
            return _batteryCharging100!!
        }
        _batteryCharging100 =
            materialIcon(name = "Outlined.BatteryCharging100") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.9989C9.94772 1.9989 9.5 2.44662 9.5 2.9989V3.4989H14.5V2.9989C14.5 2.44662 14.0523 1.9989 13.5 1.9989H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.9989C6.89543 3.9989 6 4.89433 6 5.9989V19.9989C6 21.1035 6.89543 21.9989 8 21.9989H12.5278C11.5777 20.9374 11 19.5356 11 17.9989C11 14.6852 13.6863 11.9989 17 11.9989C17.3407 11.9989 17.6748 12.0273 18 12.0819V5.9989C18 4.89433 17.1046 3.9989 16 3.9989H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5 18.9994V21.9994L20 16.9994H17.5V13.9994L14 18.9994H16.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryCharging100!!
    }

private var _batteryCharging100: ImageVector? = null
