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

public val Icons.AiFilled.Shutdown: ImageVector
    get() {
        if (_shutdown != null) {
            return _shutdown!!
        }
        _shutdown =
            materialIcon(name = "AiFilled.Shutdown") {
            addPath(
                pathData = PathParser().parsePathString("M11 2.04932V11.9999H13V2.04932C18.0533 2.55104 22 6.81459 22 11.9999C22 17.5228 17.5228 21.9999 12 21.9999C6.47715 21.9999 2 17.5228 2 11.9999C2 6.81459 5.94668 2.55104 11 2.04932Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _shutdown!!
    }

private var _shutdown: ImageVector? = null
