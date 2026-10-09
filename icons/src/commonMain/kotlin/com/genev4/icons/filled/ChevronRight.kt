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

public val Icons.Filled.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight =
            materialIcon(name = "Filled.ChevronRight") {
            addPath(
                pathData = PathParser().parsePathString("M9.99827 18.0183L14.6015 13.4152C15.3825 12.6341 15.3825 11.3678 14.6015 10.5867L9.9982 5.98346L8.58398 7.39767L13.1873 12.0009L8.58406 16.6041L9.99827 18.0183Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
