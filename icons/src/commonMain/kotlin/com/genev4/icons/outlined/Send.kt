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

public val Icons.Outlined.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send =
            materialIcon(name = "Outlined.Send") {
            addPath(
                pathData = PathParser().parsePathString("M4.42627 3.52441C4.56329 3.52441 4.69886 3.55257 4.82454 3.60715L22.0416 11.0828C22.5482 11.3027 22.7806 11.8917 22.5606 12.3983C22.4597 12.6308 22.2742 12.8163 22.0416 12.9173L4.82454 20.3929C4.31795 20.6129 3.72896 20.3805 3.509 19.8739C3.45443 19.7482 3.42627 19.6127 3.42627 19.4756V14V10V4.52441C3.42627 3.97213 3.87398 3.52441 4.42627 3.52441ZM5.42627 13.5556L12.4263 12L5.42627 10.4445V6.04802L19.1313 12L5.42627 17.951V13.5556Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _send!!
    }

private var _send: ImageVector? = null
