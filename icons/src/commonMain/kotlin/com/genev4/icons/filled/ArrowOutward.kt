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

public val Icons.Filled.ArrowOutward: ImageVector
    get() {
        if (_arrowOutward != null) {
            return _arrowOutward!!
        }
        _arrowOutward =
            materialIcon(name = "Filled.ArrowOutward") {
            addPath(
                pathData = PathParser().parsePathString("M15.6611 6.33801H6.33113V8.33801H14.2468L5.62402 16.9608L7.03824 18.375L15.6611 9.75213L15.6611 17.668H17.6611L17.6611 8.33801C17.6611 7.23344 16.7657 6.33801 15.6611 6.33801Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowOutward!!
    }

private var _arrowOutward: ImageVector? = null
