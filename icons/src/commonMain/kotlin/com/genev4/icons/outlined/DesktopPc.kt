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

public val Icons.Outlined.DesktopPc: ImageVector
    get() {
        if (_desktopPc != null) {
            return _desktopPc!!
        }
        _desktopPc =
            materialIcon(name = "Outlined.DesktopPc") {
            addPath(
                pathData = PathParser().parsePathString("M16 4C17.1046 4 18 4.89543 18 6V9H21C21.5523 9 22 9.44772 22 10V19C22 19.5523 21.5523 20 21 20H16C15.4477 20 15 19.5523 15 19V16H11V18H14V20H6V18H8.999L9 16H4C2.89543 16 2 15.1046 2 14V6C2 4.89543 2.89543 4 4 4H16ZM20 11H17V18H20V11ZM16 6H4V14H15V10C15 9.44805 15.4472 9.00055 15.999 9L16 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _desktopPc!!
    }

private var _desktopPc: ImageVector? = null
