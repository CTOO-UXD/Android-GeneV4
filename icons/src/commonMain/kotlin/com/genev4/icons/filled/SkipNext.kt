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

public val Icons.Filled.SkipNext: ImageVector
    get() {
        if (_skipNext != null) {
            return _skipNext!!
        }
        _skipNext =
            materialIcon(name = "Filled.SkipNext") {
            addPath(
                pathData = PathParser().parsePathString("M19 5H21V19H19V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.1417 13.715C14.4232 13.5461 14.6588 13.3105 14.8277 13.029C15.396 12.0818 15.0889 10.8533 14.1417 10.285L6.02899 5.41739C5.71816 5.2309 5.36249 5.13238 5 5.13238C3.89543 5.13238 3 6.02781 3 7.13238V16.8676C3 17.2301 3.09852 17.5858 3.28501 17.8966C3.85331 18.8438 5.08183 19.1509 6.02899 18.5826L14.1417 13.715Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _skipNext!!
    }

private var _skipNext: ImageVector? = null
