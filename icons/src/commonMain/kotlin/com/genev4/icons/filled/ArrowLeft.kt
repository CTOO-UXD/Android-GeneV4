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

public val Icons.Filled.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft =
            materialIcon(name = "Filled.ArrowLeft") {
            addPath(
                pathData = PathParser().parsePathString("M7.76523 10.585L14.3625 3.9877L15.7767 5.40191L9.17944 11.9992L8.47234 11.2921L15.7767 18.5965L14.3625 20.0107L7.76523 13.4134C6.98418 12.6324 6.98418 11.3661 7.76523 10.585Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
