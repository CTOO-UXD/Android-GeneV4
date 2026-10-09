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

public val Icons.Outlined.DoubleClick: ImageVector
    get() {
        if (_doubleClick != null) {
            return _doubleClick!!
        }
        _doubleClick =
            materialIcon(name = "Outlined.DoubleClick") {
            addPath(
                pathData = PathParser().parsePathString("M12.5 5H4.5L4.5 19H12.5V5ZM4.5 3C3.39543 3 2.5 3.89543 2.5 5V19C2.5 20.1046 3.39543 21 4.5 21H12.5C13.6046 21 14.5 20.1046 14.5 19V12C15.0523 12 15.5 11.5523 15.5 11V9C15.5 8.44772 15.0523 8 14.5 8V5C14.5 3.89543 13.6046 3 12.5 3H4.5ZM22 10L24 5H21.8459L20.143 9.25722L19.8459 10L20.143 10.7428L21.8459 15H24L22 10ZM16.5 10L18.5 15H20.6541L18.6541 10L20.6541 5H18.5L16.5 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _doubleClick!!
    }

private var _doubleClick: ImageVector? = null
