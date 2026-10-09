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

public val Icons.Filled.ExpandAll: ImageVector
    get() {
        if (_expandAll != null) {
            return _expandAll!!
        }
        _expandAll =
            materialIcon(name = "Filled.ExpandAll") {
            addPath(
                pathData = PathParser().parsePathString("M10.5851 3.3978L5.98193 8.00099L7.39615 9.41521L11.9993 4.81201L16.6026 9.41528L18.0168 8.00106L13.4136 3.3978C12.6325 2.61675 11.3662 2.61675 10.5851 3.3978Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.4144 20.6007L18.0176 15.9975L16.6034 14.5833L12.0002 19.1865L7.39695 14.5832L5.98273 15.9974L10.586 20.6007C11.367 21.3817 12.6334 21.3817 13.4144 20.6007Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _expandAll!!
    }

private var _expandAll: ImageVector? = null
