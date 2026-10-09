/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo =
            materialIcon(name = "Outlined.Undo") {
            addPath(
                pathData = PathParser().parsePathString("M14.5028 7.00004L7.00319 7.00032L9.53972 4.46451L8.1255 3.05029L3.88155 7.29303C3.49077 7.6833 3.49068 8.31647 3.88115 8.70705C3.88088 8.70718 3.88121 8.70711 3.88115 8.70705L8.1255 12.9498L9.53972 11.5356L7.00319 9.00001L14.5028 9.00004C16.8439 9.00004 18.7674 10.7878 18.9827 13.0726L18.9979 13.2882L19.0028 13.5C19.0028 15.9853 16.9881 18 14.5028 18H6.00277V20H14.5028C18.0146 20 20.8759 17.215 20.9987 13.7332L21.0028 13.5C21.0028 9.91019 18.0926 7.00004 14.5028 7.00004Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _undo!!
    }

private var _undo: ImageVector? = null
