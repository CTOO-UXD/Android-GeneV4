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

public val Icons.Filled.SignalWifi4Bar: ImageVector
    get() {
        if (_signalWifi4Bar != null) {
            return _signalWifi4Bar!!
        }
        _signalWifi4Bar =
            materialIcon(name = "Filled.SignalWifi4Bar") {
            addPath(
                pathData = PathParser().parsePathString("M13.1592 19.6298L22.9811 8.02216C20.0187 5.51307 16.186 4 11.9998 4C7.81364 4 3.98087 5.51307 1.01855 8.02216L10.8406 19.63C11.1676 19.863 11.5677 20 11.9998 20C12.4319 20 12.8321 19.8629 13.1592 19.6298Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _signalWifi4Bar!!
    }

private var _signalWifi4Bar: ImageVector? = null
