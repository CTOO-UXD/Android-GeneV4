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

public val Icons.AiFilled.Writing: ImageVector
    get() {
        if (_writing != null) {
            return _writing!!
        }
        _writing =
            materialIcon(name = "AiFilled.Writing") {
            addPath(
                pathData = PathParser().parsePathString("M12.8995 6.85479L17.1421 11.0975L7.24264 20.997H3V16.7543L12.8995 6.85479ZM14.3137 5.44058L16.435 3.31926C16.8256 2.92874 17.4587 2.92874 17.8492 3.31926L20.6777 6.14769C21.0682 6.53821 21.0682 7.17138 20.6777 7.5619L18.5563 9.68322L14.3137 5.44058Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _writing!!
    }

private var _writing: ImageVector? = null
