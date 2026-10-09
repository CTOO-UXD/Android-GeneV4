/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aioutlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiOutlined.DownloadFile: ImageVector
    get() {
        if (_downloadFile != null) {
            return _downloadFile!!
        }
        _downloadFile =
            materialIcon(name = "AiOutlined.DownloadFile") {
            addPath(
                pathData = PathParser().parsePathString("M8 17V15H16V17H8ZM16 10L12 14L8 10H10.5V7H13.5V10H16ZM5 3H19C20.11 3 21 3.9 21 5V19C21 20.11 20.11 21 19 21H5C3.9 21 3 20.11 3 19V5C3 3.9 3.9 3 5 3ZM5 5V19H19V5H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _downloadFile!!
    }

private var _downloadFile: ImageVector? = null
