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

public val Icons.Outlined.Storage: ImageVector
    get() {
        if (_storage != null) {
            return _storage!!
        }
        _storage =
            materialIcon(name = "Outlined.Storage") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8C22 10.2091 20.2091 12 18 12H6C3.79086 12 2 10.2091 2 8C2 5.79086 3.79086 4 6 4H18ZM18 6H6C4.89543 6 4 6.89543 4 8C4 9.10457 4.89543 10 6 10H18C19.1046 10 20 9.10457 20 8C20 6.89543 19.1046 6 18 6ZM18 7H16V9H18V7ZM16 16H18V18H16V16ZM18 13C20.2091 13 22 14.7909 22 17C22 19.2091 20.2091 21 18 21H6C3.79086 21 2 19.2091 2 17C2 14.7909 3.79086 13 6 13H18ZM18 15H6C4.89543 15 4 15.8954 4 17C4 18.1046 4.89543 19 6 19H18C19.1046 19 20 18.1046 20 17C20 15.8954 19.1046 15 18 15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _storage!!
    }

private var _storage: ImageVector? = null
