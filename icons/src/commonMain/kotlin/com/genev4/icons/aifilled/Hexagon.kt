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

public val Icons.AiFilled.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon =
            materialIcon(name = "AiFilled.Hexagon") {
            addPath(
                pathData = PathParser().parsePathString("M9.72963 3H14.2704V8.10286L18.7296 5.55142L21 9.44854L16.5408 12L21 14.5514L18.7296 18.4485L14.2704 15.8971V21H9.72963V15.8971L5.27038 18.4485L3 14.5514L7.45925 12L3 9.44854L5.27038 5.55142L9.72963 8.10286V3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
