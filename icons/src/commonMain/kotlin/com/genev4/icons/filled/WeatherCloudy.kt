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

public val Icons.Filled.WeatherCloudy: ImageVector
    get() {
        if (_weatherCloudy != null) {
            return _weatherCloudy!!
        }
        _weatherCloudy =
            materialIcon(name = "Filled.WeatherCloudy") {
            addPath(
                pathData = PathParser().parsePathString("M18.6 9.1C17.7 6.2 15.1 4 12 4C9.3 4 7 5.6 5.8 8C3.1 8.4 1 10.7 1 13.5C1 16.5 3.5 19 6.5 19H12H18C20.8 19 23 16.8 23 14C23 11.4 21.1 9.4 18.6 9.1Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _weatherCloudy!!
    }

private var _weatherCloudy: ImageVector? = null
