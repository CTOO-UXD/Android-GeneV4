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

public val Icons.Outlined.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive =
            materialIcon(name = "Outlined.Archive") {
            addPath(
                pathData = PathParser().parsePathString("M9 12.9994H15V10.9994H9V12.9994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 7.99939C3 8.55167 3.44772 8.99939 4 8.99939V18.9994C4 20.104 4.89543 20.9994 6 20.9994H18C19.1046 20.9994 20 20.104 20 18.9994V8.99939C20.5523 8.99939 21 8.55167 21 7.99939V4.99939C21 3.89482 20.1046 2.99939 19 2.99939H5C3.89543 2.99939 3 3.89482 3 4.99939V7.99939ZM19 6.99939V4.99939L5 4.99939V6.99939H19ZM6 18.9994V8.99939H18V18.9994H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _archive!!
    }

private var _archive: ImageVector? = null
