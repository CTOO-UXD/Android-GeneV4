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

public val Icons.Filled.OneHand: ImageVector
    get() {
        if (_oneHand != null) {
            return _oneHand!!
        }
        _oneHand =
            materialIcon(name = "Filled.OneHand") {
            addPath(
                pathData = PathParser().parsePathString("M15 2C16.1046 2 17 2.89543 17 4L17.001 8.348L20.5979 13.028C21.1418 13.7358 21.4853 14.5749 21.595 15.4576L21.6209 15.7236L21.9873 20.9298C22.028 21.5083 21.5697 22 20.9897 22H14.2179C13.8155 22 13.4522 21.7587 13.2962 21.3878C13.2405 21.2555 13.1861 21.126 13.133 20.9994L6 21C4.89543 21 4 20.1046 4 19V4C4 2.89543 4.89543 2 6 2H15ZM14.9994 12.9747L15 4H6V19L12.3024 19C12.0448 18.3711 11.8456 17.8731 11.7046 17.5053L11.3778 16.64C10.0466 13.0512 9.83157 11.5264 11.2304 11.0528C12.1791 10.7316 13.2865 11.3155 14.8249 12.8045L14.9994 12.9747Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _oneHand!!
    }

private var _oneHand: ImageVector? = null
