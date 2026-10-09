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

public val Icons.Filled.BurstMode: ImageVector
    get() {
        if (_burstMode != null) {
            return _burstMode!!
        }
        _burstMode =
            materialIcon(name = "Filled.BurstMode") {
            addPath(
                pathData = PathParser().parsePathString("M21.0773 18.9985C21.0517 18.9995 21.0259 19 21 19H11C10.8619 19 10.7271 18.986 10.5969 18.9594C9.68556 18.7729 9 17.9665 9 17V7C9 5.89543 9.89543 5 11 5H21C22.1046 5 23 5.89543 23 7V17C23 18.0273 22.2255 18.8736 21.2286 18.9871C21.2206 18.988 21.2126 18.9889 21.2046 18.9897C21.2004 18.9901 21.1962 18.9905 21.192 18.9909C21.1816 18.9919 21.1712 18.9928 21.1607 18.9936C21.1505 18.9944 21.1403 18.9952 21.13 18.9958C21.1125 18.997 21.0949 18.9979 21.0773 18.9985ZM19.4045 12.5067C18.6235 11.7256 17.3571 11.7256 16.5761 12.5067L12.0817 17H21V14.1011L19.4045 12.5067ZM15 9.5C15 10.3284 14.3284 11 13.5 11C12.6716 11 12 10.3284 12 9.5C12 8.67157 12.6716 8 13.5 8C14.3284 8 15 8.67157 15 9.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 19V5H7V19H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M1 19V5H3V19H1Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _burstMode!!
    }

private var _burstMode: ImageVector? = null
