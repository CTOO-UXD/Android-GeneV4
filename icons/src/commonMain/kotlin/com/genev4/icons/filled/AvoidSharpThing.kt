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

public val Icons.Filled.AvoidSharpThing: ImageVector
    get() {
        if (_avoidSharpThing != null) {
            return _avoidSharpThing!!
        }
        _avoidSharpThing =
            materialIcon(name = "Filled.AvoidSharpThing") {
            addPath(
                pathData = PathParser().parsePathString("M15 5C15 3.89543 14.1046 3 13 3H5C3.89543 3 3 3.89543 3 5V19C3 20.1046 3.89543 21 5 21H13C14.1046 21 15 20.1046 15 19V17.1234V14.3921L13 13.4171L8.81633 11.3775L11.4683 14.0925L20.5832 19.3339L21.5801 17.6001L15 14.3921V5ZM20 4H18V10H20V4ZM18 11H20V13H18V11Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _avoidSharpThing!!
    }

private var _avoidSharpThing: ImageVector? = null
