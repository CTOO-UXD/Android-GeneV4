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

public val Icons.Filled.ElectricBolt: ImageVector
    get() {
        if (_electricBolt != null) {
            return _electricBolt!!
        }
        _electricBolt =
            materialIcon(name = "Filled.ElectricBolt") {
            addPath(
                pathData = PathParser().parsePathString("M13.9998 8.99951L15.9998 0.999512H13.9998L3.99976 14.9995H9.99976L7.99976 22.9995H9.99976L19.9998 8.99951H13.9998Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _electricBolt!!
    }

private var _electricBolt: ImageVector? = null
