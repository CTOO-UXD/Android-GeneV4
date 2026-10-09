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

public val Icons.Filled.FlashlightOn: ImageVector
    get() {
        if (_flashlightOn != null) {
            return _flashlightOn!!
        }
        _flashlightOn =
            materialIcon(name = "Filled.FlashlightOn") {
            addPath(
                pathData = PathParser().parsePathString("M15.8902 2.45297L21.5471 8.10983C22.3281 8.89088 22.3281 10.1572 21.5471 10.9383L19.4498 13.0355L10.9646 4.55021L13.0618 2.45297C13.8428 1.67193 15.1092 1.67193 15.8902 2.45297ZM9.89185 6.30594L8.81915 9.52404L3.1623 15.1809C1.6002 16.743 1.6002 19.2757 3.1623 20.8377C4.72439 22.3998 7.25705 22.3998 8.81915 20.8377L14.476 15.1809L17.6941 14.1082L9.89185 6.30594ZM10.2336 15.1809L11.6478 13.7667L10.2336 12.3525L8.81941 13.7667L10.2336 15.1809Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
