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

public val Icons.Outlined.SelectCheckBox: ImageVector
    get() {
        if (_selectCheckBox != null) {
            return _selectCheckBox!!
        }
        _selectCheckBox =
            materialIcon(name = "Outlined.SelectCheckBox") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C17.8153 3 18.5737 3.24394 19.2061 3.66282L17.7311 5.13783C17.5046 5.04886 17.258 5 17 5H7C5.89543 5 5 5.89543 5 7V17C5 18.1046 5.89543 19 7 19H17C18.1046 19 19 18.1046 19 17V12.3542L21 10.3542V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.2333 16.2922L22.041 6.48453L20.6268 5.07031L11.5262 14.1708L7.2836 9.9282L5.86938 11.3424L10.8191 16.2922C11.2097 16.6827 11.8428 16.6827 12.2333 16.2922Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _selectCheckBox!!
    }

private var _selectCheckBox: ImageVector? = null
