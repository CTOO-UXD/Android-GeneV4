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

public val Icons.Outlined.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu =
            materialIcon(name = "Outlined.Menu") {
            addPath(
                pathData = PathParser().parsePathString("M4 5H20V7H4V5ZM4 11H20V13H4V11ZM4 17H20V19H4V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _menu!!
    }

private var _menu: ImageVector? = null
