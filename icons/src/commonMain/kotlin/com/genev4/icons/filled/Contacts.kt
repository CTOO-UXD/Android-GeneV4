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

public val Icons.Filled.Contacts: ImageVector
    get() {
        if (_contacts != null) {
            return _contacts!!
        }
        _contacts =
            materialIcon(name = "Filled.Contacts") {
            addPath(
                pathData = PathParser().parsePathString("M9 21H17C19.2091 21 21 19.2091 21 17V7C21 4.79086 19.2091 3 17 3H9V21ZM7 3C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21V3ZM16 10C16 11.1046 15.1046 12 14 12C12.8954 12 12 11.1046 12 10C12 8.89543 12.8954 8 14 8C15.1046 8 16 8.89543 16 10ZM17 16C17 14.3431 16.5 13 14 13C11.5 13 11 14.3431 11 16H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _contacts!!
    }

private var _contacts: ImageVector? = null
