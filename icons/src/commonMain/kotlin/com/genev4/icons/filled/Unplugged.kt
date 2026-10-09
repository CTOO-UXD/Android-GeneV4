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

public val Icons.Filled.Unplugged: ImageVector
    get() {
        if (_unplugged != null) {
            return _unplugged!!
        }
        _unplugged =
            materialIcon(name = "Filled.Unplugged") {
            addPath(
                pathData = PathParser().parsePathString("M12 7.50147C10.067 7.50147 8.5 5.93446 8.5 4.00146H5.5C5.5 7.59132 8.41015 10.5015 12 10.5015C15.5899 10.5015 18.5 7.59132 18.5 4.00146H15.5C15.5 5.93446 13.933 7.50147 12 7.50147Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6.5 20.0015C6.5 16.9639 8.96243 14.5015 12 14.5015C15.0376 14.5015 17.5 16.9639 17.5 20.0015H20.5C20.5 15.307 16.6944 11.5015 12 11.5015C7.30558 11.5015 3.5 15.307 3.5 20.0015H6.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _unplugged!!
    }

private var _unplugged: ImageVector? = null
