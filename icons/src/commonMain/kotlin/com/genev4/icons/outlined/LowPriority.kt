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

public val Icons.Outlined.LowPriority: ImageVector
    get() {
        if (_lowPriority != null) {
            return _lowPriority!!
        }
        _lowPriority =
            materialIcon(name = "Outlined.LowPriority") {
            addPath(
                pathData = PathParser().parsePathString("M11 6V4H10C5.58172 4 2 7.58172 2 12C2 16.4183 5.58172 20 10 20C10.7451 20 11.2285 19.2144 10.8927 18.5493L8.88196 14.5671L7.09663 15.4685L8.242 17.737L8.06296 17.6804C5.69975 16.8748 4 14.6359 4 12C4 8.68629 6.68629 6 10 6H11ZM22 4H13V6H22V4ZM13 18H22V20H13V18ZM22 11H13V13H22V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lowPriority!!
    }

private var _lowPriority: ImageVector? = null
