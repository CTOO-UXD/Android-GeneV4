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

public val Icons.Filled.AppNotification: ImageVector
    get() {
        if (_appNotification != null) {
            return _appNotification!!
        }
        _appNotification =
            materialIcon(name = "Filled.AppNotification") {
            addPath(
                pathData = PathParser().parsePathString("M19.5 6.5C20.3284 6.5 21 5.82843 21 5C21 4.17157 20.3284 3.5 19.5 3.5C18.6716 3.5 18 4.17157 18 5C18 5.82843 18.6716 6.5 19.5 6.5ZM6 4H16.6707C16.5602 4.31278 16.5 4.64936 16.5 5C16.5 6.65685 17.8431 8 19.5 8C20.4464 8 21.2904 7.56178 21.8403 6.87719C21.9442 7.23341 22 7.61019 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4ZM6 16H18V14H6V16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _appNotification!!
    }

private var _appNotification: ImageVector? = null
