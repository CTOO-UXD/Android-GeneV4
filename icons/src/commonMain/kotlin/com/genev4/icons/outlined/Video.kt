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

public val Icons.Outlined.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video =
            materialIcon(name = "Outlined.Video") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM18 6H6C4.89543 6 4 6.89543 4 8V16C4 17.1046 4.89543 18 6 18H18C19.1046 18 20 17.1046 20 16V8C20 6.89543 19.1046 6 18 6ZM14.9806 12.8682C15.6524 12.4843 15.6524 11.5157 14.9806 11.1318L10.9961 8.85494C10.3295 8.47399 9.5 8.95536 9.5 9.72318V14.2768C9.5 15.0446 10.3295 15.526 10.9961 15.1451L14.9806 12.8682Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _video!!
    }

private var _video: ImageVector? = null
