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

public val Icons.Filled.EdgeLights: ImageVector
    get() {
        if (_edgeLights != null) {
            return _edgeLights!!
        }
        _edgeLights =
            materialIcon(name = "Filled.EdgeLights") {
            addPath(
                pathData = PathParser().parsePathString("M15.5 3C16.6046 3 17.5 3.89543 17.5 5V19C17.5 20.1046 16.6046 21 15.5 21H8.5C7.39543 21 6.5 20.1046 6.5 19V5C6.5 3.89543 7.39543 3 8.5 3H15.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.5 4C4.94772 4 4.5 4.44772 4.5 5V19C4.5 19.5523 4.94772 20 5.5 20V4ZM18.5 4C19.0523 4 19.5 4.44772 19.5 5V19C19.5 19.5523 19.0523 20 18.5 20V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _edgeLights!!
    }

private var _edgeLights: ImageVector? = null
