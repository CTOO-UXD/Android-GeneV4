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

public val Icons.Filled.FormatSize: ImageVector
    get() {
        if (_formatSize != null) {
            return _formatSize!!
        }
        _formatSize =
            materialIcon(name = "Filled.FormatSize") {
            addPath(
                pathData = PathParser().parsePathString("M6.27012 20.1103V7.01125H1.99072V4.01025H13.6747V7.01125H9.41012V20.1103H6.27012ZM16.0701 20.0205V11.48H13.0295V8.82045H21.9575V11.48H18.9201V20.0205H16.0701Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _formatSize!!
    }

private var _formatSize: ImageVector? = null
