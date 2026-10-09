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

public val Icons.Filled.SecureFolder: ImageVector
    get() {
        if (_secureFolder != null) {
            return _secureFolder!!
        }
        _secureFolder =
            materialIcon(name = "Filled.SecureFolder") {
            addPath(
                pathData = PathParser().parsePathString("M7 3C4.79086 3 3 4.79086 3 7V17C3 19.2091 4.79086 21 7 21H17C19.2091 21 21 19.2091 21 17V7C21 4.79086 19.2091 3 17 3H7ZM14 10.5C14 9.39543 13.1046 8.5 12 8.5C10.8954 8.5 10 9.39543 10 10.5C10 11.3158 10.4891 12.016 11.1895 12.3271L10 15.5H14L12.8096 12.3271C13.5104 12.0162 14 11.3161 14 10.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _secureFolder!!
    }

private var _secureFolder: ImageVector? = null
