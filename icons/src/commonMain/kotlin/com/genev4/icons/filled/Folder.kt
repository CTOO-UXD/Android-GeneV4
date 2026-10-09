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

public val Icons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder =
            materialIcon(name = "Filled.Folder") {
            addPath(
                pathData = PathParser().parsePathString("M13 5L10 3H6C3.79086 3 2 4.79086 2 7V9H22C22 6.79086 20.2091 5 18 5H13ZM22 11H2V16C2 18.2091 3.79086 20 6 20H18C20.2091 20 22 18.2091 22 16V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _folder!!
    }

private var _folder: ImageVector? = null
