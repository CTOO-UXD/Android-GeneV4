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

public val Icons.AiFilled.Payment2: ImageVector
    get() {
        if (_payment2 != null) {
            return _payment2!!
        }
        _payment2 =
            materialIcon(name = "AiFilled.Payment2") {
            addPath(
                pathData = PathParser().parsePathString("M22 19C22 20.1046 21.1046 21 20 21H4C2.89543 21 2 20.1046 2 19V13.5H22V19ZM5 15.5V17.5H9V15.5H5ZM11 15.5V17.5H15V15.5H11ZM20 3C21.1046 3 22 3.89543 22 5V11.5H2V5C2 3.89543 2.89543 3 4 3H20ZM14 7V9H18V7H14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _payment2!!
    }

private var _payment2: ImageVector? = null
