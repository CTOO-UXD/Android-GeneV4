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

public val Icons.Filled.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox =
            materialIcon(name = "Filled.Inbox") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C19.2091 3 21 4.79086 21 7V13V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V13V7C3 4.79086 4.79086 3 7 3H17ZM19 13.0001L15.163 13.0004C14.6012 14.1826 13.3961 15 12 15C10.6039 15 9.3988 14.1826 8.83699 13.0004L5 13.0001V7C5 5.89543 5.89543 5 7 5H17C18.1046 5 19 5.89543 19 7V13.0001Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _inbox!!
    }

private var _inbox: ImageVector? = null
