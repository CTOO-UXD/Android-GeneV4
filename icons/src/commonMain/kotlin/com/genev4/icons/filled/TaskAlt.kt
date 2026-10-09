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

public val Icons.Filled.TaskAlt: ImageVector
    get() {
        if (_taskAlt != null) {
            return _taskAlt!!
        }
        _taskAlt =
            materialIcon(name = "Filled.TaskAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12 22C17.5228 22 22 17.5228 22 12C22 10.3375 21.5943 8.76984 20.8766 7.39047L12.6218 15.6452C12.2313 16.0358 11.5981 16.0358 11.2076 15.6452L6.95488 11.3925L8.36909 9.97832L11.9147 13.5239L19.7539 5.6847C17.9202 3.43601 15.1278 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _taskAlt!!
    }

private var _taskAlt: ImageVector? = null
