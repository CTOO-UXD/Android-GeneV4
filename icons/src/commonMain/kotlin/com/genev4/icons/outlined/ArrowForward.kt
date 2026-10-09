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

public val Icons.Outlined.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward =
            materialIcon(name = "Outlined.ArrowForward") {
            addPath(
                pathData = PathParser().parsePathString("M18.5912 10.5848L11.9939 3.98746L10.5797 5.40167L16.177 10.999L3.98242 10.999V12.999L16.177 12.999L10.5797 18.5963L11.9939 20.0105L18.5912 13.4132C19.3723 12.6321 19.3723 11.3658 18.5912 10.5848Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
