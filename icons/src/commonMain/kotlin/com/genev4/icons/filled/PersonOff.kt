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

public val Icons.Filled.PersonOff: ImageVector
    get() {
        if (_personOff != null) {
            return _personOff!!
        }
        _personOff =
            materialIcon(name = "Filled.PersonOff") {
            addPath(
                pathData = PathParser().parsePathString("M13.5533 10.7247C15.2732 10.0922 16.5 8.43935 16.5 6.5C16.5 4.01472 14.4853 2 12 2C10.0606 2 8.40782 3.22681 7.77527 4.94669L13.5533 10.7247Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.6719 21.5L20.4853 23.3134L21.8995 21.8992L2.10049 2.10019L0.686279 3.5144L9.83737 12.6655C5.09326 13.4416 3.5809 16.7965 3.15236 19.5083C2.97995 20.5993 3.89543 21.5 5 21.5H18.6719Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.3247 17.4962C19.6593 15.7329 18.376 14.0189 15.958 13.1294L20.3247 17.4962Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _personOff!!
    }

private var _personOff: ImageVector? = null
