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

public val Icons.Outlined.BatteryCare: ImageVector
    get() {
        if (_batteryCare != null) {
            return _batteryCare!!
        }
        _batteryCare =
            materialIcon(name = "Outlined.BatteryCare") {
            addPath(
                pathData = PathParser().parsePathString("M9.5 3C9.5 2.44772 9.94772 2 10.5 2H13.5C14.0523 2 14.5 2.44772 14.5 3V3.5H9.5V3ZM8 6H16V20H8L8 6ZM6 6C6 4.89543 6.89543 4 8 4H16C17.1046 4 18 4.89543 18 6V20C18 21.1046 17.1046 22 16 22H8C6.89543 22 6 21.1046 6 20V6ZM9.25 12.1017C9.25 11.6883 9.30592 11.2598 9.36163 10.9392L12 9.88672L14.637 10.9386C14.6934 11.2651 14.75 11.6974 14.75 12.1017C14.75 14.6644 12.8223 15.7865 12 16.1484C11.1777 15.7865 9.25 14.6644 9.25 12.1017Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _batteryCare!!
    }

private var _batteryCare: ImageVector? = null
