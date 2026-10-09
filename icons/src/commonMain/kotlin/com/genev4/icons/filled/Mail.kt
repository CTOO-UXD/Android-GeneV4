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

public val Icons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail =
            materialIcon(name = "Filled.Mail") {
            addPath(
                pathData = PathParser().parsePathString("M6 3.97437C3.79086 3.97437 2 5.76523 2 7.97437V15.9744C2 18.1835 3.79086 19.9744 6 19.9744H18C20.2091 19.9744 22 18.1835 22 15.9744V7.97437C22 5.76523 20.2091 3.97437 18 3.97437H6ZM19.4562 6.79267L12 11.6241L4.54376 6.79267L3.45618 8.47111L10.9124 13.3025C11.5741 13.7313 12.4259 13.7313 13.0876 13.3025L20.5438 8.47111L19.4562 6.79267Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mail!!
    }

private var _mail: ImageVector? = null
