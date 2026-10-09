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

public val Icons.Outlined.HideKeyboard: ImageVector
    get() {
        if (_hideKeyboard != null) {
            return _hideKeyboard!!
        }
        _hideKeyboard =
            materialIcon(name = "Outlined.HideKeyboard") {
            addPath(
                pathData = PathParser().parsePathString("M15.25 19C15.3881 19 15.5 19.1119 15.5 19.25C15.5 19.3287 15.463 19.4028 15.4 19.45L12.3 21.775C12.1222 21.9083 11.8778 21.9083 11.7 21.775L8.6 19.45C8.48954 19.3672 8.46716 19.2105 8.55 19.1C8.59721 19.037 8.67131 19 8.75 19H15.25ZM20 4C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H17V18H20V6H4V18H7V20H4C2.89543 20 2 19.1046 2 18V6C2 4.89543 2.89543 4 4 4H20ZM16 15V17H8V15H16ZM7 11V13H5V11H7ZM11 11V13H9V11H11ZM15 11V13H13V11H15ZM19 11V13H17V11H19ZM7 8V10H5V8H7ZM11 8V10H9V8H11ZM15 8V10H13V8H15ZM19 8V10H17V8H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _hideKeyboard!!
    }

private var _hideKeyboard: ImageVector? = null
