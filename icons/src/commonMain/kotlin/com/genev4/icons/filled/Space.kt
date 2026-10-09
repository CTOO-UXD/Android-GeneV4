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

public val Icons.Filled.Space: ImageVector
    get() {
        if (_space != null) {
            return _space!!
        }
        _space =
            materialIcon(name = "Filled.Space") {
            addPath(
                pathData = PathParser().parsePathString("M3 15C1.89543 15 1 14.1046 1 13V9H4V12H20V9H23V13C23 14.1046 22.1046 15 21 15H3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _space!!
    }

private var _space: ImageVector? = null
