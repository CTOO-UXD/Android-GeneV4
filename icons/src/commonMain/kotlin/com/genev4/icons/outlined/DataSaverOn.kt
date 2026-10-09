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

public val Icons.Outlined.DataSaverOn: ImageVector
    get() {
        if (_dataSaverOn != null) {
            return _dataSaverOn!!
        }
        _dataSaverOn =
            materialIcon(name = "Outlined.DataSaverOn") {
            addPath(
                pathData = PathParser().parsePathString("M2 12C2 6.81465 5.94668 2.5511 11 2.04938V4.06189C7.05369 4.55399 4 7.92038 4 12C4 16.4183 7.58172 20 12 20C16.0796 20 19.446 16.9463 19.9381 13H21.9506C21.4489 18.0533 17.1853 22 12 22C6.47715 22 2 17.5228 2 12ZM13 2.04938V4.06189C16.6187 4.51314 19.4869 7.38128 19.9381 11H21.9506C21.4815 6.27558 17.7244 2.51845 13 2.04938ZM11 6.99999H13V11H17V13H13V17H11V13H7V11H11V6.99999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dataSaverOn!!
    }

private var _dataSaverOn: ImageVector? = null
