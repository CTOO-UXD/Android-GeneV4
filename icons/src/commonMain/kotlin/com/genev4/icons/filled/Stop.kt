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

public val Icons.Filled.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop =
            materialIcon(name = "Filled.Stop") {
            addPath(
                pathData = PathParser().parsePathString("M7.0 4.99707H17.0A2.0 2.0 0 0 1 19.0 6.99707V16.99707A2.0 2.0 0 0 1 17.0 18.99707H7.0A2.0 2.0 0 0 1 5.0 16.99707V6.99707A2.0 2.0 0 0 1 7.0 4.99707Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _stop!!
    }

private var _stop: ImageVector? = null
