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

public val Icons.Filled.Usage: ImageVector
    get() {
        if (_usage != null) {
            return _usage!!
        }
        _usage =
            materialIcon(name = "Filled.Usage") {
            addPath(
                pathData = PathParser().parsePathString("M13 2.04932V10.9999H21.9506C21.4816 6.27552 17.7244 2.51839 13 2.04932ZM11 2.04932V11.9999V12.9999H12H21.9506C21.4489 18.0533 17.1853 21.9999 12 21.9999C6.47715 21.9999 2 17.5228 2 11.9999C2 6.81459 5.94668 2.55104 11 2.04932Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _usage!!
    }

private var _usage: ImageVector? = null
