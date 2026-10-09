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

public val Icons.Filled.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label =
            materialIcon(name = "Filled.Label") {
            addPath(
                pathData = PathParser().parsePathString("M4.88828 3.29283L10.9448 2.27824C11.5824 2.17143 12.2323 2.37941 12.6894 2.83654L20.0926 10.2397C21.6547 11.8018 21.6547 14.3345 20.0926 15.8966L15.85 20.1392C14.2879 21.7013 11.7552 21.7013 10.1931 20.1392L2.78991 12.736C2.33278 12.2789 2.1248 11.629 2.23161 10.9914L3.2462 4.93491C3.38719 4.09329 4.04666 3.43382 4.88828 3.29283ZM9.06509 10.565C9.89352 10.565 10.5651 9.89345 10.5651 9.06502C10.5651 8.2366 9.89352 7.56502 9.06509 7.56502C8.23666 7.56502 7.56509 8.2366 7.56509 9.06502C7.56509 9.89345 8.23666 10.565 9.06509 10.565Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _label!!
    }

private var _label: ImageVector? = null
