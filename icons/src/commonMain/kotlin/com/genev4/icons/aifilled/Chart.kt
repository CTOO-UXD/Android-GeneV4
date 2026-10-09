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

public val Icons.AiFilled.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart =
            materialIcon(name = "AiFilled.Chart") {
            addPath(
                pathData = PathParser().parsePathString("M4 22C3.45 22 2.97933 21.8043 2.588 21.413C2.19667 21.0217 2.00067 20.5507 2 20V4C2 3.45 2.196 2.97933 2.588 2.588C2.98 2.19667 3.45067 2.00067 4 2L20 2C20.55 2 21.021 2.196 21.413 2.588C21.805 2.98 22.0007 3.45067 22 4V20C22 20.55 21.8043 21.021 21.413 21.413C21.0217 21.805 20.5507 22.0007 20 22H4ZM7 17H9V7H7V17ZM15 15H17V7H15V15ZM11 12H13V7H11V12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _chart!!
    }

private var _chart: ImageVector? = null
