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

public val Icons.AiFilled.DeleteComment: ImageVector
    get() {
        if (_deleteComment != null) {
            return _deleteComment!!
        }
        _deleteComment =
            materialIcon(name = "AiFilled.DeleteComment") {
            addPath(
                pathData = PathParser().parsePathString("M20 2H4C2.9 2 2 2.89 2 4V16C2 17.11 2.9 18 4 18H8V21C8 21.55 8.45 22 9 22H9.5C9.75 22 10 21.9 10.2 21.71L13.9 18H20C21.11 18 22 17.11 22 16V4C22 2.9 21.11 2 20 2ZM16 11H8V9H16V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _deleteComment!!
    }

private var _deleteComment: ImageVector? = null
