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

public val Icons.Outlined.EdgeLights: ImageVector
    get() {
        if (_edgeLights != null) {
            return _edgeLights!!
        }
        _edgeLights =
            materialIcon(name = "Outlined.EdgeLights") {
            addPath(
                pathData = PathParser().parsePathString("M15.5 2.99707C16.6046 2.99707 17.5 3.8925 17.5 4.99707V18.9971C17.5 20.1016 16.6046 20.9971 15.5 20.9971H8.5C7.39543 20.9971 6.5 20.1016 6.5 18.9971V4.99707C6.5 3.8925 7.39543 2.99707 8.5 2.99707H15.5ZM15.5 4.99707H8.5V18.9971H15.5V4.99707Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.5 3.99707C4.94772 3.99707 4.5 4.44479 4.5 4.99707V18.9971C4.5 19.5494 4.94772 19.9971 5.5 19.9971V3.99707ZM18.5 3.99707C19.0523 3.99707 19.5 4.44479 19.5 4.99707V18.9971C19.5 19.5494 19.0523 19.9971 18.5 19.9971V3.99707Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _edgeLights!!
    }

private var _edgeLights: ImageVector? = null
