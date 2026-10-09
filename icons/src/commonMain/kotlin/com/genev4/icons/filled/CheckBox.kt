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

public val Icons.Filled.CheckBox: ImageVector
    get() {
        if (_checkBox != null) {
            return _checkBox!!
        }
        _checkBox =
            materialIcon(name = "Filled.CheckBox") {
            addPath(
                pathData = PathParser().parsePathString("M7 3C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V7C21 4.79086 19.2091 3 17 3H7ZM17.6566 9.32852L11.5498 15.4351C11.1593 15.8256 10.5262 15.8256 10.1356 15.4351L6.6001 11.8996L8.01431 10.4853L10.8427 13.3138L16.2424 7.91431L17.6566 9.32852Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _checkBox!!
    }

private var _checkBox: ImageVector? = null
