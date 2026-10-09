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

public val Icons.Filled.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send =
            materialIcon(name = "Filled.Send") {
            addPath(
                pathData = PathParser().parsePathString("M4.39827 3.60715C4.27259 3.55257 4.13702 3.52441 4 3.52441C3.44772 3.52441 3 3.97213 3 4.52441V10V10.0275L12.0737 12L3 13.9726V14V19.4756C3 19.6127 3.02816 19.7482 3.08273 19.8739C3.30269 20.3805 3.89168 20.6129 4.39827 20.3929L21.6154 12.9173C21.8479 12.8163 22.0334 12.6308 22.1344 12.3983C22.3543 11.8917 22.122 11.3027 21.6154 11.0828L4.39827 3.60715Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _send!!
    }

private var _send: ImageVector? = null
