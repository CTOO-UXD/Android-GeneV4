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

public val Icons.AiFilled.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar =
            materialIcon(name = "AiFilled.Calendar") {
            addPath(
                pathData = PathParser().parsePathString("M8 4H16V1H18V4H22V9H2V4H6V1H8V4ZM22 11V22H2V11H22ZM9.004 13.497H7V15.501H9.004V13.497ZM13.004 13.497H11V15.501H13.004V13.497ZM17.004 13.497H15V15.501H17.004V13.497ZM9.004 17.497H7V19.501H9.004V17.497ZM13.004 17.497H11V19.501H13.004V17.497ZM17.004 17.497H15V19.501H17.004V17.497Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _calendar!!
    }

private var _calendar: ImageVector? = null
