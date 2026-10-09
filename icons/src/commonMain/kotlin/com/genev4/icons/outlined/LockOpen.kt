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

public val Icons.Outlined.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen =
            materialIcon(name = "Outlined.LockOpen") {
            addPath(
                pathData = PathParser().parsePathString("M11 17V13H13V17H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6.68164 5.31818C6.68164 2.38103 9.06267 0 11.9998 0C14.937 0 17.318 2.38103 17.318 5.31818V9H18C19.1046 9 20 9.89543 20 11V19C20 20.1046 19.1046 21 18 21H6C4.89543 21 4 20.1046 4 19V11C4 9.89543 4.89543 9 6 9H15.318V5.31818C15.318 3.4856 13.8324 2 11.9998 2C10.1672 2 8.68164 3.4856 8.68164 5.31818V7H6.68164V5.31818ZM6 19V11H18V19H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
