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

public val Icons.Outlined.BlurShort: ImageVector
    get() {
        if (_blurShort != null) {
            return _blurShort!!
        }
        _blurShort =
            materialIcon(name = "Outlined.BlurShort") {
            addPath(
                pathData = PathParser().parsePathString("M4 7.99951C4 7.44723 4.44772 6.99951 5 6.99951H15C17.7614 6.99951 20 9.23809 20 11.9995C20 14.7609 17.7614 16.9995 15 16.9995C12.581 16.9995 10.5633 15.2818 10.1 12.9995H5.5C4.94772 12.9995 4.5 12.5518 4.5 11.9995C4.5 11.4472 4.94772 10.9995 5.5 10.9995H10.1C10.25 10.2606 10.5629 9.58092 10.9996 8.99951H5C4.44772 8.99951 4 8.5518 4 7.99951ZM12 11.9995C12 10.3427 13.3431 8.99951 15 8.99951C16.6569 8.99951 18 10.3427 18 11.9995C18 13.6564 16.6569 14.9995 15 14.9995C13.3431 14.9995 12 13.6564 12 11.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _blurShort!!
    }

private var _blurShort: ImageVector? = null
