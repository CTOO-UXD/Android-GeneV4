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

public val Icons.Filled.WeatherPartlySunny: ImageVector
    get() {
        if (_weatherPartlySunny != null) {
            return _weatherPartlySunny!!
        }
        _weatherPartlySunny =
            materialIcon(name = "Filled.WeatherPartlySunny") {
            addPath(
                pathData = PathParser().parsePathString("M14.6684 8.40381C15.3011 8.798 15.855 9.30675 16.3012 9.90103C16.7631 10.5163 17.1096 11.2232 17.3083 11.9896C17.3125 12.0057 17.3166 12.0218 17.3206 12.038C19.398 12.3167 21 14.0963 21 16.25C21 18.5972 19.0972 20.5 16.75 20.5H6.75C4.12665 20.5 2 18.3734 2 15.75C2 13.3753 3.74255 11.4077 6.01871 11.0559C6.9545 8.96042 9.0567 7.5 11.5 7.5C11.841 7.5 12.1753 7.52844 12.5008 7.58308C13.2854 7.71483 14.0184 7.99889 14.6684 8.40381ZM19.5 7.5C19.5 8.34007 19.0856 9.08337 18.4502 9.53666C18.6029 9.80401 18.7407 10.081 18.8624 10.3665C19.2479 10.505 19.6158 10.6801 19.9619 10.8878C20.9046 10.063 21.5 8.85102 21.5 7.5C21.5 5.01472 19.4853 3 17 3C15.1844 3 13.62 4.07519 12.9087 5.62357C13.5879 5.74419 14.2374 5.95051 14.8456 6.23092C15.2805 5.4942 16.0825 5 17 5C18.3807 5 19.5 6.11929 19.5 7.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _weatherPartlySunny!!
    }

private var _weatherPartlySunny: ImageVector? = null
