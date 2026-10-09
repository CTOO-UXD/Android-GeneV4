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

public val Icons.AiOutlined.SmartShopping: ImageVector
    get() {
        if (_smartShopping != null) {
            return _smartShopping!!
        }
        _smartShopping =
            materialIcon(name = "AiOutlined.SmartShopping") {
            addPath(
                pathData = PathParser().parsePathString("M20 11V8C20 7.44772 19.5523 7 19 7H5C4.44772 7 4 7.44772 4 8V18C4 18.5523 4.44772 19 5 19H10").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 6C15 4.34315 13.6569 3 12 3C10.3431 3 9 4.34315 9 6").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 17L19 19").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _smartShopping!!
    }

private var _smartShopping: ImageVector? = null
