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

public val Icons.Filled.NightLightEyeProtection: ImageVector
    get() {
        if (_nightLightEyeProtection != null) {
            return _nightLightEyeProtection!!
        }
        _nightLightEyeProtection =
            materialIcon(name = "Filled.NightLightEyeProtection") {
            addPath(
                pathData = PathParser().parsePathString("M12 2C17.5228 2 22 6.47715 22 12C22 17.5228 17.5228 22 12 22C6.47715 22 2 17.5228 2 12C2 6.47715 6.47715 2 12 2ZM13 9.5C13 11.433 11.433 13 9.5 13C8.52078 13 7.63549 12.5979 7.00025 11.9497L7 12C7 14.7614 9.23858 17 12 17C14.7614 17 17 14.7614 17 12C17 9.23858 14.7614 7 12 7L11.9497 7.00025C12.5979 7.63549 13 8.52078 13 9.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _nightLightEyeProtection!!
    }

private var _nightLightEyeProtection: ImageVector? = null
