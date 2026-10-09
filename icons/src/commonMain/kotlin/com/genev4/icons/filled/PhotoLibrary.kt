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

public val Icons.Filled.PhotoLibrary: ImageVector
    get() {
        if (_photoLibrary != null) {
            return _photoLibrary!!
        }
        _photoLibrary =
            materialIcon(name = "Filled.PhotoLibrary") {
            addPath(
                pathData = PathParser().parsePathString("M8.08276 18H8C6.89543 18 6 17.1046 6 16V5C6 3.89543 6.89543 3 8 3H19C20.1046 3 21 3.89543 21 5V16C21 17.0273 20.2255 17.8736 19.2286 17.9871C19.2206 17.988 19.2125 17.9889 19.2045 17.9897C19.1899 17.9912 19.1754 17.9925 19.1607 17.9936C19.1331 17.9958 19.1053 17.9975 19.0773 17.9985C19.0517 17.9995 19.0259 18 19 18H18.9998H8.08276ZM19 13.1022V16H10.0828L14.5761 11.5067C15.3571 10.7256 16.6235 10.7256 17.4045 11.5067L19 13.1022ZM5 7V17C5 18.1046 5.89543 19 7 19H19V21H7C4.79086 21 3 19.2091 3 17V7H5ZM12 7.5C12 8.32843 11.3284 9 10.5 9C9.67157 9 9 8.32843 9 7.5C9 6.67157 9.67157 6 10.5 6C11.3284 6 12 6.67157 12 7.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _photoLibrary!!
    }

private var _photoLibrary: ImageVector? = null
