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

public val Icons.Filled.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) {
            return _aspectRatio!!
        }
        _aspectRatio =
            materialIcon(name = "Filled.AspectRatio") {
            addPath(
                pathData = PathParser().parsePathString("M6 3.99963C3.79086 3.99963 2 5.79049 2 7.99963V15.9996C2 18.2088 3.79086 19.9996 6 19.9996H18C20.2091 19.9996 22 18.2088 22 15.9996V7.99963C22 5.79049 20.2091 3.99963 18 3.99963H6ZM5 7.99963C5 7.44735 5.44772 6.99963 6 6.99963H10V8.99963H7V11.9996H5V7.99963ZM19 15.9996C19 16.5519 18.5523 16.9996 18 16.9996H14V14.9996H17V11.9996H19V15.9996Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
