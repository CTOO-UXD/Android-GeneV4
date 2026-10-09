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

public val Icons.Outlined.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label =
            materialIcon(name = "Outlined.Label") {
            addPath(
                pathData = PathParser().parsePathString("M5.00058 3.29283L11.0571 2.27824C11.6947 2.17143 12.3446 2.37941 12.8017 2.83654L20.2049 10.2397C21.767 11.8018 21.767 14.3345 20.2049 15.8966L15.9623 20.1392C14.4002 21.7013 11.8675 21.7013 10.3054 20.1392L2.90222 12.736C2.44508 12.2789 2.23711 11.629 2.34392 10.9914L3.35851 4.93491C3.4995 4.09329 4.15896 3.43382 5.00058 3.29283ZM5.33102 5.26535L4.31643 11.3218L11.7196 18.725C12.5007 19.5061 13.767 19.5061 14.5481 18.725L18.7907 14.4824C19.5718 13.7013 19.5718 12.435 18.7907 11.654L11.3875 4.25076L5.33102 5.26535ZM9.1774 10.565C10.0058 10.565 10.6774 9.89345 10.6774 9.06502C10.6774 8.2366 10.0058 7.56502 9.1774 7.56502C8.34897 7.56502 7.6774 8.2366 7.6774 9.06502C7.6774 9.89345 8.34897 10.565 9.1774 10.565Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _label!!
    }

private var _label: ImageVector? = null
