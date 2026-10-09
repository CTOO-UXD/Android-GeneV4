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

public val Icons.Outlined.MobileOff: ImageVector
    get() {
        if (_mobileOff != null) {
            return _mobileOff!!
        }
        _mobileOff =
            materialIcon(name = "Outlined.MobileOff") {
            addPath(
                pathData = PathParser().parsePathString("M19.0002 3.99902V16.1711L17.0002 14.1711V3.99902H7.00024V4.17108L5.5026 2.67344C5.86902 2.25978 6.40418 1.99902 7.00024 1.99902H17.0002C18.1048 1.99902 19.0002 2.89445 19.0002 3.99902Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.00024 7.82788L0.686523 3.51416L2.10074 2.09995L21.8997 21.8989L20.4855 23.3132L18.4975 21.3251C18.1311 21.7385 17.5961 21.999 17.0002 21.999H7.00024C5.89567 21.999 5.00024 21.1036 5.00024 19.999V7.82788ZM17.0002 19.8279V19.999H7.00024V9.82788L17.0002 19.8279Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mobileOff!!
    }

private var _mobileOff: ImageVector? = null
