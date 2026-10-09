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

public val Icons.Filled.E911Emergency: ImageVector
    get() {
        if (_e911Emergency != null) {
            return _e911Emergency!!
        }
        _e911Emergency =
            materialIcon(name = "Filled.E911Emergency") {
            addPath(
                pathData = PathParser().parsePathString("M12 6C16.4183 6 20 9.58172 20 14V19H21V21H3.00001V19H4.00001V14C4.00001 9.58172 7.58173 6 12 6ZM4.22183 4.80761L6.34315 6.92893L4.92894 8.34315L2.80762 6.22183L4.22183 4.80761ZM19.7782 4.80761L21.1924 6.22183L19.0711 8.34315L17.6569 6.92893L19.7782 4.80761ZM13 2V5H11V2H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _e911Emergency!!
    }

private var _e911Emergency: ImageVector? = null
