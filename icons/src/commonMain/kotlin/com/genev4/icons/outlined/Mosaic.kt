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

public val Icons.Outlined.Mosaic: ImageVector
    get() {
        if (_mosaic != null) {
            return _mosaic!!
        }
        _mosaic =
            materialIcon(name = "Outlined.Mosaic") {
            addPath(
                pathData = PathParser().parsePathString("M21 7C21 4.79086 19.2091 3 17 3H12H7C4.92893 3 3.22549 4.574 3.02065 6.59102C3.007 6.72549 3 6.86193 3 7V12V17C3 19.2091 4.79086 21 7 21H12H17C19.2091 21 21 19.2091 21 17V12V7ZM19 12V7C19 5.89543 18.1046 5 17 5H12V12H5V17C5 18.1046 5.89543 19 7 19H12V12H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mosaic!!
    }

private var _mosaic: ImageVector? = null
