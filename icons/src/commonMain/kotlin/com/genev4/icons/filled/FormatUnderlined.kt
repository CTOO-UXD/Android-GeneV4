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

public val Icons.Filled.FormatUnderlined: ImageVector
    get() {
        if (_formatUnderlined != null) {
            return _formatUnderlined!!
        }
        _formatUnderlined =
            materialIcon(name = "Filled.FormatUnderlined") {
            addPath(
                pathData = PathParser().parsePathString("M5 19V21.5H19V19H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5.75 11.5V4.5H8.75V11.5C8.75 13.2949 10.2051 14.75 12 14.75C13.7949 14.75 15.25 13.2949 15.25 11.5V4.5H18.25V11.5C18.25 14.9518 15.4518 17.75 12 17.75C8.54822 17.75 5.75 14.9518 5.75 11.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _formatUnderlined!!
    }

private var _formatUnderlined: ImageVector? = null
