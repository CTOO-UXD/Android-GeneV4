/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.Learning: ImageVector
    get() {
        if (_learning != null) {
            return _learning!!
        }
        _learning =
            materialIcon(name = "AiOutlined.Learning") {
            addPath(
                pathData = PathParser().parsePathString("M8 2.5C9.63575 2.5 11.0878 3.28565 12 4.5C12.9122 3.28565 14.3643 2.5 16 2.5H22.5V19H15C13.8954 19 13 19.8954 13 21H11C11 19.8954 10.1046 19 9 19H1.5V2.5H8ZM3.5 17H9C9.72875 17 10.4116 17.1956 11 17.5361V7.5C11 5.84313 9.65687 4.5 8 4.5H3.5V17ZM16 4.5C14.3431 4.5 13 5.84313 13 7.5V17.5361C13.5884 17.1956 14.2712 17 15 17H20.5V4.5H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _learning!!
    }

private var _learning: ImageVector? = null
