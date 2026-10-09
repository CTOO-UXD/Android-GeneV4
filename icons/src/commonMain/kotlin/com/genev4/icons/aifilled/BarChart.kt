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

public val Icons.AiFilled.BarChart: ImageVector
    get() {
        if (_barChart != null) {
            return _barChart!!
        }
        _barChart =
            materialIcon(name = "AiFilled.BarChart") {
            addPath(
                pathData = PathParser().parsePathString("M2 15C2 13.8954 2.89543 13 4 13H6C7.10457 13 8 13.8954 8 15V21H2V15ZM9 5C9 3.89543 9.89543 3 11 3H13C14.1046 3 15 3.89543 15 5V21H9V5ZM16 10C16 8.89543 16.8954 8 18 8H20C21.1046 8 22 8.89543 22 10V21H16V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _barChart!!
    }

private var _barChart: ImageVector? = null
