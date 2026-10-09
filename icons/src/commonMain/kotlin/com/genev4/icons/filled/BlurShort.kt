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

public val Icons.Filled.BlurShort: ImageVector
    get() {
        if (_blurShort != null) {
            return _blurShort!!
        }
        _blurShort =
            materialIcon(name = "Filled.BlurShort") {
            addPath(
                pathData = PathParser().parsePathString("M4 7.99951C4 7.44723 4.44772 6.99951 5 6.99951H15C17.7614 6.99951 20 9.23809 20 11.9995C20 14.7609 17.7614 16.9995 15 16.9995C12.581 16.9995 10.5633 15.2818 10.1 12.9995H5.5C4.94772 12.9995 4.5 12.5518 4.5 11.9995C4.5 11.4472 4.94772 10.9995 5.5 10.9995H10.1C10.25 10.2606 10.5629 9.58092 10.9996 8.99951H5C4.44772 8.99951 4 8.5518 4 7.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _blurShort!!
    }

private var _blurShort: ImageVector? = null
