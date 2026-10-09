/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Learning: ImageVector
    get() {
        if (_learning != null) {
            return _learning!!
        }
        _learning =
            materialIcon(name = "AiFilled.Learning") {
            addPath(
                pathData = PathParser().parsePathString("M8 2.5C9.63575 2.5 11.0878 3.28565 12 4.5C12.9122 3.28565 14.3643 2.5 16 2.5H22.5V19H15C13.8954 19 13 19.8954 13 21H11C11 19.8954 10.1046 19 9 19H1.5V2.5H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _learning!!
    }

private var _learning: ImageVector? = null
