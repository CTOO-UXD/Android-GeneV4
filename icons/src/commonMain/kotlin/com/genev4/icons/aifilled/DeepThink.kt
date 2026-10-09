/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.DeepThink: ImageVector
    get() {
        if (_deepThink != null) {
            return _deepThink!!
        }
        _deepThink =
            materialIcon(name = "AiFilled.DeepThink") {
            addPath(
                pathData = PathParser().parsePathString("M14 8.99951L16 0.999512H14L4 14.9995H10L8 22.9995H10L20 8.99951H14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _deepThink!!
    }

private var _deepThink: ImageVector? = null
