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

public val Icons.AiOutlined.Branch: ImageVector
    get() {
        if (_branch != null) {
            return _branch!!
        }
        _branch =
            materialIcon(name = "AiOutlined.Branch") {
            addPath(
                pathData = PathParser().parsePathString("M11 20V12.4L6 7.4V10H4V4H10V6H7.4L13 11.6V20H11ZM14.85 10.6L13.4 9.15L16.6 6H14V4H20V10H18V7.4L14.85 10.6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _branch!!
    }

private var _branch: ImageVector? = null
