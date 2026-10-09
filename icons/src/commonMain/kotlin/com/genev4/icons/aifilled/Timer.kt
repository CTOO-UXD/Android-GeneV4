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

public val Icons.AiFilled.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer =
            materialIcon(name = "AiFilled.Timer") {
            addPath(
                pathData = PathParser().parsePathString("M19 7.9L20.5 6.5C20 6 19.5 5.5 19 5.1L17.6 6.5C16 5.2 14.1 4.5 12 4.5C7 4.5 3 8.5 3 13.5C3 18.5 7 22.5 12 22.5C17 22.5 21 18.5 21 13.5C21 11.4 20.3 9.4 19 7.9ZM13 14.5H11V7.5H13V14.5ZM15 1.5H9V3.5H15V1.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _timer!!
    }

private var _timer: ImageVector? = null
