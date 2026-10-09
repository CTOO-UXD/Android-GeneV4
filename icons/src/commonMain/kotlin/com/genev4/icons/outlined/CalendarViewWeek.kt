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

public val Icons.Outlined.CalendarViewWeek: ImageVector
    get() {
        if (_calendarViewWeek != null) {
            return _calendarViewWeek!!
        }
        _calendarViewWeek =
            materialIcon(name = "Outlined.CalendarViewWeek") {
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 4.89494 2.89543 3.99951 4 3.99951H20C21.1046 3.99951 22 4.89494 22 5.99951V17.9995C22 19.1041 21.1046 19.9995 20 19.9995H4C2.89543 19.9995 2 19.1041 2 17.9995V5.99951ZM8.5 5.99951H11V17.9995H8.5V5.99951ZM13 17.9995V5.99951H15.5V17.9995H13ZM17.5 17.9995H20V5.99951H17.5V17.9995ZM6.5 5.99951H4V17.9995H6.5V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _calendarViewWeek!!
    }

private var _calendarViewWeek: ImageVector? = null
