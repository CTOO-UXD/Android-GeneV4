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

public val Icons.Outlined.ClearAll: ImageVector
    get() {
        if (_clearAll != null) {
            return _clearAll!!
        }
        _clearAll =
            materialIcon(name = "Outlined.ClearAll") {
            addPath(
                pathData = PathParser().parsePathString("M22 6H6V8H22V6ZM4 11H20V13H4V11ZM2 16H18V18H2V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _clearAll!!
    }

private var _clearAll: ImageVector? = null
