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

public val Icons.Filled.Favorite: ImageVector
    get() {
        if (_favorite != null) {
            return _favorite!!
        }
        _favorite =
            materialIcon(name = "Filled.Favorite") {
            addPath(
                pathData = PathParser().parsePathString("M16.5 3.20471C19.8137 3.20471 22.5 5.891 22.5 9.20471C22.5 9.30434 22.4976 9.4034 22.4928 9.50184C22.4974 9.56687 22.5 9.6349 22.5 9.70471C22.5 13.6415 19.3482 17.5469 13.0446 21.4209C12.4041 21.8152 11.5966 21.8152 10.9554 21.4222C4.65206 17.5471 1.5 13.6417 1.5 9.70471C1.5 9.63536 1.50265 9.56778 1.5079 9.50192C1.50244 9.40407 1.5 9.30468 1.5 9.20471C1.5 5.891 4.18629 3.20471 7.5 3.20471C9.29203 3.20471 10.9006 3.99034 12 5.23595C13.0994 3.99034 14.708 3.20471 16.5 3.20471Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _favorite!!
    }

private var _favorite: ImageVector? = null
