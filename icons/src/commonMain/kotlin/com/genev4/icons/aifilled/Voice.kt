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

public val Icons.AiFilled.Voice: ImageVector
    get() {
        if (_voice != null) {
            return _voice!!
        }
        _voice =
            materialIcon(name = "AiFilled.Voice") {
            addPath(
                pathData = PathParser().parsePathString("M11 3H13V21H11V3ZM3 9H5V15H3V9ZM7 6H9V18H7V6ZM15 6H17V18H15V6ZM19 9H21V15H19V9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _voice!!
    }

private var _voice: ImageVector? = null
