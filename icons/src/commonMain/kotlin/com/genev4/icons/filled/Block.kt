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

public val Icons.Filled.Block: ImageVector
    get() {
        if (_block != null) {
            return _block!!
        }
        _block =
            materialIcon(name = "Filled.Block") {
            addPath(
                pathData = PathParser().parsePathString("M22 11.9971C22 17.5199 17.5228 21.9971 12 21.9971C6.47715 21.9971 2 17.5199 2 11.9971C2 6.47422 6.47715 1.99707 12 1.99707C17.5228 1.99707 22 6.47422 22 11.9971ZM19 11.9971C19 15.8631 15.866 18.9971 12 18.9971C10.6099 18.9971 9.31443 18.5919 8.22527 17.8931L17.8961 8.22235C18.5948 9.3115 19 10.607 19 11.9971ZM6.10395 15.7718L15.7747 6.10102C14.6856 5.40228 13.3901 4.99707 12 4.99707C8.13401 4.99707 5 8.13108 5 11.9971C5 13.3872 5.40521 14.6827 6.10395 15.7718Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _block!!
    }

private var _block: ImageVector? = null
