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

public val Icons.Outlined.SmsHistory: ImageVector
    get() {
        if (_smsHistory != null) {
            return _smsHistory!!
        }
        _smsHistory =
            materialIcon(name = "Outlined.SmsHistory") {
            addPath(
                pathData = PathParser().parsePathString("M11 6.5V10.0833L8.45215 12.6099L9.86042 14.0301L13 10.9167V6.5H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.20711 21.7929C3.0745 21.9255 2.89464 22 2.70711 22C2.31658 22 2 21.6834 2 21.2929V6C2 3.79086 3.79086 2 6 2H18C20.2091 2 22 3.79086 22 6V14C22 16.2091 20.2091 18 18 18H7L3.20711 21.7929ZM6.17157 16H18C19.1046 16 20 15.1046 20 14V6C20 4.89543 19.1046 4 18 4H6C4.89543 4 4 4.89543 4 6V18.1716L6.17157 16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _smsHistory!!
    }

private var _smsHistory: ImageVector? = null
