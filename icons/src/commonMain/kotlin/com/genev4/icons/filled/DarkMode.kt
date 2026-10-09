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

public val Icons.Filled.DarkMode: ImageVector
    get() {
        if (_darkMode != null) {
            return _darkMode!!
        }
        _darkMode =
            materialIcon(name = "Filled.DarkMode") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.99902C6.47715 1.99902 2 6.47618 2 11.999C2 17.5219 6.47715 21.999 12 21.999C17.5229 21.999 22 17.5219 22 11.999C22 6.47618 17.5229 1.99902 12 1.99902ZM11 4.06092C7.05369 4.55302 4 7.91941 4 11.999C4 16.0786 7.05369 19.445 11 19.9371V4.06092Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _darkMode!!
    }

private var _darkMode: ImageVector? = null
