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

public val Icons.Filled.DeviceThermostat: ImageVector
    get() {
        if (_deviceThermostat != null) {
            return _deviceThermostat!!
        }
        _deviceThermostat =
            materialIcon(name = "Filled.DeviceThermostat") {
            addPath(
                pathData = PathParser().parsePathString("M12 1C14.2091 1 16 2.79086 16 4.99985L16.001 12.528L16.1807 12.696C17.2682 13.7517 17.928 15.1892 17.9944 16.7405L18 17C18 20.3137 15.3137 23 12 23C8.68629 23 6 20.3137 6 17C6 15.3497 6.67176 13.8096 7.82027 12.6951L7.999 12.528L8 5C8 2.8578 9.68397 1.10892 11.8004 1.0049L12 1ZM12.75 5L12.751 15.1458C13.4834 15.4427 14 16.161 14 17C14 18.1046 13.1046 19 12 19C10.8954 19 10 18.1046 10 17C10 16.1607 10.517 15.4421 11.25 15.1454L11.25 5H12.75Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _deviceThermostat!!
    }

private var _deviceThermostat: ImageVector? = null
