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

public val Icons.Outlined.ChangeMachine: ImageVector
    get() {
        if (_changeMachine != null) {
            return _changeMachine!!
        }
        _changeMachine =
            materialIcon(name = "Outlined.ChangeMachine") {
            addPath(
                pathData = PathParser().parsePathString("M16 4H7L7 19H9.5V21H7C5.89543 21 5 20.1046 5 19V4C5 2.89543 5.89543 2 7 2H16C17.1046 2 18 2.89543 18 4V11H16V4ZM19.7071 14.7929L16.7071 11.7929L15.2929 13.2071L16.5858 14.5H11V16.5H19C19.4045 16.5 19.7691 16.2564 19.9239 15.8827C20.0787 15.509 19.9931 15.0789 19.7071 14.7929ZM12 18C11.5955 18 11.2309 18.2436 11.0761 18.6173C10.9213 18.991 11.0069 19.4211 11.2929 19.7071L14.2929 22.7071L15.7071 21.2929L14.4142 20H20V18H12Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _changeMachine!!
    }

private var _changeMachine: ImageVector? = null
