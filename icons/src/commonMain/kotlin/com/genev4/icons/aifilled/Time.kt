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

public val Icons.AiFilled.Time: ImageVector
    get() {
        if (_time != null) {
            return _time!!
        }
        _time =
            materialIcon(name = "AiFilled.Time") {
            addPath(
                pathData = PathParser().parsePathString("M12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22ZM13 12V7H11V14H17V12H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _time!!
    }

private var _time: ImageVector? = null
