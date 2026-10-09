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

public val Icons.Outlined.BurstMode: ImageVector
    get() {
        if (_burstMode != null) {
            return _burstMode!!
        }
        _burstMode =
            materialIcon(name = "Outlined.BurstMode") {
            addPath(
                pathData = PathParser().parsePathString("M1 5V19H3V5H1Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 19V5H7V19H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.5 11C14.3284 11 15 10.3284 15 9.5C15 8.67157 14.3284 8 13.5 8C12.6716 8 12 8.67157 12 9.5C12 10.3284 12.6716 11 13.5 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 5C9.89543 5 9 5.89543 9 7V17C9 18.1046 9.89543 19 11 19H21C22.1046 19 23 18.1046 23 17V7C23 5.89543 22.1046 5 21 5H11ZM21 7H11V17H12.0857L16.5859 12.4998C17.3669 11.7188 18.6332 11.7188 19.4143 12.4998L21 14.0856V7ZM21 17H14.9141L18.0001 13.9141L21 16.914V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _burstMode!!
    }

private var _burstMode: ImageVector? = null
