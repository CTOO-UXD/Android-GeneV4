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

public val Icons.Outlined.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor =
            materialIcon(name = "Outlined.Monitor") {
            addPath(
                pathData = PathParser().parsePathString("M4 3C2.89543 3 2 3.89543 2 5V16C2 17.1046 2.89543 18 4 18H10V19H9C8.44772 19 8 19.4477 8 20C8 20.5523 8.44772 21 9 21H15C15.5523 21 16 20.5523 16 20C16 19.4477 15.5523 19 15 19H14V18H20C21.1046 18 22 17.1046 22 16V5C22 3.89543 21.1046 3 20 3H4ZM20 5H4V16H20V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _monitor!!
    }

private var _monitor: ImageVector? = null
