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

public val Icons.Filled.SwitchLastApp: ImageVector
    get() {
        if (_switchLastApp != null) {
            return _switchLastApp!!
        }
        _switchLastApp =
            materialIcon(name = "Filled.SwitchLastApp") {
            addPath(
                pathData = PathParser().parsePathString("M3 5C3 3.89543 3.89543 3 5 3H15C16.1046 3 17 3.89543 17 5V11H9.89983L12.447 8.45279L11.0328 7.03857L6.77873 11.2927C6.38821 11.6832 6.38821 12.3164 6.77873 12.7069L11.0328 16.961L12.447 15.5468L9.90027 13H17V19C17 20.1046 16.1046 21 15 21H5C3.89543 21 3 20.1046 3 19V5ZM17 13H19V21H21V13V11V3H19V11H17V13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _switchLastApp!!
    }

private var _switchLastApp: ImageVector? = null
