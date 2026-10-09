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

public val Icons.Filled.MotoMover: ImageVector
    get() {
        if (_motoMover != null) {
            return _motoMover!!
        }
        _motoMover =
            materialIcon(name = "Filled.MotoMover") {
            addPath(
                pathData = PathParser().parsePathString("M18 10C18 14.4183 14.4183 18 10 18C5.58172 18 2 14.4183 2 10C2 5.58172 5.58172 2 10 2C14.4183 2 18 5.58172 18 10ZM22 18.5C22 20.433 20.433 22 18.5 22C16.567 22 15 20.433 15 18.5C15 16.567 16.567 15 18.5 15C20.433 15 22 16.567 22 18.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _motoMover!!
    }

private var _motoMover: ImageVector? = null
