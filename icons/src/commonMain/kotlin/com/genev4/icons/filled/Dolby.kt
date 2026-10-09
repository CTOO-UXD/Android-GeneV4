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

public val Icons.Filled.Dolby: ImageVector
    get() {
        if (_dolby != null) {
            return _dolby!!
        }
        _dolby =
            materialIcon(name = "Filled.Dolby") {
            addPath(
                pathData = PathParser().parsePathString("M2 5H4.16632C7.69063 5 11 7.69231 11 12C11 16.3077 7.69176 19 4.16632 19H2V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22 5H19.8337C16.3094 5 13 7.69231 13 12C13 16.3077 16.3082 19 19.8337 19H22V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _dolby!!
    }

private var _dolby: ImageVector? = null
