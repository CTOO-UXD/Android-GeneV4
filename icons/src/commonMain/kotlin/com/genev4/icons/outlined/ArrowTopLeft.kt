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

public val Icons.Outlined.ArrowTopLeft: ImageVector
    get() {
        if (_arrowTopLeft != null) {
            return _arrowTopLeft!!
        }
        _arrowTopLeft =
            materialIcon(name = "Outlined.ArrowTopLeft") {
            addPath(
                pathData = PathParser().parsePathString("M5.41342 7.58458L9.99901 2.99899L11.4132 4.41321L7.82756 7.99887L16.0002 7.9989C17.657 7.99891 19.0001 9.34205 19.0001 10.9989V19.9994H17.0001V10.9989C17.0001 10.4466 16.5524 9.9989 16.0002 9.9989L7.82771 9.99887L11.4168 13.5879L10.0025 15.0021L5.41342 10.413C4.63238 9.63196 4.63237 8.36563 5.41342 7.58458Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowTopLeft!!
    }

private var _arrowTopLeft: ImageVector? = null
