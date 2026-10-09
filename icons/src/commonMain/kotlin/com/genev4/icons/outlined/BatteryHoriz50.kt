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

public val Icons.Outlined.BatteryHoriz50: ImageVector
    get() {
        if (_batteryHoriz50 != null) {
            return _batteryHoriz50!!
        }
        _batteryHoriz50 =
            materialIcon(name = "Outlined.BatteryHoriz50") {
            addPath(
                pathData = PathParser().parsePathString("M1.99902 13.5002C1.99902 14.0525 2.44674 14.5002 2.99902 14.5002H3.49902L3.49902 9.50024H2.99902C2.44674 9.50024 1.99902 9.94796 1.99902 10.5002L1.99902 13.5002Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.99902 16.0002C3.99902 17.1048 4.89445 18.0002 5.99902 18.0002L19.999 18.0002C21.1036 18.0002 21.999 17.1048 21.999 16.0002V8.00024C21.999 6.89568 21.1036 6.00024 19.999 6.00024L5.99902 6.00024C4.89445 6.00024 3.99902 6.89568 3.99902 8.00024L3.99902 16.0002ZM5.99902 8.00024L5.99902 16.0002L12.9995 16.0002L12.9995 8.00024L5.99902 8.00024Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz50!!
    }

private var _batteryHoriz50: ImageVector? = null
