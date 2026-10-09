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

public val Icons.Filled.CameraFront: ImageVector
    get() {
        if (_cameraFront != null) {
            return _cameraFront!!
        }
        _cameraFront =
            materialIcon(name = "Filled.CameraFront") {
            addPath(
                pathData = PathParser().parsePathString("M12 10.7495C13.5188 10.7495 14.75 9.51829 14.75 7.99951C14.75 6.48073 13.5188 5.24951 12 5.24951C10.4812 5.24951 9.25 6.48073 9.25 7.99951C9.25 9.51829 10.4812 10.7495 12 10.7495Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6.72125 16.4977L5 16.4977V3.99951C5 2.89494 5.89543 1.99951 7 1.99951H17C18.1046 1.99951 19 2.89494 19 3.99951V16.9995H13.5372L9.87624 13.3408L6.72125 16.4977ZM7 3.99951H17V13.5493C15.8794 12.647 14.2567 11.9995 12 11.9995C9.74331 11.9995 8.12056 12.647 7 13.5493V3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M9.87689 15.4622L12.7069 18.2904C12.8946 18.478 13 18.7324 13 18.9977C13 19.263 12.8946 19.5175 12.7069 19.705L9.87693 22.5336L8.46307 21.1191L9.58494 19.9978L5.00024 19.9978V17.9978L9.58475 17.9978L8.46311 16.8768L9.87689 15.4622Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 19.9995H19V17.9995H14V19.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cameraFront!!
    }

private var _cameraFront: ImageVector? = null
