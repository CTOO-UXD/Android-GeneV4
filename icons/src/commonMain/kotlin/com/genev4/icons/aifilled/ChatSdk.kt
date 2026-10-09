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

public val Icons.AiFilled.ChatSdk: ImageVector
    get() {
        if (_chatSdk != null) {
            return _chatSdk!!
        }
        _chatSdk =
            materialIcon(name = "AiFilled.ChatSdk") {
            addPath(
                pathData = PathParser().parsePathString("M20.499 3C21.0513 3 21.499 3.44772 21.499 4V10.5H2.5V12.5H21.499V20L21.4941 20.1025C21.4462 20.573 21.072 20.9472 20.6016 20.9951L20.499 21H3.49902L3.39746 20.9951C2.92686 20.9474 2.55284 20.5731 2.50488 20.1025L2.49902 20V4C2.49902 3.44772 2.94674 3 3.49902 3H20.499ZM6.49902 8.5H8.49902V6.5H6.49902V8.5ZM10.499 8.5H12.499V6.5H10.499V8.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _chatSdk!!
    }

private var _chatSdk: ImageVector? = null
