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

public val Icons.Outlined.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power =
            materialIcon(name = "Outlined.Power") {
            addPath(
                pathData = PathParser().parsePathString("M13 2H11V11.0001H13V2ZM3 11.9999C3 8.72304 4.75123 5.85519 7.36884 4.28123L8.39799 5.99649C6.36207 7.22069 5 9.45123 5 11.9999C5 15.8659 8.13401 19 12 19C15.866 19 19 15.8659 19 11.9999C19 9.45123 17.6379 7.22069 15.602 5.99649L16.6312 4.28123C19.2488 5.85519 21 8.72304 21 11.9999C21 16.9705 16.9706 21 12 21C7.02944 21 3 16.9705 3 11.9999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _power!!
    }

private var _power: ImageVector? = null
