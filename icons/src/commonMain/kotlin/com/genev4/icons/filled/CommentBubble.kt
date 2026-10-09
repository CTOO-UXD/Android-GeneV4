/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Filled.CommentBubble: ImageVector
    get() {
        if (_commentBubble != null) {
            return _commentBubble!!
        }
        _commentBubble =
            materialIcon(name = "Filled.CommentBubble") {
            addPath(
                pathData = PathParser().parsePathString("M22 5.99951C22 3.79037 20.2091 1.99951 18 1.99951H6C3.79086 1.99951 2 3.79037 2 5.99951V13.9995C2 16.2087 3.79086 17.9995 6 17.9995H17L20.7929 21.7924C20.9255 21.925 21.1054 21.9995 21.2929 21.9995Lnan nanL21.2929 21.9995C21.6834 21.9995 22 21.6829 22 21.2924V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _commentBubble!!
    }

private var _commentBubble: ImageVector? = null
