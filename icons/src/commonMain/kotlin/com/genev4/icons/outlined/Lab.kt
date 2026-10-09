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

public val Icons.Outlined.Lab: ImageVector
    get() {
        if (_lab != null) {
            return _lab!!
        }
        _lab =
            materialIcon(name = "Outlined.Lab") {
            addPath(
                pathData = PathParser().parsePathString("M9.00399 5H7.00399V3H17.004V5H15.004V10.6569L20.5381 17.7721C21.5598 19.0858 20.6236 21 18.9593 21H5.04863C3.38433 21 2.44814 19.0858 3.46992 17.7721L9.00399 10.6569V5ZM11.004 5V11.3431L5.04862 19H18.9593L13.004 11.3431V5H11.004Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _lab!!
    }

private var _lab: ImageVector? = null
