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

public val Icons.Filled.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast =
            materialIcon(name = "Filled.Cast") {
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 4.89494 2.89543 3.99951 4 3.99951H20C21.1046 3.99951 22 4.89494 22 5.99951V17.9995C22 19.1041 21.1046 19.9995 20 19.9995L15 19.999C15 12.8193 9.1797 6.99902 2 6.99902V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 19.999C13 13.9239 8.07513 8.99902 2 8.99902V10.999C6.97056 10.999 11 15.0285 11 19.999H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 19.999C9 16.133 5.86599 12.999 2 12.999V14.999C4.76142 14.999 7 17.2376 7 19.999H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 16.999C3.65685 16.999 5 18.3422 5 19.999H4C2.89543 19.999 2 19.1036 2 17.999V16.999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cast!!
    }

private var _cast: ImageVector? = null
