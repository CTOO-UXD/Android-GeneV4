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

public val Icons.Filled.PersonPin: ImageVector
    get() {
        if (_personPin != null) {
            return _personPin!!
        }
        _personPin =
            materialIcon(name = "Filled.PersonPin") {
            addPath(
                pathData = PathParser().parsePathString("M17 2H7C4.79086 2 3 3.79086 3 6V16C3 18.2091 4.79086 20 7 20H9L11.2929 22.2929C11.6834 22.6834 12.3166 22.6834 12.7071 22.2929L15 20H17C19.2091 20 21 18.2091 21 16V6C21 3.79086 19.2091 2 17 2ZM18.3176 17.5047C17.4917 15.6659 15.7176 14 12 14C8.28237 14 6.50829 15.6659 5.68242 17.5047C6.03432 17.8131 6.49533 18 7 18H17C17.5047 18 17.9657 17.8131 18.3176 17.5047ZM12 12C13.6569 12 15 10.6569 15 9C15 7.34315 13.6569 6 12 6C10.3431 6 9 7.34315 9 9C9 10.6569 10.3431 12 12 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _personPin!!
    }

private var _personPin: ImageVector? = null
