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

public val Icons.Outlined.TaskAlt: ImageVector
    get() {
        if (_taskAlt != null) {
            return _taskAlt!!
        }
        _taskAlt =
            materialIcon(name = "Outlined.TaskAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C14.7629 2 17.2642 3.12053 19.0741 4.93193L17.6599 6.34614C16.2119 4.89667 14.2107 4 12 4C7.58172 4 4 7.58172 4 12C4 16.4183 7.58172 20 12 20C16.4183 20 20 16.4183 20 12C20 11.2851 19.9062 10.5921 19.7303 9.93261L21.3128 8.34952C21.7564 9.48042 22 10.7118 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM20.3956 5.02467L21.8098 6.43888L12.6174 15.6313C12.2269 16.0218 11.5937 16.0218 11.2032 15.6313L6.96054 11.3886L8.37476 9.97442L11.9103 13.51L20.3956 5.02467Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _taskAlt!!
    }

private var _taskAlt: ImageVector? = null
