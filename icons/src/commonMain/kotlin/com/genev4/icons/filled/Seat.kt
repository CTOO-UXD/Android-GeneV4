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

public val Icons.Filled.Seat: ImageVector
    get() {
        if (_seat != null) {
            return _seat!!
        }
        _seat =
            materialIcon(name = "Filled.Seat") {
            addPath(
                pathData = PathParser().parsePathString("M20 7C20 4.79086 18.2091 3 16 3H8C5.79086 3 4 4.79086 4 7V8.10352C2.84575 8.42998 2 9.49122 2 10.75V18C2 19.1046 2.89543 20 4 20H5V21H7V20H17V21H19V20H20C21.1046 20 22 19.1046 22 18V10.75C22 9.49122 21.1543 8.42998 20 8.10352V7ZM18 8.29985V7C18 5.94564 17.1841 5.08183 16.1493 5.00549L16 5H8C6.89543 5 6 5.89543 6 7V8.29985C6.89042 8.75503 7.5 9.68133 7.5 10.75V14H16.5V10.75C16.5 9.68133 17.1096 8.75503 18 8.29985Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _seat!!
    }

private var _seat: ImageVector? = null
