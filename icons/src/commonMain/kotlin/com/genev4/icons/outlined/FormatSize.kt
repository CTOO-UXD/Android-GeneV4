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

public val Icons.Outlined.FormatSize: ImageVector
    get() {
        if (_formatSize != null) {
            return _formatSize!!
        }
        _formatSize =
            materialIcon(name = "Outlined.FormatSize") {
            addPath(
                pathData = PathParser().parsePathString("M6.77472 20.1103V6.01125H1.99072V4.01025H13.6747V6.01125H8.91372V20.1103H6.77472ZM16.5175 20.0205V10.5805H13.0295V8.82045H21.9575V10.5805H18.4695V20.0205H16.5175Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _formatSize!!
    }

private var _formatSize: ImageVector? = null
