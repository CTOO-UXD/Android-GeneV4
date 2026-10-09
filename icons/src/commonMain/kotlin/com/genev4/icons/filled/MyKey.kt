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

public val Icons.Filled.MyKey: ImageVector
    get() {
        if (_myKey != null) {
            return _myKey!!
        }
        _myKey =
            materialIcon(name = "Filled.MyKey") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM12 8C13.1046 8 14 8.89543 14 10C14 10.7398 13.5983 11.3858 13.0011 11.7318L13 16H11L10.9999 11.7324C10.4022 11.3866 10 10.7403 10 10C10 8.89543 10.8954 8 12 8Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _myKey!!
    }

private var _myKey: ImageVector? = null
