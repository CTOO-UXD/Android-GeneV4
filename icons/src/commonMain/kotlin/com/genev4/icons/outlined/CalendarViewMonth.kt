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

public val Icons.Outlined.CalendarViewMonth: ImageVector
    get() {
        if (_calendarViewMonth != null) {
            return _calendarViewMonth!!
        }
        _calendarViewMonth =
            materialIcon(name = "Outlined.CalendarViewMonth") {
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 4.89494 2.89543 3.99951 4 3.99951H20C21.1046 3.99951 22 4.89494 22 5.99951V17.9995C22 19.1041 21.1046 19.9995 20 19.9995H4C2.89543 19.9995 2 19.1041 2 17.9995V5.99951ZM16 5.99951H20V10.9995H16V5.99951ZM14 5.99951H10V10.9995H14V5.99951ZM8 5.99951H4V10.9995H8V5.99951ZM4 12.9995V17.9995H8V12.9995H4ZM10 17.9995H14V12.9995H10V17.9995ZM16 17.9995H20V12.9995H16V17.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _calendarViewMonth!!
    }

private var _calendarViewMonth: ImageVector? = null
