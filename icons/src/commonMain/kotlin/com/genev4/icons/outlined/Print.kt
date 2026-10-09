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

public val Icons.Outlined.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print =
            materialIcon(name = "Outlined.Print") {
            addPath(
                pathData = PathParser().parsePathString("M16 2C17.1046 2 18 2.89543 18 4V7H20C21.1046 7 22 7.89543 22 9V17C22 18.1046 21.1046 19 20 19H18V20C18 21.1046 17.1046 22 16 22H8C6.89543 22 6 21.1046 6 20V19H4C2.89543 19 2 18.1046 2 17V9C2 7.89543 2.89543 7 4 7H6V4C6 2.89543 6.89543 2 8 2H16ZM18 17H20V9H16H8H4V17H6C6 15.8954 6.89543 15 8 15H16C17.1046 15 18 15.8954 18 17ZM8 7H16V4H8V7ZM8 10V12H5V10H8ZM16 17H8V20H16V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _print!!
    }

private var _print: ImageVector? = null
