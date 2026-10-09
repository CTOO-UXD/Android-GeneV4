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

public val Icons.Outlined.BatteryHoriz0: ImageVector
    get() {
        if (_batteryHoriz0 != null) {
            return _batteryHoriz0!!
        }
        _batteryHoriz0 =
            materialIcon(name = "Outlined.BatteryHoriz0") {
            addPath(
                pathData = PathParser().parsePathString("M3 14.4999C2.44772 14.4999 2 14.0522 2 13.4999L2 10.4999C2 9.94766 2.44772 9.49994 3 9.49994H3.5L3.5 14.4999H3ZM6 5.99994C4.89543 5.99994 4 6.89537 4 7.99994L4 15.9999C4 17.1045 4.89543 17.9999 6 17.9999L20 17.9999C21.1046 17.9999 22 17.1045 22 15.9999V7.99994C22 6.89537 21.1046 5.99994 20 5.99994L6 5.99994ZM6 15.9999L6 7.99994L20 7.99994V15.9999L6 15.9999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz0!!
    }

private var _batteryHoriz0: ImageVector? = null
