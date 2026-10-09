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

public val Icons.Filled.NotificationsPaused: ImageVector
    get() {
        if (_notificationsPaused != null) {
            return _notificationsPaused!!
        }
        _notificationsPaused =
            materialIcon(name = "Filled.NotificationsPaused") {
            addPath(
                pathData = PathParser().parsePathString("M13.4567 2.14033C13.2956 1.48561 12.7046 1 12.0001 1C11.2953 1 10.7041 1.4861 10.5448 2.14111C7.09919 2.81867 4.50014 5.85581 4.50014 9.5L4.49309 9.9387C4.4232 12.1294 3.83449 14.2746 2.77271 16.1968L2.32007 17.0163C2.23824 17.1644 2.19531 17.3308 2.19531 17.5C2.19531 18.0523 2.64303 18.5 3.19531 18.5H20.805C20.9742 18.5 21.1406 18.4571 21.2887 18.3752C21.772 18.1081 21.9473 17.4997 21.6802 17.0163L21.2269 16.1963C20.0938 14.1464 19.4996 11.8423 19.5001 9.5L19.4963 9.25727C19.3839 5.72127 16.8238 2.80301 13.4567 2.14033ZM9 7V9H12.1315L9 13.6972V15H15V13H11.8685L15 8.30278V7H9Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M12.0001 22.5C13.3808 22.5 14.5001 21.3807 14.5001 20H9.50014C9.50014 21.3807 10.6194 22.5 12.0001 22.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _notificationsPaused!!
    }

private var _notificationsPaused: ImageVector? = null
