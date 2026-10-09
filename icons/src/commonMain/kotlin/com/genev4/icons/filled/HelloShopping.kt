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

public val Icons.Filled.HelloShopping: ImageVector
    get() {
        if (_helloShopping != null) {
            return _helloShopping!!
        }
        _helloShopping =
            materialIcon(name = "Filled.HelloShopping") {
            addPath(
                pathData = PathParser().parsePathString("M12.05 2.05103C10.117 2.05103 8.55 3.61803 8.55 5.55103V9.70103C8.55 10.1152 8.88579 10.451 9.3 10.451C9.71421 10.451 10.05 10.1152 10.05 9.70103V5.55103C10.05 4.44646 10.9454 3.55103 12.05 3.55103C13.1546 3.55103 14.05 4.44646 14.05 5.55103V9.70103C14.05 10.1152 14.3858 10.451 14.8 10.451C15.2142 10.451 15.55 10.1152 15.55 9.70103V5.55103C15.55 3.61803 13.983 2.05103 12.05 2.05103Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 10.001C4 7.94402 5.5527 6.24967 7.55 6.02606V9.70103C7.55 10.6675 8.3335 11.451 9.3 11.451C10.2665 11.451 11.05 10.6675 11.05 9.70103V6.00103H13.05V9.70103C13.05 10.6675 13.8335 11.451 14.8 11.451C15.7665 11.451 16.55 10.6675 16.55 9.70103V6.03853C18.4989 6.30654 20 7.97848 20 10.001V18.001C20 20.2102 18.2091 22.001 16 22.001H8C5.79086 22.001 4 20.2102 4 18.001V10.001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _helloShopping!!
    }

private var _helloShopping: ImageVector? = null
