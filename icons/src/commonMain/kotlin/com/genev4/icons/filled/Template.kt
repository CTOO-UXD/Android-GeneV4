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

public val Icons.Filled.Template: ImageVector
    get() {
        if (_template != null) {
            return _template!!
        }
        _template =
            materialIcon(name = "Filled.Template") {
            addPath(
                pathData = PathParser().parsePathString("M21 5C21 3.89543 20.1046 3 19 3H8C6.89543 3 6 3.89543 6 5V16C6 17.1046 6.89543 18 8 18H19C20.1046 18 21 17.1046 21 16V5ZM5 7V17C5 18.1046 5.89543 19 7 19H19V21H7C4.79086 21 3 19.2091 3 17V7H5ZM10 9.5H17V7.5H10V9.5ZM10 13.5H15V11.5H10V13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _template!!
    }

private var _template: ImageVector? = null
