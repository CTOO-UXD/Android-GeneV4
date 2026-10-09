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

public val Icons.Filled.FontDownload: ImageVector
    get() {
        if (_fontDownload != null) {
            return _fontDownload!!
        }
        _fontDownload =
            materialIcon(name = "Filled.FontDownload") {
            addPath(
                pathData = PathParser().parsePathString("M9.90463 13.4743H14.0617L11.9748 8.22857L9.90463 13.4743Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M6 1.99951C3.79086 1.99951 2 3.79037 2 5.99951V17.9995C2 20.2087 3.79086 21.9995 6 21.9995H18C20.2091 21.9995 22 20.2087 22 17.9995V5.99951C22 3.79037 20.2091 1.99951 18 1.99951H6ZM15.8457 18L14.7518 15.2229H9.21459L8.12062 18H6L10.9818 6H13.0014L18 18H15.8457Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _fontDownload!!
    }

private var _fontDownload: ImageVector? = null
