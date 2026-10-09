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

public val Icons.Outlined.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard =
            materialIcon(name = "Outlined.Keyboard") {
            addPath(
                pathData = PathParser().parsePathString("M19.8008 4C20.9054 4 21.8008 4.89543 21.8008 6V18C21.8008 19.1046 20.9054 20 19.8008 20H3.80078C2.69621 20 1.80078 19.1046 1.80078 18V6C1.80078 4.89543 2.69621 4 3.80078 4H19.8008ZM19.8008 6H3.80078V18H19.8008V6ZM15.8008 15V17H7.80078V15H15.8008ZM6.80078 11V13H4.80078V11H6.80078ZM10.8008 11V13H8.80078V11H10.8008ZM14.8008 11V13H12.8008V11H14.8008ZM18.8008 11V13H16.8008V11H18.8008ZM6.80078 8V10H4.80078V8H6.80078ZM10.8008 8V10H8.80078V8H10.8008ZM14.8008 8V10H12.8008V8H14.8008ZM18.8008 8V10H16.8008V8H18.8008Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
