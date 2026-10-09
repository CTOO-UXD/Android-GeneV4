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

public val Icons.Filled.MenuExpand: ImageVector
    get() {
        if (_menuExpand != null) {
            return _menuExpand!!
        }
        _menuExpand =
            materialIcon(name = "Filled.MenuExpand") {
            addPath(
                pathData = PathParser().parsePathString("M7.41428 18.0349L12.0175 13.4317C12.7985 12.6506 12.7985 11.3843 12.0175 10.6033L7.41421 6L6 7.41421L10.6033 12.0175L6.00007 16.6207L7.41428 18.0349Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M17.0 2.0H17.0A1.0 1.0 0 0 1 18.0 3.0V21.0A1.0 1.0 0 0 1 17.0 22.0H17.0A1.0 1.0 0 0 1 16.0 21.0V3.0A1.0 1.0 0 0 1 17.0 2.0Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _menuExpand!!
    }

private var _menuExpand: ImageVector? = null
