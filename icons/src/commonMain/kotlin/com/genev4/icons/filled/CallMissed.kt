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

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed =
            materialIcon(name = "Filled.CallMissed") {
            addPath(
                pathData = PathParser().parsePathString("M10.3901 7V9H4.90514L12.3901 16.4853L21.5825 7.29289L22.9967 8.70711L13.8043 17.8995C13.0233 18.6805 11.757 18.6805 10.9759 17.8995L3.39014 10.314V16H1.39014V8C1.39014 7.44772 1.83785 7 2.39014 7H10.3901Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
