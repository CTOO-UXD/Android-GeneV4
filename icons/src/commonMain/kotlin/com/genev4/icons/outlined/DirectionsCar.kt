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

public val Icons.Outlined.DirectionsCar: ImageVector
    get() {
        if (_directionsCar != null) {
            return _directionsCar!!
        }
        _directionsCar =
            materialIcon(name = "Outlined.DirectionsCar") {
            addPath(
                pathData = PathParser().parsePathString("M17.5718 4C18.3109 4 18.9898 4.40763 19.3372 5.06001L21.9636 9.99266L22.5 10C23.0523 10 23.5 10.4477 23.5 11C23.5 11.5523 23.0523 12 22.5 12L22.4309 12.0007C22.4294 12.0467 22.4272 12.0927 22.4241 12.1387L22 18.485V19C22 19.5523 21.5523 20 21 20H20C19.4477 20 19 19.5523 19 19V18.5H5V19C5 19.5523 4.55228 20 4 20H3C2.44772 20 2 19.5523 2 19V18.5L1.57591 12.1387L1.571 12H1.5C0.947715 12 0.5 11.5523 0.5 11C0.5 10.4477 0.947715 10 1.5 10L2.03219 10.0005L4.66285 5.06001C5.01023 4.40763 5.68908 4 6.42819 4H17.5718ZM20.395 12.5H3.604L3.871 16.5H20.128L20.395 12.5ZM9 13.5V15.5H5V13.5H9ZM19 13.5V15.5H15V13.5H19ZM17.5718 6H6.42819L4.032 10.499H19.967L17.5718 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _directionsCar!!
    }

private var _directionsCar: ImageVector? = null
