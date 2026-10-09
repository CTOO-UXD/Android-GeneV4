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

public val Icons.Outlined.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif =
            materialIcon(name = "Outlined.Gif") {
            addPath(
                pathData = PathParser().parsePathString("M3 3H21V5H3V3ZM14 7V17H12V7H14ZM21 21V19H3V21H21ZM11 7V9H7C5.89544 9 5 9.8954 5 11V13C5 14.1046 5.89544 15 7 15H9V13H7V11H11V15C11 16.1046 10.1046 17 9 17H7C4.79086 17 3 15.2092 3 13V11C3 8.7908 4.79086 7 7 7H11ZM21 9V7H15V17H17V13H21V11H17V9H21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _gif!!
    }

private var _gif: ImageVector? = null
