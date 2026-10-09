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

public val Icons.Filled.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) {
            return _creditCardOff!!
        }
        _creditCardOff =
            materialIcon(name = "Filled.CreditCardOff") {
            addPath(
                pathData = PathParser().parsePathString("M17.1724 20L20.4855 23.3132L21.8997 21.899L2.10074 2.09998L0.686523 3.51419L2.78815 5.61582C2.29314 6.28162 2.00024 7.10662 2.00024 8.00003V16C2.00024 18.2092 3.79111 20 6.00024 20H17.1724ZM8.17236 11L5.17236 8.00003H4.00024V11H8.17236Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.0002 16C22.0002 16.8932 21.7075 17.718 21.2127 18.3837L13.829 11H20.0002V8.00003H10.829L6.82904 4.00003H18.0002C20.2094 4.00003 22.0002 5.79089 22.0002 8.00003V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
