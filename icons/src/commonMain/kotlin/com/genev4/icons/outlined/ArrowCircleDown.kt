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

public val Icons.Outlined.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) {
            return _arrowCircleDown!!
        }
        _arrowCircleDown =
            materialIcon(name = "Outlined.ArrowCircleDown") {
            addPath(
                pathData = PathParser().parsePathString("M13.4144 14.8481L17.4166 10.8459L16.0024 9.43167L12.0002 13.4339L7.99796 9.43167L6.58375 10.8459L10.586 14.8481C11.367 15.6292 12.6333 15.6292 13.4144 14.8481Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.0711 19.0703C15.1658 22.9756 8.83418 22.9756 4.92893 19.0703C1.02369 15.1651 1.02369 8.83344 4.92893 4.9282C8.83418 1.02296 15.1658 1.02296 19.0711 4.9282C22.9763 8.83344 22.9763 15.1651 19.0711 19.0703ZM17.6569 17.6561C14.5327 20.7803 9.46734 20.7803 6.34315 17.6561C3.21895 14.5319 3.21895 9.46661 6.34315 6.34241C9.46734 3.21822 14.5327 3.21822 17.6569 6.34241C20.781 9.46661 20.781 14.5319 17.6569 17.6561Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
