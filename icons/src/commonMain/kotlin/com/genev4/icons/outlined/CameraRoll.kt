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

public val Icons.Outlined.CameraRoll: ImageVector
    get() {
        if (_cameraRoll != null) {
            return _cameraRoll!!
        }
        _cameraRoll =
            materialIcon(name = "Outlined.CameraRoll") {
            addPath(
                pathData = PathParser().parsePathString("M9 8V10H11V8H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 15V17H11V15H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 15V17H13V15H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 8V10H15V8H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 17H17V15H19V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 10H19V8H17V10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 21.9995C13.1046 21.9995 14 21.1041 14 19.9995H21C21.5523 19.9995 22 19.5518 22 18.9995V5.99951C22 5.44723 21.5523 4.99951 21 4.99951H14C14 3.89494 13.1046 2.99951 12 2.99951H11V1.99951C11 1.44723 10.5523 0.999512 10 0.999512H6C5.44772 0.999512 5 1.44723 5 1.99951V2.99951H4C2.89543 2.99951 2 3.89494 2 4.99951V19.9995C2 21.1041 2.89543 21.9995 4 21.9995H12ZM7 4.99951V2.99951H9V4.99951H12V6.99951H20V17.9995H12V19.9995H4V4.99951H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cameraRoll!!
    }

private var _cameraRoll: ImageVector? = null
