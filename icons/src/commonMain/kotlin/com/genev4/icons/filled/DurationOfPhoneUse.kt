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

public val Icons.Filled.DurationOfPhoneUse: ImageVector
    get() {
        if (_durationOfPhoneUse != null) {
            return _durationOfPhoneUse!!
        }
        _durationOfPhoneUse =
            materialIcon(name = "Filled.DurationOfPhoneUse") {
            addPath(
                pathData = PathParser().parsePathString("M5 4C5 2.89543 5.89543 2 7 2H17C18.1046 2 19 2.89543 19 4V12.083C18.6748 12.0284 18.3407 12 18 12C14.6863 12 12 14.6863 12 18C12 19.5367 12.5777 20.9385 13.5278 22H7C5.89543 22 5 21.1046 5 20V4ZM22 18C22 20.2091 20.2091 22 18 22C15.7909 22 14 20.2091 14 18C14 15.7909 15.7909 14 18 14C20.2091 14 22 15.7909 22 18ZM17.2501 17.6893V15.6055H18.7501V18V18.3107L18.5304 18.5303L16.8936 20.1672L15.833 19.1065L17.2501 17.6893Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _durationOfPhoneUse!!
    }

private var _durationOfPhoneUse: ImageVector? = null
