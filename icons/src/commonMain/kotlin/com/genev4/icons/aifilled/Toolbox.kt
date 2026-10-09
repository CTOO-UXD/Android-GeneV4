/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox =
            materialIcon(name = "AiFilled.Toolbox") {
            addPath(
                pathData = PathParser().parsePathString("M9 5V6H15V5H9ZM22 18C22 18.53 21.79 19 21.4 19.41C21 19.81 20.55 20 20 20H4C3.45 20 3 19.81 2.6 19.41C2.21 19 2 18.53 2 18V14H7V15H9V14H15V15H17V14H22V18ZM4.5 7.22C4.84 6.41 5.45 6 6.33 6H7V5C7 4.45 7.18 4 7.57 3.59C7.96 3.2 8.44 3 9 3H15C15.56 3 16.04 3.2 16.43 3.59C16.82 4 17 4.45 17 5V6H17.67C18.55 6 19.16 6.41 19.5 7.22L21.58 12H17V11H15V12H9V11H7V12H2.42L4.5 7.22Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
