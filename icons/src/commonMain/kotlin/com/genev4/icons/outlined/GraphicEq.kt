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

public val Icons.Outlined.GraphicEq: ImageVector
    get() {
        if (_graphicEq != null) {
            return _graphicEq!!
        }
        _graphicEq =
            materialIcon(name = "Outlined.GraphicEq") {
            addPath(
                pathData = PathParser().parsePathString("M11 2.99951H13V20.9995H11V2.99951ZM3 8.99951H5V14.9995H3V8.99951ZM7 5.99951H9V17.9995H7V5.99951ZM15 5.99951H17V17.9995H15V5.99951ZM19 8.99951H21V14.9995H19V8.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _graphicEq!!
    }

private var _graphicEq: ImageVector? = null
