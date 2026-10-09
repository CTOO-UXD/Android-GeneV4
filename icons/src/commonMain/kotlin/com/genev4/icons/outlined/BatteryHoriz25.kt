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

public val Icons.Outlined.BatteryHoriz25: ImageVector
    get() {
        if (_batteryHoriz25 != null) {
            return _batteryHoriz25!!
        }
        _batteryHoriz25 =
            materialIcon(name = "Outlined.BatteryHoriz25") {
            addPath(
                pathData = PathParser().parsePathString("M2 13.499C2 14.0513 2.44772 14.499 3 14.499H3.5V9.49902H3C2.44772 9.49902 2 9.94674 2 10.499V13.499Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 15.999C4 17.1036 4.89543 17.999 6 17.999H20C21.1046 17.999 22 17.1036 22 15.999V7.99902C22 6.89445 21.1046 5.99902 20 5.99902H6C4.89543 5.99902 4 6.89445 4 7.99902V15.999ZM6 7.99902V15.999H17.0005V7.99902H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz25!!
    }

private var _batteryHoriz25: ImageVector? = null
