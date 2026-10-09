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

public val Icons.AiOutlined.Notifications: ImageVector
    get() {
        if (_notifications != null) {
            return _notifications!!
        }
        _notifications =
            materialIcon(name = "AiOutlined.Notifications") {
            addPath(
                pathData = PathParser().parsePathString("M12 22.5C13.1 22.5 14 21.6 14 20.5H10C10 21.6 10.9 22.5 12 22.5ZM19 16.5L19 10.5C19 7.43 16.37 4.36 13.5 3.68V3C13.5 2.17 12.83 1.5 12 1.5C11.17 1.5 10.5 2.17 10.5 3V3.68C7.64 4.36 5 7.42 5 10.5L5 16.5L3 18.5V19.5H21V18.5L19 16.5ZM17 17.5H7L7 10.5C7 8.02 9.50999 5.5 12 5.5C14.49 5.5 17 8.02 17 10.5L17 17.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _notifications!!
    }

private var _notifications: ImageVector? = null
