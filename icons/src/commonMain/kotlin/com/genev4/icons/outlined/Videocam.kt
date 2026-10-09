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

public val Icons.Outlined.Videocam: ImageVector
    get() {
        if (_videocam != null) {
            return _videocam!!
        }
        _videocam =
            materialIcon(name = "Outlined.Videocam") {
            addPath(
                pathData = PathParser().parsePathString("M16 4.5C17.1046 4.5 18 5.39543 18 6.5V8.726L21.5211 6.80665C22.006 6.54218 22.6134 6.72084 22.8779 7.20569C22.958 7.35258 23 7.51722 23 7.68454V16.3155C23 16.8677 22.5523 17.3155 22 17.3155C21.8327 17.3155 21.668 17.2735 21.5211 17.1934L18 15.272V17.5C18 18.6046 17.1046 19.5 16 19.5H3C1.89543 19.5 1 18.6046 1 17.5V6.5C1 5.39543 1.89543 4.5 3 4.5H16ZM16 6.5H3V17.5H16V6.5ZM21 9.368L18 11.003V12.993L21 14.631V9.368ZM9 8.5V10.5H5V8.5H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _videocam!!
    }

private var _videocam: ImageVector? = null
