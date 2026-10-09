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

public val Icons.Outlined.LockOpenRight: ImageVector
    get() {
        if (_lockOpenRight != null) {
            return _lockOpenRight!!
        }
        _lockOpenRight =
            materialIcon(name = "Outlined.LockOpenRight") {
            addPath(
                pathData = PathParser().parsePathString("M17.3182 5.31818C17.3182 2.38103 14.9372 0 12 0C9.06285 0 6.68182 2.38103 6.68182 5.31818V9H6C4.89543 9 4 9.89543 4 11V19C4 20.1046 4.89543 21 6 21H18C19.1046 21 20 20.1046 20 19V11C20 9.89543 19.1046 9 18 9H8.68182V5.31818C8.68182 3.4856 10.1674 2 12 2C13.8326 2 15.3182 3.4856 15.3182 5.31818V7H17.3182V5.31818ZM6 19V11H18V19H6ZM11 17V13H13V17H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lockOpenRight!!
    }

private var _lockOpenRight: ImageVector? = null
