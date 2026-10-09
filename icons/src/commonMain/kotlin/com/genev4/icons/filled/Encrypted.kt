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

public val Icons.Filled.Encrypted: ImageVector
    get() {
        if (_encrypted != null) {
            return _encrypted!!
        }
        _encrypted =
            materialIcon(name = "Filled.Encrypted") {
            addPath(
                pathData = PathParser().parsePathString("M4.56841 4.87303C3.9233 5.13037 3.45789 5.70397 3.33898 6.38826C3.18766 7.25899 3.02637 8.47061 3.02637 9.67869C3.02637 17.4093 8.8954 20.7593 11.1943 21.7711C11.7076 21.997 12.2923 21.997 12.8056 21.7711C15.1045 20.7594 20.9735 17.4093 20.9735 9.67869C20.9735 8.49123 20.81 7.26902 20.6577 6.38838C20.5392 5.70346 20.0736 5.12917 19.428 4.87162L12.741 2.20412C12.2652 2.01432 11.7347 2.01432 11.2589 2.20412L4.56841 4.87303ZM14 10C14 10.7403 13.5978 11.3866 13 11.7324V15H11V11.7324C10.4022 11.3866 10 10.7403 10 10C10 8.89543 10.8954 8 12 8C13.1046 8 14 8.89543 14 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _encrypted!!
    }

private var _encrypted: ImageVector? = null
