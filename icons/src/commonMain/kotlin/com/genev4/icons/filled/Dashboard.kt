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

public val Icons.Filled.Dashboard: ImageVector
    get() {
        if (_dashboard != null) {
            return _dashboard!!
        }
        _dashboard =
            materialIcon(name = "Filled.Dashboard") {
            addPath(
                pathData = PathParser().parsePathString("M11 19C11 20.1046 10.1046 21 9 21H5C3.89543 21 3 20.1046 3 19V16C3 14.8954 3.89543 14 5 14H9C10.1046 14 11 14.8954 11 16V19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 19C21 20.1046 20.1046 21 19 21H15C13.8954 21 13 20.1046 13 19V13C13 11.8954 13.8954 11 15 11H19C20.1046 11 21 11.8954 21 13V19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 10C20.1046 10 21 9.10457 21 8V5C21 3.89543 20.1046 3 19 3H15C13.8954 3 13 3.89543 13 5V8C13 9.10457 13.8954 10 15 10H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 11C11 12.1046 10.1046 13 9 13H5C3.89543 13 3 12.1046 3 11V5C3 3.89543 3.89543 3 5 3H9C10.1046 3 11 3.89543 11 5V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
