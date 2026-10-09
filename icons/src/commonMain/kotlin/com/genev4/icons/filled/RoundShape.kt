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

public val Icons.Filled.RoundShape: ImageVector
    get() {
        if (_roundShape != null) {
            return _roundShape!!
        }
        _roundShape =
            materialIcon(name = "Filled.RoundShape") {
            addPath(
                pathData = PathParser().parsePathString("M7 3H9V5H7C5.89543 5 5 5.89543 5 7V9H3V7C3 4.79086 4.79086 3 7 3ZM17 5C18.1046 5 19 5.89543 19 7V9H21V7C21 4.79086 19.2091 3 17 3H15V5H17ZM19 17C19 18.1046 18.1046 19 17 19H15V21H17C19.2091 21 21 19.2091 21 17V15H19V17ZM5 17V15H3V17C3 19.2091 4.79086 21 7 21H9V19H7C5.89543 19 5 18.1046 5 17ZM12 6C15.3137 6 18 8.68629 18 12C18 15.3137 15.3137 18 12 18C8.68629 18 6 15.3137 6 12C6 8.68629 8.68629 6 12 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _roundShape!!
    }

private var _roundShape: ImageVector? = null
