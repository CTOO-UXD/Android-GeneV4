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

public val Icons.Filled.BatteryAlert: ImageVector
    get() {
        if (_batteryAlert != null) {
            return _batteryAlert!!
        }
        _batteryAlert =
            materialIcon(name = "Filled.BatteryAlert") {
            addPath(
                pathData = PathParser().parsePathString("M9.5 2.99988C9.5 2.44759 9.94772 1.99988 10.5 1.99988H13.5C14.0523 1.99988 14.5 2.44759 14.5 2.99988V3.49988H9.5V2.99988Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 5.99988C6 4.89531 6.89543 3.99988 8 3.99988H16C17.1046 3.99988 18 4.89531 18 5.99988V19.9999C18 21.1044 17.1046 21.9999 16 21.9999H8C6.89543 21.9999 6 21.1044 6 19.9999V5.99988ZM13 14.4999V8.49988H11V14.4999H13ZM11 15.4999V17.4999H13V15.4999H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryAlert!!
    }

private var _batteryAlert: ImageVector? = null
