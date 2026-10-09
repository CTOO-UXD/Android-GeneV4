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

public val Icons.AiFilled.HomePage: ImageVector
    get() {
        if (_homePage != null) {
            return _homePage!!
        }
        _homePage =
            materialIcon(name = "AiFilled.HomePage") {
            addPath(
                pathData = PathParser().parsePathString("M20 19.9999C20 20.5522 19.5523 20.9999 19 20.9999H5C4.44772 20.9999 4 20.5522 4 19.9999V10.9999H1L11.3273 1.61138C11.7087 1.26463 12.2913 1.26463 12.6727 1.61138L23 10.9999H20V19.9999ZM11 12.9999V18.9999H13V12.9999H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _homePage!!
    }

private var _homePage: ImageVector? = null
