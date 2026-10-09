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

public val Icons.Outlined.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) {
            return _creditCardOff!!
        }
        _creditCardOff =
            materialIcon(name = "Outlined.CreditCardOff") {
            addPath(
                pathData = PathParser().parsePathString("M17.1724 20L20.4855 23.3132L21.8997 21.899L2.10074 2.09998L0.686523 3.51419L2.78815 5.61582C2.29314 6.28162 2.00024 7.10662 2.00024 8.00003V16C2.00024 18.2092 3.79111 20 6.00024 20H17.1724ZM15.1724 18L8.17236 11H4.00024V16C4.00024 17.1046 4.89567 18 6.00024 18H15.1724ZM5.17236 8.00003L4.23373 7.0614C4.0847 7.3413 4.00024 7.6608 4.00024 8.00003H5.17236Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.0002 4.00003H6.82904L8.82904 6.00003H18.0002C19.1048 6.00003 20.0002 6.89546 20.0002 8.00003H10.829L13.829 11H20.0002V16C20.0002 16.339 19.9159 16.6583 19.7671 16.9381L21.2127 18.3837C21.7075 17.718 22.0002 16.8932 22.0002 16V8.00003C22.0002 5.79089 20.2094 4.00003 18.0002 4.00003Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
