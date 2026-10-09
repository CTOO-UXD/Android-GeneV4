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

public val Icons.AiFilled.DuplicateFile: ImageVector
    get() {
        if (_duplicateFile != null) {
            return _duplicateFile!!
        }
        _duplicateFile =
            materialIcon(name = "AiFilled.DuplicateFile") {
            addPath(
                pathData = PathParser().parsePathString("M4 22H16V20H4V8H2V20C2 21.103 2.897 22 4 22Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20 2H8C6.897 2 6 2.897 6 4V16C6 17.103 6.897 18 8 18H20C21.103 18 22 17.103 22 16V4C22 2.897 21.103 2 20 2ZM18 11H15V14H13V11H10V9H13V6H15V9H18V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _duplicateFile!!
    }

private var _duplicateFile: ImageVector? = null
