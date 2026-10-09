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

public val Icons.Filled.ActivePen: ImageVector
    get() {
        if (_activePen != null) {
            return _activePen!!
        }
        _activePen =
            materialIcon(name = "Filled.ActivePen") {
            addPath(
                pathData = PathParser().parsePathString("M9.80931 19.1481L20.4854 8.47194C21.8522 7.1051 21.8522 4.88903 20.4854 3.52219C19.1186 2.15536 16.9025 2.15536 15.5356 3.52219L4.94071 14.1171C4.70241 14.3554 3.90113 16.3994 2.53688 20.2491C2.34198 20.9897 3.01783 21.6656 3.75844 21.4707C7.57208 20.1425 9.58904 19.3683 9.80931 19.1481Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _activePen!!
    }

private var _activePen: ImageVector? = null
