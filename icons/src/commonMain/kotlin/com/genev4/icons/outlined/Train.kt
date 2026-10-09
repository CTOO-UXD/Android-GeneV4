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

public val Icons.Outlined.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train =
            materialIcon(name = "Outlined.Train") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C19.2091 3 21 4.79086 21 7V18C21 19.1046 20.1046 20 19 20H17L19 22H16.5L14.5 20H9.5L7.5 22H5L7 20H5C3.89543 20 3 19.1046 3 18V7C3 4.79086 4.79086 3 7 3H17ZM17 5H7C5.89543 5 5 5.89543 5 7V10H19V7C19 5.89543 18.1046 5 17 5ZM19 12H5V18H19V12ZM6 14H10V16H6V14ZM18 14H14V16H18V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _train!!
    }

private var _train: ImageVector? = null
