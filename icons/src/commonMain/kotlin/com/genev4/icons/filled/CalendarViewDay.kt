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

public val Icons.Filled.CalendarViewDay: ImageVector
    get() {
        if (_calendarViewDay != null) {
            return _calendarViewDay!!
        }
        _calendarViewDay =
            materialIcon(name = "Filled.CalendarViewDay") {
            addPath(
                pathData = PathParser().parsePathString("M21 4.99951H3V2.99951H21V4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 8.99951C3 7.89494 3.89543 6.99951 5 6.99951H19C20.1046 6.99951 21 7.89494 21 8.99951V14.9995C21 16.1041 20.1046 16.9995 19 16.9995H5C3.89543 16.9995 3 16.1041 3 14.9995V8.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 20.9995H21V18.9995H3V20.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _calendarViewDay!!
    }

private var _calendarViewDay: ImageVector? = null
