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

public val Icons.Filled.LtePlusMobiledata: ImageVector
    get() {
        if (_ltePlusMobiledata != null) {
            return _ltePlusMobiledata!!
        }
        _ltePlusMobiledata =
            materialIcon(name = "Filled.LtePlusMobiledata") {
            addPath(
                pathData = PathParser().parsePathString("M1 16V8H3V14H6V16H1ZM7 16V10H5V8H11V10H9V16H7ZM12 16V8H17V10H14V11H17V13H14V14H17V16H12ZM20 15V13H18V11H20V9H22V11H24V13H22V15H20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _ltePlusMobiledata!!
    }

private var _ltePlusMobiledata: ImageVector? = null
