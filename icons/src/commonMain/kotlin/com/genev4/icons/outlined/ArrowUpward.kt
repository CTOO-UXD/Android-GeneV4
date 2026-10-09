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

public val Icons.Outlined.ArrowUpward: ImageVector
    get() {
        if (_arrowUpward != null) {
            return _arrowUpward!!
        }
        _arrowUpward =
            materialIcon(name = "Outlined.ArrowUpward") {
            addPath(
                pathData = PathParser().parsePathString("M10.5868 5.40778L3.9895 12.0051L5.40372 13.4193L11.001 7.822L11.001 20.0166H13.001L13.001 7.82198L18.5983 13.4193L20.0125 12.0051L13.4152 5.40778C12.6342 4.62673 11.3679 4.62673 10.5868 5.40778Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowUpward!!
    }

private var _arrowUpward: ImageVector? = null
