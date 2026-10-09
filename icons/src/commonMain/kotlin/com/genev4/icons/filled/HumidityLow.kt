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

public val Icons.Filled.HumidityLow: ImageVector
    get() {
        if (_humidityLow != null) {
            return _humidityLow!!
        }
        _humidityLow =
            materialIcon(name = "Filled.HumidityLow") {
            addPath(
                pathData = PathParser().parsePathString("M10.6651 2.15617C11.4248 1.47529 12.5752 1.47529 13.3349 2.15617C18.1112 6.44956 20.5 10.2859 20.5 13.6666C20.5 19.1895 15.4801 22 12 22C8.51987 22 3.5 19.1895 3.5 13.6666C3.5 10.2859 5.88883 6.44956 10.6651 2.15617Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _humidityLow!!
    }

private var _humidityLow: ImageVector? = null
