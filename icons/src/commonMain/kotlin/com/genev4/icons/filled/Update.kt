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

public val Icons.Filled.Update: ImageVector
    get() {
        if (_update != null) {
            return _update!!
        }
        _update =
            materialIcon(name = "Filled.Update") {
            addPath(
                pathData = PathParser().parsePathString("M8.96398 22.0044H14.964L15.1132 21.9989C16.1481 21.9226 16.964 21.0588 16.964 20.0044L16.9641 13.0714L19.0351 13.0712C20.8169 13.0711 21.7092 10.9169 20.4493 9.657L13.3782 2.58593C12.5971 1.80488 11.3308 1.80488 10.5498 2.58593L3.4787 9.657L3.37309 9.77041C2.27206 11.0418 3.16347 13.0711 4.89283 13.0712L6.96505 13.0714L6.96398 20.0044C6.96397 21.109 7.85941 22.0044 8.96398 22.0044Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _update!!
    }

private var _update: ImageVector? = null
