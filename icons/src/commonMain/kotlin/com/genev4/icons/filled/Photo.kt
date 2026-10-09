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

public val Icons.Filled.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo =
            materialIcon(name = "Filled.Photo") {
            addPath(
                pathData = PathParser().parsePathString("M7 3C4.79086 3 3 4.79086 3 7V17C3 18.1242 3.46373 19.14 4.21034 19.8667C4.93093 20.568 5.91502 21 7 21H17C18.7384 21 20.2178 19.891 20.7693 18.342C20.7967 18.265 20.8218 18.187 20.8446 18.1079C20.9458 17.7561 21 17.3844 21 17V7C21 4.79086 19.2091 3 17 3H7ZM5.62481 18.4522L12.8384 11.2386C13.6194 10.4576 14.8858 10.4576 15.6668 11.2386L19 14.5718V17C19 18.1046 18.1046 19 17 19H7C6.4673 19 5.98325 18.7917 5.62481 18.4522ZM10 8.5C10 9.32843 9.32843 10 8.5 10C7.67157 10 7 9.32843 7 8.5C7 7.67157 7.67157 7 8.5 7C9.32843 7 10 7.67157 10 8.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _photo!!
    }

private var _photo: ImageVector? = null
