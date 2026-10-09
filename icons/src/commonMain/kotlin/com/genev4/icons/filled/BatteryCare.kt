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

public val Icons.Filled.BatteryCare: ImageVector
    get() {
        if (_batteryCare != null) {
            return _batteryCare!!
        }
        _batteryCare =
            materialIcon(name = "Filled.BatteryCare") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 2C9.94772 2 9.5 2.44772 9.5 3V3.5H14.5V3C14.5 2.44772 14.0523 2 13.5 2H10.5ZM8 4C6.89543 4 6 4.89543 6 6V20C6 21.1046 6.89543 22 8 22H16C17.1046 22 18 21.1046 18 20V6C18 4.89543 17.1046 4 16 4H8ZM9.25 12.1017C9.25 11.6883 9.30592 11.2598 9.36163 10.9392L12 9.88672L14.637 10.9386C14.6934 11.2651 14.75 11.6974 14.75 12.1017C14.75 14.6644 12.8223 15.7865 12 16.1484C11.1777 15.7865 9.25 14.6644 9.25 12.1017Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryCare!!
    }

private var _batteryCare: ImageVector? = null
