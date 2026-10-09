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

public val Icons.Filled.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power =
            materialIcon(name = "Filled.Power") {
            addPath(
                pathData = PathParser().parsePathString("M10.5 1.99805V10.998H13.5V1.99805H10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 11.998C3 8.833 4.63377 6.04955 7.10398 4.44502L8.49395 7.12844C6.98331 8.218 6 9.99319 6 11.998C6 15.3117 8.68629 17.998 12 17.998C15.3137 17.998 18 15.3117 18 11.998C18 9.99319 17.0167 8.218 15.506 7.12844L16.896 4.44502C19.3662 6.04955 21 8.833 21 11.998C21 16.9686 16.9706 20.998 12 20.998C7.02944 20.998 3 16.9686 3 11.998Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _power!!
    }

private var _power: ImageVector? = null
