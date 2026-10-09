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

public val Icons.Filled.BatteryHoriz100: ImageVector
    get() {
        if (_batteryHoriz100 != null) {
            return _batteryHoriz100!!
        }
        _batteryHoriz100 =
            materialIcon(name = "Filled.BatteryHoriz100") {
            addPath(
                pathData = PathParser().parsePathString("M3 14.5C2.44772 14.5 2 14.0523 2 13.5L2 10.5C2 9.94772 2.44772 9.5 3 9.5H3.5L3.5 14.5H3ZM6 6C4.89543 6 4 6.89543 4 8L4 16C4 17.1046 4.89543 18 6 18L20 18C21.1046 18 22 17.1046 22 16V8C22 6.89543 21.1046 6 20 6L6 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz100!!
    }

private var _batteryHoriz100: ImageVector? = null
