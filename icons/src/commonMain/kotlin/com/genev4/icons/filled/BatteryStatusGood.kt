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

public val Icons.Filled.BatteryStatusGood: ImageVector
    get() {
        if (_batteryStatusGood != null) {
            return _batteryStatusGood!!
        }
        _batteryStatusGood =
            materialIcon(name = "Filled.BatteryStatusGood") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99902C9.94772 1.99902 9.5 2.44674 9.5 2.99902V3.49902H14.5V2.99902C14.5 2.44674 14.0523 1.99902 13.5 1.99902H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 3.99902C6.89543 3.99902 6 4.89445 6 5.99902V19.999C6 21.1036 6.89543 21.999 8 21.999H12.5278C11.5777 20.9375 11 19.5357 11 17.999C11 14.6853 13.6863 11.999 17 11.999C17.3407 11.999 17.6748 12.0274 18 12.082V5.99902C18 4.89445 17.1046 3.99902 16 3.99902H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.1819 15.0251L15.9392 19.2678L13.8179 17.1464L12.4037 18.5607L15.2321 21.3891C15.6226 21.7796 16.2558 21.7796 16.6463 21.3891L21.5961 16.4393L20.1819 15.0251Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _batteryStatusGood!!
    }

private var _batteryStatusGood: ImageVector? = null
