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

public val Icons.Outlined.CountdownDay: ImageVector
    get() {
        if (_countdownDay != null) {
            return _countdownDay!!
        }
        _countdownDay =
            materialIcon(name = "Outlined.CountdownDay") {
            addPath(
                pathData = PathParser().parsePathString("M7 7V3H9V7H7ZM15 7V3H17V7H15ZM10 6H14V4H10V6ZM6 4H4C2.89543 4 2 4.89543 2 6V18C2 19.1046 2.89543 20 4 20H20C21.1046 20 22 19.1046 22 18V6C22 4.89543 21.1046 4 20 4H18V6H20V18H4V6H6V4ZM14.7554 8.42725V9.51314C14.7554 10.843 13.8114 11.9524 12.557 12.2078C13.3718 12.3716 14.0556 12.8978 14.4348 13.6106C14.6394 13.9952 14.7554 14.4342 14.7554 14.9003V15.9862H9.25537V14.9003C9.25537 13.5701 10.1998 12.4605 11.4548 12.2055C10.1998 11.953 9.25537 10.8434 9.25537 9.51314V8.42725H14.7554Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _countdownDay!!
    }

private var _countdownDay: ImageVector? = null
