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

public val Icons.Filled.TuneAlt: ImageVector
    get() {
        if (_tuneAlt != null) {
            return _tuneAlt!!
        }
        _tuneAlt =
            materialIcon(name = "Filled.TuneAlt") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM16 7.5H14V8.5V10.5V11.5H16V10.5H18V8.5H16V7.5ZM10 12.5H8V13.5H6V15.5H8V16.5H10V15.5V13.5V12.5ZM13 8.5H6V10.5H13V8.5ZM11 15.5H18V13.5H11V15.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _tuneAlt!!
    }

private var _tuneAlt: ImageVector? = null
