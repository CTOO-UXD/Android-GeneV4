/*
 * Generated from Material-3 Gene4.0 AI icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_ai_icons.py
 */

package com.genev4.icons.aifilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.AiFilled.DownloadFile: ImageVector
    get() {
        if (_downloadFile != null) {
            return _downloadFile!!
        }
        _downloadFile =
            materialIcon(name = "AiFilled.DownloadFile") {
            addPath(
                pathData = PathParser().parsePathString("M5 3H19C20.11 3 21 3.9 21 5V19C21 20.11 20.11 21 19 21H5C3.9 21 3 20.11 3 19V5C3 3.9 3.9 3 5 3ZM8 17H16V15H8V17ZM16 10H13.5V7H10.5V10H8L12 14L16 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _downloadFile!!
    }

private var _downloadFile: ImageVector? = null
