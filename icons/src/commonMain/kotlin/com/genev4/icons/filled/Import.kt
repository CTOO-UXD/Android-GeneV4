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

public val Icons.Filled.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import =
            materialIcon(name = "Filled.Import") {
            addPath(
                pathData = PathParser().parsePathString("M10.9988 4H6C3.79086 4 2 5.79086 2 8V16C2 18.2091 3.79086 20 6 20H18C20.2091 20 22 18.2091 22 16V8C22 5.79086 20.2091 4 18 4H12.9987L12.9981 12.2569L15.5344 9.72181L16.9486 11.136L12.7059 15.3787C12.3154 15.7692 11.6822 15.7692 11.2917 15.3787L7.04907 11.136L8.46329 9.72181L10.9984 12.2583L10.9988 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _import!!
    }

private var _import: ImageVector? = null
