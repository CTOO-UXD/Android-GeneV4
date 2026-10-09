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

public val Icons.Outlined.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown =
            materialIcon(name = "Outlined.ArrowDown") {
            addPath(
                pathData = PathParser().parsePathString("M10.5856 16.2338L3.98828 9.6365L5.40249 8.22229L11.9998 14.8196L11.2927 15.5267L18.597 8.22235L20.0113 9.63656L13.414 16.2338C12.633 17.0149 11.3666 17.0149 10.5856 16.2338Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
