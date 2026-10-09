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

public val Icons.Outlined.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock =
            materialIcon(name = "Outlined.Lock") {
            addPath(
                pathData = PathParser().parsePathString("M17.3182 6.31818V9H18C19.1046 9 20 9.89543 20 11V19C20 20.1046 19.1046 21 18 21H6C4.89543 21 4 20.1046 4 19V11C4 9.89543 4.89543 9 6 9H6.68182V6.31818C6.68182 3.38103 9.06285 1 12 1C14.9372 1 17.3182 3.38103 17.3182 6.31818ZM8.68182 9H15.3182V6.31818C15.3182 4.4856 13.8326 3 12 3C10.1674 3 8.68182 4.4856 8.68182 6.31818V9ZM6 19V11H18V19H6ZM11 17V13H13V17H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lock!!
    }

private var _lock: ImageVector? = null
