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

public val Icons.Outlined.ViewArray: ImageVector
    get() {
        if (_viewArray != null) {
            return _viewArray!!
        }
        _viewArray =
            materialIcon(name = "Outlined.ViewArray") {
            addPath(
                pathData = PathParser().parsePathString("M2 20H4C5.10457 20 6 19.1046 6 18V6C6 4.89543 5.10457 4 4 4H2V6H4V18H2V20ZM22 4H20C18.8954 4 18 4.89543 18 6V18C18 19.1046 18.8954 20 20 20H22V18H20V6H22V4ZM15 3.5C16.1046 3.5 17 4.39543 17 5.5V18.5C17 19.6046 16.1046 20.5 15 20.5H9C7.89543 20.5 7 19.6046 7 18.5V5.5C7 4.39543 7.89543 3.5 9 3.5H15ZM15 5.5H9V18.5H15V5.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _viewArray!!
    }

private var _viewArray: ImageVector? = null
