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

public val Icons.Outlined.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book =
            materialIcon(name = "Outlined.Book") {
            addPath(
                pathData = PathParser().parsePathString("M4 2.99951C4 2.44723 4.44772 1.99951 5 1.99951H19C19.5523 1.99951 20 2.44723 20 2.99951V20.9995C20 21.5518 19.5523 21.9995 19 21.9995H5C4.44772 21.9995 4 21.5518 4 20.9995V2.99951ZM6 19.9995V3.99951H11V10.9995L13.5 9.49951L16 10.9995V3.99951H18V19.9995H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _book!!
    }

private var _book: ImageVector? = null
