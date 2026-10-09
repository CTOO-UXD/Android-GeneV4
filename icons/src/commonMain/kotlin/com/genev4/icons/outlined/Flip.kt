/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.Flip: ImageVector
    get() {
        if (_flip != null) {
            return _flip!!
        }
        _flip =
            materialIcon(name = "Outlined.Flip") {
            addPath(
                pathData = PathParser().parsePathString("M14 2H12V22H14V2ZM6 4H11V6H6C4.89543 6 4 6.89543 4 8V16C4 17.1046 4.89543 18 6 18H11V20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4ZM15 20V18H17V20H15ZM15 6H17V4H15V6ZM19 6.26756C19.3036 6.4432 19.5568 6.69637 19.7324 7H21.874C21.5122 5.59439 20.4056 4.4878 19 4.12602V6.26756ZM20 9V11H22V9H20ZM20 13V15H22V13H20ZM19.7324 17C19.5568 17.3036 19.3036 17.5568 19 17.7324V19.874C20.4056 19.5122 21.5122 18.4056 21.874 17H19.7324Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flip!!
    }

private var _flip: ImageVector? = null
