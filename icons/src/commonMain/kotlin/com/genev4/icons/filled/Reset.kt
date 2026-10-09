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

public val Icons.Filled.Reset: ImageVector
    get() {
        if (_reset != null) {
            return _reset!!
        }
        _reset =
            materialIcon(name = "Filled.Reset") {
            addPath(
                pathData = PathParser().parsePathString("M4 3V8C4 8.55228 4.44772 9 5 9H10V7L7.10054 6.99976C8.38918 5.73582 10.1324 5 12 5C15.866 5 19 8.13401 19 12C19 15.866 15.866 19 12 19C8.13401 19 5 15.866 5 12H3C3 16.9706 7.02944 21 12 21C16.9706 21 21 16.9706 21 12C21 7.02944 16.9706 3 12 3C9.74081 3 7.62112 3.83904 5.99863 5.2921L6 3H4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _reset!!
    }

private var _reset: ImageVector? = null
