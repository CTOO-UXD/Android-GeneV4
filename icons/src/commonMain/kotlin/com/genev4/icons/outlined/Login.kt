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

public val Icons.Outlined.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login =
            materialIcon(name = "Outlined.Login") {
            addPath(
                pathData = PathParser().parsePathString("M17 20.9995H12V18.9995H17C18.1046 18.9995 19 18.1041 19 16.9995V6.99951C19 5.89494 18.1046 4.99951 17 4.99951H12V2.99951H17C19.2091 2.99951 21 4.79037 21 6.99951V16.9995C21 19.2087 19.2091 20.9995 17 20.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8.59275 8.41686L11.1741 10.9992H3V12.9992H11.1746L8.59264 15.5831L10.0074 16.9968L14.295 12.7061C14.6852 12.3156 14.6852 11.6827 14.2949 11.2923L10.0072 7.00293L8.59275 8.41686Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _login!!
    }

private var _login: ImageVector? = null
