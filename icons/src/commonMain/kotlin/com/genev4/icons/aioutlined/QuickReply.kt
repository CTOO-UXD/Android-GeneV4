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

public val Icons.AiOutlined.QuickReply: ImageVector
    get() {
        if (_quickReply != null) {
            return _quickReply!!
        }
        _quickReply =
            materialIcon(name = "AiOutlined.QuickReply") {
            addPath(
                pathData = PathParser().parsePathString("M22.5 16H20.3L22 12H17V18H19V23L22.5 16ZM15 18H13.9L10.2 21.7C10 21.9 9.8 22 9.5 22H9C8.4 22 8 21.6 8 21V18H4C2.9 18 2 17.1 2 16V4C2 2.9 2.9 2 4 2H20C21.1 2 22 2.9 22 4V10H20V4H4V16H10V19.1L13.1 16H15V18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _quickReply!!
    }

private var _quickReply: ImageVector? = null
