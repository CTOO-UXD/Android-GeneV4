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

public val Icons.Filled.ContentCopy: ImageVector
    get() {
        if (_contentCopy != null) {
            return _contentCopy!!
        }
        _contentCopy =
            materialIcon(name = "Filled.ContentCopy") {
            addPath(
                pathData = PathParser().parsePathString("M8 3.99951H19C19.5523 3.99951 20 4.44723 20 4.99951V15.9995C20 16.5518 19.5523 16.9995 19 16.9995H8C7.44772 16.9995 7 16.5518 7 15.9995V4.99951C7 4.44723 7.44772 3.99951 8 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _contentCopy!!
    }

private var _contentCopy: ImageVector? = null
