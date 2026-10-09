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

public val Icons.Filled.BatteryCharging100: ImageVector
    get() {
        if (_batteryCharging100 != null) {
            return _batteryCharging100!!
        }
        _batteryCharging100 =
            materialIcon(name = "Filled.BatteryCharging100") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99878C9.94772 1.99878 9.5 2.44649 9.5 2.99878V3.49878H14.5V2.99878C14.5 2.44649 14.0523 1.99878 13.5 1.99878H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99878C6.89543 3.99878 6 4.89421 6 5.99878V19.9988C6 21.1033 6.89543 21.9988 8 21.9988H12.5278C11.5777 20.9373 11 19.5355 11 17.9988C11 14.6851 13.6863 11.9988 17 11.9988C17.3407 11.9988 17.6748 12.0272 18 12.0817V5.99878C18 4.89421 17.1046 3.99878 16 3.99878H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5 18.9993V21.9993L20 16.9993H17.5V13.9993L14 18.9993H16.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryCharging100!!
    }

private var _batteryCharging100: ImageVector? = null
