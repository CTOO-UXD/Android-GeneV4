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

public val Icons.Outlined.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop =
            materialIcon(name = "Outlined.Stop") {
            addPath(
                pathData = PathParser().parsePathString("M17 6.99609H7L7 16.9961H17V6.99609ZM7 4.99609C5.89543 4.99609 5 5.89152 5 6.99609V16.9961C5 18.1007 5.89543 18.9961 7 18.9961H17C18.1046 18.9961 19 18.1007 19 16.9961V6.99609C19 5.89152 18.1046 4.99609 17 4.99609H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _stop!!
    }

private var _stop: ImageVector? = null
