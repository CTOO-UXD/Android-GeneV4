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

public val Icons.Filled.PowerAuto: ImageVector
    get() {
        if (_powerAuto != null) {
            return _powerAuto!!
        }
        _powerAuto =
            materialIcon(name = "Filled.PowerAuto") {
            addPath(
                pathData = PathParser().parsePathString("M11 2V11H13V2H11ZM3 12C3 7.89695 5.74572 4.43515 9.5 3.35181L9.5 10.5C9.5 11.8807 10.6193 13 12 13C13.3807 13 14.5 11.8807 14.5 10.5V3.35181C18.2543 4.43515 21 7.89695 21 12C21 12.264 20.9886 12.5252 20.9664 12.7834C20.0915 12.2848 19.079 12 18 12C14.6863 12 12 14.6863 12 18C12 19.079 12.2848 20.0915 12.7834 20.9664C12.5252 20.9887 12.2639 21 12 21C7.02944 21 3 16.9706 3 12ZM14 18C14 20.1574 15.7079 21.9158 17.8454 21.9971C17.8967 21.999 17.9482 22 18 22C20.2091 22 22 20.2091 22 18C22 15.7909 20.2092 14 18 14C15.7909 14 14 15.7909 14 18ZM17.188 15.25L15.5 20.25H16.708L17.13 19H18.87L19.291 20.25H20.5001L18.816 15.25H17.188ZM18.0017 16.4193L18.554 18.062H17.446L18.0017 16.4193Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _powerAuto!!
    }

private var _powerAuto: ImageVector? = null
