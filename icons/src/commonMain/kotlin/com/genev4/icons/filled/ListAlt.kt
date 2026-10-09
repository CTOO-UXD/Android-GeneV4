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

public val Icons.Filled.ListAlt: ImageVector
    get() {
        if (_listAlt != null) {
            return _listAlt!!
        }
        _listAlt =
            materialIcon(name = "Filled.ListAlt") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C19.2091 3 21 4.79086 21 7V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3H17ZM9 9.5C9 10.1904 8.44036 10.75 7.75 10.75C7.05964 10.75 6.5 10.1904 6.5 9.5C6.5 8.80964 7.05964 8.25 7.75 8.25C8.44036 8.25 9 8.80964 9 9.5ZM9 14.5C9 15.1904 8.44036 15.75 7.75 15.75C7.05964 15.75 6.5 15.1904 6.5 14.5C6.5 13.8096 7.05964 13.25 7.75 13.25C8.44036 13.25 9 13.8096 9 14.5ZM17 8.5H10V10.5H17V8.5ZM10 13.5H17V15.5H10V13.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _listAlt!!
    }

private var _listAlt: ImageVector? = null
