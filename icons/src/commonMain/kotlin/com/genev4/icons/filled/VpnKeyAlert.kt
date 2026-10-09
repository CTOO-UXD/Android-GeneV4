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

public val Icons.Filled.VpnKeyAlert: ImageVector
    get() {
        if (_vpnKeyAlert != null) {
            return _vpnKeyAlert!!
        }
        _vpnKeyAlert =
            materialIcon(name = "Filled.VpnKeyAlert") {
            addPath(
                pathData = PathParser().parsePathString("M7 18C9.61244 18 11.8349 16.3304 12.6586 14H15.5V15.5C15.5 16.3284 16.1716 17 17 17H18C18.1753 17 18.3436 16.9699 18.5 16.9146V10H12.6586C11.8349 7.66962 9.61244 6 7 6C3.68629 6 1 8.68629 1 12C1 15.3137 3.68629 18 7 18ZM7 14C8.10457 14 9 13.1046 9 12C9 10.8954 8.10457 10 7 10C5.89543 10 5 10.8954 5 12C5 13.1046 5.89543 14 7 14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 8V14.5H23V8H21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M23 18.5V16.5H21V18.5H23Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _vpnKeyAlert!!
    }

private var _vpnKeyAlert: ImageVector? = null
