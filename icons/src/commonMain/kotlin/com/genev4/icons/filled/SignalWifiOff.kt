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

public val Icons.Filled.SignalWifiOff: ImageVector
    get() {
        if (_signalWifiOff != null) {
            return _signalWifiOff!!
        }
        _signalWifiOff =
            materialIcon(name = "Filled.SignalWifiOff") {
            addPath(
                pathData = PathParser().parsePathString("M14.8286 17.6571L19.7781 22.6066L21.1923 21.1924L2.80752 2.80762L1.39331 4.22183L3.46571 6.29423C2.59837 6.79865 1.77972 7.3776 1.01855 8.02231L10.8406 19.6302C11.1676 19.8631 11.5677 20.0002 11.9998 20.0002C12.4319 20.0002 12.8321 19.8631 13.1592 19.63L14.8286 17.6571Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.9811 8.02231L17.4211 14.5931L7.4452 4.61717C8.89476 4.21505 10.4222 4.00015 11.9998 4.00015C16.186 4.00015 20.0187 5.51322 22.9811 8.02231Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _signalWifiOff!!
    }

private var _signalWifiOff: ImageVector? = null
