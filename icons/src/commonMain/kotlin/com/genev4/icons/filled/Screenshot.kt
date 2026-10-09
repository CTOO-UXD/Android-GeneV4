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

public val Icons.Filled.Screenshot: ImageVector
    get() {
        if (_screenshot != null) {
            return _screenshot!!
        }
        _screenshot =
            materialIcon(name = "Filled.Screenshot") {
            addPath(
                pathData = PathParser().parsePathString("M5 4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V4ZM8 5H12V6.5H9.5V9H8V5ZM16 15H14.5V17.5H12V19H16V15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _screenshot!!
    }

private var _screenshot: ImageVector? = null
