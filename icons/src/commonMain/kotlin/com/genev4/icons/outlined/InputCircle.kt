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

public val Icons.Outlined.InputCircle: ImageVector
    get() {
        if (_inputCircle != null) {
            return _inputCircle!!
        }
        _inputCircle =
            materialIcon(name = "Outlined.InputCircle") {
            addPath(
                pathData = PathParser().parsePathString("M20 11.9995C20 13.4871 19.594 14.8799 18.8866 16.0731L20.3638 17.4831C21.3982 15.9085 22 14.0243 22 11.9995C22 6.47666 17.5228 1.99951 12 1.99951C6.47715 1.99951 2 6.47666 2 11.9995C2 14.0243 2.60177 15.9085 3.63623 17.4831L5.11336 16.0731C4.40605 14.8799 4 13.4871 4 11.9995C4 7.58123 7.58172 3.99951 12 3.99951C16.4183 3.99951 20 7.58123 20 11.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.7075 8.70307C12.317 8.31254 11.6838 8.31252 11.2933 8.70301L7.00293 12.9928L8.41706 14.4072L11.0003 11.8242L11 21.9995L13 21.9995L13.0003 11.8244L15.5829 14.4071L16.9971 12.9929L12.7075 8.70307Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _inputCircle!!
    }

private var _inputCircle: ImageVector? = null
