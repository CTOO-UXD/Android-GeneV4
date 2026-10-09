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

public val Icons.Filled.PlayDisabled: ImageVector
    get() {
        if (_playDisabled != null) {
            return _playDisabled!!
        }
        _playDisabled =
            materialIcon(name = "Filled.PlayDisabled") {
            addPath(
                pathData = PathParser().parsePathString("M13.9821 16.8103L20.4853 23.3135L21.8995 21.8993L2.10049 2.10034L0.686279 3.51456L5 7.82828V18.6672C5 19.0297 5.09852 19.3853 5.28501 19.6962C5.85331 20.6433 7.08183 20.9505 8.02899 20.3822L13.9821 16.8103Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.1417 13.7145L17.5175 14.6891L6.28999 3.46163C6.51064 3.37782 6.74996 3.33194 7 3.33194C7.36249 3.33194 7.71816 3.43045 8.02899 3.61695L19.1417 10.2846C20.0889 10.8529 20.396 12.0814 19.8277 13.0285C19.6588 13.31 19.4232 13.5456 19.1417 13.7145Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _playDisabled!!
    }

private var _playDisabled: ImageVector? = null
