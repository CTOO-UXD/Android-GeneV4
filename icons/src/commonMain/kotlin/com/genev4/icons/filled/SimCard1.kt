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

public val Icons.Filled.SimCard1: ImageVector
    get() {
        if (_simCard1 != null) {
            return _simCard1!!
        }
        _simCard1 =
            materialIcon(name = "Filled.SimCard1") {
            addPath(
                pathData = PathParser().parsePathString("M9 2L4 7V18C4 20.2091 5.79086 22 8 22H16C18.2091 22 20 20.2091 20 18V6C20 3.79086 18.2091 2 16 2H9ZM12.339 10.3H15.089V18H13.417V11.73H12.339V10.3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _simCard1!!
    }

private var _simCard1: ImageVector? = null
