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

public val Icons.Outlined.LiveTv: ImageVector
    get() {
        if (_liveTv != null) {
            return _liveTv!!
        }
        _liveTv =
            materialIcon(name = "Outlined.LiveTv") {
            addPath(
                pathData = PathParser().parsePathString("M9 6.83118V12.1678C9 12.959 9.87525 13.4369 10.5408 13.009L14.6915 10.3407C15.3038 9.94705 15.3038 9.05197 14.6915 8.65833L10.5408 5.99C9.87525 5.56217 9 6.04001 9 6.83118Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 1.99951C2.89543 1.99951 2 2.89494 2 3.99951V14.9995C2 16.1041 2.89543 16.9995 4 16.9995H20C21.1046 16.9995 22 16.1041 22 14.9995V3.99951C22 2.89494 21.1046 1.99951 20 1.99951H4ZM20 3.99951H4V14.9995H20V3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M7 18.9995C7 18.4472 7.44772 17.9995 8 17.9995H16C16.5523 17.9995 17 18.4472 17 18.9995C17 19.5518 16.5523 19.9995 16 19.9995H8C7.44772 19.9995 7 19.5518 7 18.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _liveTv!!
    }

private var _liveTv: ImageVector? = null
