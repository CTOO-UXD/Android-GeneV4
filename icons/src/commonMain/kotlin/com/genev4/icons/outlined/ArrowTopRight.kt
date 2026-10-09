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

public val Icons.Outlined.ArrowTopRight: ImageVector
    get() {
        if (_arrowTopRight != null) {
            return _arrowTopRight!!
        }
        _arrowTopRight =
            materialIcon(name = "Outlined.ArrowTopRight") {
            addPath(
                pathData = PathParser().parsePathString("M18.5867 7.58458L14.0011 2.99899L12.5869 4.41321L16.1726 7.99887L7.99999 7.9989C6.34314 7.99891 5 9.34205 5 10.9989V19.9994H7V10.9989C7 10.4466 7.44771 9.9989 8 9.9989L16.1724 9.99887L12.5834 13.5879L13.9976 15.0021L18.5867 10.413C19.3678 9.63196 19.3678 8.36563 18.5867 7.58458Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowTopRight!!
    }

private var _arrowTopRight: ImageVector? = null
