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

public val Icons.Outlined.BatteryHoriz20: ImageVector
    get() {
        if (_batteryHoriz20 != null) {
            return _batteryHoriz20!!
        }
        _batteryHoriz20 =
            materialIcon(name = "Outlined.BatteryHoriz20") {
            addPath(
                pathData = PathParser().parsePathString("M1.99902 13.5C1.99902 14.0523 2.44674 14.5 2.99902 14.5H3.49902L3.49902 9.5H2.99902C2.44674 9.5 1.99902 9.94772 1.99902 10.5L1.99902 13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.99902 16C3.99902 17.1046 4.89445 18 5.99902 18L19.999 18C21.1036 18 21.999 17.1046 21.999 16V8C21.999 6.89543 21.1036 6 19.999 6L5.99902 6C4.89445 6 3.99902 6.89543 3.99902 8L3.99902 16ZM5.99902 8L5.99902 16L17.1997 16V8L5.99902 8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz20!!
    }

private var _batteryHoriz20: ImageVector? = null
