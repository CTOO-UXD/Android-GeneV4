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

public val Icons.Filled.Album: ImageVector
    get() {
        if (_album != null) {
            return _album!!
        }
        _album =
            materialIcon(name = "Filled.Album") {
            addPath(
                pathData = PathParser().parsePathString("M3 7C3 4.79086 4.79086 3 7 3H17C19.2091 3 21 4.79086 21 7V17C21 17.3812 20.9467 17.7499 20.8471 18.0991C20.8228 18.1842 20.7958 18.2681 20.7661 18.3508C20.2121 19.8953 18.7351 21 17 21H7C6.1705 21 5.39998 20.7475 4.76109 20.3152C3.69847 19.5961 3 18.3796 3 17V16H2V14H3V10H2V8H3V7ZM12.8386 12.2377L6.22992 18.8464C6.46695 18.9453 6.72709 19 7 19H17C18.1046 19 19 18.1046 19 17V15.5707L15.667 12.2377C14.886 11.4566 13.6196 11.4566 12.8386 12.2377ZM9.5 10C10.3284 10 11 9.32843 11 8.5C11 7.67157 10.3284 7 9.5 7C8.67157 7 8 7.67157 8 8.5C8 9.32843 8.67157 10 9.5 10Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _album!!
    }

private var _album: ImageVector? = null
