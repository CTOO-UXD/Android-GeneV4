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

public val Icons.AiOutlined.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen =
            materialIcon(name = "AiOutlined.Pen") {
            addPath(
                pathData = PathParser().parsePathString("M7.675 16L5.5 7L12 1L18.5 7L16.325 16H7.675ZM9.25 14H14.75L16.275 7.675L13 4.65V7.3C13.2333 7.46667 13.4167 7.675 13.55 7.925C13.6833 8.175 13.75 8.45 13.75 8.75C13.75 9.23333 13.5792 9.64583 13.2375 9.9875C12.8958 10.3292 12.4833 10.5 12 10.5C11.5167 10.5 11.1042 10.3292 10.7625 9.9875C10.4208 9.64583 10.25 9.23333 10.25 8.75C10.25 8.45 10.3167 8.175 10.45 7.925C10.5833 7.675 10.7667 7.46667 11 7.3V4.65L7.725 7.675L9.25 14ZM4 21L4.55 19.375C4.68333 18.9583 4.925 18.625 5.275 18.375C5.625 18.125 6.01667 18 6.45 18H17.55C17.9833 18 18.375 18.125 18.725 18.375C19.075 18.625 19.3167 18.9583 19.45 19.375L20 21H4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _pen!!
    }

private var _pen: ImageVector? = null
