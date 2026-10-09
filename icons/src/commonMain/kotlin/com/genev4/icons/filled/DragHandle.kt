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

public val Icons.Filled.DragHandle: ImageVector
    get() {
        if (_dragHandle != null) {
            return _dragHandle!!
        }
        _dragHandle =
            materialIcon(name = "Filled.DragHandle") {
            addPath(
                pathData = PathParser().parsePathString("M22 7H2V9H22V7ZM22 15H2V17H22V15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dragHandle!!
    }

private var _dragHandle: ImageVector? = null
