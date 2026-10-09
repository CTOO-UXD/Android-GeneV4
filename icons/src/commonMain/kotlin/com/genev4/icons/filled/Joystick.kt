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

public val Icons.Filled.Joystick: ImageVector
    get() {
        if (_joystick != null) {
            return _joystick!!
        }
        _joystick =
            materialIcon(name = "Filled.Joystick") {
            addPath(
                pathData = PathParser().parsePathString("M13 7.85457C14.4457 7.4243 15.5 6.08502 15.5 4.49951C15.5 2.56652 13.933 0.999512 12 0.999512C10.067 0.999512 8.5 2.56652 8.5 4.49951C8.5 6.08502 9.55426 7.4243 11 7.85457V8.27441L4.00377 12.2934C3.38285 12.6501 3 13.3115 3 14.0276V15.9735C3 16.689 3.38222 17.35 4.00233 17.7069L11.0023 21.7358C11.62 22.0913 12.3801 22.0913 12.9977 21.7358L19.9977 17.7069C20.6178 17.35 21 16.689 21 15.9735V14.0276C21 13.3115 20.6172 12.6501 19.9962 12.2934L13 8.27441V7.85457ZM11 13.9995V10.632L6.83264 13.0282L12 16.0023L17.1674 13.0282L13 10.632V13.9995H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _joystick!!
    }

private var _joystick: ImageVector? = null
