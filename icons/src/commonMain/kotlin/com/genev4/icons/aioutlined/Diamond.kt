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

public val Icons.AiOutlined.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond =
            materialIcon(name = "AiOutlined.Diamond") {
            addPath(
                pathData = PathParser().parsePathString("M12 21L2 9L5 3H19L22 9L12 21ZM9.625 8H14.375L12.875 5H11.125L9.625 8ZM11 16.675V10H5.45L11 16.675ZM13 16.675L18.55 10H13V16.675ZM16.6 8H19.25L17.75 5H15.1L16.6 8ZM4.75 8H7.4L8.9 5H6.25L4.75 8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
