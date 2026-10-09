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

public val Icons.Filled.TimerAuto: ImageVector
    get() {
        if (_timerAuto != null) {
            return _timerAuto!!
        }
        _timerAuto =
            materialIcon(name = "Filled.TimerAuto") {
            addPath(
                pathData = PathParser().parsePathString("M15.0001 3H9.00012V1H15.0001V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.0142 10.1265L13.1426 13.0343H10.8858L12.0142 10.1265Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.63604 19.364C9.15076 22.8787 14.8492 22.8787 18.364 19.364C21.6397 16.0882 21.8624 10.9155 19.0321 7.3818L20.485 5.92886L19.0708 4.51465L17.6178 5.96762C14.0841 3.13758 8.91169 3.36039 5.63604 6.63604C2.12132 10.1508 2.12132 15.8492 5.63604 19.364ZM10.3541 14.3689H13.6634L14.3035 15.9964H16.0287L12.8388 8.40137H11.2113L8.03223 15.9964H9.72483L10.3541 14.3689Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timerAuto!!
    }

private var _timerAuto: ImageVector? = null
