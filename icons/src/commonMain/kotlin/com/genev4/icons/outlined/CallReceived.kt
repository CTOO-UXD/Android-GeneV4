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

public val Icons.Outlined.CallReceived: ImageVector
    get() {
        if (_callReceived != null) {
            return _callReceived!!
        }
        _callReceived =
            materialIcon(name = "Outlined.CallReceived") {
            addPath(
                pathData = PathParser().parsePathString("M18.364 4.2218L19.7782 5.63601L7.414 17.9998L15 18V20H5C4.44772 20 4 19.5523 4 19V8.99998H6V16.5848L18.364 4.2218Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _callReceived!!
    }

private var _callReceived: ImageVector? = null
