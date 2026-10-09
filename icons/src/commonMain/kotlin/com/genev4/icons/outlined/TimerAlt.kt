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

public val Icons.Outlined.TimerAlt: ImageVector
    get() {
        if (_timerAlt != null) {
            return _timerAlt!!
        }
        _timerAlt =
            materialIcon(name = "Outlined.TimerAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.99951C17.5228 1.99951 22 6.47666 22 11.9995C22 17.5224 17.5228 21.9995 12 21.9995C6.47715 21.9995 2 17.5224 2 11.9995C2 6.47666 6.47715 1.99951 12 1.99951ZM12 3.99951C7.58172 3.99951 4 7.58123 4 11.9995C4 16.4178 7.58172 19.9995 12 19.9995C16.4183 19.9995 20 16.4178 20 11.9995C20 7.58123 16.4183 3.99951 12 3.99951ZM7.75736 7.75687C7.55538 7.95885 7.53541 8.27963 7.71078 8.5051L11.4326 13.2904C11.9216 13.9191 12.851 13.9769 13.4142 13.4137C13.9774 12.8505 13.9196 11.9212 13.2908 11.4322L8.50559 7.71029C8.28011 7.53492 7.95934 7.55489 7.75736 7.75687Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _timerAlt!!
    }

private var _timerAlt: ImageVector? = null
