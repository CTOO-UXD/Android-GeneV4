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

public val Icons.Filled.Tool: ImageVector
    get() {
        if (_tool != null) {
            return _tool!!
        }
        _tool =
            materialIcon(name = "Filled.Tool") {
            addPath(
                pathData = PathParser().parsePathString("M13 2.07739L13 11.4228L21.0933 16.0954C21.0933 16.0954 21.0933 16.0954 21.0933 16.0953V7.90474C21.0933 7.19021 20.7121 6.52996 20.0933 6.17269L13 2.07739ZM11 2.07739L3.90674 6.17269C3.28794 6.52996 2.90674 7.19021 2.90674 7.90474V16.0953C2.90674 16.0956 2.90674 16.0959 2.90674 16.0962L11 11.4235L11 2.07739ZM3.90747 17.8278L11 21.9227C11.6188 22.28 12.3812 22.28 13 21.9227L20.0932 17.8274L12.0007 13.1552L3.90747 17.8278Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _tool!!
    }

private var _tool: ImageVector? = null
