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

public val Icons.AiFilled.SearchZoomIn: ImageVector
    get() {
        if (_searchZoomIn != null) {
            return _searchZoomIn!!
        }
        _searchZoomIn =
            materialIcon(name = "AiFilled.SearchZoomIn") {
            addPath(
                pathData = PathParser().parsePathString("M11.5 2C16.74 2 21 6.26 21 11.5C21 16.74 16.74 21 11.5 21C6.26 21 2 16.74 2 11.5C2 6.26 6.26 2 11.5 2ZM10.7002 8.2002V10.7002H8.2002V12.7002H10.7002V15.2002H12.7002V12.7002H15.2002V10.7002H12.7002V8.2002H10.7002Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21.5146 21.5146L20 20").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _searchZoomIn!!
    }

private var _searchZoomIn: ImageVector? = null
