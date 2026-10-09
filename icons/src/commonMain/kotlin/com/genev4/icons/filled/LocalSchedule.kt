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

public val Icons.Filled.LocalSchedule: ImageVector
    get() {
        if (_localSchedule != null) {
            return _localSchedule!!
        }
        _localSchedule =
            materialIcon(name = "Filled.LocalSchedule") {
            addPath(
                pathData = PathParser().parsePathString("M9 4H15V3H17V4H20C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H4C2.89543 20 2 19.1046 2 18V6C2 4.89543 2.89543 4 4 4H7V3H9V4ZM7 12H9V10H7V12ZM10 12H17V10H10V12ZM7 16H9V14H7V16ZM10 16H17V14H10V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _localSchedule!!
    }

private var _localSchedule: ImageVector? = null
