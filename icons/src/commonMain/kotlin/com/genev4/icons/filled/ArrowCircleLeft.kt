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

public val Icons.Filled.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft =
            materialIcon(name = "Filled.ArrowCircleLeft") {
            addPath(
                pathData = PathParser().parsePathString("M4.92942 4.92783C1.02418 8.83308 1.02418 15.1647 4.92942 19.07C8.83466 22.9752 15.1663 22.9752 19.0716 19.07C22.9768 15.1647 22.9768 8.83308 19.0716 4.92783C15.1663 1.02259 8.83466 1.02259 4.92942 4.92783ZM9.15116 13.4131L13.1534 17.4153L14.5676 16.0011L10.5654 11.9989L14.5676 7.99668L13.1534 6.58246L9.15116 10.5847C8.37011 11.3657 8.37011 12.6321 9.15116 13.4131Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
