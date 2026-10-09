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

public val Icons.Filled.CreditScore: ImageVector
    get() {
        if (_creditScore != null) {
            return _creditScore!!
        }
        _creditScore =
            materialIcon(name = "Filled.CreditScore") {
            addPath(
                pathData = PathParser().parsePathString("M22 8C22 5.79086 20.2091 4 18 4H6C3.79086 4 2 5.79086 2 8V16C2 18.2091 3.79086 20 6 20H10.1292L9.29868 19.1695C8.51763 18.3885 8.51763 17.1221 9.29868 16.3411L10.7129 14.9269C11.088 14.5518 11.5967 14.3411 12.1271 14.3411C12.6575 14.3411 13.1662 14.5518 13.5413 14.9269L14.9558 16.3413L19.1981 12.0986C19.5731 11.7235 20.0818 11.5127 20.6122 11.5127C21.1303 11.5127 21.6276 11.7136 22 12.0724V8ZM4 8H20V11H4V8Z").toNodes(),
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
