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

public val Icons.Outlined.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save =
            materialIcon(name = "Outlined.Save") {
            addPath(
                pathData = PathParser().parsePathString("M21 8.00002L15.998 2.99902L5 2.99998C3.89543 2.99998 3 3.89541 3 4.99998V19C3 20.1046 3.89543 21 5 21H7H17H19C20.1046 21 21 20.1046 21 19V8.00002ZM17 19H19V8.82902L15.168 4.99802L5 4.99998V19H7V12H17V19ZM9 19H15V14H9V19ZM7 6.99998H15V8.99998H7V6.99998Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _save!!
    }

private var _save: ImageVector? = null
