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

public val Icons.Outlined.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic =
            materialIcon(name = "Outlined.Mic") {
            addPath(
                pathData = PathParser().parsePathString("M6 12C6 15.3137 8.68629 18 12 18C15.3137 18 18 15.3137 18 12H20C20 16.0793 16.9468 19.4455 13.001 19.938L13 22H11L11 19.9381C7.05371 19.446 4 16.0796 4 12H6ZM12 2C14.2091 2 16 3.79086 16 6V12C16 14.2091 14.2091 16 12 16C9.79086 16 8 14.2091 8 12V6C8 3.79086 9.79086 2 12 2ZM12 4C10.8954 4 10 4.89543 10 6V12C10 13.1046 10.8954 14 12 14C13.1046 14 14 13.1046 14 12V6C14 4.89543 13.1046 4 12 4Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _mic!!
    }

private var _mic: ImageVector? = null
