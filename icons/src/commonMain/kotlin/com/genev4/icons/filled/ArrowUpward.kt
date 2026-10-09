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

public val Icons.Filled.ArrowUpward: ImageVector
    get() {
        if (_arrowUpward != null) {
            return _arrowUpward!!
        }
        _arrowUpward =
            materialIcon(name = "Filled.ArrowUpward") {
            addPath(
                pathData = PathParser().parsePathString("M10.5868 5.40753L3.9895 12.0048L5.40372 13.4191L11.001 7.82176L11.001 20.0163H13.001L13.001 7.82173L18.5983 13.419L20.0125 12.0048L13.4152 5.40753C12.6342 4.62648 11.3679 4.62649 10.5868 5.40753Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowUpward!!
    }

private var _arrowUpward: ImageVector? = null
