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

public val Icons.Outlined.PlayArrow: ImageVector
    get() {
        if (_playArrow != null) {
            return _playArrow!!
        }
        _playArrow =
            materialIcon(name = "Outlined.PlayArrow") {
            addPath(
                pathData = PathParser().parsePathString("M19.8277 13.029C19.6588 13.3105 19.4232 13.5461 19.1417 13.715L8.02899 20.3826C7.08183 20.9509 5.85331 20.6438 5.28501 19.6966C5.09852 19.3858 5 19.0301 5 18.6676V5.3324C5 4.22783 5.89543 3.3324 7 3.3324C7.36249 3.3324 7.71816 3.43091 8.02899 3.61741L19.1417 10.285C20.0889 10.8533 20.396 12.0818 19.8277 13.029ZM18.112 11.999L7 5.3324V18.6676L18.112 11.999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _playArrow!!
    }

private var _playArrow: ImageVector? = null
