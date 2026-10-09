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

public val Icons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark =
            materialIcon(name = "Filled.Bookmark") {
            addPath(
                pathData = PathParser().parsePathString("M16.087 2.00586C18.2481 2.00586 20 3.79672 20 6.00586V20.8562C20 21.4085 19.562 21.8562 19.0217 21.8562C18.8642 21.8562 18.7089 21.8173 18.5692 21.7428L12.5 18.5059L6.43077 21.7428C5.95177 21.9982 5.36086 21.8084 5.11095 21.3188C5.03806 21.176 5 21.0173 5 20.8562V6.00586C5 3.79672 6.75193 2.00586 8.91304 2.00586H16.087Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
