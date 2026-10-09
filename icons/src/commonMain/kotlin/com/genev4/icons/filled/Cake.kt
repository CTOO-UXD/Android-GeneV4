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

public val Icons.Filled.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake =
            materialIcon(name = "Filled.Cake") {
            addPath(
                pathData = PathParser().parsePathString("M2 21V19H3V13C3 10.7909 4.79086 9 7 9H11V7H13V9H17C19.2091 9 21 10.7909 21 13V19H21.9979V21H2ZM17 11H7C5.89543 11 5 11.8954 5 13L4.99996 13.3043C6.08895 12.6124 7.50521 12.6619 8.54744 13.4525C9.01596 13.808 9.66382 13.808 10.1323 13.4525C11.244 12.6092 12.7813 12.6092 13.893 13.4525C14.3616 13.808 15.0094 13.808 15.4779 13.4525C16.5125 12.6677 17.9155 12.6132 19.0012 13.2891L19 13C19 11.9456 18.1841 11.0818 17.1493 11.0055L17 11ZM13.8301 1C14.6586 2.43488 14.1669 4.26964 12.7321 5.09807L11 6.09807C10.1716 4.66319 10.6632 2.82842 12.0981 2L13.8301 1Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _cake!!
    }

private var _cake: ImageVector? = null
