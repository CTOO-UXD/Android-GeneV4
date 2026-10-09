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

public val Icons.Filled.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush =
            materialIcon(name = "Filled.Brush") {
            addPath(
                pathData = PathParser().parsePathString("M21.4312 3.33111C20.4549 2.3548 18.8719 2.3548 17.8956 3.33111L9.7639 11.4628L13.2994 14.9984L21.4312 6.86664C22.4075 5.89033 22.4075 4.30742 21.4312 3.33111Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3.94657 20.8475C4.87879 21.3136 5.8216 21.5466 6.775 21.5466C8.17332 21.5466 9.37037 21.0487 10.3661 20.053C11.3619 19.0572 11.8598 17.8601 11.8598 16.4618C11.8598 15.4025 11.489 14.502 10.7475 13.7605C10.006 13.019 9.10554 12.6482 8.0462 12.6482C6.98686 12.6482 6.08643 13.019 5.34489 13.7605C4.60336 14.502 4.23259 15.4025 4.23259 16.4618C4.23259 17.2881 3.94657 17.9184 3.37453 18.3527C2.80249 18.787 2.24104 19.0042 1.69019 19.0042C2.26223 19.7669 3.01436 20.3813 3.94657 20.8475Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _brush!!
    }

private var _brush: ImageVector? = null
