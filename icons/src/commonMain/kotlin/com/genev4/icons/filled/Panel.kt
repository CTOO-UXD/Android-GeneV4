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

public val Icons.Filled.Panel: ImageVector
    get() {
        if (_panel != null) {
            return _panel!!
        }
        _panel =
            materialIcon(name = "Filled.Panel") {
            addPath(
                pathData = PathParser().parsePathString("M8 4C6.89543 4 6 4.89543 6 6V18C6 19.1046 6.89543 20 8 20H16C17.1046 20 18 19.1046 18 18V6C18 4.89543 17.1046 4 16 4H8ZM3 5H5V19H3C1.89543 19 1 18.1046 1 17V7C1 5.89543 1.89543 5 3 5ZM21 19H19V5H21C22.1046 5 23 5.89543 23 7V17C23 18.1046 22.1046 19 21 19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _panel!!
    }

private var _panel: ImageVector? = null
