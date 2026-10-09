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

public val Icons.AiOutlined.DeepThink: ImageVector
    get() {
        if (_deepThink != null) {
            return _deepThink!!
        }
        _deepThink =
            materialIcon(name = "AiOutlined.DeepThink") {
            addPath(
                pathData = PathParser().parsePathString("M16 1H14L4 15H10L8 23H10L20 9H14L16 1ZM16.1136 11H11.4384L12.5819 6.42631L7.88638 13H12.5616L11.4181 17.5737L16.1136 11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _deepThink!!
    }

private var _deepThink: ImageVector? = null
