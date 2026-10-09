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

public val Icons.Filled.CreateNewFolder: ImageVector
    get() {
        if (_createNewFolder != null) {
            return _createNewFolder!!
        }
        _createNewFolder =
            materialIcon(name = "Filled.CreateNewFolder") {
            addPath(
                pathData = PathParser().parsePathString("M10 3L13 5H18C20.2091 5 22 6.79086 22 9V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V7C2 4.79086 3.79086 3 6 3H10ZM16.0413 10.0569V12.0018H18.0376V14.0018H16.0413V16.0569H14.0413V14.0018H12.0376V12.0018H14.0413V10.0569H16.0413Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _createNewFolder!!
    }

private var _createNewFolder: ImageVector? = null
