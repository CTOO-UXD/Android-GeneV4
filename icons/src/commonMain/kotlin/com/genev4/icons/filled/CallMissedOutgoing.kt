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

public val Icons.Filled.CallMissedOutgoing: ImageVector
    get() {
        if (_callMissedOutgoing != null) {
            return _callMissedOutgoing!!
        }
        _callMissedOutgoing =
            materialIcon(name = "Filled.CallMissedOutgoing") {
            addPath(
                pathData = PathParser().parsePathString("M13.61 7V9H19.095L11.61 16.4853L2.41763 7.29289L1.00342 8.70711L10.1958 17.8995C10.9769 18.6805 12.2432 18.6805 13.0242 17.8995L20.61 10.314V16H22.61V8C22.61 7.44772 22.1623 7 21.61 7H13.61Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _callMissedOutgoing!!
    }

private var _callMissedOutgoing: ImageVector? = null
