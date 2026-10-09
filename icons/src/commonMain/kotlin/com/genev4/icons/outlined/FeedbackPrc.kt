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

public val Icons.Outlined.FeedbackPrc: ImageVector
    get() {
        if (_feedbackPrc != null) {
            return _feedbackPrc!!
        }
        _feedbackPrc =
            materialIcon(name = "Outlined.FeedbackPrc") {
            addPath(
                pathData = PathParser().parsePathString("M5.28249 18.2175C1.5725 14.5075 1.5725 8.49247 5.28249 4.78249C8.99247 1.0725 15.0075 1.0725 18.7175 4.78249C22.4275 8.49247 22.4275 14.5075 18.7175 18.2175C16.8625 20.0725 14.4313 21 12 21V22.5208C12 23.4117 10.9229 23.8579 10.2929 23.2279L5.28249 18.2175ZM10 20.1066V19H12C13.9225 19 15.8384 18.2682 17.3033 16.8033C20.2322 13.8744 20.2322 9.12563 17.3033 6.1967C14.3744 3.26777 9.62563 3.26777 6.6967 6.1967C3.76777 9.12563 3.76777 13.8744 6.6967 16.8033L10 20.1066ZM13 7V13H11V7H13ZM11 14H13V16H11V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _feedbackPrc!!
    }

private var _feedbackPrc: ImageVector? = null
