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

public val Icons.Filled.BatteryCharging30: ImageVector
    get() {
        if (_batteryCharging30 != null) {
            return _batteryCharging30!!
        }
        _batteryCharging30 =
            materialIcon(name = "Filled.BatteryCharging30") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99902C9.94771 1.99902 9.5 2.44674 9.5 2.99902V3.49902H14.5V2.99902C14.5 2.44674 14.0523 1.99902 13.5 1.99902H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99902C6.89543 3.99902 6 4.89445 6 5.99902V19.999C6 21.1036 6.89543 21.999 8 21.999H12.5278C11.5777 20.9375 11 19.5357 11 17.999C11 17.2225 11.1475 16.4804 11.416 15.7993H8V5.99902H16V12.082C16.3252 12.0274 16.6593 11.999 17 11.999C17.3407 11.999 17.6748 12.0274 18 12.082V5.99902C18 4.89445 17.1046 3.99902 16 3.99902H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5 18.9995V21.9995L20 16.9995H17.5V13.9995L14 18.9995H16.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryCharging30!!
    }

private var _batteryCharging30: ImageVector? = null
