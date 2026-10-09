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

public val Icons.Outlined.EventAvailable: ImageVector
    get() {
        if (_eventAvailable != null) {
            return _eventAvailable!!
        }
        _eventAvailable =
            materialIcon(name = "Outlined.EventAvailable") {
            addPath(
                pathData = PathParser().parsePathString("M7 7V3H9V7H7ZM15 7V3H17V7H15ZM10 6H14V4H10V6ZM6 4H4C2.89543 4 2 4.89543 2 6V18C2 19.1046 2.89543 20 4 20H20C21.1046 20 22 19.1046 22 18V6C22 4.89543 21.1046 4 20 4H18V6H20V18H4V6H6V4ZM15.9265 8.56421L10.9717 13.519L8.14727 10.6945L6.73306 12.1087L10.2646 15.6403C10.6552 16.0308 11.2883 16.0308 11.6788 15.6403L17.3407 9.97842L15.9265 8.56421Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _eventAvailable!!
    }

private var _eventAvailable: ImageVector? = null
