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

public val Icons.Filled.AddCardNew: ImageVector
    get() {
        if (_addCardNew != null) {
            return _addCardNew!!
        }
        _addCardNew =
            materialIcon(name = "Filled.AddCardNew") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM11 8H13V11H16V13H13V16H11V13H8V11H11V8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _addCardNew!!
    }

private var _addCardNew: ImageVector? = null
