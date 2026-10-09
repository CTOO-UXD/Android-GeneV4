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

public val Icons.Filled.Work: ImageVector
    get() {
        if (_work != null) {
            return _work!!
        }
        _work =
            materialIcon(name = "Filled.Work") {
            addPath(
                pathData = PathParser().parsePathString("M15 2C16.1046 2 17 2.89543 17 4V6H18C20.2091 6 22 7.79086 22 10V12H17V11H15V12H9V11H7V12H2V10C2 7.79086 3.79086 6 6 6H7V4C7 2.89543 7.89543 2 9 2H15ZM2 14V17C2 19.2091 3.79086 21 6 21H18C20.2091 21 22 19.2091 22 17V14H17V15H15V14H9V15H7V14H2ZM9 6H15V4H9V6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _work!!
    }

private var _work: ImageVector? = null
