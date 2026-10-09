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

public val Icons.AiFilled.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen =
            materialIcon(name = "AiFilled.Pen") {
            addPath(
                pathData = PathParser().parsePathString("M7.675 16H16.325L18.5 7.00005L13 1.92505V7.30005C13.2333 7.46672 13.4167 7.67505 13.55 7.92505C13.6833 8.17505 13.75 8.45005 13.75 8.75005C13.75 9.23338 13.5792 9.64588 13.2375 9.98755C12.8958 10.3292 12.4833 10.5 12 10.5C11.5167 10.5 11.1042 10.3292 10.7625 9.98755C10.4208 9.64588 10.25 9.23338 10.25 8.75005C10.25 8.45005 10.3167 8.17505 10.45 7.92505C10.5833 7.67505 10.7667 7.46672 11 7.30005V1.92505L5.5 7.00005L7.675 16ZM4 21L4.55 19.375C4.68333 18.9584 4.925 18.625 5.275 18.375C5.625 18.125 6.01667 18 6.45 18H17.55C17.9833 18 18.375 18.125 18.725 18.375C19.075 18.625 19.3167 18.9584 19.45 19.375L20 21H4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _pen!!
    }

private var _pen: ImageVector? = null
