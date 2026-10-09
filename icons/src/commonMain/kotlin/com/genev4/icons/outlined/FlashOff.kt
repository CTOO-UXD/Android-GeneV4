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

public val Icons.Outlined.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff =
            materialIcon(name = "Outlined.FlashOff") {
            addPath(
                pathData = PathParser().parsePathString("M7 2H17L15 9H19L16.075 13.225L14.65 11.8L15.2 11H13.85L12.675 9.825L14.35 4H9V6.15L7 4.15V2ZM10 22V14H7V9.85L1.375 4.225L2.8 2.8L21.2 21.2L19.775 22.625L13.75 16.6L10 22Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
