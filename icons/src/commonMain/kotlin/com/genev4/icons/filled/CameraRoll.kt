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

public val Icons.Filled.CameraRoll: ImageVector
    get() {
        if (_cameraRoll != null) {
            return _cameraRoll!!
        }
        _cameraRoll =
            materialIcon(name = "Filled.CameraRoll") {
            addPath(
                pathData = PathParser().parsePathString("M5 1.99951C5 1.44723 5.44772 0.999512 6 0.999512H10C10.5523 0.999512 11 1.44723 11 1.99951V2.99951H12C13.1046 2.99951 14 3.89494 14 4.99951H21C21.5523 4.99951 22 5.44723 22 5.99951V18.9995C22 19.5518 21.5523 19.9995 21 19.9995H14C14 21.1041 13.1046 21.9995 12 21.9995H4C2.89543 21.9995 2 21.1041 2 19.9995V4.99951C2 3.89494 2.89543 2.99951 4 2.99951H5V1.99951ZM9 8V10H11V8H9ZM9 15V17H11V15H9ZM15 15V17H13V15H15ZM13 8V10H15V8H13ZM19 17H17V15H19V17ZM17 10H19V8H17V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cameraRoll!!
    }

private var _cameraRoll: ImageVector? = null
