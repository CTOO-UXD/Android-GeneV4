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

public val Icons.Outlined.ContentCopy: ImageVector
    get() {
        if (_contentCopy != null) {
            return _contentCopy!!
        }
        _contentCopy =
            materialIcon(name = "Outlined.ContentCopy") {
            addPath(
                pathData = PathParser().parsePathString("M6 4.99951C6 3.89494 6.89543 2.99951 8 2.99951H19C20.1046 2.99951 21 3.89494 21 4.99951V15.9995C21 17.1041 20.1046 17.9995 19 17.9995H8C6.89543 17.9995 6 17.1041 6 15.9995V4.99951ZM8 4.99951H19V15.9995H8V4.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 16.3995V6.99951H3V16.3995C3 18.94 5.05949 20.9995 7.6 20.9995H19V18.9995H7.6C6.16406 18.9995 5 17.8355 5 16.3995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _contentCopy!!
    }

private var _contentCopy: ImageVector? = null
