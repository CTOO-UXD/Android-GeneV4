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

public val Icons.Filled.ChatBubble: ImageVector
    get() {
        if (_chatBubble != null) {
            return _chatBubble!!
        }
        _chatBubble =
            materialIcon(name = "Filled.ChatBubble") {
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 3.79037 3.79086 1.99951 6 1.99951H18C20.2091 1.99951 22 3.79037 22 5.99951V13.9995C22 16.2087 20.2091 17.9995 18 17.9995H7L3.20711 21.7924C3.0745 21.925 2.89464 21.9995 2.70711 21.9995Lnan nanL2.70711 21.9995C2.31658 21.9995 2 21.6829 2 21.2924V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _chatBubble!!
    }

private var _chatBubble: ImageVector? = null
