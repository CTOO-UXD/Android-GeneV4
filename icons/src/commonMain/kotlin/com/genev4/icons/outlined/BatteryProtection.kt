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

public val Icons.Outlined.BatteryProtection: ImageVector
    get() {
        if (_batteryProtection != null) {
            return _batteryProtection!!
        }
        _batteryProtection =
            materialIcon(name = "Outlined.BatteryProtection") {
            addPath(
                pathData = PathParser().parsePathString("M16 4C17.1046 4 18 4.89543 18 6V12C14.6863 12 12 14.6863 12 18C12 19.5371 12.578 20.9393 13.5286 22.0009L8 22C6.89543 22 6 21.1046 6 20V6C6 4.89543 6.89543 4 8 4H16ZM18.2282 14.8702L20.7758 16.1958C20.8444 16.2346 20.8925 16.302 20.904 16.3798C21.052 17.2614 20.914 18.2348 20.49 19.3C20.0577 20.3861 19.2609 21.188 18.0997 21.7055C18.0369 21.7354 17.9645 21.7352 17.9008 21.7073C16.7262 21.1723 15.9259 20.3699 15.5 19.3C15.0813 18.2482 14.9473 17.2717 15.0981 16.3705C15.1119 16.294 15.1603 16.2281 15.2296 16.1929L17.7663 14.8704C17.911 14.7949 18.0834 14.7949 18.2282 14.8702ZM16 6H8V12H16V6ZM13.5 2C14.0523 2 14.5 2.44772 14.5 3V3.5H9.5V3C9.5 2.44772 9.94772 2 10.5 2H13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryProtection!!
    }

private var _batteryProtection: ImageVector? = null
