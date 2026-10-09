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

public val Icons.Filled.Flight: ImageVector
    get() {
        if (_flight != null) {
            return _flight!!
        }
        _flight =
            materialIcon(name = "Filled.Flight") {
            addPath(
                pathData = PathParser().parsePathString("M16.2358 21.1992L17.4732 19.9618L15.4226 10.4865L19.5946 6.3146C20.1218 5.7874 20.1218 4.93262 19.5946 4.40542C19.0674 3.87821 18.2126 3.87821 17.6854 4.40542L13.5134 8.57735L4.03822 6.52674L2.80078 7.76417L10.685 11.4058L6.68987 15.4009L3.96751 15.0827L2.97756 16.0727L6.40703 17.593L7.92731 21.0224L9.09403 19.8557L8.59906 17.3101L12.5942 13.315L16.2358 21.1992Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flight!!
    }

private var _flight: ImageVector? = null
