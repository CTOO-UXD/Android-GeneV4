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

public val Icons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive =
            materialIcon(name = "Filled.Archive") {
            addPath(
                pathData = PathParser().parsePathString("M3 4.99963V6.99963C3 7.55192 3.44772 7.99963 4 7.99963H20C20.5523 7.99963 21 7.55192 21 6.99963V4.99963C21 3.89506 20.1046 2.99963 19 2.99963H5C3.89543 2.99963 3 3.89506 3 4.99963Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 18.9996V8.99963H20V18.9996C20 20.1042 19.1046 20.9996 18 20.9996H6C4.89543 20.9996 4 20.1042 4 18.9996ZM15 12.9996H9V10.9996H15V12.9996Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _archive!!
    }

private var _archive: ImageVector? = null
