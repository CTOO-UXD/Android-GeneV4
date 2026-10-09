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

public val Icons.Outlined.CreditScore: ImageVector
    get() {
        if (_creditScore != null) {
            return _creditScore!!
        }
        _creditScore =
            materialIcon(name = "Outlined.CreditScore") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V11.9995H20V11H4V16C4 17.1046 4.89543 18 6 18H9V20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM18 6H6C4.89543 6 4 6.89543 4 8H20C20 6.89543 19.1046 6 18 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.663 21.2911L22.0266 14.9268L20.6123 13.5127L14.9558 19.1698L12.1271 16.3411L10.7129 17.7553L14.2488 21.2912C14.4363 21.4787 14.6907 21.5841 14.9559 21.5841C15.2211 21.5841 15.4755 21.4787 15.663 21.2911Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _creditScore!!
    }

private var _creditScore: ImageVector? = null
