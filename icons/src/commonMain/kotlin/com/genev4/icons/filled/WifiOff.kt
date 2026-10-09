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

public val Icons.Filled.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff =
            materialIcon(name = "Filled.WifiOff") {
            addPath(
                pathData = PathParser().parsePathString("M14.8288 17.6571L19.7783 22.6066L21.1925 21.1924L2.80777 2.80762L1.39355 4.22183L3.46595 6.29423C2.59861 6.79865 1.77997 7.3776 1.0188 8.02231L10.8408 19.6302C11.1678 19.8631 11.5679 20.0002 12 20.0002C12.4322 20.0002 12.8324 19.8631 13.1594 19.63L14.8288 17.6571Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M22.9813 8.02231L17.4214 14.5931L7.44544 4.61717C8.895 4.21505 10.4224 4.00015 12 4.00015C16.1862 4.00015 20.019 5.51322 22.9813 8.02231Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
