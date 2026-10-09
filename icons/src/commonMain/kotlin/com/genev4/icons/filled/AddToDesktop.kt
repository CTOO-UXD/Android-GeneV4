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

public val Icons.Filled.AddToDesktop: ImageVector
    get() {
        if (_addToDesktop != null) {
            return _addToDesktop!!
        }
        _addToDesktop =
            materialIcon(name = "Filled.AddToDesktop") {
            addPath(
                pathData = PathParser().parsePathString("M11 5C11 3.89543 10.1046 3 9 3H5C3.89543 3 3 3.89543 3 5V9C3 10.1046 3.89543 11 5 11H9C10.1046 11 11 10.1046 11 9V5ZM21 5C21 3.89543 20.1046 3 19 3H15C13.8954 3 13 3.89543 13 5V9C13 10.1046 13.8954 11 15 11H19C20.1046 11 21 10.1046 21 9V5ZM11 15C11 13.8954 10.1046 13 9 13H5C3.89543 13 3 13.8954 3 15V19C3 20.1046 3.89543 21 5 21H9C10.1046 21 11 20.1046 11 19V15ZM15.5 19.5V16.9142L19.7929 21.2071L21.2071 19.7929L16.9142 15.5H19.5H20V13.5H19.5H14.5C13.9477 13.5 13.5 13.9477 13.5 14.5V19.5V20H15.5V19.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _addToDesktop!!
    }

private var _addToDesktop: ImageVector? = null
