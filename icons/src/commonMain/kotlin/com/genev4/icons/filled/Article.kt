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

public val Icons.Filled.Article: ImageVector
    get() {
        if (_article != null) {
            return _article!!
        }
        _article =
            materialIcon(name = "Filled.Article") {
            addPath(
                pathData = PathParser().parsePathString("M3 7C3 4.79086 4.79086 3 7 3H16L21 8V17C21 19.2091 19.2091 21 17 21H7C4.79086 21 3 19.2091 3 17V7ZM19 9H15V5H15.1716L19 8.82843V9ZM7 9H12V7H7V9ZM17 13V11H7V13H17ZM17 17V15H7V17H17Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _article!!
    }

private var _article: ImageVector? = null
