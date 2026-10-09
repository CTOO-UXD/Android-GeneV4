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

public val Icons.Filled.NewWindow: ImageVector
    get() {
        if (_newWindow != null) {
            return _newWindow!!
        }
        _newWindow =
            materialIcon(name = "Filled.NewWindow") {
            addPath(
                pathData = PathParser().parsePathString("M17 13C18.5367 13 19.9385 12.4223 21 11.4722V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7C3 4.79086 4.79086 3 7 3H12.5278C11.5777 4.06151 11 5.46329 11 7C11 10.3137 13.6863 13 17 13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 11V8H13V6H16V3H18V6H21V8H18V11H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _newWindow!!
    }

private var _newWindow: ImageVector? = null
