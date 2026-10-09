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

public val Icons.Outlined.BatteryHoriz10: ImageVector
    get() {
        if (_batteryHoriz10 != null) {
            return _batteryHoriz10!!
        }
        _batteryHoriz10 =
            materialIcon(name = "Outlined.BatteryHoriz10") {
            addPath(
                pathData = PathParser().parsePathString("M1.99951 13.4995C1.99951 14.0518 2.44723 14.4995 2.99951 14.4995H3.49951L3.49951 9.49951H2.99951C2.44723 9.49951 1.99951 9.94723 1.99951 10.4995L1.99951 13.4995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.99951 15.9995C3.99951 17.1041 4.89494 17.9995 5.99951 17.9995L19.9995 17.9995C21.1041 17.9995 21.9995 17.1041 21.9995 15.9995V7.99951C21.9995 6.89494 21.1041 5.99951 19.9995 5.99951L5.99951 5.99951C4.89494 5.99951 3.99951 6.89494 3.99951 7.99951L3.99951 15.9995ZM5.99951 7.99951L5.99951 15.9995L18.6001 15.9995V7.99951L5.99951 7.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryHoriz10!!
    }

private var _batteryHoriz10: ImageVector? = null
