/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.CommentBubble: ImageVector
    get() {
        if (_commentBubble != null) {
            return _commentBubble!!
        }
        _commentBubble =
            materialIcon(name = "Outlined.CommentBubble") {
            addPath(
                pathData = PathParser().parsePathString("M17.8284 15.9995H6C4.89543 15.9995 4 15.1041 4 13.9995V5.99951C4 4.89494 4.89543 3.99951 6 3.99951H18C19.1046 3.99951 20 4.89494 20 5.99951V18.1711L17.8284 15.9995ZM20.7929 21.7924C20.9255 21.925 21.1054 21.9995 21.2929 21.9995C21.6834 21.9995 22 21.6829 22 21.2924V5.99951C22 3.79037 20.2091 1.99951 18 1.99951H6C3.79086 1.99951 2 3.79037 2 5.99951V13.9995C2 16.2087 3.79086 17.9995 6 17.9995H17L20.7929 21.7924Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _commentBubble!!
    }

private var _commentBubble: ImageVector? = null
