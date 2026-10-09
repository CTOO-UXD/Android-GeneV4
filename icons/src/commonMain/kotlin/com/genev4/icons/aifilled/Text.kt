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

public val Icons.AiFilled.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text =
            materialIcon(name = "AiFilled.Text") {
            addPath(
                pathData = PathParser().parsePathString("M21 8V20.9922C21 21.5507 20.5553 21.9999 20.0068 22H3.99316C3.44482 21.9999 3 21.5555 3 21.0078V2.99219C3 2.45577 3.44682 2.00012 3.99805 2H15L21 8ZM8 17H16V15H8V17ZM8 13H16V11H8V13ZM8 9H11V7H8V9ZM14 9H19.5L14 3.5V9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _text!!
    }

private var _text: ImageVector? = null
