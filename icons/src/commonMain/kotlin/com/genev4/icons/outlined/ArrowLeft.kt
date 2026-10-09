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

public val Icons.Outlined.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft =
            materialIcon(name = "Outlined.ArrowLeft") {
            addPath(
                pathData = PathParser().parsePathString("M7.76523 10.5849L14.3625 3.98764L15.7767 5.40185L9.17944 11.9992L8.47234 11.2921L15.7767 18.5964L14.3625 20.0106L7.76523 13.4134C6.98418 12.6323 6.98418 11.366 7.76523 10.5849Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
