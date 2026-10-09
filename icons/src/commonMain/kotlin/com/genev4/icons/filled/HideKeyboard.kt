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

public val Icons.Filled.HideKeyboard: ImageVector
    get() {
        if (_hideKeyboard != null) {
            return _hideKeyboard!!
        }
        _hideKeyboard =
            materialIcon(name = "Filled.HideKeyboard") {
            addPath(
                pathData = PathParser().parsePathString("M20 4C21.1046 4 22 4.89543 22 6V18C22 19.1046 21.1046 20 20 20H14.6668L12.3001 21.775C12.1224 21.9083 11.8779 21.9083 11.7001 21.775L9.33347 20H4C2.89543 20 2 19.1046 2 18V6C2 4.89543 2.89543 4 4 4H20ZM7 8V10H5V8H7ZM7 11V13H5V11H7ZM16 15V17H8V15H16ZM11 13V11H9V13H11ZM15 11V13H13V11H15ZM19 13V11H17V13H19ZM11 10V8H9V10H11ZM15 8V10H13V8H15ZM19 10V8H17V10H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _hideKeyboard!!
    }

private var _hideKeyboard: ImageVector? = null
