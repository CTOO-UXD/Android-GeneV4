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

public val Icons.Filled.CheckBoxIndeterminate: ImageVector
    get() {
        if (_checkBoxIndeterminate != null) {
            return _checkBoxIndeterminate!!
        }
        _checkBoxIndeterminate =
            materialIcon(name = "Filled.CheckBoxIndeterminate") {
            addPath(
                pathData = PathParser().parsePathString("M3 7C3 4.79086 4.79086 3 7 3H17C19.2091 3 21 4.79086 21 7V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7ZM17 11H7V13H17V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _checkBoxIndeterminate!!
    }

private var _checkBoxIndeterminate: ImageVector? = null
