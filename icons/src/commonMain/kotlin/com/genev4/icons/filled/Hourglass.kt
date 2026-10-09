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

public val Icons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass =
            materialIcon(name = "Filled.Hourglass") {
            addPath(
                pathData = PathParser().parsePathString("M20 2H18.5H5.5H4V4H5.5V6.5C5.5 8.81577 6.71102 10.8487 8.53432 12C6.71102 13.1513 5.5 15.1842 5.5 17.5V20H4V22H5.5H18.5H20V20H18.5V17.5C18.5 15.1842 17.289 13.1513 15.4657 12C17.289 10.8487 18.5 8.81577 18.5 6.5V4H20V2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
