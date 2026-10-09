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

public val Icons.AiOutlined.CancelEvent: ImageVector
    get() {
        if (_cancelEvent != null) {
            return _cancelEvent!!
        }
        _cancelEvent =
            materialIcon(name = "AiOutlined.CancelEvent") {
            addPath(
                pathData = PathParser().parsePathString("M19 4H18V2H16V4H8V2H6V4H5C4.46957 4 3.96086 4.21071 3.58579 4.58579C3.21071 4.96086 3 5.46957 3 6V20C3 20.5304 3.21071 21.0391 3.58579 21.4142C3.96086 21.7893 4.46957 22 5 22H19C19.5304 22 20.0391 21.7893 20.4142 21.4142C20.7893 21.0391 21 20.5304 21 20V6C21 5.46957 20.7893 4.96086 20.4142 4.58579C20.0391 4.21071 19.5304 4 19 4ZM19 20H5V10H19V20ZM5 8V6H19V8H5ZM8.23 17.41L9.29 18.47L11.73 16.03L14.17 18.47L15.23 17.41L12.79 14.97L15.23 12.53L14.17 11.47L11.73 13.91L9.29 11.47L8.23 12.53L10.67 14.97L8.23 17.41Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cancelEvent!!
    }

private var _cancelEvent: ImageVector? = null
