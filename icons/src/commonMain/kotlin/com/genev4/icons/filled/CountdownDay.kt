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

public val Icons.Filled.CountdownDay: ImageVector
    get() {
        if (_countdownDay != null) {
            return _countdownDay!!
        }
        _countdownDay =
            materialIcon(name = "Filled.CountdownDay") {
            addPath(
                pathData = PathParser().parsePathString("M9 4H15V3H17V4H20C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H4C2.89543 20 2 19.1046 2 18V6C2 4.89543 2.89543 4 4 4H7V3H9V4ZM14.7554 9.51314V8.42725H9.25537V9.51314C9.25537 10.8434 10.1998 11.953 11.4548 12.2055C10.1998 12.4605 9.25537 13.5701 9.25537 14.9003V15.9862H14.7554V14.9003C14.7554 14.4342 14.6394 13.9952 14.4348 13.6106C14.0556 12.8978 13.3718 12.3716 12.557 12.2078C13.8114 11.9524 14.7554 10.843 14.7554 9.51314Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _countdownDay!!
    }

private var _countdownDay: ImageVector? = null
