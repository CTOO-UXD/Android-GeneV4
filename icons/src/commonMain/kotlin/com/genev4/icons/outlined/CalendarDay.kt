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

public val Icons.Outlined.CalendarDay: ImageVector
    get() {
        if (_calendarDay != null) {
            return _calendarDay!!
        }
        _calendarDay =
            materialIcon(name = "Outlined.CalendarDay") {
            addPath(
                pathData = PathParser().parsePathString("M7 6.99951H9V2.99951H7V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 6.99951H17V2.99951H15V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 15.9995H18V13.9995H13V15.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 3.99951H4C2.89543 3.99951 2 4.89494 2 5.99951V17.9995C2 19.1041 2.89543 19.9995 4 19.9995H20C21.1046 19.9995 22 19.1041 22 17.9995V5.99951C22 4.89494 21.1046 3.99951 20 3.99951H18V5.99951H20V8.99951H4V5.99951H6V3.99951ZM4 10.9995H20V17.9995H4V10.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 5.99951H10V3.99951H14V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
