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

public val Icons.Filled.MusicOff: ImageVector
    get() {
        if (_musicOff != null) {
            return _musicOff!!
        }
        _musicOff =
            materialIcon(name = "Filled.MusicOff") {
            addPath(
                pathData = PathParser().parsePathString("M14.0002 5.286V11.1716L12.0005 9.17192L12.0002 2.5L19.0002 3.5V6L14.0002 5.286ZM14.0002 16.8284L19.7783 22.6065L21.1925 21.1923L2.80777 2.80754L1.39355 4.22176L9.67514 12.5033C9.6171 12.5011 9.55878 12.5 9.5002 12.5C7.01492 12.5 5.0002 14.5147 5.0002 17C5.0002 19.4853 7.01492 21.5 9.5002 21.5C11.9855 21.5 14.0002 19.4853 14.0002 17V16.8284Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _musicOff!!
    }

private var _musicOff: ImageVector? = null
