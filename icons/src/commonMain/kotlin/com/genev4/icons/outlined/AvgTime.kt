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

public val Icons.Outlined.AvgTime: ImageVector
    get() {
        if (_avgTime != null) {
            return _avgTime!!
        }
        _avgTime =
            materialIcon(name = "Outlined.AvgTime") {
            addPath(
                pathData = PathParser().parsePathString("M15.0001 2.99963H9.00012V0.999634H15.0001V2.99963Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.364 19.3636C14.8492 22.8783 9.15076 22.8783 5.63604 19.3636C2.12132 15.8489 2.12132 10.1504 5.63604 6.63567C8.91167 3.36004 14.0841 3.13722 17.6178 5.9672L19.0708 4.51416L20.485 5.92837L19.032 7.38136C21.8624 10.9151 21.6397 16.0878 18.364 19.3636ZM16.9497 17.9494C14.2161 20.6831 9.78392 20.6831 7.05025 17.9494C5.93844 16.8376 5.27882 15.4448 5.07137 13.9996H7.38209L9.10569 17.4468C9.27509 17.7856 9.62135 17.9996 10.0001 17.9996C10.3789 17.9996 10.7252 17.7856 10.8945 17.4468L14.0001 11.2357L15.1057 13.4468C15.2751 13.7856 15.6214 13.9996 16.0001 13.9996H18.9286C18.7212 15.4448 18.0616 16.8376 16.9497 17.9494ZM18.9286 11.9996H16.6182L14.8945 8.55242C14.7252 8.21364 14.3789 7.99963 14.0001 7.99963C13.6214 7.99963 13.2751 8.21364 13.1057 8.55242L10.0001 14.7636L8.89455 12.5524C8.72516 12.2136 8.37889 11.9996 8.00012 11.9996H5.07137C5.27882 10.5545 5.93844 9.16169 7.05025 8.04989C9.78392 5.31622 14.2161 5.31622 16.9497 8.04989C18.0616 9.16169 18.7212 10.5545 18.9286 11.9996Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _avgTime!!
    }

private var _avgTime: ImageVector? = null
