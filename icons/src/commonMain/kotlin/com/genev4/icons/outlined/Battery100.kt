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

public val Icons.Outlined.Battery100: ImageVector
    get() {
        if (_battery100 != null) {
            return _battery100!!
        }
        _battery100 =
            materialIcon(name = "Outlined.Battery100") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 2C9.94772 2 9.5 2.44772 9.5 3V3.5H14.5V3C14.5 2.44772 14.0523 2 13.5 2H10.5ZM8 4C6.89543 4 6 4.89543 6 6V20C6 21.1046 6.89543 22 8 22H16C17.1046 22 18 21.1046 18 20V6C18 4.89543 17.1046 4 16 4H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _battery100!!
    }

private var _battery100: ImageVector? = null
