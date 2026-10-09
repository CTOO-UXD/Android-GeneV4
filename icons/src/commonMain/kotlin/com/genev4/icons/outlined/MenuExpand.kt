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

public val Icons.Outlined.MenuExpand: ImageVector
    get() {
        if (_menuExpand != null) {
            return _menuExpand!!
        }
        _menuExpand =
            materialIcon(name = "Outlined.MenuExpand") {
            addPath(
                pathData = PathParser().parsePathString("M6.41428 18.0349L11.0175 13.4317C11.7985 12.6506 11.7985 11.3843 11.0175 10.6033L6.41421 6L5 7.41421L9.60327 12.0175L5.00007 16.6207L6.41428 18.0349Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.0 2.0H16.0A1.0 1.0 0 0 1 17.0 3.0V21.0A1.0 1.0 0 0 1 16.0 22.0H16.0A1.0 1.0 0 0 1 15.0 21.0V3.0A1.0 1.0 0 0 1 16.0 2.0Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _menuExpand!!
    }

private var _menuExpand: ImageVector? = null
