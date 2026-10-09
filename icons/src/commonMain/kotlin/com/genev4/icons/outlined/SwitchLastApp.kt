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

public val Icons.Outlined.SwitchLastApp: ImageVector
    get() {
        if (_switchLastApp != null) {
            return _switchLastApp!!
        }
        _switchLastApp =
            materialIcon(name = "Outlined.SwitchLastApp") {
            addPath(
                pathData = PathParser().parsePathString("M5 5H15V10H17V5C17 3.89543 16.1046 3 15 3H5C3.89543 3 3 3.89543 3 5V19C3 20.1046 3.89543 21 5 21H15C16.1046 21 17 20.1046 17 19V14H15V19H5L5 5ZM19 21V14H21V21H19ZM21 3V10H19V3H21ZM11.0328 7.03857L6.77873 11.2927C6.38821 11.6832 6.38821 12.3164 6.77873 12.7069L11.0328 16.961L12.447 15.5468L9.90027 13H21V11H9.89983L12.447 8.45279L11.0328 7.03857Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switchLastApp!!
    }

private var _switchLastApp: ImageVector? = null
