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

public val Icons.Filled.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward =
            materialIcon(name = "Filled.ArrowForward") {
            addPath(
                pathData = PathParser().parsePathString("M18.5912 10.585L11.9939 3.98767L10.5797 5.40188L16.177 10.9992L3.98242 10.9992V12.9992L16.177 12.9992L10.5797 18.5965L11.9939 20.0107L18.5912 13.4134C19.3723 12.6324 19.3723 11.366 18.5912 10.585Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
