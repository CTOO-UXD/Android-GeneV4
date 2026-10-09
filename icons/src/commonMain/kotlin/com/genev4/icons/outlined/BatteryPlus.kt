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

public val Icons.Outlined.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) {
            return _batteryPlus!!
        }
        _batteryPlus =
            materialIcon(name = "Outlined.BatteryPlus") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99951C9.94771 1.99951 9.5 2.44723 9.5 2.99951V3.49951H14.5V2.99951C14.5 2.44723 14.0523 1.99951 13.5 1.99951H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 5.99951C6 4.89494 6.89543 3.99951 8 3.99951H16C17.1046 3.99951 18 4.89494 18 5.99951V12.0825C17.6748 12.0279 17.3407 11.9995 17 11.9995C16.6593 11.9995 16.3252 12.0279 16 12.0825V5.99951H8V19.9995H11.3414C11.6048 20.7448 12.0113 21.4224 12.5278 21.9995H8C6.89543 21.9995 6 21.1041 6 19.9995V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 13.9995V16.9995H13V18.9995H16V21.9995H18V18.9995H21V16.9995H18V13.9995H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
