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

public val Icons.Outlined.Apartment: ImageVector
    get() {
        if (_apartment != null) {
            return _apartment!!
        }
        _apartment =
            materialIcon(name = "Outlined.Apartment") {
            addPath(
                pathData = PathParser().parsePathString("M22 21H2V19H3V7C3 4.79086 4.79086 3 7 3H15C17.2091 3 19 4.79086 19 7V9C20.1046 9 21 9.89543 21 11V19H22V21ZM17 19H19V11H13V19H15V13H17V19ZM17 9V7C17 5.89543 16.1046 5 15 5H7C5.89543 5 5 5.89543 5 7V19H11V11C11 9.89543 11.8954 9 13 9H17ZM7 11H9V13H7V11ZM7 15H9V17H7V15ZM7 7H9V9H7V7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _apartment!!
    }

private var _apartment: ImageVector? = null
