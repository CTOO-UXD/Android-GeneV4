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

public val Icons.Outlined.CustomTypography: ImageVector
    get() {
        if (_customTypography != null) {
            return _customTypography!!
        }
        _customTypography =
            materialIcon(name = "Outlined.CustomTypography") {
            addPath(
                pathData = PathParser().parsePathString("M9.15429 11.2727H14.7943L15.9257 14.0498H18.12L13.0286 2.0498H10.9543L5.88 14.0498H8.04L9.15429 11.2727ZM11.9829 4.27838L14.1086 9.52409H9.85715L11.9829 4.27838Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 15.9995V17.9995H21V19.9995H13V21.9995H11V15.9995H13Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 17.9995H3V19.9995H9V17.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _customTypography!!
    }

private var _customTypography: ImageVector? = null
