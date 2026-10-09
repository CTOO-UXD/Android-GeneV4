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

public val Icons.Filled.FeatureSearch: ImageVector
    get() {
        if (_featureSearch != null) {
            return _featureSearch!!
        }
        _featureSearch =
            materialIcon(name = "Filled.FeatureSearch") {
            addPath(
                pathData = PathParser().parsePathString("M16 11.9995C17.0191 11.9995 17.967 11.6946 18.7574 11.1711L21.293 13.7067L22.7072 12.2925L20.1716 9.7569C20.6951 8.96647 21 8.01859 21 6.99951C21 4.23809 18.7614 1.99951 16 1.99951C13.2386 1.99951 11 4.23809 11 6.99951C11 9.76094 13.2386 11.9995 16 11.9995ZM16 9.99951C17.6569 9.99951 19 8.65637 19 6.99951C19 5.34266 17.6569 3.99951 16 3.99951C14.3431 3.99951 13 5.34266 13 6.99951C13 8.65637 14.3431 9.99951 16 9.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 3.99951H9.67363C9.24169 4.90877 9 5.92591 9 6.99951C9 10.8655 12.134 13.9995 16 13.9995C16.8236 13.9995 17.6159 13.8566 18.3519 13.594L20 15.2422V17.9995C20 20.2087 18.2091 21.9995 16 21.9995H6C3.79086 21.9995 2 20.2087 2 17.9995V7.99951C2 5.79037 3.79086 3.99951 6 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _featureSearch!!
    }

private var _featureSearch: ImageVector? = null
