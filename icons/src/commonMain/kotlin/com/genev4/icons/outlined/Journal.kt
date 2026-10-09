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

public val Icons.Outlined.Journal: ImageVector
    get() {
        if (_journal != null) {
            return _journal!!
        }
        _journal =
            materialIcon(name = "Outlined.Journal") {
            addPath(
                pathData = PathParser().parsePathString("M6 5C6 3.89543 6.89543 3 8 3H19C20.1046 3 21 3.89543 21 5V16C21 17.1046 20.1046 18 19 18H8C6.89543 18 6 17.1046 6 16V5ZM18 5H19V16H8V5H14V10L16 8.71429L18 10V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 7V16.4C5 17.8359 6.16406 19 7.6 19H19V21H7.6C5.05949 21 3 18.9405 3 16.4V7H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _journal!!
    }

private var _journal: ImageVector? = null
