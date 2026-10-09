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

public val Icons.Filled.WindowMaximize: ImageVector
    get() {
        if (_windowMaximize != null) {
            return _windowMaximize!!
        }
        _windowMaximize =
            materialIcon(name = "Filled.WindowMaximize") {
            addPath(
                pathData = PathParser().parsePathString("M21 18.6C21 19.9255 19.9255 21 18.6 21H5.4C4.07452 21 3 19.9255 3 18.6V5.4C3 4.07452 4.07452 3 5.4 3H18.6C19.9255 3 21 4.07452 21 5.4V18.6ZM18.6 18.6H5.4V5.4H18.6V18.6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _windowMaximize!!
    }

private var _windowMaximize: ImageVector? = null
