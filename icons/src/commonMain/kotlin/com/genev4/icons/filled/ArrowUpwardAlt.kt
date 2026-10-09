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

public val Icons.Filled.ArrowUpwardAlt: ImageVector
    get() {
        if (_arrowUpwardAlt != null) {
            return _arrowUpwardAlt!!
        }
        _arrowUpwardAlt =
            materialIcon(name = "Filled.ArrowUpwardAlt") {
            addPath(
                pathData = PathParser().parsePathString("M10.5866 6.41107L6.00098 10.9967L7.41519 12.4109L11.0009 8.82518L11.0008 17.998L13.0008 17.998L13.0009 8.82539L16.5899 12.4144L18.0041 11.0002L13.415 6.41107C12.6339 5.63003 11.3676 5.63002 10.5866 6.41107Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowUpwardAlt!!
    }

private var _arrowUpwardAlt: ImageVector? = null
