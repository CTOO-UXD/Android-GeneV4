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

public val Icons.Filled.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut =
            materialIcon(name = "Filled.ZoomOut") {
            addPath(
                pathData = PathParser().parsePathString("M16.9703 5.65662C19.855 8.54132 20.0762 13.0809 17.6338 16.2193L22.5074 21.0927L21.0932 22.5069L16.2196 17.6336C13.0811 20.0762 8.54138 19.8551 5.65662 16.9703C2.53243 13.8461 2.53243 8.78082 5.65662 5.65662C8.78082 2.53243 13.8461 2.53243 16.9703 5.65662ZM7.31348 12.3135H15.3135V10.3135H7.31348V12.3135Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
