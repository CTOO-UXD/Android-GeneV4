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

public val Icons.Filled.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) {
            return _batteryPlus!!
        }
        _batteryPlus =
            materialIcon(name = "Filled.BatteryPlus") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99951C9.94772 1.99951 9.5 2.44723 9.5 2.99951V3.49951H14.5V2.99951C14.5 2.44723 14.0523 1.99951 13.5 1.99951H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99951C6.89543 3.99951 6 4.89494 6 5.99951V19.9995C6 21.1041 6.89543 21.9995 8 21.9995H12.5278C11.5777 20.938 11 19.5362 11 17.9995C11 14.6858 13.6863 11.9995 17 11.9995C17.3407 11.9995 17.6748 12.0279 18 12.0825V5.99951C18 4.89494 17.1046 3.99951 16 3.99951H8Z").toNodes(),
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
