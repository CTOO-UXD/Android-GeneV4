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

public val Icons.Outlined.AiService: ImageVector
    get() {
        if (_aiService != null) {
            return _aiService!!
        }
        _aiService =
            materialIcon(name = "Outlined.AiService") {
            addPath(
                pathData = PathParser().parsePathString("M16.6938 19H14.52L13.1392 15.75H5.9165L4.53564 19H2.36182L8.31201 5H10.7437L16.6938 19ZM20.5005 19H18.5005V5H20.5005V19ZM6.76611 13.75H12.2896L9.52783 7.25195L6.76611 13.75Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _aiService!!
    }

private var _aiService: ImageVector? = null
