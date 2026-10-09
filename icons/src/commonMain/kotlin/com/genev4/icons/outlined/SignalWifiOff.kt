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

public val Icons.Outlined.SignalWifiOff: ImageVector
    get() {
        if (_signalWifiOff != null) {
            return _signalWifiOff!!
        }
        _signalWifiOff =
            materialIcon(name = "Outlined.SignalWifiOff") {
            addPath(
                pathData = PathParser().parsePathString("M14.8286 17.6571L19.7781 22.6066L21.1923 21.1924L2.80752 2.80762L1.39331 4.22183L3.46571 6.29423C3.17856 6.46122 2.89676 6.63638 2.62061 6.8194C2.06734 7.18607 1.53677 7.58425 1.03146 8.01139L1.01855 8.02231L10.8406 19.6302C11.1676 19.8631 11.5677 20.0002 11.9998 20.0002C12.4319 20.0002 12.8321 19.8631 13.1592 19.63L14.8286 17.6571ZM13.4094 16.238L4.93544 7.76396C4.5895 7.94903 4.25166 8.14728 3.92255 8.35806L11.9998 17.9039L13.4094 16.238Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.9811 8.02231L17.4211 14.5931L16.002 13.174L20.0771 8.35806C17.7457 6.86491 14.9754 6.00015 11.9998 6.00015C11.0098 6.00015 10.0426 6.09587 9.10664 6.27861L7.4452 4.61717C8.89476 4.21505 10.4222 4.00015 11.9998 4.00015C15.4664 4.00015 18.6907 5.03778 21.379 6.8194C21.9323 7.18607 22.4628 7.58425 22.9681 8.01139L22.9811 8.02231Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _signalWifiOff!!
    }

private var _signalWifiOff: ImageVector? = null
