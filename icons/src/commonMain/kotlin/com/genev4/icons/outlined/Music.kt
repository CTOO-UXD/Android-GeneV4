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

public val Icons.Outlined.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music =
            materialIcon(name = "Outlined.Music") {
            addPath(
                pathData = PathParser().parsePathString("M19 17C19 19.2091 17.2091 21 15 21C12.7909 21 11 19.2091 11 17C11 14.7909 12.7909 13 15 13C15.7286 13 16.4117 13.1948 17 13.5351V6.5L10 4.98116V13C10 15.2091 8.2091 17 6 17C3.79086 17 2 15.2091 2 13C2 10.7909 3.79086 9 6 9C6.7286 9 7.4117 9.1948 8 9.5351V2L19 4.34921V17ZM15 15C13.8954 15 13 15.8954 13 17C13 18.1046 13.8954 19 15 19C16.1046 19 17 18.1046 17 17C17 15.8954 16.1046 15 15 15ZM6 11C4.89543 11 4 11.8954 4 13C4 14.1046 4.89543 15 6 15C7.1046 15 8 14.1046 8 13C8 11.8954 7.1046 11 6 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _music!!
    }

private var _music: ImageVector? = null
