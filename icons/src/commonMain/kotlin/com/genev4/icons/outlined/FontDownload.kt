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

public val Icons.Outlined.FontDownload: ImageVector
    get() {
        if (_fontDownload != null) {
            return _fontDownload!!
        }
        _fontDownload =
            materialIcon(name = "Outlined.FontDownload") {
            addPath(
                pathData = PathParser().parsePathString("M15.8457 18L14.7518 15.2229H9.21459L8.12062 18H6L10.9818 6H13.0014L18 18H15.8457ZM9.90463 13.4743H14.0617L11.9748 8.22857L9.90463 13.4743Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M2 5.99951C2 3.79037 3.79086 1.99951 6 1.99951H18C20.2091 1.99951 22 3.79037 22 5.99951V17.9995C22 20.2087 20.2091 21.9995 18 21.9995H6C3.79086 21.9995 2 20.2087 2 17.9995V5.99951ZM6 3.99951H18C19.1046 3.99951 20 4.89494 20 5.99951V17.9995C20 19.1041 19.1046 19.9995 18 19.9995H6C4.89543 19.9995 4 19.1041 4 17.9995V5.99951C4 4.89494 4.89543 3.99951 6 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _fontDownload!!
    }

private var _fontDownload: ImageVector? = null
