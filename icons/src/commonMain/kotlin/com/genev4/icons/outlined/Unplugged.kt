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

public val Icons.Outlined.Unplugged: ImageVector
    get() {
        if (_unplugged != null) {
            return _unplugged!!
        }
        _unplugged =
            materialIcon(name = "Outlined.Unplugged") {
            addPath(
                pathData = PathParser().parsePathString("M8 4C8 6.20914 9.79086 8 12 8C14.2091 8 16 6.20914 16 4H18C18 7.31371 15.3137 10 12 10C8.68629 10 6 7.31371 6 4H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 14C8.68629 14 6 16.6863 6 20H4C4 15.5817 7.58172 12 12 12C16.4183 12 20 15.5817 20 20H18C18 16.6863 15.3137 14 12 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _unplugged!!
    }

private var _unplugged: ImageVector? = null
