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

public val Icons.Filled.Morning: ImageVector
    get() {
        if (_morning != null) {
            return _morning!!
        }
        _morning =
            materialIcon(name = "Filled.Morning") {
            addPath(
                pathData = PathParser().parsePathString("M11 7V4H13V7H11ZM22 18V20H2V18H22ZM19.071 6.51482L16.9496 8.63614L18.3638 10.0504L20.4852 7.92903L19.071 6.51482ZM5.63589 10.0504L3.51457 7.92903L4.92879 6.51482L7.05011 8.63614L5.63589 10.0504ZM12 9C15.866 9 19 12.134 19 16H5C5 12.134 8.13401 9 12 9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _morning!!
    }

private var _morning: ImageVector? = null
