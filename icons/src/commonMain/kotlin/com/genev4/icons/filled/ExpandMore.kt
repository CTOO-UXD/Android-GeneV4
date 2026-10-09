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

public val Icons.Filled.ExpandMore: ImageVector
    get() {
        if (_expandMore != null) {
            return _expandMore!!
        }
        _expandMore =
            materialIcon(name = "Filled.ExpandMore") {
            addPath(
                pathData = PathParser().parsePathString("M18.0178 9.99827L13.4146 14.6015C12.6336 15.3825 11.3672 15.3825 10.5862 14.6015L5.98291 9.9982L7.39712 8.58398L12.0004 13.1873L16.6036 8.58405L18.0178 9.99827Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _expandMore!!
    }

private var _expandMore: ImageVector? = null
