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

public val Icons.Filled.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen =
            materialIcon(name = "Filled.LockOpen") {
            addPath(
                pathData = PathParser().parsePathString("M11.9998 0C9.06267 0 6.68164 2.38103 6.68164 5.31818V7H8.68164V5.31818C8.68164 3.4856 10.1672 2 11.9998 2C13.8324 2 15.318 3.4856 15.318 5.31818V9H6C4.89543 9 4 9.89543 4 11V19C4 20.1046 4.89543 21 6 21H18C19.1046 21 20 20.1046 20 19V11C20 9.89543 19.1046 9 18 9H17.318V5.31818C17.318 2.38103 14.937 0 11.9998 0ZM11 13V17H13V13H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
