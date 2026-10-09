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

public val Icons.Outlined.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat =
            materialIcon(name = "Outlined.Repeat") {
            addPath(
                pathData = PathParser().parsePathString("M20.7243 5.28877L17.2151 1.82007L15.8091 3.24248L17.5871 4.99927L7.00005 4.99997C4.79091 4.99997 3.00005 6.79083 3.00005 8.99997V15H5.00005V8.99997C5.00005 7.8954 5.89548 6.99997 7.00005 6.99997H20.0213C20.915 6.99997 21.3599 5.91703 20.7243 5.28877ZM21.0001 15V8.99997H19.0001V15C19.0001 16.1045 18.1046 17 17.0001 17H4.00005C3.1084 17 2.66258 18.0786 3.29404 18.7082L6.80233 22.2057L8.21437 20.7893L6.42005 19H17.0001C19.2092 19 21.0001 17.2091 21.0001 15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _repeat!!
    }

private var _repeat: ImageVector? = null
