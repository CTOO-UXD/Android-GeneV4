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

public val Icons.AiOutlined.Investment: ImageVector
    get() {
        if (_investment != null) {
            return _investment!!
        }
        _investment =
            materialIcon(name = "AiOutlined.Investment") {
            addPath(
                pathData = PathParser().parsePathString("M13.5 9H20.6426C21.116 9 21.5 9.38403 21.5 9.85742V14.1426C21.5 14.616 21.116 15 20.6426 15H13.5C11.8431 15 10.5 13.6569 10.5 12C10.5 10.3431 11.8431 9 13.5 9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.5 3C19.6046 3 20.5 3.89543 20.5 5V8H18.5V5H4.5V19H18.5V16H20.5V19C20.5 20.0357 19.7128 20.887 18.7041 20.9893L18.5 21H4.5L4.2959 20.9893C3.35435 20.8938 2.6062 20.1457 2.51074 19.2041L2.5 19V5C2.5 3.89543 3.39543 3 4.5 3H18.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.5 12C14.5 12.5523 14.0523 13 13.5 13C12.9477 13 12.5 12.5523 12.5 12C12.5 11.4477 12.9477 11 13.5 11C14.0523 11 14.5 11.4477 14.5 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _investment!!
    }

private var _investment: ImageVector? = null
