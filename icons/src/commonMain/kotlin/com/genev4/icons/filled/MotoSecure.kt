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

public val Icons.Filled.MotoSecure: ImageVector
    get() {
        if (_motoSecure != null) {
            return _motoSecure!!
        }
        _motoSecure =
            materialIcon(name = "Filled.MotoSecure") {
            addPath(
                pathData = PathParser().parsePathString("M11.2572 3.2971L5.44948 5.6202C4.85321 5.85871 4.40621 6.36872 4.29305 7.00088C4.15549 7.76935 4 8.88467 4 9.99999C4 17.098 9.57862 20.0121 11.4189 20.7803C11.7944 20.937 12.2056 20.937 12.5811 20.7803C14.4214 20.0121 20 17.098 20 9.99999C20 8.9071 19.8434 7.78485 19.7055 7.00829C19.5926 6.37223 19.144 5.85759 18.5442 5.61766L12.7428 3.2971C12.266 3.10637 11.734 3.10637 11.2572 3.2971Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _motoSecure!!
    }

private var _motoSecure: ImageVector? = null
