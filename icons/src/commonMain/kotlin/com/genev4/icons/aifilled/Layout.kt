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

public val Icons.AiFilled.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout =
            materialIcon(name = "AiFilled.Layout") {
            addPath(
                pathData = PathParser().parsePathString("M15 10V21H3C2.44772 21 2 20.5523 2 20V10H15ZM22 10V20C22 20.5523 21.5523 21 21 21H17V10H22ZM21 3C21.5523 3 22 3.44772 22 4V8H2V4C2 3.44772 2.44772 3 3 3H21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _layout!!
    }

private var _layout: ImageVector? = null
