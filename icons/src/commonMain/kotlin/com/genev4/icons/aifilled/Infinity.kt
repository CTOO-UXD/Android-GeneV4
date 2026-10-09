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

public val Icons.AiFilled.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity =
            materialIcon(name = "AiFilled.Infinity") {
            addPath(
                pathData = PathParser().parsePathString("M11.5831 11.4433C11.8414 11.7734 11.8414 12.2266 11.5831 12.5567C10.7231 13.656 8.6911 16 7 16C4.79086 16 3 14.2091 3 12C3 9.79086 4.79086 8 7 8C8.6911 8 10.7231 10.344 11.5831 11.4433Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.4169 11.4433C12.1586 11.7734 12.1586 12.2266 12.4169 12.5567C13.2769 13.656 15.3089 16 17 16C19.2091 16 21 14.2091 21 12C21 9.79086 19.2091 8 17 8C15.3089 8 13.2769 10.344 12.4169 11.4433Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _infinity!!
    }

private var _infinity: ImageVector? = null
