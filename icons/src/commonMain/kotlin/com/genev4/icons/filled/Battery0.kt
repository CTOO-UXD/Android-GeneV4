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

public val Icons.Filled.Battery0: ImageVector
    get() {
        if (_battery0 != null) {
            return _battery0!!
        }
        _battery0 =
            materialIcon(name = "Filled.Battery0") {
            addPath(
                pathData = PathParser().parsePathString("M9.5 3C9.5 2.44772 9.94772 2 10.5 2H13.5C14.0523 2 14.5 2.44772 14.5 3V3.5H9.5V3ZM18 6C18 4.89543 17.1046 4 16 4H8C6.89543 4 6 4.89543 6 6V20C6 21.1046 6.89543 22 8 22H16C17.1046 22 18 21.1046 18 20V6ZM8 6H16V20H8V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _battery0!!
    }

private var _battery0: ImageVector? = null
