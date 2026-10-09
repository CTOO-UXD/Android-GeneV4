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

public val Icons.Outlined.LocalSchedule: ImageVector
    get() {
        if (_localSchedule != null) {
            return _localSchedule!!
        }
        _localSchedule =
            materialIcon(name = "Outlined.LocalSchedule") {
            addPath(
                pathData = PathParser().parsePathString("M7 7V3H9V7H7ZM15 7V3H17V7H15ZM10 6H14V4H10V6ZM6 4H4C2.89543 4 2 4.89543 2 6V18C2 19.1046 2.89543 20 4 20H20C21.1046 20 22 19.1046 22 18V6C22 4.89543 21.1046 4 20 4H18V6H20V18H4V6H6V4ZM7.13135 12H9.13135V10H7.13135V12ZM10.1313 12H17.1313V10H10.1313V12ZM7.13135 16H9.13135V14H7.13135V16ZM10.1313 16H17.1313V14H10.1313V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _localSchedule!!
    }

private var _localSchedule: ImageVector? = null
