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

public val Icons.Outlined.AppNotification: ImageVector
    get() {
        if (_appNotification != null) {
            return _appNotification!!
        }
        _appNotification =
            materialIcon(name = "Outlined.AppNotification") {
            addPath(
                pathData = PathParser().parsePathString("M19.5 6.5C20.3284 6.5 21 5.82843 21 5C21 4.17157 20.3284 3.5 19.5 3.5C18.6716 3.5 18 4.17157 18 5C18 5.82843 18.6716 6.5 19.5 6.5ZM16.6707 4H6C3.79086 4 2 5.79086 2 8V16C2 18.2091 3.79086 20 6 20H18C20.2091 20 22 18.2091 22 16V8C22 7.61019 21.9442 7.23341 21.8403 6.87719C21.3893 7.43866 20.7405 7.8344 19.9996 7.95859C19.9999 7.97236 20 7.98616 20 8V16C20 17.1046 19.1046 18 18 18H6C4.89543 18 4 17.1046 4 16V8C4 6.89543 4.89543 6 6 6H16.6707C16.5602 5.68722 16.5 5.35064 16.5 5C16.5 4.64936 16.5602 4.31278 16.6707 4ZM6 14H18V16H6V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _appNotification!!
    }

private var _appNotification: ImageVector? = null
