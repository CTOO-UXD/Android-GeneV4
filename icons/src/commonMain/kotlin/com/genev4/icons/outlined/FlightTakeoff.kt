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

public val Icons.Outlined.FlightTakeoff: ImageVector
    get() {
        if (_flightTakeoff != null) {
            return _flightTakeoff!!
        }
        _flightTakeoff =
            materialIcon(name = "Outlined.FlightTakeoff") {
            addPath(
                pathData = PathParser().parsePathString("M21.9832 9.09748C22.1976 9.89768 21.7228 10.7202 20.9226 10.9346L5.25598 15.1324C4.81274 15.2512 4.34556 15.0531 4.12284 14.6519L1.5 9.92718L2.94889 9.53898L5.41668 11.9835L10.512 10.6183L6.00146 3.54462L7.93331 3.02698L14.8847 9.44658L20.1461 8.03679C20.9463 7.82238 21.7688 8.29725 21.9832 9.09748ZM4.03431 17.9857H20.0343V19.9857H4.03431V17.9857Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flightTakeoff!!
    }

private var _flightTakeoff: ImageVector? = null
