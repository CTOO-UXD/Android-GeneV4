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

public val Icons.AiFilled.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond =
            materialIcon(name = "AiFilled.Diamond") {
            addPath(
                pathData = PathParser().parsePathString("M9.2 8.25L11.85 3H12.15L14.8 8.25H9.2ZM11.25 20.1L2.625 9.75H11.25V20.1ZM12.75 20.1V9.75H21.375L12.75 20.1ZM16.45 8.25L13.85 3H19L21.625 8.25H16.45ZM2.375 8.25L5 3H10.15L7.55 8.25H2.375Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
