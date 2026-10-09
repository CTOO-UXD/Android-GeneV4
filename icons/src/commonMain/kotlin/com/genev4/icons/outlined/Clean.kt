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

public val Icons.Outlined.Clean: ImageVector
    get() {
        if (_clean != null) {
            return _clean!!
        }
        _clean =
            materialIcon(name = "Outlined.Clean") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C13.6569 2 15 3.34315 15 5V9H18.5C19.6046 9 20.5 9.89543 20.5 11V13.6377L21 21H3L3.5 13.6557V11C3.5 9.89543 4.39543 9 5.5 9H9V5C9 3.34315 10.3431 2 12 2ZM13 5V9H11V5C11 4.44772 11.4477 4 12 4L12.1166 4.00673C12.614 4.06449 13 4.48716 13 5ZM5.5 11H9H15H18.5V12H5.5V11ZM5.48116 14H18.52L18.859 19H17V16H15V19H13V16H11V19H9V16H7V19H5.14L5.48116 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _clean!!
    }

private var _clean: ImageVector? = null
