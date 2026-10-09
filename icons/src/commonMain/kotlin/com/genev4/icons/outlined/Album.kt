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

public val Icons.Outlined.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album =
            materialIcon(name = "Outlined.Album") {
            addPath(
                pathData = PathParser().parsePathString("M7 5H17C18.1046 5 19 5.89543 19 7V15.5707L15.667 12.2377C14.886 11.4566 13.6196 11.4566 12.8386 12.2377L6.22992 18.8464C5.50762 18.5448 5 17.8317 5 17V16H6V14H5V10H6V8H5V7C5 5.89543 5.89543 5 7 5ZM3 8V7C3 4.79086 4.79086 3 7 3H17C19.2091 3 21 4.79086 21 7V17C21 17.4832 20.9143 17.9465 20.7573 18.3753C20.7002 18.5311 20.6338 18.6824 20.5586 18.8284C20.4333 19.0719 20.2837 19.3009 20.113 19.5121L20.113 19.5121C19.3797 20.4196 18.2576 21 17 21H7C6.96851 21 6.93711 20.9996 6.9058 20.9989L6.90562 20.9991C6.11203 20.9807 5.37557 20.7313 4.76095 20.3153L4.76109 20.3152C3.69847 19.5961 3 18.3796 3 17V16H2V14H3V10H2V8H3ZM18.6826 18.0816C18.3267 18.6341 17.7061 19 17 19H8.90471L14.2528 13.6519L18.6826 18.0816ZM11 8.5C11 9.32843 10.3284 10 9.5 10C8.67157 10 8 9.32843 8 8.5C8 7.67157 8.67157 7 9.5 7C10.3284 7 11 7.67157 11 8.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _album!!
    }

private var _album: ImageVector? = null
