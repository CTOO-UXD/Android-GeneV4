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

public val Icons.Filled.DesktopPc: ImageVector
    get() {
        if (_desktopPc != null) {
            return _desktopPc!!
        }
        _desktopPc =
            materialIcon(name = "Filled.DesktopPc") {
            addPath(
                pathData = PathParser().parsePathString("M18 6C18 4.89543 17.1046 4 16 4H4C2.89543 4 2 4.89543 2 6V14C2 15.1046 2.89543 16 4 16H9L8.999 18H6V20H14V19V18H11V16H14V10C14 8.89543 14.8954 8 16 8H18V6ZM15 16V19C15 19.5523 15.4477 20 16 20H21C21.5523 20 22 19.5523 22 19V10C22 9.44772 21.5523 9 21 9H18H16C15.4477 9 15 9.44771 15 10V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _desktopPc!!
    }

private var _desktopPc: ImageVector? = null
