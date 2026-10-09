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

public val Icons.Filled.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save =
            materialIcon(name = "Filled.Save") {
            addPath(
                pathData = PathParser().parsePathString("M21 8.00002L15.998 2.99902L5 2.99998C3.89543 2.99998 3 3.89541 3 4.99998V19C3 20.1046 3.89543 21 5 21H6V21H18V21H19C20.1046 21 21 20.1046 21 19V8.00002ZM17 17V13V12H16H8H7V13V17H17ZM15 9H7V7H15V9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _save!!
    }

private var _save: ImageVector? = null
