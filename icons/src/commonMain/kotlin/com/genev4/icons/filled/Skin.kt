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

public val Icons.Filled.Skin: ImageVector
    get() {
        if (_skin != null) {
            return _skin!!
        }
        _skin =
            materialIcon(name = "Filled.Skin") {
            addPath(
                pathData = PathParser().parsePathString("M8.19259 2.74167C8.64133 2.65192 9.09374 2.87824 9.29102 3.29117C9.77483 4.30385 10.8071 5.00004 12 5.00004C13.1929 5.00004 14.2252 4.30385 14.709 3.29117C14.9063 2.87824 15.3587 2.65192 15.8074 2.74167L22.1961 4.01941C22.6635 4.1129 23 4.52331 23 4.99999V11C23 11.2825 22.8805 11.5519 22.671 11.7414C22.4615 11.931 22.1816 12.0231 21.9005 11.995L19.413 11.7463L19.9209 18.8575C20.0036 20.0152 19.0867 21 17.926 21H6.07398C4.91329 21 3.99636 20.0152 4.07906 18.8575L4.587 11.7463L2.0995 11.995C1.81838 12.0231 1.53848 11.931 1.32899 11.7414C1.11951 11.5519 1 11.2825 1 11V4.99999C1 4.52331 1.33646 4.1129 1.80388 4.01941L8.19259 2.74167Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _skin!!
    }

private var _skin: ImageVector? = null
