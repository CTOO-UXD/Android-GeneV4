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

public val Icons.Filled.WindowCollapse: ImageVector
    get() {
        if (_windowCollapse != null) {
            return _windowCollapse!!
        }
        _windowCollapse =
            materialIcon(name = "Filled.WindowCollapse") {
            addPath(
                pathData = PathParser().parsePathString("M19.5 2.5C20.6046 2.5 21.5 3.39543 21.5 4.5V15.5C21.4997 16.6043 20.6044 17.5 19.5 17.5H17.5V19.5C17.4997 20.6043 16.6044 21.5 15.5 21.5H4.5C3.39559 21.5 2.50026 20.6043 2.5 19.5V8.5C2.5 7.39543 3.39543 6.5 4.5 6.5H6.5V4.5C6.5 3.39543 7.39543 2.5 8.5 2.5H19.5ZM4.5 19.5H15.5V8.5H4.5V19.5ZM15.5 6.5C16.6046 6.5 17.5 7.39543 17.5 8.5V15.5H19.5V4.5H8.5V6.5H15.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _windowCollapse!!
    }

private var _windowCollapse: ImageVector? = null
