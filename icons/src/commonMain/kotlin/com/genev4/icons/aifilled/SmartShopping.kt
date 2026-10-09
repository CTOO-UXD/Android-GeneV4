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

public val Icons.AiFilled.SmartShopping: ImageVector
    get() {
        if (_smartShopping != null) {
            return _smartShopping!!
        }
        _smartShopping =
            materialIcon(name = "AiFilled.SmartShopping") {
            addPath(
                pathData = PathParser().parsePathString("M15 6C15 4.34315 13.6569 3 12 3C10.3431 3 9 4.34315 9 6").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 17L20 20").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 8C21 6.89543 20.1046 6 19 6H5C3.89543 6 3 6.89543 3 8V18C3 19.1046 3.89543 20 5 20H11.6836C10.0664 18.9252 9 17.0874 9 15C9 11.6863 11.6863 9 15 9C18.3137 9 21 11.6863 21 15V8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _smartShopping!!
    }

private var _smartShopping: ImageVector? = null
