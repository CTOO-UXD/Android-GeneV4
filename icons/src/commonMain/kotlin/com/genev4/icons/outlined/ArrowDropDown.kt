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

public val Icons.Outlined.ArrowDropDown: ImageVector
    get() {
        if (_arrowDropDown != null) {
            return _arrowDropDown!!
        }
        _arrowDropDown =
            materialIcon(name = "Outlined.ArrowDropDown") {
            addPath(
                pathData = PathParser().parsePathString("M10.5862 14.6019L5.98291 9.99866L7.39712 8.58444L12.0004 13.1877L16.6036 8.58451L18.0178 9.99873L13.4146 14.6019C12.6336 15.383 11.3672 15.383 10.5862 14.6019Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowDropDown!!
    }

private var _arrowDropDown: ImageVector? = null
