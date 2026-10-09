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

public val Icons.Outlined.Work: ImageVector
    get() {
        if (_work != null) {
            return _work!!
        }
        _work =
            materialIcon(name = "Outlined.Work") {
            addPath(
                pathData = PathParser().parsePathString("M17 4C17 2.89543 16.1046 2 15 2H9C7.89543 2 7 2.89543 7 4V6H6C3.79086 6 2 7.79086 2 10V17C2 19.2091 3.79086 21 6 21H18C20.2091 21 22 19.2091 22 17V10C22 7.79086 20.2091 6 18 6H17V4ZM15 6H9V4H15V6ZM7 8H17H18C19.1046 8 20 8.89543 20 10V12H17V11H15V12H9V11H7V12H4V10C4 8.89543 4.89543 8 6 8H7ZM15 14H9V15H7V14H4V17C4 18.1046 4.89543 19 6 19H18C19.1046 19 20 18.1046 20 17V14H17V15H15V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _work!!
    }

private var _work: ImageVector? = null
