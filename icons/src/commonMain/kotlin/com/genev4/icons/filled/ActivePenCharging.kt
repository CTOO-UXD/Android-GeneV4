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

public val Icons.Filled.ActivePenCharging: ImageVector
    get() {
        if (_activePenCharging != null) {
            return _activePenCharging!!
        }
        _activePenCharging =
            materialIcon(name = "Filled.ActivePenCharging") {
            addPath(
                pathData = PathParser().parsePathString("M9.80931 19.1479L20.4854 8.47179C21.8522 7.10495 21.8522 4.88888 20.4854 3.52204C19.1186 2.15521 16.9025 2.15521 15.5356 3.52204L4.94071 14.1169C4.70241 14.3552 3.90113 16.3993 2.53688 20.249C2.34198 20.9896 3.01783 21.6655 3.75844 21.4706C7.57208 20.1424 9.58904 19.3682 9.80931 19.1479Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.5 12.9994L19 16.9994H21L16.5 22.9994L17 18.9994H15L19.5 12.9994Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _activePenCharging!!
    }

private var _activePenCharging: ImageVector? = null
