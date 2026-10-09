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

public val Icons.Filled.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight =
            materialIcon(name = "Filled.ArrowRight") {
            addPath(
                pathData = PathParser().parsePathString("M9.63741 3.98868L16.2347 10.5859C17.0157 11.367 17.0157 12.6333 16.2347 13.4144L9.63736 20.0117L8.22314 18.5974L14.8204 12.0001L8.2232 5.40289L9.63741 3.98868Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
