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

public val Icons.Filled.SignalCellular3Bar: ImageVector
    get() {
        if (_signalCellular3Bar != null) {
            return _signalCellular3Bar!!
        }
        _signalCellular3Bar =
            materialIcon(name = "Filled.SignalCellular3Bar") {
            addPath(
                pathData = PathParser().parsePathString("M21.0001 4.24513C21.0001 3.37935 19.9746 2.92266 19.3311 3.50183L2.93705 18.2565C2.25583 18.8696 2.68953 19.9998 3.60602 19.9998H20.0001C20.5523 19.9998 21.0001 19.552 21.0001 18.9998V4.24513ZM15 10.0905L19.0001 6.49049V17.9998H15V10.0905Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _signalCellular3Bar!!
    }

private var _signalCellular3Bar: ImageVector? = null
