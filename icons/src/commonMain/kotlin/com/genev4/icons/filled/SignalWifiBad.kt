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

public val Icons.Filled.SignalWifiBad: ImageVector
    get() {
        if (_signalWifiBad != null) {
            return _signalWifiBad!!
        }
        _signalWifiBad =
            materialIcon(name = "Filled.SignalWifiBad") {
            addPath(
                pathData = PathParser().parsePathString("M11.9998 18C11.9998 18.691 12.1166 19.3548 12.3316 19.9726C12.2236 19.9906 12.1128 20 11.9998 20C11.5677 20 11.1676 19.863 10.8406 19.63L1.01855 8.02216C3.98087 5.51307 7.81364 4 11.9998 4C16.186 4 20.0187 5.51307 22.9811 8.02216L19.4631 12.1797C18.9947 12.0623 18.5045 12 17.9998 12C14.686 12 11.9998 14.6863 11.9998 18Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M19.4141 18.0004L21.5354 15.8791L20.1212 14.4648L17.9999 16.5862L15.8786 14.4648L14.4644 15.8791L16.5857 18.0004L14.4644 20.1217L15.8786 21.5359L17.9999 19.4146L20.1212 21.5359L21.5354 20.1217L19.4141 18.0004Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _signalWifiBad!!
    }

private var _signalWifiBad: ImageVector? = null
