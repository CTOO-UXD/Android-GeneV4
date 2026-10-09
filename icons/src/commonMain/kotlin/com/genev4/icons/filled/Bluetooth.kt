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

public val Icons.Filled.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth =
            materialIcon(name = "Filled.Bluetooth") {
            addPath(
                pathData = PathParser().parsePathString("M11 22V14.4L6.4 19L5 17.6L10.6 12L5 6.4L6.4 5L11 9.6V2H12L17.7 7.7L13.4 12L17.7 16.3L12 22H11ZM13 9.6L14.9 7.7L13 5.85V9.6ZM13 18.15L14.9 16.3L13 14.4V18.15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
