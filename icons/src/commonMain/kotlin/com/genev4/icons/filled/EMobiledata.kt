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

public val Icons.Filled.EMobiledata: ImageVector
    get() {
        if (_eMobiledata != null) {
            return _eMobiledata!!
        }
        _eMobiledata =
            materialIcon(name = "Filled.EMobiledata") {
            addPath(
                pathData = PathParser().parsePathString("M8 17V7H16V9H10V11H16V13H10V15H16V17H8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _eMobiledata!!
    }

private var _eMobiledata: ImageVector? = null
