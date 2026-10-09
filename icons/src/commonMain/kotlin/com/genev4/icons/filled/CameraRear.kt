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

public val Icons.Filled.CameraRear: ImageVector
    get() {
        if (_cameraRear != null) {
            return _cameraRear!!
        }
        _cameraRear =
            materialIcon(name = "Filled.CameraRear") {
            addPath(
                pathData = PathParser().parsePathString("M6.72125 16.4977L5 16.4977V3.99951C5 2.89494 5.89543 1.99951 7 1.99951H17C18.1046 1.99951 19 2.89494 19 3.99951V16.9995H13.5372L9.87624 13.3408L6.72125 16.4977ZM9 7.99951C10.1046 7.99951 11 7.10408 11 5.99951C11 4.89494 10.1046 3.99951 9 3.99951C7.89543 3.99951 7 4.89494 7 5.99951C7 7.10408 7.89543 7.99951 9 7.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M9.87689 15.4622L12.7069 18.2904C12.8946 18.478 13 18.7324 13 18.9977C13 19.263 12.8946 19.5175 12.7069 19.705L9.87693 22.5336L8.46307 21.1191L9.58494 19.9978L5.00024 19.9978V17.9978L9.58475 17.9978L8.46311 16.8768L9.87689 15.4622Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 19.9995H14V17.9995H19V19.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cameraRear!!
    }

private var _cameraRear: ImageVector? = null
