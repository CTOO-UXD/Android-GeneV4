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

public val Icons.Filled.ScreenRecord: ImageVector
    get() {
        if (_screenRecord != null) {
            return _screenRecord!!
        }
        _screenRecord =
            materialIcon(name = "Filled.ScreenRecord") {
            addPath(
                pathData = PathParser().parsePathString("M18 6.5C18 5.39543 17.1046 4.5 16 4.5H3C1.89543 4.5 1 5.39543 1 6.5V17.5C1 18.6046 1.89543 19.5 3 19.5H16C17.1046 19.5 18 18.6046 18 17.5V15.272L21.5211 17.1934C21.668 17.2735 21.8327 17.3155 22 17.3155C22.5523 17.3155 23 16.8677 23 16.3155V7.68454C23 7.51722 22.958 7.35258 22.8779 7.20569C22.6134 6.72084 22.006 6.54218 21.5211 6.80665L18 8.726V6.5ZM9.5 15C11.1569 15 12.5 13.6569 12.5 12C12.5 10.3431 11.1569 9 9.5 9C7.84315 9 6.5 10.3431 6.5 12C6.5 13.6569 7.84315 15 9.5 15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _screenRecord!!
    }

private var _screenRecord: ImageVector? = null
