/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.CheckSmall: ImageVector
    get() {
        if (_checkSmall != null) {
            return _checkSmall!!
        }
        _checkSmall =
            materialIcon(name = "Outlined.CheckSmall") {
            addPath(
                pathData = PathParser().parsePathString("M11.5498 15.4351L17.6566 9.32852L16.2424 7.91431L10.8427 13.3138L8.01431 10.4853L6.6001 11.8996L10.1356 15.4351C10.5262 15.8256 11.1593 15.8256 11.5498 15.4351Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _checkSmall!!
    }

private var _checkSmall: ImageVector? = null
