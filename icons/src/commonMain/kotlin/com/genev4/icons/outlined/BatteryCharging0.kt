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

public val Icons.Outlined.BatteryCharging0: ImageVector
    get() {
        if (_batteryCharging0 != null) {
            return _batteryCharging0!!
        }
        _batteryCharging0 =
            materialIcon(name = "Outlined.BatteryCharging0") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99902C9.94772 1.99902 9.5 2.44674 9.5 2.99902V3.49902H14.5V2.99902C14.5 2.44674 14.0523 1.99902 13.5 1.99902H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 5.99902C6 4.89445 6.89543 3.99902 8 3.99902H16C17.1046 3.99902 18 4.89445 18 5.99902V12.082C17.6748 12.0274 17.3407 11.999 17 11.999C16.6593 11.999 16.3252 12.0274 16 12.082V5.99902H8V19.999H11.3414C11.6048 20.7443 12.0113 21.4219 12.5278 21.999H8C6.89543 21.999 6 21.1036 6 19.999V5.99902Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5 18.9995V21.9995L20 16.9995H17.5V13.9995L14 18.9995H16.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryCharging0!!
    }

private var _batteryCharging0: ImageVector? = null
