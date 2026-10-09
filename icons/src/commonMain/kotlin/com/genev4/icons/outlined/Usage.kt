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

public val Icons.Outlined.Usage: ImageVector
    get() {
        if (_usage != null) {
            return _usage!!
        }
        _usage =
            materialIcon(name = "Outlined.Usage") {
            addPath(
                pathData = PathParser().parsePathString("M12 2H11V13H22V12C22 6.47716 17.5228 2 12 2ZM13 4.062L13.2258 4.09333C16.6626 4.6218 19.3782 7.33744 19.9067 10.7742L19.937 11H13V4.062ZM9 4.58148V2.45777C4.94289 3.73203 2 7.52233 2 12C2 17.5228 6.47715 22 12 22C16.4776 22 20.2679 19.0571 21.5422 15H19.4185C18.2317 17.9318 15.3574 20 12 20C7.58172 20 4 16.4183 4 12C4 8.6426 6.06817 5.76826 9 4.58148Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _usage!!
    }

private var _usage: ImageVector? = null
