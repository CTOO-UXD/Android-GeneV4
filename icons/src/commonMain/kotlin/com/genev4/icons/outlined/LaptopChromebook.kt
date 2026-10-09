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

public val Icons.Outlined.LaptopChromebook: ImageVector
    get() {
        if (_laptopChromebook != null) {
            return _laptopChromebook!!
        }
        _laptopChromebook =
            materialIcon(name = "Outlined.LaptopChromebook") {
            addPath(
                pathData = PathParser().parsePathString("M2 17.9995V2.99951H22V17.9995H24V19.9995H0V17.9995H2ZM4 4.99951H20V14.9995H4V4.99951ZM14 16.9995H10V17.9995H14V16.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _laptopChromebook!!
    }

private var _laptopChromebook: ImageVector? = null
