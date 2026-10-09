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

public val Icons.Filled.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi =
            materialIcon(name = "Filled.Wifi") {
            addPath(
                pathData = PathParser().parsePathString("M13.1594 19.6298L22.9813 8.02216C20.019 5.51307 16.1862 4 12 4C7.81388 4 3.98111 5.51307 1.0188 8.02216L10.8408 19.63C11.1678 19.863 11.5679 20 12 20C12.4322 20 12.8324 19.8629 13.1594 19.6298Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _wifi!!
    }

private var _wifi: ImageVector? = null
