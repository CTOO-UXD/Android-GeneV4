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

public val Icons.Filled.Forum: ImageVector
    get() {
        if (_forum != null) {
            return _forum!!
        }
        _forum =
            materialIcon(name = "Filled.Forum") {
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 3.79037 3.79086 1.99951 6 1.99951H14C16.2091 1.99951 18 3.79037 18 5.99951V10.9995C18 13.2087 16.2091 14.9995 14 14.9995H7L3.2 17.8495C3.07018 17.9469 2.91228 17.9995 2.75 17.9995C2.33579 17.9995 2 17.6637 2 17.2495V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M7.53516 16.9995C8.22678 18.1951 9.51946 18.9995 11 18.9995H17L20.8 21.8495C20.9298 21.9469 21.0877 21.9995 21.25 21.9995C21.6642 21.9995 22 21.6638 22 21.2495V10.9995C22 9.51897 21.1956 8.22629 20 7.53467V18.7495L17.6667 16.9995H7.53516Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _forum!!
    }

private var _forum: ImageVector? = null
