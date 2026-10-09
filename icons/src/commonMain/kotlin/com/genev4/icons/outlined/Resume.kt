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

public val Icons.Outlined.Resume: ImageVector
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume =
            materialIcon(name = "Outlined.Resume") {
            addPath(
                pathData = PathParser().parsePathString("M3 5V19H5V5H3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 16.8672V7.13199C9 5.57741 10.6959 4.61718 12.029 5.41701L20.1417 10.2846C21.4364 11.0614 21.4364 12.9378 20.1417 13.7146L12.029 18.5822C10.6959 19.382 9 18.4218 9 16.8672ZM11 16.8672V7.13199L19.1127 11.9996L11 16.8672Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _resume!!
    }

private var _resume: ImageVector? = null
