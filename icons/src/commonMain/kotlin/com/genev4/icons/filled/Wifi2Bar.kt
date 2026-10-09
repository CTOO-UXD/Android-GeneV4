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

public val Icons.Filled.Wifi2Bar: ImageVector
    get() {
        if (_wifi2Bar != null) {
            return _wifi2Bar!!
        }
        _wifi2Bar =
            materialIcon(name = "Filled.Wifi2Bar") {
            addPath(
                pathData = PathParser().parsePathString("M12.0001 12C14.2163 12 16.2454 12.801 17.8137 14.1294L16.5218 15.6562C15.302 14.623 13.7238 14 12.0001 14C10.2764 14 8.69821 14.623 7.47844 15.6562L6.18652 14.1294C7.75481 12.801 9.78392 12 12.0001 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.0001 20C13.1046 20 14.0001 19.1046 14.0001 18C14.0001 16.8954 13.1046 16 12.0001 16C10.8955 16 10.0001 16.8954 10.0001 18C10.0001 19.1046 10.8955 20 12.0001 20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _wifi2Bar!!
    }

private var _wifi2Bar: ImageVector? = null
