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

public val Icons.Filled.HighSpeedRail: ImageVector
    get() {
        if (_highSpeedRail != null) {
            return _highSpeedRail!!
        }
        _highSpeedRail =
            materialIcon(name = "Filled.HighSpeedRail") {
            addPath(
                pathData = PathParser().parsePathString("M6.65559 5C10.0118 5 13.2929 5.99345 16.0855 7.85514L17.8028 9H9.9146C9.0237 9 8.57753 10.0771 9.2075 10.7071L9.32882 10.8284C10.079 11.5786 11.0964 12 12.1572 12H21.9788C23.1511 13.4166 23.3128 15.4877 22.2404 17.0963C21.4475 18.2856 20.1127 19 18.6833 19H1V17V16H8L7 14H1V7V5H6.65559Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _highSpeedRail!!
    }

private var _highSpeedRail: ImageVector? = null
