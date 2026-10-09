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

public val Icons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation =
            materialIcon(name = "Filled.Navigation") {
            addPath(
                pathData = PathParser().parsePathString("M11.622 1.70899C12.1328 1.49889 12.7172 1.74263 12.9273 2.25339L19.9512 19.3287C20.066 19.6079 20.0486 19.924 19.9039 20.1888C19.6389 20.6734 19.0313 20.8515 18.5467 20.5866L11.9999 17.0076L5.50102 20.58C5.23638 20.7255 4.92017 20.7436 4.64067 20.6292C4.12951 20.4201 3.88465 19.8362 4.09376 19.325L11.0769 2.25517C11.1782 2.00751 11.3746 1.81079 11.622 1.70899Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _navigation!!
    }

private var _navigation: ImageVector? = null
