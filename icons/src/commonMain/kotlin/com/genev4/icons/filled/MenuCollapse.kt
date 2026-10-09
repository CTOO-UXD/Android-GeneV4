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

public val Icons.Filled.MenuCollapse: ImageVector
    get() {
        if (_menuCollapse != null) {
            return _menuCollapse!!
        }
        _menuCollapse =
            materialIcon(name = "Filled.MenuCollapse") {
            addPath(
                pathData = PathParser().parsePathString("M18.5857 18.0349L13.9825 13.4317C13.2015 12.6506 13.2015 11.3843 13.9825 10.6033L18.5858 6L20 7.41421L15.3967 12.0175L19.9999 16.6207L18.5857 18.0349Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M9.0 2.0H9.0A1.0 1.0 0 0 1 10.0 3.0V21.0A1.0 1.0 0 0 1 9.0 22.0H9.0A1.0 1.0 0 0 1 8.0 21.0V3.0A1.0 1.0 0 0 1 9.0 2.0Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _menuCollapse!!
    }

private var _menuCollapse: ImageVector? = null
