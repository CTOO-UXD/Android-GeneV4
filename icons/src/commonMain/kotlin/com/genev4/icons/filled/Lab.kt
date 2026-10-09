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

public val Icons.Filled.Lab: ImageVector
    get() {
        if (_lab != null) {
            return _lab!!
        }
        _lab =
            materialIcon(name = "Filled.Lab") {
            addPath(
                pathData = PathParser().parsePathString("M7.00399 5H9.00399V10.6569L3.46992 17.7721C2.44814 19.0858 3.38433 21 5.04863 21H18.9593C20.6236 21 21.5598 19.0858 20.5381 17.7721L15.004 10.6569V5H17.004V3H14.004H10.004H7.00399V5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lab!!
    }

private var _lab: ImageVector? = null
