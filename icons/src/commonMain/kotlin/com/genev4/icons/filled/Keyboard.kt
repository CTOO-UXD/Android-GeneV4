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

public val Icons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard =
            materialIcon(name = "Filled.Keyboard") {
            addPath(
                pathData = PathParser().parsePathString("M22 6C22 4.89543 21.1046 4 20 4H4C2.89543 4 2 4.89543 2 6V18C2 19.1046 2.89543 20 4 20H20C21.1046 20 22 19.1046 22 18V6ZM7 10V8H5V10H7ZM7 13V11H5V13H7ZM16 17V15H8V17H16ZM11 11V13H9V11H11ZM15 13V11H13V13H15ZM19 11V13H17V11H19ZM11 8V10H9V8H11ZM15 10V8H13V10H15ZM19 8V10H17V8H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
