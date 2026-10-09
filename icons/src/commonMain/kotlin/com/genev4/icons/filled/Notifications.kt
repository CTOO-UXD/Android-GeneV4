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

public val Icons.Filled.Notifications: ImageVector
    get() {
        if (_notifications != null) {
            return _notifications!!
        }
        _notifications =
            materialIcon(name = "Filled.Notifications") {
            addPath(
                pathData = PathParser().parsePathString("M12.0001 1C12.7046 1 13.2956 1.48561 13.4567 2.14033C16.8238 2.80301 19.3839 5.72127 19.4963 9.25727L19.5001 9.5C19.4996 11.8423 20.0938 14.1464 21.2269 16.1963L21.6802 17.0163C21.9473 17.4997 21.772 18.1081 21.2887 18.3752C21.1406 18.4571 20.9742 18.5 20.805 18.5H3.19531C2.64303 18.5 2.19531 18.0523 2.19531 17.5C2.19531 17.3308 2.23824 17.1644 2.32007 17.0163L2.77271 16.1968C3.83449 14.2746 4.4232 12.1294 4.49309 9.9387L4.50014 9.5C4.50014 5.85581 7.09919 2.81867 10.5448 2.14111C10.7041 1.4861 11.2953 1 12.0001 1ZM9.50014 20H14.5001C14.5001 21.3807 13.3808 22.5 12.0001 22.5C10.6194 22.5 9.50014 21.3807 9.50014 20Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _notifications!!
    }

private var _notifications: ImageVector? = null
