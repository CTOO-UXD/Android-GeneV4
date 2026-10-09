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

public val Icons.AiFilled.ReturnToDocument: ImageVector
    get() {
        if (_returnToDocument != null) {
            return _returnToDocument!!
        }
        _returnToDocument =
            materialIcon(name = "AiFilled.ReturnToDocument") {
            addPath(
                pathData = PathParser().parsePathString("M12.4688 5H20.5C21.6046 5 22.5 5.89542 22.5 7V20C22.5 21.1046 21.6046 22 20.5 22H3.5C2.39544 22 1.5 21.1046 1.5 20V4C1.5 2.89543 2.39543 2 3.5 2H9.96875L12.4688 5ZM6.58594 14L9.79297 17.207L11.207 15.793L10.4141 15H17V11H15V13H10.4141L11.207 12.207L9.79297 10.793L6.58594 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _returnToDocument!!
    }

private var _returnToDocument: ImageVector? = null
