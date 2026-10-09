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

public val Icons.Outlined.ArrowDownwardAlt: ImageVector
    get() {
        if (_arrowDownwardAlt != null) {
            return _arrowDownwardAlt!!
        }
        _arrowDownwardAlt =
            materialIcon(name = "Outlined.ArrowDownwardAlt") {
            addPath(
                pathData = PathParser().parsePathString("M12.9993 15.1696L12.9994 5.99671L10.9994 5.9967L10.9993 15.1694L7.41031 11.5803L5.99609 12.9946L10.5852 17.5837C11.3663 18.3647 12.6326 18.3647 13.4136 17.5837L17.9992 12.9981L16.585 11.5839L12.9993 15.1696Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _arrowDownwardAlt!!
    }

private var _arrowDownwardAlt: ImageVector? = null
