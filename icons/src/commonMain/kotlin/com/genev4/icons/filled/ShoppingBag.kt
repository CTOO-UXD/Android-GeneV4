/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Filled.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag =
            materialIcon(name = "Filled.ShoppingBag") {
            addPath(
                pathData = PathParser().parsePathString("M11.9998 1C14.7613 1 16.9998 3.23858 16.9998 6V8H19.1478C20.1928 8 21.0617 8.80461 21.1419 9.84661L21.6685 16.6932C21.838 18.8958 20.1897 20.8188 17.9871 20.9882C17.885 20.9961 17.7827 21 17.6803 21H6.31934C4.1102 21 2.31934 19.2091 2.31934 17C2.31934 16.8976 2.32327 16.7953 2.33112 16.6932L2.85778 9.84661C2.93793 8.80461 3.80682 8 4.85189 8H6.99983V6C6.99983 3.23858 9.2384 1 11.9998 1ZM14.9998 6V8H8.99983V6C8.99983 4.34315 10.343 3 11.9998 3C13.6567 3 14.9998 4.34315 14.9998 6ZM7 10V12H9V10H7ZM15 10V12H17V10H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
