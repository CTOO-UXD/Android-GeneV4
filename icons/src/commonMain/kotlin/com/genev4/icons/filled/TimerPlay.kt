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

public val Icons.Filled.TimerPlay: ImageVector
    get() {
        if (_timerPlay != null) {
            return _timerPlay!!
        }
        _timerPlay =
            materialIcon(name = "Filled.TimerPlay") {
            addPath(
                pathData = PathParser().parsePathString("M15 3H9V1H15V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.63604 19.364C9.15076 22.8787 14.8492 22.8787 18.364 19.364C21.6397 16.0882 21.8624 10.9155 19.0321 7.3818L20.485 5.92886L19.0708 4.51465L17.6178 5.96762C14.0841 3.13758 8.91169 3.36039 5.63604 6.63604C2.12132 10.1508 2.12132 15.8492 5.63604 19.364ZM9 9.80433C9 9.0189 9.86395 8.54006 10.53 8.95634L15.6432 12.1521C16.2699 12.5438 16.2699 13.4564 15.6432 13.8481L10.53 17.0438C9.86395 17.4601 9 16.9813 9 16.1958V9.80433Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timerPlay!!
    }

private var _timerPlay: ImageVector? = null
