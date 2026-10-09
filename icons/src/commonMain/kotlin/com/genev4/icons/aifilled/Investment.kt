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

public val Icons.AiFilled.Investment: ImageVector
    get() {
        if (_investment != null) {
            return _investment!!
        }
        _investment =
            materialIcon(name = "AiFilled.Investment") {
            addPath(
                pathData = PathParser().parsePathString("M18.5 3C19.6046 3 20.5 3.89543 20.5 5V8H13.5C11.2909 8 9.5 9.79086 9.5 12C9.5 14.14 11.1806 15.8879 13.2939 15.9951L13.5 16H20.5V19C20.5 20.0357 19.7128 20.887 18.7041 20.9893L18.5 21H4.5L4.2959 20.9893C3.35435 20.8938 2.6062 20.1457 2.51074 19.2041L2.5 19V5C2.5 3.89543 3.39543 3 4.5 3H18.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.5 14H13.5C12.3954 14 11.5 13.1046 11.5 12C11.5 10.8954 12.3954 10 13.5 10H20.5V14ZM13.5 11C12.9477 11 12.5 11.4477 12.5 12C12.5 12.5523 12.9477 13 13.5 13C14.0523 13 14.5 12.5523 14.5 12C14.5 11.4477 14.0523 11 13.5 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _investment!!
    }

private var _investment: ImageVector? = null
