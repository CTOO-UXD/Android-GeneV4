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

public val Icons.Filled.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff =
            materialIcon(name = "Filled.FlashlightOff") {
            addPath(
                pathData = PathParser().parsePathString("M18.6923 13.7774L17.1278 14.2989L9.68551 6.8566L10.207 5.29214L13.0354 2.46372C13.8165 1.68267 15.0828 1.68267 15.8639 2.46372L21.5207 8.12057C22.3018 8.90162 22.3018 10.1679 21.5207 10.949L18.6923 13.7774ZM14.4496 3.87793L13.0355 5.29206L18.6924 10.9489L20.1065 9.53478L14.4496 3.87793Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M13.4067 16.2346L19.0709 21.8988L20.4851 20.4846L3.51456 3.51401L2.10034 4.92822L7.74984 10.5777L3.13593 15.1916C1.57383 16.7537 1.57383 19.2864 3.13593 20.8485C4.69803 22.4106 7.23069 22.4106 8.79278 20.8485L13.4067 16.2346ZM9.8716 12.6995L11.2858 14.1137L10.2068 15.1927L8.7926 13.7785L9.8716 12.6995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
