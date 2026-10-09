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

public val Icons.Filled.LaptopChromebook: ImageVector
    get() {
        if (_laptopChromebook != null) {
            return _laptopChromebook!!
        }
        _laptopChromebook =
            materialIcon(name = "Filled.LaptopChromebook") {
            addPath(
                pathData = PathParser().parsePathString("M5 5.99951H19V13.9995H5V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22 2.99951H2V17.9995H0V19.9995H24V17.9995H22V2.99951ZM20 4.99951H4V14.9995H20V4.99951ZM14 16.9995H10V17.9995H14V16.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptopChromebook!!
    }

private var _laptopChromebook: ImageVector? = null
