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

public val Icons.Outlined.NoSim: ImageVector
    get() {
        if (_noSim != null) {
            return _noSim!!
        }
        _noSim =
            materialIcon(name = "Outlined.NoSim") {
            addPath(
                pathData = PathParser().parsePathString("M20 6V17.1716L18 15.1716V6C18 4.89543 17.1046 4 16 4H9.829L8.32871 5.50029L6.91421 4.08579L9 2H16C18.2091 2 20 3.79086 20 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4.08582 6.91418L0.686279 3.51465L2.10049 2.10043L21.8995 21.8994L20.4853 23.3136L18.3839 21.2123C17.7182 21.7072 16.8933 22 16 22H8C5.79086 22 4 20.2091 4 18V7L4.08582 6.91418ZM6 8.82837V18C6 19.1046 6.89543 20 8 20H16C16.3391 20 16.6585 19.9156 16.9383 19.7667L6 8.82837Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _noSim!!
    }

private var _noSim: ImageVector? = null
