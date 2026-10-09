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

public val Icons.Outlined.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop =
            materialIcon(name = "Outlined.Crop") {
            addPath(
                pathData = PathParser().parsePathString("M16 13.9878H18V7.99478C18 6.89574 17.1 5.99652 16 5.99652H10V7.99478H16V13.9878ZM8 15.9861V2H6V5.99652H2V7.99478H6V15.9861C6 17.0851 6.9 17.9843 8 17.9843H16V21.9809H18V17.9843H22V15.9861H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _crop!!
    }

private var _crop: ImageVector? = null
