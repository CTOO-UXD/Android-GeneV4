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

public val Icons.Filled.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan =
            materialIcon(name = "Filled.Scan") {
            addPath(
                pathData = PathParser().parsePathString("M7 3H9V5H7C5.89543 5 5 5.89543 5 7V9H3V7C3 4.79086 4.79086 3 7 3ZM15 3V5H17C18.1046 5 19 5.89543 19 7V9H21V7C21 4.79086 19.2091 3 17 3H15ZM17 19H15V21H17C19.2091 21 21 19.2091 21 17V15H19V17C19 18.1046 18.1046 19 17 19ZM5 17V15H3V17C3 19.2091 4.79086 21 7 21H9V19H7C5.89543 19 5 18.1046 5 17ZM22 11H2V13H22V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _scan!!
    }

private var _scan: ImageVector? = null
