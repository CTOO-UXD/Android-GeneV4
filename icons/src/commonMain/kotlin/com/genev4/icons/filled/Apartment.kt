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

public val Icons.Filled.Apartment: ImageVector
    get() {
        if (_apartment != null) {
            return _apartment!!
        }
        _apartment =
            materialIcon(name = "Filled.Apartment") {
            addPath(
                pathData = PathParser().parsePathString("M7 3C4.79086 3 3 4.79086 3 7V19H2V21H22V19H21V11C21 9.89543 20.1046 9 19 9V7C19 4.79086 17.2091 3 15 3H7ZM17 19H19V11H13V19H15V13H17V19ZM7 7V9H9V7H7ZM7 11V13H9V11H7ZM7 15V17H9V15H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _apartment!!
    }

private var _apartment: ImageVector? = null
