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

public val Icons.Filled.LteMobiledata: ImageVector
    get() {
        if (_lteMobiledata != null) {
            return _lteMobiledata!!
        }
        _lteMobiledata =
            materialIcon(name = "Filled.LteMobiledata") {
            addPath(
                pathData = PathParser().parsePathString("M4 16V8H6V14H9V16H4ZM11 16V10H9V8H15V10H13V16H11ZM16 16V8H21V10H18V11H21V13H18V14H21V16H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _lteMobiledata!!
    }

private var _lteMobiledata: ImageVector? = null
