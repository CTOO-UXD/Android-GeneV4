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

public val Icons.Outlined.Listview: ImageVector
    get() {
        if (_listview != null) {
            return _listview!!
        }
        _listview =
            materialIcon(name = "Outlined.Listview") {
            addPath(
                pathData = PathParser().parsePathString("M4.5 7.5C5.32843 7.5 6 6.82843 6 6C6 5.17157 5.32843 4.5 4.5 4.5C3.67157 4.5 3 5.17157 3 6C3 6.82843 3.67157 7.5 4.5 7.5ZM4.5 13.5C5.32843 13.5 6 12.8284 6 12C6 11.1716 5.32843 10.5 4.5 10.5C3.67157 10.5 3 11.1716 3 12C3 12.8284 3.67157 13.5 4.5 13.5ZM6 18C6 18.8284 5.32843 19.5 4.5 19.5C3.67157 19.5 3 18.8284 3 18C3 17.1716 3.67157 16.5 4.5 16.5C5.32843 16.5 6 17.1716 6 18ZM21 5H8V7H21V5ZM8 11H21V13H8V11ZM21 17H8V19H21V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _listview!!
    }

private var _listview: ImageVector? = null
