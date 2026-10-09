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

public val Icons.Filled.Remove: ImageVector
    get() {
        if (_remove != null) {
            return _remove!!
        }
        _remove =
            materialIcon(name = "Filled.Remove") {
            addPath(
                pathData = PathParser().parsePathString("M20.5 11V13H3.5V11H20.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _remove!!
    }

private var _remove: ImageVector? = null
