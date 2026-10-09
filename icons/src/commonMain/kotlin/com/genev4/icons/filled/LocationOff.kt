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

public val Icons.Filled.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff =
            materialIcon(name = "Filled.LocationOff") {
            addPath(
                pathData = PathParser().parsePathString("M21 10.5C21 12.3403 20.3587 14.2561 19.0761 16.2473L15.4141 12.5853C15.7858 11.9781 16 11.2641 16 10.5C16 8.29086 14.2091 6.5 12 6.5C11.2359 6.5 10.5219 6.71423 9.91469 7.0859L6.335 3.50621C7.88188 2.25168 9.85316 1.5 12 1.5C16.9706 1.5 21 5.52944 21 10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.5705 19.3984L20.4853 23.3132L21.8995 21.8989L2.10049 2.09995L0.686279 3.51416L3.84969 6.67758C3.30463 7.83777 3 9.13331 3 10.5C3 14.1859 5.57257 18.1745 10.715 22.469C11.4556 23.0867 12.5316 23.088 13.2742 22.4726C14.5248 21.43 15.6236 20.4053 16.5705 19.3984ZM11.6577 14.4856C9.72162 14.3215 8.17853 12.7784 8.01444 10.8423L11.6577 14.4856Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
