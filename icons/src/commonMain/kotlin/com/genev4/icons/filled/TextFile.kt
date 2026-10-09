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

public val Icons.Filled.TextFile: ImageVector
    get() {
        if (_textFile != null) {
            return _textFile!!
        }
        _textFile =
            materialIcon(name = "Filled.TextFile") {
            addPath(
                pathData = PathParser().parsePathString("M16 2L20 6V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V6C4 3.79086 5.79086 2 8 2H16ZM16 7H19L15 3V6C15 6.55228 15.4477 7 16 7ZM14 16V14H8V16H14ZM16 12V10H8V12H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _textFile!!
    }

private var _textFile: ImageVector? = null
