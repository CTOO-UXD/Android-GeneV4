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

public val Icons.Outlined.Freeform: ImageVector
    get() {
        if (_freeform != null) {
            return _freeform!!
        }
        _freeform =
            materialIcon(name = "Outlined.Freeform") {
            addPath(
                pathData = PathParser().parsePathString("M7 5.33057H17C18.1046 5.33057 19 6.226 19 7.33057V17.3306C19 18.4351 18.1046 19.3306 17 19.3306H7C5.89543 19.3306 5 18.4351 5 17.3306V7.33057C5 6.226 5.89543 5.33057 7 5.33057ZM3 7.33057C3 5.12143 4.79086 3.33057 7 3.33057H17C19.2091 3.33057 21 5.12143 21 7.33057V17.3306C21 19.5397 19.2091 21.3306 17 21.3306H7C4.79086 21.3306 3 19.5397 3 17.3306V7.33057ZM12 7.33057C11.4477 7.33057 11 7.77828 11 8.33057V14.3306C11 14.8829 11.4477 15.3306 12 15.3306H16C16.5523 15.3306 17 14.8829 17 14.3306V8.33057C17 7.77828 16.5523 7.33057 16 7.33057H12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _freeform!!
    }

private var _freeform: ImageVector? = null
