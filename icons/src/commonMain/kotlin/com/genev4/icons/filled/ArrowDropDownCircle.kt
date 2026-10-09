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

public val Icons.Filled.ArrowDropDownCircle: ImageVector
    get() {
        if (_arrowDropDownCircle != null) {
            return _arrowDropDownCircle!!
        }
        _arrowDropDownCircle =
            materialIcon(name = "Filled.ArrowDropDownCircle") {
            addPath(
                pathData = PathParser().parsePathString("M4.92893 19.0705C8.83418 22.9757 15.1658 22.9757 19.0711 19.0705C22.9763 15.1652 22.9763 8.83356 19.0711 4.92832C15.1658 1.02308 8.83418 1.02308 4.92893 4.92832C1.02369 8.83356 1.02369 15.1652 4.92893 19.0705ZM13.4144 14.8482L17.4166 10.846L16.0024 9.43179L12.0002 13.434L7.99796 9.43179L6.58375 10.846L10.586 14.8482C11.367 15.6293 12.6333 15.6293 13.4144 14.8482Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDropDownCircle!!
    }

private var _arrowDropDownCircle: ImageVector? = null
