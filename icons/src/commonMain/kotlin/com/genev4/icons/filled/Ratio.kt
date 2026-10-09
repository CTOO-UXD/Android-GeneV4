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

public val Icons.Filled.Ratio: ImageVector
    get() {
        if (_ratio != null) {
            return _ratio!!
        }
        _ratio =
            materialIcon(name = "Filled.Ratio") {
            addPath(
                pathData = PathParser().parsePathString("M11.0352 9.96973V21H5C3.34315 21 2 19.6569 2 18V9.96973H11.0352ZM14.7109 9.96973C14.904 9.96984 15.1084 10.055 15.2744 10.2393C15.4431 10.4265 15.5516 10.6973 15.5518 10.9971V21H12.9658V9.96973H14.7109ZM19 3C20.6569 3 22 4.34315 22 6V18C22 19.6569 20.6569 21 19 21H17.4834V10.9971C17.4833 10.2335 17.2109 9.48466 16.7021 8.91992C16.1906 8.35218 15.476 8.01378 14.7109 8.01367H2V6C2 4.34315 3.34315 3 5 3H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _ratio!!
    }

private var _ratio: ImageVector? = null
