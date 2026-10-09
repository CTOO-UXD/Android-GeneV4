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

public val Icons.Filled.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones =
            materialIcon(name = "Filled.Headphones") {
            addPath(
                pathData = PathParser().parsePathString("M22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12V13V15V18C2 19.1046 2.89543 20 4 20H6C7.65685 20 9 18.6569 9 17V14C9 12.3431 7.65685 11 6 11H4.06189C4.55399 7.05369 7.92038 4 12 4L12.2492 4.00381C16.216 4.12517 19.4561 7.13433 19.9381 11H18C16.3431 11 15 12.3431 15 14V17C15 18.6569 16.3431 20 18 20H20C21.1046 20 22 19.1046 22 18V15V13V12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
