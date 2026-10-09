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

public val Icons.Filled.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic =
            materialIcon(name = "Filled.Mic") {
            addPath(
                pathData = PathParser().parsePathString("M6 12C6 15.3137 8.68629 18 12 18C15.3137 18 18 15.3137 18 12H20C20 16.0793 16.9468 19.4455 13.001 19.938L13 22H11L11 19.9381C7.05371 19.446 4 16.0796 4 12H6ZM12 2C14.2091 2 16 3.79086 16 6V12C16 14.2091 14.2091 16 12 16C9.79086 16 8 14.2091 8 12V6C8 3.79086 9.79086 2 12 2Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _mic!!
    }

private var _mic: ImageVector? = null
