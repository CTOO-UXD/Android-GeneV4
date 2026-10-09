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

public val Icons.Outlined.OpenInPhone: ImageVector
    get() {
        if (_openInPhone != null) {
            return _openInPhone!!
        }
        _openInPhone =
            materialIcon(name = "Outlined.OpenInPhone") {
            addPath(
                pathData = PathParser().parsePathString("M17 4H7V9H5V4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V20C19 21.1046 18.1046 22 17 22H7C5.89543 22 5 21.1046 5 20V15H7V20H17V4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 11V13H10.15L8.6 14.6L10 16L14 12L10 8L8.6 9.4L10.15 11H2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _openInPhone!!
    }

private var _openInPhone: ImageVector? = null
