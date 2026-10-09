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

public val Icons.Outlined.LaunchPowerTouch: ImageVector
    get() {
        if (_launchPowerTouch != null) {
            return _launchPowerTouch!!
        }
        _launchPowerTouch =
            materialIcon(name = "Outlined.LaunchPowerTouch") {
            addPath(
                pathData = PathParser().parsePathString("M13 3C14.1046 3 15 3.89543 15 5V8C15.5523 8 16 8.44772 16 9V11C16 11.5523 15.5523 12 15 12V19C15 20.1046 14.1046 21 13 21H5C3.89543 21 3 20.1046 3 19V5C3 3.89543 3.89543 3 5 3H13ZM13 5H5V19H13V5ZM18 9H22V11H18V9ZM17.5355 12.1213L20.364 14.9497L18.9497 16.364L16.1213 13.5355L17.5355 12.1213ZM16.1213 6.46447L18.9497 3.63604L20.364 5.05025L17.5355 7.87868L16.1213 6.46447Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _launchPowerTouch!!
    }

private var _launchPowerTouch: ImageVector? = null
