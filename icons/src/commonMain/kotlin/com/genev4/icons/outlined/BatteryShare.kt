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

public val Icons.Outlined.BatteryShare: ImageVector
    get() {
        if (_batteryShare != null) {
            return _batteryShare!!
        }
        _batteryShare =
            materialIcon(name = "Outlined.BatteryShare") {
            addPath(
                pathData = PathParser().parsePathString("M9.5 3C9.5 2.44772 9.94772 2 10.5 2H13.5C14.0523 2 14.5 2.44772 14.5 3V3.5H9.5V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18 6C18 4.89543 17.1046 4 16 4H8C6.89543 4 6 4.89543 6 6V20C6 21.1046 6.89543 22 8 22H16C17.1046 22 18 21.1046 18 20V17.9995H16V20H8V6H16V7.99951H18V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.5936 10.4123L15.182 12.0006H11C9.89543 12.0006 9 12.896 9 14.0006V17.0001H11V14.0006H15.182L13.5883 15.5943L15.0025 17.0085L18.3033 13.7077C18.6938 13.3172 18.6938 12.684 18.3033 12.2935L15.0078 8.99805L13.5936 10.4123Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryShare!!
    }

private var _batteryShare: ImageVector? = null
