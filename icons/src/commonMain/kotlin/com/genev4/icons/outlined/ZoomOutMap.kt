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

public val Icons.Outlined.ZoomOutMap: ImageVector
    get() {
        if (_zoomOutMap != null) {
            return _zoomOutMap!!
        }
        _zoomOutMap =
            materialIcon(name = "Outlined.ZoomOutMap") {
            addPath(
                pathData = PathParser().parsePathString("M9 3V5H6.414L10.1213 8.70711L8.70711 10.1213L5 6.414V9H3V4C3 3.44772 3.44772 3 4 3H9ZM8.70711 13.9198L10.1213 15.334L6.455 18.999L9 19V21H4C3.44772 21 3 20.5523 3 20V15H5V17.626L8.70711 13.9198ZM15.334 13.9198L19.041 17.627L19.0411 15.0411H21.0411V20.0411C21.0411 20.5934 20.5934 21.0411 20.0411 21.0411H15.0411V19.0411L17.627 19.041L13.9198 15.334L15.334 13.9198ZM20.0411 3.04112C20.5934 3.04112 21.0411 3.48883 21.0411 4.04112V9.04112H19.0411L19.041 6.413L15.334 10.1213L13.9198 8.70711L17.585 5.041L15.0411 5.04112V3.04112H20.0411Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _zoomOutMap!!
    }

private var _zoomOutMap: ImageVector? = null
