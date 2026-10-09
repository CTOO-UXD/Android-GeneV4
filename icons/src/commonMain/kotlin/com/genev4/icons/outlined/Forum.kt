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

public val Icons.Outlined.Forum: ImageVector
    get() {
        if (_forum != null) {
            return _forum!!
        }
        _forum =
            materialIcon(name = "Outlined.Forum") {
            addPath(
                pathData = PathParser().parsePathString("M14 14.9995H7L3.2 17.8495C3.07018 17.9469 2.91228 17.9995 2.75 17.9995C2.33579 17.9995 2 17.6637 2 17.2495V5.99951C2 3.79037 3.79086 1.99951 6 1.99951H14C16.2091 1.99951 18 3.79037 18 5.99951V10.9995C18 13.2087 16.2091 14.9995 14 14.9995ZM14 12.9995H6.33333L4 14.7495V5.99951C4 4.89494 4.89543 3.99951 6 3.99951H14C15.1046 3.99951 16 4.89494 16 5.99951V10.9995C16 12.1041 15.1046 12.9995 14 12.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M11 18.9995C9.51946 18.9995 8.22678 18.1951 7.53516 16.9995H17.6667L20 18.7495V7.53467C21.1956 8.22629 22 9.51897 22 10.9995V21.2495C22 21.6638 21.6642 21.9995 21.25 21.9995C21.0877 21.9995 20.9298 21.9469 20.8 21.8495L17 18.9995H11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _forum!!
    }

private var _forum: ImageVector? = null
