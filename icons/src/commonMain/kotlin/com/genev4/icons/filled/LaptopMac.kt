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

public val Icons.Filled.LaptopMac: ImageVector
    get() {
        if (_laptopMac != null) {
            return _laptopMac!!
        }
        _laptopMac =
            materialIcon(name = "Filled.LaptopMac") {
            addPath(
                pathData = PathParser().parsePathString("M19 5.99951H5V14.9995H19V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 4.99951C2 3.89494 2.89543 2.99951 4 2.99951H20C21.1046 2.99951 22 3.89494 22 4.99951V15.9995C22 17.1041 21.1046 17.9995 20 17.9995H24C24 19.1041 23.1046 19.9995 22 19.9995H2C0.89543 19.9995 0 19.1041 0 17.9995H4C2.89543 17.9995 2 17.1041 2 15.9995V4.99951ZM4 4.99951H20V15.9995H4V4.99951ZM12 18.9995C12.5523 18.9995 13 18.5518 13 17.9995C13 17.4472 12.5523 16.9995 12 16.9995C11.4477 16.9995 11 17.4472 11 17.9995C11 18.5518 11.4477 18.9995 12 18.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptopMac!!
    }

private var _laptopMac: ImageVector? = null
