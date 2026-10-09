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

public val Icons.Filled.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment =
            materialIcon(name = "Filled.Comment") {
            addPath(
                pathData = PathParser().parsePathString("M18 1.99902C20.2091 1.99902 22 3.78988 22 5.99902V21.2919C22 21.6824 21.6834 21.999 21.2929 21.999C21.1054 21.999 20.9255 21.9245 20.7929 21.7919L17 17.999H6C3.79086 17.999 2 16.2082 2 13.999V5.99902C2 3.78988 3.79086 1.99902 6 1.99902H18ZM6 7.74951H18V6.24951H6V7.74951ZM6 10.7495H18V9.24951H6V10.7495ZM6 13.7495H18V12.2495H6V13.7495Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _comment!!
    }

private var _comment: ImageVector? = null
