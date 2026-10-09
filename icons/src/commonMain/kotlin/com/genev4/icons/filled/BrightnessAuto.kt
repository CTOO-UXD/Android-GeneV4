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

public val Icons.Filled.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) {
            return _brightnessAuto!!
        }
        _brightnessAuto =
            materialIcon(name = "Filled.BrightnessAuto") {
            addPath(
                pathData = PathParser().parsePathString("M11.9805 9.0438L13.3325 12.4895H10.6285L11.9805 9.0438Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M10.5857 2.09995C11.3668 1.3189 12.6331 1.3189 13.4141 2.09995L15.3137 3.99945H17.9999C19.1045 3.99945 19.9999 4.89488 19.9999 5.99945V8.68573L21.8994 10.5852C22.6805 11.3663 22.6805 12.6326 21.8994 13.4137L19.9999 15.3131V17.9995C19.9999 19.104 19.1045 19.9995 17.9999 19.9995H15.3136L13.4141 21.8989C12.6331 22.68 11.3668 22.68 10.5857 21.8989L8.68624 19.9995H5.99993C4.89536 19.9995 3.99993 19.104 3.99993 17.9995V15.3131L2.10043 13.4137C1.31939 12.6326 1.31939 11.3663 2.10043 10.5852L3.99993 8.68573V5.99945C3.99993 4.89488 4.89536 3.99945 5.99993 3.99945H8.68621L10.5857 2.09995ZM9.99147 14.0709H13.9565L14.7235 15.9995H16.7905L12.9685 6.99951H11.0185L7.20947 15.9995H9.23747L9.99147 14.0709Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
