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

public val Icons.Filled.AppStore: ImageVector
    get() {
        if (_appStore != null) {
            return _appStore!!
        }
        _appStore =
            materialIcon(name = "Filled.AppStore") {
            addPath(
                pathData = PathParser().parsePathString("M16.7159 3C18.8389 3 20.592 4.65845 20.7098 6.77812L21.2653 16.7781C21.3879 18.9839 19.6991 20.8713 17.4934 20.9938C17.4195 20.9979 17.3455 21 17.2715 21H6.72827C4.51913 21 2.72827 19.2091 2.72827 17L2.72981 16.889L3.28999 6.77812C3.40774 4.65845 5.16089 3 7.28383 3H16.7159ZM17.1862 8.33458L15.3007 7.6676C14.8103 9.05398 13.4949 10 11.9999 10C10.5049 10 9.1895 9.05398 8.69908 7.6676L6.81357 8.33458C7.58446 10.5138 9.65086 12 11.9999 12C14.3489 12 16.4153 10.5138 17.1862 8.33458Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _appStore!!
    }

private var _appStore: ImageVector? = null
