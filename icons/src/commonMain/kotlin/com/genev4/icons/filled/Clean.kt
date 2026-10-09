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

public val Icons.Filled.Clean: ImageVector
    get() {
        if (_clean != null) {
            return _clean!!
        }
        _clean =
            materialIcon(name = "Filled.Clean") {
            addPath(
                pathData = PathParser().parsePathString("M14.5 4.5C14.5 3.11929 13.3807 2 12 2C10.6193 2 9.5 3.11929 9.5 4.5V9H5.5C4.39543 9 3.5 9.89543 3.5 11V12H20.5V11C20.5 9.89543 19.6046 9 18.5 9H14.5V4.5ZM3.5 13.1557V13H20.5V13.1377L21 21H17V16H15V21H13V16H11V21H9V16H7V21H3L3.5 13.1557Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _clean!!
    }

private var _clean: ImageVector? = null
