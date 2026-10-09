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

public val Icons.Outlined.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close =
            materialIcon(name = "Outlined.Close") {
            addPath(
                pathData = PathParser().parsePathString("M18.3641 4.2218L19.7783 5.63602L13.4139 11.9998L19.7783 18.3639L18.3641 19.7782L11.9999 13.4138L5.63614 19.7782L4.22192 18.3639L10.5859 11.9998L4.22192 5.63602L5.63614 4.2218L11.9999 10.5858L18.3641 4.2218Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _close!!
    }

private var _close: ImageVector? = null
