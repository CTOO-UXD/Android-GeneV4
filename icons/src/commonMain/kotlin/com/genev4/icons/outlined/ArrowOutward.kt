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

public val Icons.Outlined.ArrowOutward: ImageVector
    get() {
        if (_arrowOutward != null) {
            return _arrowOutward!!
        }
        _arrowOutward =
            materialIcon(name = "Outlined.ArrowOutward") {
            addPath(
                pathData = PathParser().parsePathString("M15.6611 6.33817H6.33113V8.33817H14.2468L5.62402 16.961L7.03824 18.3752L15.6611 9.75229L15.6611 17.6681H17.6611L17.6611 8.33817C17.6611 7.23359 16.7657 6.33817 15.6611 6.33817Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowOutward!!
    }

private var _arrowOutward: ImageVector? = null
