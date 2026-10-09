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

public val Icons.Filled.CalendarDay: ImageVector
    get() {
        if (_calendarDay != null) {
            return _calendarDay!!
        }
        _calendarDay =
            materialIcon(name = "Filled.CalendarDay") {
            addPath(
                pathData = PathParser().parsePathString("M7 2.99951V6.99951H9V2.99951H7Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 2.99951V6.99951H17V2.99951H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 3.99951H6V6.99951C6 7.5518 6.44772 7.99951 7 7.99951H9C9.55228 7.99951 10 7.5518 10 6.99951V3.99951H14V6.99951C14 7.5518 14.4477 7.99951 15 7.99951H17C17.5523 7.99951 18 7.5518 18 6.99951V3.99951H20C21.1046 3.99951 22 4.89494 22 5.99951V9.49951H2V5.99951C2 4.89494 2.89543 3.99951 4 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 10.4995H22V17.9995C22 19.1041 21.1046 19.9995 20 19.9995H4C2.89543 19.9995 2 19.1041 2 17.9995V10.4995ZM18 15.9995H13V13.9995H18V15.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
