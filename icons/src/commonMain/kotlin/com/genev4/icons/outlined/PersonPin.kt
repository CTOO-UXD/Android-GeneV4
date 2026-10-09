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

public val Icons.Outlined.PersonPin: ImageVector
    get() {
        if (_personPin != null) {
            return _personPin!!
        }
        _personPin =
            materialIcon(name = "Outlined.PersonPin") {
            addPath(
                pathData = PathParser().parsePathString("M12 13C14.2091 13 16 11.2091 16 9C16 6.79086 14.2091 5 12 5C9.79086 5 8 6.79086 8 9C8 11.2091 9.79086 13 12 13ZM12 11C13.1046 11 14 10.1046 14 9C14 7.89543 13.1046 7 12 7C10.8954 7 10 7.89543 10 9C10 10.1046 10.8954 11 12 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 20H15L12.7071 22.2929C12.3166 22.6834 11.6834 22.6834 11.2929 22.2929L9 20H7C4.79086 20 3 18.2091 3 16V6C3 3.79086 4.79086 2 7 2H17C19.2091 2 21 3.79086 21 6V16C21 18.2091 19.2091 20 17 20ZM16.3308 18H14.1716L12 20.1716L9.82843 18H7.66919C7.83857 17.6956 8.04505 17.4171 8.29423 17.1746C8.90074 16.5843 9.97118 16 12 16C14.0288 16 15.0993 16.5843 15.7058 17.1746C15.955 17.4171 16.1614 17.6956 16.3308 18ZM18.3176 17.5047C17.4917 15.6659 15.7176 14 12 14C8.28237 14 6.50829 15.6659 5.68242 17.5047C5.26412 17.1381 5 16.5999 5 16V6C5 4.89543 5.89543 4 7 4H17C18.1046 4 19 4.89543 19 6V16C19 16.5999 18.7359 17.1381 18.3176 17.5047Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _personPin!!
    }

private var _personPin: ImageVector? = null
