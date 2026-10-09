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

public val Icons.AiOutlined.TooltipCheck: ImageVector
    get() {
        if (_tooltipCheck != null) {
            return _tooltipCheck!!
        }
        _tooltipCheck =
            materialIcon(name = "AiOutlined.TooltipCheck") {
            addPath(
                pathData = PathParser().parsePathString("M20 2H4C2.9 2 2 2.9 2 4V16C2 17.11 2.9 18 4 18H8L12 22L16 18H20C21.11 18 22 17.11 22 16V4C22 2.9 21.11 2 20 2ZM20 16H15.17L12 19.17L8.83 16H4V4H20V16ZM10.75 13.71L7.25 10.21L8.66 8.79L10.75 10.88L15.34 6.3L16.75 7.71L10.75 13.71Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _tooltipCheck!!
    }

private var _tooltipCheck: ImageVector? = null
