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

public val Icons.AiFilled.CancelEvent: ImageVector
    get() {
        if (_cancelEvent != null) {
            return _cancelEvent!!
        }
        _cancelEvent =
            materialIcon(name = "AiFilled.CancelEvent") {
            addPath(
                pathData = PathParser().parsePathString("M19 19H5V8H19V19ZM19 3H18V1H16V3H8V1H6V3H5C3.89 3 3 3.9 3 5V19C3 19.5304 3.21071 20.0391 3.58579 20.4142C3.96086 20.7893 4.46957 21 5 21H19C19.5304 21 20.0391 20.7893 20.4142 20.4142C20.7893 20.0391 21 19.5304 21 19V5C21 4.46957 20.7893 3.96086 20.4142 3.58579C20.0391 3.21071 19.5304 3 19 3ZM9.31 17L11.75 14.56L14.19 17L15.25 15.94L12.81 13.5L15.25 11.06L14.19 10L11.75 12.44L9.31 10L8.25 11.06L10.69 13.5L8.25 15.94L9.31 17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _cancelEvent!!
    }

private var _cancelEvent: ImageVector? = null
