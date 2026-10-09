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

public val Icons.Filled.Unpin: ImageVector
    get() {
        if (_unpin != null) {
            return _unpin!!
        }
        _unpin =
            materialIcon(name = "Filled.Unpin") {
            addPath(
                pathData = PathParser().parsePathString("M15.5355 1.39355L16.2426 2.10066L21.8995 7.75752L22.6066 8.46462L21.8995 9.17173L21.1924 9.87884L20.4853 9.17173L17.6468 12.0102C15.4105 12.14 13.5028 13.4947 12.5847 15.4133L11.2929 14.1215L4.92894 20.4854L4.22183 21.1925L3.51472 20.4854L2.80762 19.7783L3.51472 19.0712L9.87868 12.7073L6.34315 9.17173L7.75736 7.75752C8.53841 8.53856 9.80474 8.53856 10.5858 7.75752L14.8284 3.51487L14.1213 2.80777L14.8284 2.10066L15.5355 1.39355ZM14.4645 15.8791L15.8787 14.4648L18 16.5862L20.1213 14.4648L21.5355 15.8791L19.4142 18.0004L21.5355 20.1217L20.1213 21.5359L18 19.4146L15.8787 21.5359L14.4645 20.1217L16.5858 18.0004L14.4645 15.8791Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _unpin!!
    }

private var _unpin: ImageVector? = null
