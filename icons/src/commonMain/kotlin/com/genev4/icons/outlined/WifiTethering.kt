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

public val Icons.Outlined.WifiTethering: ImageVector
    get() {
        if (_wifiTethering != null) {
            return _wifiTethering!!
        }
        _wifiTethering =
            materialIcon(name = "Outlined.WifiTethering") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 15.6851 20.0067 18.9046 17.0395 20.6392L16.0316 18.9114C18.4054 17.5237 20 14.9481 20 12C20 7.58172 16.4183 4 12 4C7.58172 4 4 7.58172 4 12C4 14.9481 5.59462 17.5237 7.96838 18.9114L6.96047 20.6392C3.99328 18.9046 2 15.6851 2 12C2 6.47715 6.47715 2 12 2ZM18 12C18 14.211 16.804 16.1428 15.0237 17.1835L14.0158 15.4557C15.2027 14.7618 16 13.474 16 12C16 9.79086 14.2091 8 12 8C9.79086 8 8 9.79086 8 12C8 13.474 8.79731 14.7618 9.98419 15.4557L8.97628 17.1835C7.19597 16.1428 6 14.211 6 12C6 8.68629 8.68629 6 12 6C15.3137 6 18 8.68629 18 12ZM12 14C13.1046 14 14 13.1046 14 12C14 10.8954 13.1046 10 12 10C10.8954 10 10 10.8954 10 12C10 13.1046 10.8954 14 12 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _wifiTethering!!
    }

private var _wifiTethering: ImageVector? = null
