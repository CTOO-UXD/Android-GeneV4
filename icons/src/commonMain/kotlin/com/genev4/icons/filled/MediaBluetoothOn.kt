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

public val Icons.Filled.MediaBluetoothOn: ImageVector
    get() {
        if (_mediaBluetoothOn != null) {
            return _mediaBluetoothOn!!
        }
        _mediaBluetoothOn =
            materialIcon(name = "Filled.MediaBluetoothOn") {
            addPath(
                pathData = PathParser().parsePathString("M16 3.5L9 2.5L9.00052 13.2581C8.28537 12.7793 7.4253 12.5 6.5 12.5C4.01472 12.5 2 14.5147 2 17C2 19.4853 4.01472 21.5 6.5 21.5C8.98528 21.5 11 19.4853 11 17V5.286L16 6V3.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M16.925 9H17.5487L20.9761 12.4179L18.3242 15L20.9754 17.5814L17.5484 21H16.925V16.3624L14.1011 19.112L13.2988 18.288L16.6757 15L13.2989 11.712L14.1011 10.888L16.925 13.6376V9ZM18.075 11.1489L19.3376 12.4081L18.075 13.6376V11.1489ZM18.075 18.8504L19.3371 17.5914L18.075 16.3624V18.8504Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _mediaBluetoothOn!!
    }

private var _mediaBluetoothOn: ImageVector? = null
