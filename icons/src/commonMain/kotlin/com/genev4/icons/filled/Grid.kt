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

public val Icons.Filled.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid =
            materialIcon(name = "Filled.Grid") {
            addPath(
                pathData = PathParser().parsePathString("M17 7V3H15V7H9V3H7V7H3V9H7V15H3V17H7V21H9V17H15V21H17V17H21V15H17V9H21V7H17ZM15 15V9H9V15H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _grid!!
    }

private var _grid: ImageVector? = null
