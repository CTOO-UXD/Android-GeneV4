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

public val Icons.Outlined.Reply: ImageVector
    get() {
        if (_reply != null) {
            return _reply!!
        }
        _reply =
            materialIcon(name = "Outlined.Reply") {
            addPath(
                pathData = PathParser().parsePathString("M4.41318 9.5851L8.99877 4.99951L10.413 6.41372L6.82732 9.99938L15.9999 9.99941C18.7613 9.99942 20.9999 12.238 20.9999 14.9994V18.9999H18.9999V14.9994C18.9999 13.3426 17.6568 11.9994 15.9999 11.9994L6.82746 11.9994L10.4165 15.5884L9.0023 17.0026L4.41318 12.4135C3.63213 11.6325 3.63213 10.3661 4.41318 9.5851Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _reply!!
    }

private var _reply: ImageVector? = null
