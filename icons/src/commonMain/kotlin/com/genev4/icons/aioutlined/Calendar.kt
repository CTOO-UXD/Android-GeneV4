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

public val Icons.AiOutlined.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar =
            materialIcon(name = "AiOutlined.Calendar") {
            addPath(
                pathData = PathParser().parsePathString("M21 10V21H3V10M21 10H3M21 10V5H3V10M7 5V2M17 5V2").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M8 14H8.004V14.004H8V14ZM12 14H12.004V14.004H12V14ZM16 14H16.004V14.004H16V14ZM16 17H16.004V17.004H16V17ZM8 17H8.004V17.004H8V17ZM12 17H12.004V17.004H12V17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _calendar!!
    }

private var _calendar: ImageVector? = null
