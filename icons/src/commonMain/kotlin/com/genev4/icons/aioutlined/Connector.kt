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

public val Icons.AiOutlined.Connector: ImageVector
    get() {
        if (_connector != null) {
            return _connector!!
        }
        _connector =
            materialIcon(name = "AiOutlined.Connector") {
            addPath(
                pathData = PathParser().parsePathString("M6 7V11C6 11.5523 6.44772 12 7 12H17C17.5523 12 18 11.5523 18 11V7").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12 11V17").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _connector!!
    }

private var _connector: ImageVector? = null
