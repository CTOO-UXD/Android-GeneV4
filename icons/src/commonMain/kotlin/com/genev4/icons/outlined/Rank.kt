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

public val Icons.Outlined.Rank: ImageVector
    get() {
        if (_rank != null) {
            return _rank!!
        }
        _rank =
            materialIcon(name = "Outlined.Rank") {
            addPath(
                pathData = PathParser().parsePathString("M20 4C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H18C16.8954 20 16 19.1046 16 18V6C16 4.89543 16.8954 4 18 4H20ZM20 6H18V18H20V6ZM8 8C8 6.89543 7.10457 6 6 6H4C2.89543 6 2 6.89543 2 8V18C2 19.1046 2.89543 20 4 20H6C7.10457 20 8 19.1046 8 18V8ZM4 8H6V18H4V8ZM15 12C15 10.8954 14.1046 10 13 10H11C9.89543 10 9 10.8954 9 12V18C9 19.1046 9.89543 20 11 20H13C14.1046 20 15 19.1046 15 18V12ZM11 12H13V18H11V12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _rank!!
    }

private var _rank: ImageVector? = null
