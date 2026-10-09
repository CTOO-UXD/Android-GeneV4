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

public val Icons.Filled.ContactEmergency: ImageVector
    get() {
        if (_contactEmergency != null) {
            return _contactEmergency!!
        }
        _contactEmergency =
            materialIcon(name = "Filled.ContactEmergency") {
            addPath(
                pathData = PathParser().parsePathString("M18 4C20.2091 4 22 5.79086 22 8V16C22 18.2091 20.2091 20 18 20H6C3.79086 20 2 18.2091 2 16V8C2 5.79086 3.79086 4 6 4H18ZM16.7231 8.99001L16.723 10.69L18.1962 9.84049L18.9462 11.1395L17.473 11.989L18.9462 12.8405L18.1962 14.1395L16.723 13.289L16.7231 14.99H15.2231L15.223 13.289L13.75 14.1395L13 12.8405L14.473 11.99L13 11.1395L13.75 9.84049L15.223 10.69L15.2231 8.99001H16.7231ZM9 12C10.1046 12 11 11.1046 11 10C11 8.89543 10.1046 8 9 8C7.89543 8 7 8.89543 7 10C7 11.1046 7.89543 12 9 12ZM9 13C11.5 13 12 14.3431 12 16H6C6 14.3431 6.5 13 9 13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _contactEmergency!!
    }

private var _contactEmergency: ImageVector? = null
