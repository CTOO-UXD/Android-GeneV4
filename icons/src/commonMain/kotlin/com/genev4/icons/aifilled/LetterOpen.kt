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

public val Icons.AiFilled.LetterOpen: ImageVector
    get() {
        if (_letterOpen != null) {
            return _letterOpen!!
        }
        _letterOpen =
            materialIcon(name = "AiFilled.LetterOpen") {
            addPath(
                pathData = PathParser().parsePathString("M2.24283 6.8543L11.4895 1.30855C11.8062 1.1186 12.2019 1.11867 12.5185 1.30873L21.7573 6.85428C21.9079 6.94465 22 7.10738 22 7.28298V20C22 20.5523 21.5523 21 21 21H3C2.44772 21 2 20.5523 2 20V7.2831C2 7.10743 2.09218 6.94466 2.24283 6.8543ZM18.3456 8.24378L12.0606 13.6829L5.64722 8.23764L4.35278 9.76225L12.0731 16.3171L19.6544 9.7561L18.3456 8.24378Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _letterOpen!!
    }

private var _letterOpen: ImageVector? = null
