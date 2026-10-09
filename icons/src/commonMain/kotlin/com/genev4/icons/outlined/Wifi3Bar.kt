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

public val Icons.Outlined.Wifi3Bar: ImageVector
    get() {
        if (_wifi3Bar != null) {
            return _wifi3Bar!!
        }
        _wifi3Bar =
            materialIcon(name = "Outlined.Wifi3Bar") {
            addPath(
                pathData = PathParser().parsePathString("M3.60254 11.0758C5.86784 9.15706 8.79878 8 12 8C15.2012 8 18.1321 9.15706 20.3974 11.0758L19.1055 12.6026C17.1887 10.979 14.7087 10 12 10C9.29127 10 6.81124 10.979 4.89445 12.6026L3.60254 11.0758Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 12C14.2162 12 16.2453 12.801 17.8136 14.1294L16.5217 15.6562C15.3019 14.623 13.7237 14 12 14C10.2762 14 8.69805 14.623 7.47827 15.6562L6.18636 14.1294C7.75465 12.801 9.78376 12 12 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11.9999 20C13.1045 20 13.9999 19.1046 13.9999 18C13.9999 16.8954 13.1045 16 11.9999 16C10.8953 16 9.99992 16.8954 9.99992 18C9.99992 19.1046 10.8953 20 11.9999 20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _wifi3Bar!!
    }

private var _wifi3Bar: ImageVector? = null
