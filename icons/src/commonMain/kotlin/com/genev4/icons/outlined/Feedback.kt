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

public val Icons.Outlined.Feedback: ImageVector
    get() {
        if (_feedback != null) {
            return _feedback!!
        }
        _feedback =
            materialIcon(name = "Outlined.Feedback") {
            addPath(
                pathData = PathParser().parsePathString("M11 5.49951V11.4995H13V5.49951H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 12.4995V14.4995H13V12.4995H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2.70711 21.999C2.89464 21.999 3.0745 21.9245 3.20711 21.7919L7 17.999H18C20.2091 17.999 22 16.2082 22 13.999V5.99902C22 3.78988 20.2091 1.99902 18 1.99902H6C3.79086 1.99902 2 3.78988 2 5.99902V21.2919C2 21.6824 2.31658 21.999 2.70711 21.999ZM18 15.999H6.17157L4 18.1706V5.99902C4 4.89445 4.89543 3.99902 6 3.99902H18C19.1046 3.99902 20 4.89445 20 5.99902V13.999C20 15.1036 19.1046 15.999 18 15.999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _feedback!!
    }

private var _feedback: ImageVector? = null
