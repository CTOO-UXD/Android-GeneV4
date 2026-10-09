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

public val Icons.AiOutlined.PresentationBoard: ImageVector
    get() {
        if (_presentationBoard != null) {
            return _presentationBoard!!
        }
        _presentationBoard =
            materialIcon(name = "AiOutlined.PresentationBoard") {
            addPath(
                pathData = PathParser().parsePathString("M19 2C19.2652 2 19.5195 2.10543 19.707 2.29297C19.8946 2.48051 20 2.73478 20 3V14H22V16H13V17L19.0625 20.5L18.0625 22.2324L13 19.3096V22H11V19.3457L6 22.2324L5 20.5L11 17.0352V16H2V14H4V3C4 2.73478 4.10543 2.48051 4.29297 2.29297C4.48051 2.10543 4.73478 2 5 2H19ZM6 4V14H18V4H6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 7L13 10L11 8L9 11").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _presentationBoard!!
    }

private var _presentationBoard: ImageVector? = null
