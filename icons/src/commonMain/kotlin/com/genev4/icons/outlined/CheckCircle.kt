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

public val Icons.Outlined.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle =
            materialIcon(name = "Outlined.CheckCircle") {
            addPath(
                pathData = PathParser().parsePathString("M20 11.9995C20 16.4178 16.4183 19.9995 12 19.9995C7.58172 19.9995 4 16.4178 4 11.9995C4 7.58123 7.58172 3.99951 12 3.99951C16.4183 3.99951 20 7.58123 20 11.9995ZM22 11.9995C22 17.5224 17.5228 21.9995 12 21.9995C6.47715 21.9995 2 17.5224 2 11.9995C2 6.47666 6.47715 1.99951 12 1.99951C17.5228 1.99951 22 6.47666 22 11.9995ZM16.2462 7.91437L10.8427 13.3178L8.02162 10.4967L6.60741 11.9109L10.1356 15.4391C10.5261 15.8296 11.1593 15.8296 11.5498 15.4391L17.6604 9.32858L16.2462 7.91437Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
