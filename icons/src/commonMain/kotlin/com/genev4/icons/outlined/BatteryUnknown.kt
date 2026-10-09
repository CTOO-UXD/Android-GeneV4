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

public val Icons.Outlined.BatteryUnknown: ImageVector
    get() {
        if (_batteryUnknown != null) {
            return _batteryUnknown!!
        }
        _batteryUnknown =
            materialIcon(name = "Outlined.BatteryUnknown") {
            addPath(
                pathData = PathParser().parsePathString("M9.5 3C9.5 2.44772 9.94772 2 10.5 2H13.5C14.0523 2 14.5 2.44772 14.5 3V3.5H9.5V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18 6C18 4.89543 17.1046 4 16 4H8C6.89543 4 6 4.89543 6 6V20C6 21.1046 6.89543 22 8 22H13V20H8V6H16V9H18V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.5344 14.1607C15.6878 13.4953 16.2853 13 16.9961 13C17.8246 13 18.4961 13.6716 18.4961 14.5C18.4961 15.3284 17.8246 16 16.9961 16C16.7309 16 16.4766 16.1054 16.289 16.2929C16.1015 16.4804 15.9961 16.7348 15.9961 17L15.9962 19L17.9962 19L17.9961 17.8551C19.4419 17.4248 20.4961 16.0855 20.4961 14.5C20.4961 12.567 18.9291 11 16.9961 11C15.3334 11 13.9436 12.1585 13.5856 13.7113L15.5344 14.1607Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.9962 20V22H17.9962V20H15.9962Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryUnknown!!
    }

private var _batteryUnknown: ImageVector? = null
