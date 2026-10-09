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

public val Icons.Outlined.TimerAuto: ImageVector
    get() {
        if (_timerAuto != null) {
            return _timerAuto!!
        }
        _timerAuto =
            materialIcon(name = "Outlined.TimerAuto") {
            addPath(
                pathData = PathParser().parsePathString("M15.0001 3H9.00012V1H15.0001V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M10.3541 14.3689H13.6634L14.3035 15.9964H16.0287L12.8388 8.40137H11.2113L8.03223 15.9964H9.72483L10.3541 14.3689ZM12.0142 10.1265L13.1426 13.0343H10.8858L12.0142 10.1265Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.364 19.364C14.8492 22.8787 9.15076 22.8787 5.63604 19.364C2.12132 15.8492 2.12132 10.1508 5.63604 6.63604C8.91169 3.36039 14.0841 3.13758 17.6178 5.96762L19.0708 4.51465L20.485 5.92886L19.0321 7.3818C21.8624 10.9155 21.6397 16.0882 18.364 19.364ZM16.9497 17.9497C14.2161 20.6834 9.78392 20.6834 7.05025 17.9497C4.31658 15.2161 4.31658 10.7839 7.05025 8.05025C9.78392 5.31658 14.2161 5.31658 16.9497 8.05025C19.6834 10.7839 19.6834 15.2161 16.9497 17.9497Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timerAuto!!
    }

private var _timerAuto: ImageVector? = null
