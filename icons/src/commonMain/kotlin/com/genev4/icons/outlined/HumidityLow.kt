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

public val Icons.Outlined.HumidityLow: ImageVector
    get() {
        if (_humidityLow != null) {
            return _humidityLow!!
        }
        _humidityLow =
            materialIcon(name = "Outlined.HumidityLow") {
            addPath(
                pathData = PathParser().parsePathString("M10.6651 2.15617C11.4248 1.47529 12.5752 1.47529 13.3349 2.15617C18.1112 6.44956 20.5 10.2859 20.5 13.6666C20.5 19.1895 15.4801 22 12 22C8.51987 22 3.5 19.1895 3.5 13.6666C3.5 10.2859 5.88883 6.44956 10.6651 2.15617ZM11.6598 3.95437C7.4966 7.77283 5.5 11.0489 5.5 13.6666C5.5 17.3267 8.74323 20 12 20C15.2568 20 18.5 17.3267 18.5 13.6666C18.5 10.9782 16.394 7.59526 12 3.64551L11.6598 3.95437Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _humidityLow!!
    }

private var _humidityLow: ImageVector? = null
