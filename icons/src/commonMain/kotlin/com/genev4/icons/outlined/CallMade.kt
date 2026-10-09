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

public val Icons.Outlined.CallMade: ImageVector
    get() {
        if (_callMade != null) {
            return _callMade!!
        }
        _callMade =
            materialIcon(name = "Outlined.CallMade") {
            addPath(
                pathData = PathParser().parsePathString("M18.9999 4C19.5521 4 19.9999 4.44772 19.9999 5V15H17.9999L17.9997 7.414L5.63589 19.7782L4.22168 18.364L16.5847 6H8.99985V4H18.9999Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _callMade!!
    }

private var _callMade: ImageVector? = null
