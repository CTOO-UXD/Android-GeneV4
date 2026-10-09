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

public val Icons.Filled.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar =
            materialIcon(name = "Filled.Dollar") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM14 14H8.5V16H11V18H13V16H14C15.3807 16 16.5 14.8807 16.5 13.5C16.5 12.1193 15.3807 11 14 11H10C9.72386 11 9.5 10.7762 9.5 10.5C9.5 10.2239 9.72386 9.99997 10 9.99997H15.5V8H13V6H11V8H10C8.61929 8 7.5 9.11929 7.5 10.5C7.5 11.8807 8.61929 13 10 13H14C14.2761 13 14.5 13.2239 14.5 13.5C14.5 13.7762 14.2761 14 14 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _dollar!!
    }

private var _dollar: ImageVector? = null
