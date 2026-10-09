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

public val Icons.Outlined.FlashAuto: ImageVector
    get() {
        if (_flashAuto != null) {
            return _flashAuto!!
        }
        _flashAuto =
            materialIcon(name = "Outlined.FlashAuto") {
            addPath(
                pathData = PathParser().parsePathString("M16 3L14 10H18L9 23V15H6V3H16ZM18.745 14.0344L21.685 21.0344H20.095L19.505 19.5344H16.455L15.875 21.0344H14.315L17.245 14.0344H18.745ZM17.995 15.6244L16.945 18.3044H19.025L17.995 15.6244ZM13.35 5H8V13H11V16.6L14.2 12H11.35L13.35 5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _flashAuto!!
    }

private var _flashAuto: ImageVector? = null
