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

public val Icons.Filled.Storage: ImageVector
    get() {
        if (_storage != null) {
            return _storage!!
        }
        _storage =
            materialIcon(name = "Filled.Storage") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8C22 10.2091 20.2091 12 18 12H6C3.79086 12 2 10.2091 2 8C2 5.79086 3.79086 4 6 4H18ZM18 7H16V9H18V7ZM16 16H18V18H16V16ZM18 13C20.2091 13 22 14.7909 22 17C22 19.2091 20.2091 21 18 21H6C3.79086 21 2 19.2091 2 17C2 14.7909 3.79086 13 6 13H18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _storage!!
    }

private var _storage: ImageVector? = null
