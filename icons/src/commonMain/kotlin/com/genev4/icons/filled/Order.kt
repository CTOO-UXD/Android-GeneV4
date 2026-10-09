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

public val Icons.Filled.Order: ImageVector
    get() {
        if (_order != null) {
            return _order!!
        }
        _order =
            materialIcon(name = "Filled.Order") {
            addPath(
                pathData = PathParser().parsePathString("M21 7C21 4.79086 19.2091 3 17 3H7C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V7ZM7.00027 8.49732L17.0003 8.5L16.9997 10.5L6.99973 10.4973L7.00027 8.49732ZM14.0002 15.4987L13.9998 13.4987L6.99981 13.5L7.00019 15.5L14.0002 15.4987Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _order!!
    }

private var _order: ImageVector? = null
