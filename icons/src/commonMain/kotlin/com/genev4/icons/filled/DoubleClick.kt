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

public val Icons.Filled.DoubleClick: ImageVector
    get() {
        if (_doubleClick != null) {
            return _doubleClick!!
        }
        _doubleClick =
            materialIcon(name = "Filled.DoubleClick") {
            addPath(
                pathData = PathParser().parsePathString("M2.5 5C2.5 3.89543 3.39543 3 4.5 3H12.5C13.6046 3 14.5 3.89543 14.5 5V8C15.0523 8 15.5 8.44772 15.5 9V11C15.5 11.5523 15.0523 12 14.5 12V19C14.5 20.1046 13.6046 21 12.5 21H4.5C3.39543 21 2.5 20.1046 2.5 19V5ZM22 10L24 5H21.8459L20.143 9.25722L19.8459 10L20.143 10.7428L21.8459 15H24L22 10ZM16.5 10L18.5 15H20.6541L18.6541 10L20.6541 5H18.5L16.5 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _doubleClick!!
    }

private var _doubleClick: ImageVector? = null
