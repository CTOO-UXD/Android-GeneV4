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

public val Icons.Filled.Browse: ImageVector
    get() {
        if (_browse != null) {
            return _browse!!
        }
        _browse =
            materialIcon(name = "Filled.Browse") {
            addPath(
                pathData = PathParser().parsePathString("M11 5C11 3.89543 10.1046 3 9 3H5C3.89543 3 3 3.89543 3 5V8C3 9.10457 3.89543 10 5 10H9C10.1046 10 11 9.10457 11 8V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 5C21 3.89543 20.1046 3 19 3H15C13.8954 3 13 3.89543 13 5V11C13 12.1046 13.8954 13 15 13H19C20.1046 13 21 12.1046 21 11V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19 14C20.1046 14 21 14.8954 21 16V19C21 20.1046 20.1046 21 19 21H15C13.8954 21 13 20.1046 13 19V16C13 14.8954 13.8954 14 15 14H19Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 13C11 11.8954 10.1046 11 9 11H5C3.89543 11 3 11.8954 3 13V19C3 20.1046 3.89543 21 5 21H9C10.1046 21 11 20.1046 11 19V13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _browse!!
    }

private var _browse: ImageVector? = null
