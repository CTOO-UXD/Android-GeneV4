/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Entertainment: ImageVector
    get() {
        if (_entertainment != null) {
            return _entertainment!!
        }
        _entertainment =
            materialIcon(name = "AiFilled.Entertainment") {
            addPath(
                pathData = PathParser().parsePathString("M4.0 5.0H20.0A2.0 2.0 0 0 1 22.0 7.0V19.0A2.0 2.0 0 0 1 20.0 21.0H4.0A2.0 2.0 0 0 1 2.0 19.0V7.0A2.0 2.0 0 0 1 4.0 5.0Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.5356 2.46436L12.3537 5.64634C12.1584 5.8416 11.8418 5.8416 11.6466 5.64634L8.46458 2.46436").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M0.0 0.0H24.0V24.0H0.0Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _entertainment!!
    }

private var _entertainment: ImageVector? = null
