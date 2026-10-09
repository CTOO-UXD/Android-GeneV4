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

public val Icons.Filled.CollapseContent: ImageVector
    get() {
        if (_collapseContent != null) {
            return _collapseContent!!
        }
        _collapseContent =
            materialIcon(name = "Filled.CollapseContent") {
            addPath(
                pathData = PathParser().parsePathString("M19 8.99951L15 8.99951L15 4.99951H13L13 8.99951C13 10.1041 13.8954 10.9995 15 10.9995L19 10.9995V8.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 14.9995H9V18.9995H11V14.9995C11 13.8949 10.1046 12.9995 9 12.9995H5V14.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _collapseContent!!
    }

private var _collapseContent: ImageVector? = null
