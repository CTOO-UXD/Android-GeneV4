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

public val Icons.Outlined.CheckIndeterminateSmall: ImageVector
    get() {
        if (_checkIndeterminateSmall != null) {
            return _checkIndeterminateSmall!!
        }
        _checkIndeterminateSmall =
            materialIcon(name = "Outlined.CheckIndeterminateSmall") {
            addPath(
                pathData = PathParser().parsePathString("M6 13V11H18V13H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _checkIndeterminateSmall!!
    }

private var _checkIndeterminateSmall: ImageVector? = null
