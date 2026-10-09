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

public val Icons.Outlined.PhonelinkErase: ImageVector
    get() {
        if (_phonelinkErase != null) {
            return _phonelinkErase!!
        }
        _phonelinkErase =
            materialIcon(name = "Outlined.PhonelinkErase") {
            addPath(
                pathData = PathParser().parsePathString("M16 4H6L6 20H16V17H18V20C18 21.1046 17.1046 22 16 22H6C4.89543 22 4 21.1046 4 20V4C4 2.89543 4.89543 2 6 2H16C17.1046 2 18 2.89543 18 4V7H16V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14.4 16L13 14.6L15.6 12L13 9.4L14.4 8L17 10.6L19.6 8L21 9.4L18.4 12L21 14.6L19.6 16L17 13.4L14.4 16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _phonelinkErase!!
    }

private var _phonelinkErase: ImageVector? = null
