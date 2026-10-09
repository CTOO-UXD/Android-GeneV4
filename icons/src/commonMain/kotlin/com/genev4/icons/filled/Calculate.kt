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

public val Icons.Filled.Calculate: ImageVector
    get() {
        if (_calculate != null) {
            return _calculate!!
        }
        _calculate =
            materialIcon(name = "Filled.Calculate") {
            addPath(
                pathData = PathParser().parsePathString("M7 2.99951C4.79086 2.99951 3 4.79037 3 6.99951V16.9995C3 19.2087 4.79086 20.9995 7 20.9995H17C19.2091 20.9995 21 19.2087 21 16.9995V6.99951C21 4.79037 19.2091 2.99951 17 2.99951H7ZM16.9176 10.9271L15.5097 9.51919L14.1006 10.9284L13.0399 9.86771L14.4491 8.45853L13.0278 7.03722L14.0884 5.97656L15.5097 7.39787L16.9057 6.00193L17.9663 7.06259L16.5704 8.45853L17.9783 9.86644L16.9176 10.9271ZM6.25485 9.20829H11.2514V7.70829H6.25485V9.20829ZM9.50388 15.9717H11.4914V14.4717H9.50388V12.5105H8.00388V14.4717H5.99023V15.9717H8.00388V17.9776H9.50388V15.9717ZM17.9819 14.7452H13.0181V13.2452H17.9819V14.7452ZM13.0101 17.2537H17.982V15.7537H13.0101V17.2537Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _calculate!!
    }

private var _calculate: ImageVector? = null
