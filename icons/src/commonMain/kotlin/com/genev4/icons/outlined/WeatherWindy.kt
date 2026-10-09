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

public val Icons.Outlined.WeatherWindy: ImageVector
    get() {
        if (_weatherWindy != null) {
            return _weatherWindy!!
        }
        _weatherWindy =
            materialIcon(name = "Outlined.WeatherWindy") {
            addPath(
                pathData = PathParser().parsePathString("M15.5 5.5C15.5 3.567 13.933 2 12 2C10.4343 2 9.0721 3.03689 8.63982 4.51831L10.5597 5.07855C10.7447 4.44478 11.329 4 12 4C12.8284 4 13.5 4.67157 13.5 5.5C13.5 6.32843 12.8284 7 12 7H3V9H12C13.933 9 15.5 7.433 15.5 5.5ZM19.3292 5C21.5383 5 23.3292 6.79086 23.3292 9C23.3292 11.1519 21.6299 12.9069 19.5 12.9964V13H19.3292H3V11H19.3292C20.4337 11 21.3292 10.1046 21.3292 9C21.3292 7.89543 20.4337 7 19.3292 7C19.0166 7 18.7162 7.07107 18.4436 7.20598L17.5564 5.41356C18.1032 5.14285 18.707 5 19.3292 5ZM17 15H6V17H17C17.8284 17 18.5 17.6716 18.5 18.5C18.5 19.3284 17.8284 20 17 20C16.1716 20 15.5 19.3284 15.5 18.5H13.5C13.5 20.433 15.067 22 17 22C18.933 22 20.5 20.433 20.5 18.5C20.5 16.567 18.933 15 17 15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _weatherWindy!!
    }

private var _weatherWindy: ImageVector? = null
