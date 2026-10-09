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

public val Icons.Outlined.ActivePenCharging: ImageVector
    get() {
        if (_activePenCharging != null) {
            return _activePenCharging!!
        }
        _activePenCharging =
            materialIcon(name = "Outlined.ActivePenCharging") {
            addPath(
                pathData = PathParser().parsePathString("M9.80931 19.1479L20.4854 8.47182C21.8522 7.10498 21.8522 4.88891 20.4854 3.52207C19.1186 2.15524 16.9025 2.15524 15.5356 3.52207L4.94071 14.117C4.70241 14.3553 3.90113 16.3993 2.53688 20.249C2.34198 20.9896 3.01783 21.6655 3.75844 21.4706C7.57208 20.1424 9.58904 19.3682 9.80931 19.1479ZM19.0151 7.10116C19.6007 6.51496 19.6004 5.56514 19.014 4.97866C18.4282 4.39353 17.479 4.39406 16.8938 4.97984L6.4005 15.4848L4.9073 19.1001L8.48108 17.6469L19.0151 7.10116Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
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
