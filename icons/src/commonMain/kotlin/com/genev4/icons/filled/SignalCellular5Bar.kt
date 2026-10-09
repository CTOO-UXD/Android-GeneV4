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

public val Icons.Filled.SignalCellular5Bar: ImageVector
    get() {
        if (_signalCellular5Bar != null) {
            return _signalCellular5Bar!!
        }
        _signalCellular5Bar =
            materialIcon(name = "Filled.SignalCellular5Bar") {
            addPath(
                pathData = PathParser().parsePathString("M21.0001 19V4.24537C21.0001 3.3796 19.9746 2.92291 19.3311 3.50208L2.93705 18.2567C2.25583 18.8698 2.68953 20 3.60602 20H20.0001C20.5523 20 21.0001 19.5523 21.0001 19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _signalCellular5Bar!!
    }

private var _signalCellular5Bar: ImageVector? = null
