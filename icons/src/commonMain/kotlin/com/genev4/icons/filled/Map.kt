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

public val Icons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map =
            materialIcon(name = "Filled.Map") {
            addPath(
                pathData = PathParser().parsePathString("M3.34019 4.82496L8.40043 3.14496C8.78257 3.01809 9.19334 3.01809 9.57547 3.14496L15.012 4.9499L19.4848 3.46496C20.4988 3.12831 21.5838 3.70823 21.9083 4.76025C21.9691 4.95729 22 5.16292 22 5.3698V17.2699C22 18.1396 21.4582 18.9097 20.6598 19.1747L15.5996 20.8547C15.2174 20.9816 14.8067 20.9816 14.4245 20.8547L8.98795 19.0498L4.51523 20.5347C3.50124 20.8714 2.41619 20.2915 2.09171 19.2395C2.03094 19.0424 2 18.8368 2 18.6299V6.7298C2 5.86007 2.54177 5.09003 3.34019 4.82496ZM14.0482 6.7298L9.95181 5.3698V17.2699L14.0482 18.6299V6.7298Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _map!!
    }

private var _map: ImageVector? = null
