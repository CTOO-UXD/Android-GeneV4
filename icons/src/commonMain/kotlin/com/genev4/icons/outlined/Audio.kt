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

public val Icons.Outlined.Audio: ImageVector
    get() {
        if (_audio != null) {
            return _audio!!
        }
        _audio =
            materialIcon(name = "Outlined.Audio") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM18 6H6C4.89543 6 4 6.89543 4 8V16C4 17.1046 4.89543 18 6 18H18C19.1046 18 20 17.1046 20 16V8C20 6.89543 19.1046 6 18 6ZM11.125 7.77437L15.5113 8.52348V10.3239L12.875 9.84678V13.7778C12.875 15.0051 11.8956 16 10.6875 16C9.47938 16 8.5 15.0051 8.5 13.7778C8.5 12.5505 9.47938 11.5556 10.6875 11.5556C10.8373 11.5556 10.9836 11.5708 11.125 11.6V7.77437Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _audio!!
    }

private var _audio: ImageVector? = null
