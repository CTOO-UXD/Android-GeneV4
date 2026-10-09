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

public val Icons.Outlined.Block: ImageVector
    get() {
        if (_block != null) {
            return _block!!
        }
        _block =
            materialIcon(name = "Outlined.Block") {
            addPath(
                pathData = PathParser().parsePathString("M2 12C2 6.47715 6.47715 2 12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12ZM12 4C7.58172 4 4 7.58172 4 12C4 13.8487 4.62708 15.551 5.68014 16.9056L16.9056 5.68014C15.551 4.62708 13.8487 4 12 4ZM18.3199 7.09436L7.09436 18.3199C8.44904 19.3729 10.1513 20 12 20C16.4183 20 20 16.4183 20 12C20 10.1513 19.3729 8.44904 18.3199 7.09436Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _block!!
    }

private var _block: ImageVector? = null
