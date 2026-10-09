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

public val Icons.Outlined.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet =
            materialIcon(name = "Outlined.Wallet") {
            addPath(
                pathData = PathParser().parsePathString("M17 3C19.2091 3 21 4.79086 21 7V9V15V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3H17ZM19 14V10H14C12.9456 10 12.0818 10.8159 12.0055 11.8507L12 12C12 13.1046 12.8954 14 14 14H19ZM19 8H14C11.7909 8 10 9.79086 10 12C10 14.2091 11.7909 16 14 16H19V17C19 18.1046 18.1046 19 17 19H7C5.89543 19 5 18.1046 5 17V7C5 5.89543 5.89543 5 7 5H17C18.1046 5 19 5.89543 19 7V8ZM14 11H16V13H14V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
