/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Filled.Flip: ImageVector
    get() {
        if (_flip != null) {
            return _flip!!
        }
        _flip =
            materialIcon(name = "Filled.Flip") {
            addPath(
                pathData = PathParser().parsePathString("M12 2H14V22H12V2ZM15 18V20H17V18H15ZM17 6H15V4H17V6ZM19.7324 7C19.5568 6.69637 19.3036 6.4432 19 6.26756V4.12602C20.4056 4.4878 21.5122 5.59439 21.874 7H19.7324ZM20 11V9H22V11H20ZM20 15V13H22V15H20ZM19 17.7324C19.3036 17.5568 19.5568 17.3036 19.7324 17H21.874C21.5122 18.4056 20.4056 19.5122 19 19.874V17.7324ZM6 4H12V6V18V20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flip!!
    }

private var _flip: ImageVector? = null
