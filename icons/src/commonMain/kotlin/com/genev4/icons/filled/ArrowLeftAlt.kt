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

public val Icons.Filled.ArrowLeftAlt: ImageVector
    get() {
        if (_arrowLeftAlt != null) {
            return _arrowLeftAlt!!
        }
        _arrowLeftAlt =
            materialIcon(name = "Filled.ArrowLeftAlt") {
            addPath(
                pathData = PathParser().parsePathString("M6.41342 13.4107L10.999 17.9963L12.4132 16.5821L8.82753 12.9964L18.0004 12.9965L18.0004 10.9965L8.82774 10.9964L12.4168 7.40741L11.0025 5.99319L6.41342 10.5823C5.63238 11.3634 5.63237 12.6297 6.41342 13.4107Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowLeftAlt!!
    }

private var _arrowLeftAlt: ImageVector? = null
