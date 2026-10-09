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

public val Icons.Outlined.ElectricBolt: ImageVector
    get() {
        if (_electricBolt != null) {
            return _electricBolt!!
        }
        _electricBolt =
            materialIcon(name = "Outlined.ElectricBolt") {
            addPath(
                pathData = PathParser().parsePathString("M15.9998 0.999512H13.9998L3.99976 14.9995H9.99976L7.99976 22.9995H9.99976L19.9998 8.99951H13.9998L15.9998 0.999512ZM16.1134 10.9995H11.4382L12.5816 6.42583L7.88613 12.9995H12.5613L11.4179 17.5732L16.1134 10.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _electricBolt!!
    }

private var _electricBolt: ImageVector? = null
