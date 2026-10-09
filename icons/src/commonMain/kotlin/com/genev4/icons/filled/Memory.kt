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

public val Icons.Filled.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory =
            materialIcon(name = "Filled.Memory") {
            addPath(
                pathData = PathParser().parsePathString("M9 2V3H15V2H17V3C19.2091 3 21 4.79086 21 7V7.00499H22V9.00499H21V15.005H22V17.005H21C20.9973 19.2118 19.2075 21 17 21V22H15V21H9V22H7V21C4.79252 21 3.00269 19.2118 3 17.005H2V15.005H3V9.00499H2V7.00499H3V7C3 4.79086 4.79086 3 7 3V2H9ZM17 9C17 7.89543 16.1046 7 15 7H9C7.89543 7 7 7.89543 7 9V15C7 16.1046 7.89543 17 9 17H15C16.1046 17 17 16.1046 17 15V9ZM9 9H15V15H9V9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _memory!!
    }

private var _memory: ImageVector? = null
