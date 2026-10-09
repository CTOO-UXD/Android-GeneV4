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

public val Icons.Outlined.Speed: ImageVector
    get() {
        if (_speed != null) {
            return _speed!!
        }
        _speed =
            materialIcon(name = "Outlined.Speed") {
            addPath(
                pathData = PathParser().parsePathString("M22 13C22 11.3223 21.5869 9.74115 20.8568 8.35265L19.4269 10.0209C19.7966 10.9416 20 11.9471 20 13L19.9947 13.2934C19.9171 15.4375 18.9918 17.4186 17.459 18.8485L17.29 19H6.709L6.54099 18.8485C4.93848 17.3536 4 15.2563 4 13C4 8.58172 7.58172 5 12 5C13.3237 5 14.5722 5.32147 15.6719 5.8906L17.2843 4.50861C15.751 3.55245 13.94 3 12 3C6.47715 3 2 7.47715 2 13C2 16.2717 3.57121 19.1765 6.00024 21.0009H17.9998C20.4288 19.1765 22 16.2717 22 13ZM20.1339 5.35683C19.9344 5.15733 19.6149 5.14506 19.4007 5.32867L11.0197 12.5124C10.4054 13.0389 10.3693 13.9771 10.9415 14.5492C11.5136 15.1214 12.4518 15.0853 12.9783 14.471L20.162 6.09001C20.3456 5.8758 20.3334 5.55633 20.1339 5.35683Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _speed!!
    }

private var _speed: ImageVector? = null
