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

public val Icons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home =
            materialIcon(name = "Filled.Home") {
            addPath(
                pathData = PathParser().parsePathString("M14.3998 3.04974L22.601 9.19992L21.4011 10.8L19.9989 9.74788L19.9992 12.4498L19.9992 12.5297C19.9995 14.6865 19.9997 16.8432 19.9999 19C19.9999 20.1045 19.1045 21 17.9999 21H14H10H5.9999C4.89533 21 3.99991 20.1045 3.99985 19C3.99974 16.8219 3.99948 14.6439 3.99922 12.4658L3.9989 9.75088L2.5999 10.8L1.3999 9.19996L9.60001 3.04988C11.0222 1.98326 12.9776 1.98321 14.3998 3.04974ZM10 14C10 12.8954 10.8954 12 12 12C13.1046 12 14 12.8954 14 14V19L10 19V14Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _home!!
    }

private var _home: ImageVector? = null
