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

public val Icons.Filled.BatteryHoriz90: ImageVector
    get() {
        if (_batteryHoriz90 != null) {
            return _batteryHoriz90!!
        }
        _batteryHoriz90 =
            materialIcon(name = "Filled.BatteryHoriz90") {
            addPath(
                pathData = PathParser().parsePathString("M1.99902 13.5001C1.99902 14.0524 2.44674 14.5001 2.99902 14.5001H3.49902L3.49902 9.50012H2.99902C2.44674 9.50012 1.99902 9.94784 1.99902 10.5001L1.99902 13.5001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.99902 16.0001C3.99902 17.1047 4.89445 18.0001 5.99902 18.0001L19.999 18.0001C21.1036 18.0001 21.999 17.1047 21.999 16.0001V8.00012C21.999 6.89555 21.1036 6.00012 19.999 6.00012L5.99902 6.00012C4.89445 6.00012 3.99902 6.89555 3.99902 8.00012L3.99902 16.0001ZM5.99902 8.00012L5.99902 16.0001H7.39941L7.39942 8.00012L5.99902 8.00012Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz90!!
    }

private var _batteryHoriz90: ImageVector? = null
