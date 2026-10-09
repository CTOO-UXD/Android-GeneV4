/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film =
            materialIcon(name = "AiOutlined.Film") {
            addPath(
                pathData = PathParser().parsePathString("M18.3 3H5.7C4.20883 3 3 4.20883 3 5.7V18.3C3 19.7912 4.20883 21 5.7 21H18.3C19.7912 21 21 19.7912 21 18.3V5.7C21 4.20883 19.7912 3 18.3 3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M7.5 3V21M16.5 3V21M3 12H21M3 7.5H7.5M21 7.5H16.5M3 16.5H7.5M21 16.5H16.5").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _film!!
    }

private var _film: ImageVector? = null
