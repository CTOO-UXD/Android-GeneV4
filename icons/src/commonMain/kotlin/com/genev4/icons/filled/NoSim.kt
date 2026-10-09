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

public val Icons.Filled.NoSim: ImageVector
    get() {
        if (_noSim != null) {
            return _noSim!!
        }
        _noSim =
            materialIcon(name = "Filled.NoSim") {
            addPath(
                pathData = PathParser().parsePathString("M20 6V17.1716L6.91421 4.08579L9 2H16C18.2091 2 20 3.79086 20 6Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4.08582 6.91418L4 7V18C4 20.2091 5.79086 22 8 22H16C16.8933 22 17.7182 21.7072 18.3839 21.2123L20.4853 23.3136L21.8995 21.8994L2.10049 2.10043L0.686279 3.51465L4.08582 6.91418Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _noSim!!
    }

private var _noSim: ImageVector? = null
