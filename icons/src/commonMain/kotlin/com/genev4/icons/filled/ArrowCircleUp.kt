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

public val Icons.Filled.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp =
            materialIcon(name = "Filled.ArrowCircleUp") {
            addPath(
                pathData = PathParser().parsePathString("M19.0706 4.92783C15.1653 1.02259 8.83369 1.02259 4.92844 4.92783C1.0232 8.83308 1.0232 15.1647 4.92844 19.07C8.83369 22.9752 15.1653 22.9752 19.0706 19.07C22.9758 15.1647 22.9758 8.83308 19.0706 4.92783ZM10.5853 9.14958L6.58307 13.1518L7.99729 14.566L11.9995 10.5638L16.0017 14.566L17.4159 13.1518L13.4137 9.14958C12.6327 8.36853 11.3663 8.36853 10.5853 9.14958Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
