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

public val Icons.AiFilled.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay =
            materialIcon(name = "AiFilled.Airplay") {
            addPath(
                pathData = PathParser().parsePathString("M6 21L12 15L18 21H6ZM4 19C3.45 19 2.97933 18.8043 2.588 18.413C2.19667 18.0217 2.00067 17.5507 2 17V5C2 4.45 2.196 3.97933 2.588 3.588C2.98 3.19667 3.45067 3.00067 4 3H20C20.55 3 21.021 3.196 21.413 3.588C21.805 3.98 22.0007 4.45067 22 5V17C22 17.55 21.8043 18.021 21.413 18.413C21.0217 18.805 20.5507 19.0007 20 19H19L12 12L5 19H4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _airplay!!
    }

private var _airplay: ImageVector? = null
