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

public val Icons.Filled.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete =
            materialIcon(name = "Filled.Delete") {
            addPath(
                pathData = PathParser().parsePathString("M14 2C15.1046 2 16 2.89543 16 4V5H22V7H20V18C20 20.2091 18.2091 22 16 22H8C5.79086 22 4 20.2091 4 18V7H2V5H8V4C8 2.89543 8.89543 2 10 2H14ZM10 5H14V4H10V5ZM11 9V18H9V9H11ZM15 18V9H13V18H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _delete!!
    }

private var _delete: ImageVector? = null
