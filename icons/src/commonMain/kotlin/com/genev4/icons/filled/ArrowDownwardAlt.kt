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

public val Icons.Filled.ArrowDownwardAlt: ImageVector
    get() {
        if (_arrowDownwardAlt != null) {
            return _arrowDownwardAlt!!
        }
        _arrowDownwardAlt =
            materialIcon(name = "Filled.ArrowDownwardAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12.9993 15.1697L12.9994 5.99683L10.9994 5.99683L10.9993 15.1695L7.41031 11.5805L5.99609 12.9947L10.5852 17.5838C11.3663 18.3648 12.6326 18.3648 13.4136 17.5838L17.9992 12.9982L16.585 11.584L12.9993 15.1697Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowDownwardAlt!!
    }

private var _arrowDownwardAlt: ImageVector? = null
