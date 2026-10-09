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

public val Icons.Outlined.Panel: ImageVector
    get() {
        if (_panel != null) {
            return _panel!!
        }
        _panel =
            materialIcon(name = "Outlined.Panel") {
            addPath(
                pathData = PathParser().parsePathString("M8 6H16V18H8V6ZM6 6C6 4.89543 6.89543 4 8 4H16C17.1046 4 18 4.89543 18 6V18C18 19.1046 17.1046 20 16 20H8C6.89543 20 6 19.1046 6 18V6ZM3 5H5V7H3V17H5V19H3C1.89543 19 1 18.1046 1 17V7C1 5.89543 1.89543 5 3 5ZM21 19H19V17H21V7H19V5H21C22.1046 5 23 5.89543 23 7V17C23 18.1046 22.1046 19 21 19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _panel!!
    }

private var _panel: ImageVector? = null
