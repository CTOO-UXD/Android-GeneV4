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

public val Icons.Outlined.SimCardDownload: ImageVector
    get() {
        if (_simCardDownload != null) {
            return _simCardDownload!!
        }
        _simCardDownload =
            materialIcon(name = "Outlined.SimCardDownload") {
            addPath(
                pathData = PathParser().parsePathString("M13 13.3284V7.5H11V13.3284L9.17154 11.5L7.75732 12.9142L11.2929 16.4497C11.6834 16.8403 12.3165 16.8403 12.7071 16.4497L16.2426 12.9142L14.8284 11.5L13 13.3284Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 2L4 7V18C4 20.2091 5.79086 22 8 22H16C18.2091 22 20 20.2091 20 18V6C20 3.79086 18.2091 2 16 2H9ZM18 6V18C18 19.1046 17.1046 20 16 20H8C6.89543 20 6 19.1046 6 18V7.82843L9.82843 4H16C17.1046 4 18 4.89543 18 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _simCardDownload!!
    }

private var _simCardDownload: ImageVector? = null
