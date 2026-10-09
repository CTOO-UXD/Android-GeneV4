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

public val Icons.Filled.ModeNight: ImageVector
    get() {
        if (_modeNight != null) {
            return _modeNight!!
        }
        _modeNight =
            materialIcon(name = "Filled.ModeNight") {
            addPath(
                pathData = PathParser().parsePathString("M6.16461 2.57001C7.20908 2.20059 8.33217 2 9.49994 2C15.0228 2 19.4999 6.47715 19.4999 12C19.4999 17.5228 15.0228 22 9.49994 22C8.33217 22 7.20908 21.7994 6.16461 21.43C5.82491 21.3098 5.57611 21.0162 5.51336 20.6614C5.4506 20.3066 5.58358 19.9454 5.86146 19.716C8.08529 17.8803 9.49994 15.1058 9.49994 12C9.49994 8.89423 8.08529 6.11972 5.86146 4.28397C5.58358 4.05458 5.4506 3.69343 5.51335 3.33861C5.57611 2.98379 5.82491 2.69017 6.16461 2.57001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _modeNight!!
    }

private var _modeNight: ImageVector? = null
