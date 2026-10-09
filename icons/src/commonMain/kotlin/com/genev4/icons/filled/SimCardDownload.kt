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

public val Icons.Filled.SimCardDownload: ImageVector
    get() {
        if (_simCardDownload != null) {
            return _simCardDownload!!
        }
        _simCardDownload =
            materialIcon(name = "Filled.SimCardDownload") {
            addPath(
                pathData = PathParser().parsePathString("M9 2L4 7V18C4 20.2091 5.79086 22 8 22H16C18.2091 22 20 20.2091 20 18V6C20 3.79086 18.2091 2 16 2H9ZM13 13.3284V7.5H11V13.3284L9.17154 11.5L7.75732 12.9142L11.2929 16.4497C11.6834 16.8403 12.3165 16.8403 12.7071 16.4497L16.2426 12.9142L14.8284 11.5L13 13.3284Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _simCardDownload!!
    }

private var _simCardDownload: ImageVector? = null
