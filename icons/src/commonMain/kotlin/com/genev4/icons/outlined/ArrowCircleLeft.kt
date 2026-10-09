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

public val Icons.Outlined.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft =
            materialIcon(name = "Outlined.ArrowCircleLeft") {
            addPath(
                pathData = PathParser().parsePathString("M9.15116 13.4129L13.1534 17.4152L14.5676 16.0009L10.5654 11.9987L14.5676 7.99649L13.1534 6.58228L9.15116 10.5845C8.37011 11.3656 8.37011 12.6319 9.15116 13.4129Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4.92942 19.0698C1.02418 15.1645 1.02418 8.83289 4.92942 4.92765C8.83466 1.02241 15.1663 1.02241 19.0716 4.92765C22.9768 8.83289 22.9768 15.1645 19.0716 19.0698C15.1663 22.975 8.83466 22.975 4.92942 19.0698ZM6.34363 17.6556C3.21944 14.5314 3.21944 9.46606 6.34363 6.34186C9.46783 3.21767 14.5331 3.21767 17.6573 6.34186C20.7815 9.46606 20.7815 14.5314 17.6573 17.6556C14.5331 20.7798 9.46783 20.7798 6.34363 17.6556Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
