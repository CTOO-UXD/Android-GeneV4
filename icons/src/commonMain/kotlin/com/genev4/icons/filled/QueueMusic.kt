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

public val Icons.Filled.QueueMusic: ImageVector
    get() {
        if (_queueMusic != null) {
            return _queueMusic!!
        }
        _queueMusic =
            materialIcon(name = "Filled.QueueMusic") {
            addPath(
                pathData = PathParser().parsePathString("M16 3.5L22 4.57048V7.07612L18 6.38985V17C18 19.2091 16.2091 21 14 21C11.7909 21 10 19.2091 10 17C10 14.7909 11.7909 13 14 13C14.7286 13 15.4117 13.1948 16 13.5351V3.5ZM8 14V16H2V14H8ZM12 9V11H2V9H12ZM14 4V6H2V4H14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _queueMusic!!
    }

private var _queueMusic: ImageVector? = null
