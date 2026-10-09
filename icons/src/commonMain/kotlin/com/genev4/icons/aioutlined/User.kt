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

public val Icons.AiOutlined.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user =
            materialIcon(name = "AiOutlined.User") {
            addPath(
                pathData = PathParser().parsePathString("M4 23C4 18.5817 7.58172 15 12 15C16.4183 15 20 18.5817 20 23H18C18 19.6863 15.3137 17 12 17C8.68629 17 6 19.6863 6 23H4ZM12 14C8.685 14 6 11.315 6 8C6 4.685 8.685 2 12 2C15.315 2 18 4.685 18 8C18 11.315 15.315 14 12 14ZM12 12C14.21 12 16 10.21 16 8C16 5.79 14.21 4 12 4C9.79 4 8 5.79 8 8C8 10.21 9.79 12 12 12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _user!!
    }

private var _user: ImageVector? = null
