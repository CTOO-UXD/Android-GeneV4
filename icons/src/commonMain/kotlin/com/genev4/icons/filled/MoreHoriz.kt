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

public val Icons.Filled.MoreHoriz: ImageVector
    get() {
        if (_moreHoriz != null) {
            return _moreHoriz!!
        }
        _moreHoriz =
            materialIcon(name = "Filled.MoreHoriz") {
            addPath(
                pathData = PathParser().parsePathString("M17 12C17 12.9665 17.7835 13.75 18.75 13.75C19.7165 13.75 20.5 12.9665 20.5 12C20.5 11.0335 19.7165 10.25 18.75 10.25C17.7835 10.25 17 11.0335 17 12ZM10.25 12C10.25 12.9665 11.0335 13.75 12 13.75C12.9665 13.75 13.75 12.9665 13.75 12C13.75 11.0335 12.9665 10.25 12 10.25C11.0335 10.25 10.25 11.0335 10.25 12ZM3.5 12C3.5 12.9665 4.2835 13.75 5.25 13.75C6.2165 13.75 7 12.9665 7 12C7 11.0335 6.2165 10.25 5.25 10.25C4.2835 10.25 3.5 11.0335 3.5 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _moreHoriz!!
    }

private var _moreHoriz: ImageVector? = null
