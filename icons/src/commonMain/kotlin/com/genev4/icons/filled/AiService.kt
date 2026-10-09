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

public val Icons.Filled.AiService: ImageVector
    get() {
        if (_aiService != null) {
            return _aiService!!
        }
        _aiService =
            materialIcon(name = "Filled.AiService") {
            addPath(
                pathData = PathParser().parsePathString("M16.6938 19H13.978L12.7026 16H6.35303L5.07764 19H2.36182L8.31201 5H10.7437L16.6938 19ZM20.7505 19H18.2505V5H20.7505V19ZM7.41553 13.5H11.6401L9.52783 8.5293L7.41553 13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _aiService!!
    }

private var _aiService: ImageVector? = null
