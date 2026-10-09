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

public val Icons.AiFilled.FileChart: ImageVector
    get() {
        if (_fileChart != null) {
            return _fileChart!!
        }
        _fileChart =
            materialIcon(name = "AiFilled.FileChart") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L21 7V21.0082C21 21.556 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918C3 2.44405 3.44495 2 3.9934 2H16ZM11 7V17H13V7H11ZM15 11V17H17V11H15ZM7 13V17H9V13H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fileChart!!
    }

private var _fileChart: ImageVector? = null
