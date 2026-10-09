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

public val Icons.Filled.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book =
            materialIcon(name = "Filled.Book") {
            addPath(
                pathData = PathParser().parsePathString("M5 1.99951C4.44772 1.99951 4 2.44723 4 2.99951V20.9995C4 21.5518 4.44772 21.9995 5 21.9995H19C19.5523 21.9995 20 21.5518 20 20.9995V2.99951C20 2.44723 19.5523 1.99951 19 1.99951H5ZM11 10.9995V3.99951H16V10.9995L13.5 9.49951L11 10.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _book!!
    }

private var _book: ImageVector? = null
