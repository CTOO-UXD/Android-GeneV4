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

public val Icons.Filled.PlayArrow: ImageVector
    get() {
        if (_playArrow != null) {
            return _playArrow!!
        }
        _playArrow =
            materialIcon(name = "Filled.PlayArrow") {
            addPath(
                pathData = PathParser().parsePathString("M19.8277 13.0289C19.6588 13.3104 19.4232 13.546 19.1417 13.7149L8.02899 20.3825C7.08183 20.9508 5.85331 20.6437 5.28501 19.6965C5.09852 19.3857 5 19.03 5 18.6675V5.33228C5 4.22771 5.89543 3.33228 7 3.33228C7.36249 3.33228 7.71816 3.43079 8.02899 3.61729L19.1417 10.2849C20.0889 10.8532 20.396 12.0817 19.8277 13.0289Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _playArrow!!
    }

private var _playArrow: ImageVector? = null
