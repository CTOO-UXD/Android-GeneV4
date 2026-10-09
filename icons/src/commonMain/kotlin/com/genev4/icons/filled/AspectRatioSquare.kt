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

public val Icons.Filled.AspectRatioSquare: ImageVector
    get() {
        if (_aspectRatioSquare != null) {
            return _aspectRatioSquare!!
        }
        _aspectRatioSquare =
            materialIcon(name = "Filled.AspectRatioSquare") {
            addPath(
                pathData = PathParser().parsePathString("M7 3C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V7C21 4.79086 19.2091 3 17 3H7ZM6 7C6 6.44772 6.44772 6 7 6H11V8H8V11H6V7ZM18 17C18 17.5523 17.5523 18 17 18H13V16H16V13H18V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _aspectRatioSquare!!
    }

private var _aspectRatioSquare: ImageVector? = null
