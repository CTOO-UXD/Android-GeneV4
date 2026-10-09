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

public val Icons.Outlined.ZoomPan: ImageVector
    get() {
        if (_zoomPan != null) {
            return _zoomPan!!
        }
        _zoomPan =
            materialIcon(name = "Outlined.ZoomPan") {
            addPath(
                pathData = PathParser().parsePathString("M19 4C19.5523 4 20 4.44772 20 5V13H18V7.414L7.414 18H13V20H5C4.44772 20 4 19.5523 4 19V11H6V16.584L16.584 6H11V4H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _zoomPan!!
    }

private var _zoomPan: ImageVector? = null
