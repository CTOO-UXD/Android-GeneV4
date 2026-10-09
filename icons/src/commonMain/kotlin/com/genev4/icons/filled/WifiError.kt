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

public val Icons.Filled.WifiError: ImageVector
    get() {
        if (_wifiError != null) {
            return _wifiError!!
        }
        _wifiError =
            materialIcon(name = "Filled.WifiError") {
            addPath(
                pathData = PathParser().parsePathString("M12 18C12 18.691 12.1168 19.3548 12.3318 19.9726C12.2239 19.9906 12.113 20 12 20C11.5679 20 11.1678 19.863 10.8408 19.63L1.0188 8.02216C3.98111 5.51307 7.81388 4 12 4C16.1862 4 20.019 5.51307 22.9813 8.02216L19.4634 12.1797C18.995 12.0623 18.5048 12 18 12C14.6863 12 12 14.6863 12 18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 19V14H19V19H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 22V20H19V22H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _wifiError!!
    }

private var _wifiError: ImageVector? = null
