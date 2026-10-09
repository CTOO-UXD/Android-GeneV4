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

public val Icons.Outlined.ArrowDropDownCircle: ImageVector
    get() {
        if (_arrowDropDownCircle != null) {
            return _arrowDropDownCircle!!
        }
        _arrowDropDownCircle =
            materialIcon(name = "Outlined.ArrowDropDownCircle") {
            addPath(
                pathData = PathParser().parsePathString("M13.4144 14.8482L17.4166 10.8459L16.0024 9.43173L12.0002 13.434L7.99796 9.43173L6.58375 10.8459L10.586 14.8482C11.367 15.6292 12.6333 15.6292 13.4144 14.8482Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.0711 19.0704C15.1658 22.9756 8.83418 22.9756 4.92893 19.0704C1.02369 15.1652 1.02369 8.8335 4.92893 4.92826C8.83418 1.02302 15.1658 1.02302 19.0711 4.92826C22.9763 8.8335 22.9763 15.1652 19.0711 19.0704ZM17.6569 17.6562C14.5327 20.7804 9.46734 20.7804 6.34315 17.6562C3.21895 14.532 3.21895 9.46667 6.34315 6.34247C9.46734 3.21828 14.5327 3.21828 17.6569 6.34247C20.781 9.46667 20.781 14.532 17.6569 17.6562Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDropDownCircle!!
    }

private var _arrowDropDownCircle: ImageVector? = null
