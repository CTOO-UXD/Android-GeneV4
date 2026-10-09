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

public val Icons.Outlined.CameraRear: ImageVector
    get() {
        if (_cameraRear != null) {
            return _cameraRear!!
        }
        _cameraRear =
            materialIcon(name = "Outlined.CameraRear") {
            addPath(
                pathData = PathParser().parsePathString("M7 3.99951H17V16.9995L19 17V3.99951C19 2.89494 18.1046 1.99951 17 1.99951H7C5.89543 1.99951 5 2.89494 5 3.99951V17L7 16.9995V3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 6.99951C12 8.10408 11.1046 8.99951 10 8.99951C8.89543 8.99951 8 8.10408 8 6.99951C8 5.89494 8.89543 4.99951 10 4.99951C11.1046 4.99951 12 5.89494 12 6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8.45 21.1L9.85 22.5L13.35 19L9.85 15.5L8.45 16.9L9.55 18H5V20H9.55L8.45 21.1Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 18H14V20H19V18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cameraRear!!
    }

private var _cameraRear: ImageVector? = null
