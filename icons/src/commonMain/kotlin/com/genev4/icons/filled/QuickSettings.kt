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

public val Icons.Filled.QuickSettings: ImageVector
    get() {
        if (_quickSettings != null) {
            return _quickSettings!!
        }
        _quickSettings =
            materialIcon(name = "Filled.QuickSettings") {
            addPath(
                pathData = PathParser().parsePathString("M11 7C11 9.20914 9.20914 11 7 11C4.79086 11 3 9.20914 3 7C3 4.79086 4.79086 3 7 3C9.20914 3 11 4.79086 11 7ZM11 17C11 19.2091 9.20914 21 7 21C4.79086 21 3 19.2091 3 17C3 14.7909 4.79086 13 7 13C9.20914 13 11 14.7909 11 17ZM17 3C14.7909 3 13 4.79086 13 7V17C13 19.2091 14.7909 21 17 21C19.2091 21 21 19.2091 21 17V7C21 4.79086 19.2091 3 17 3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _quickSettings!!
    }

private var _quickSettings: ImageVector? = null
