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

public val Icons.Filled.TimerOff: ImageVector
    get() {
        if (_timerOff != null) {
            return _timerOff!!
        }
        _timerOff =
            materialIcon(name = "Filled.TimerOff") {
            addPath(
                pathData = PathParser().parsePathString("M15 3H9V1H15V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17.3847 20.2128C13.8598 22.8513 8.84028 22.5683 5.63592 19.364C2.43156 16.1596 2.1486 11.1401 4.78706 7.61519L1.39355 4.22168L2.80777 2.80747L21.1925 21.1922L19.7783 22.6065L17.3847 20.2128Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.032 7.3818C21.286 10.1959 21.6037 14.0495 19.9852 17.1567C14.6809 11.8524 12.1615 9.33291 7.84321 5.01467C10.9503 3.39624 14.8036 3.7139 17.6177 5.96762L19.0707 4.51465L20.4849 5.92886L19.032 7.3818Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _timerOff!!
    }

private var _timerOff: ImageVector? = null
