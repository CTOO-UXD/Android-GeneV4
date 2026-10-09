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

public val Icons.Filled.BatteryHoriz75: ImageVector
    get() {
        if (_batteryHoriz75 != null) {
            return _batteryHoriz75!!
        }
        _batteryHoriz75 =
            materialIcon(name = "Filled.BatteryHoriz75") {
            addPath(
                pathData = PathParser().parsePathString("M1.99902 13.4999C1.99902 14.0522 2.44674 14.4999 2.99902 14.4999H3.49902L3.49902 9.49994H2.99902C2.44674 9.49994 1.99902 9.94766 1.99902 10.4999L1.99902 13.4999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.99902 15.9999C3.99902 17.1045 4.89445 17.9999 5.99902 17.9999L19.999 17.9999C21.1036 17.9999 21.999 17.1045 21.999 15.9999V7.99994C21.999 6.89537 21.1036 5.99994 19.999 5.99994L5.99902 5.99994C4.89445 5.99994 3.99902 6.89537 3.99902 7.99994L3.99902 15.9999ZM5.99902 7.99994L5.99902 15.9999L9.49951 15.9999L9.49951 7.99994L5.99902 7.99994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz75!!
    }

private var _batteryHoriz75: ImageVector? = null
