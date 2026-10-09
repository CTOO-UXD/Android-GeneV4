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

public val Icons.Filled.LocationOn: ImageVector
    get() {
        if (_locationOn != null) {
            return _locationOn!!
        }
        _locationOn =
            materialIcon(name = "Filled.LocationOn") {
            addPath(
                pathData = PathParser().parsePathString("M12 1.5C16.9706 1.5 21 5.52944 21 10.5C21 14.1879 18.4247 18.1787 13.2742 22.4726C12.5316 23.088 11.4556 23.0867 10.715 22.469C5.57257 18.1745 3 14.1859 3 10.5C3 5.52944 7.02944 1.5 12 1.5ZM12 6.5C14.2091 6.5 16 8.29086 16 10.5C16 12.7091 14.2091 14.5 12 14.5C9.79086 14.5 8 12.7091 8 10.5C8 8.29086 9.79086 6.5 12 6.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _locationOn!!
    }

private var _locationOn: ImageVector? = null
