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

public val Icons.Filled.Resume: ImageVector
    get() {
        if (_resume != null) {
            return _resume!!
        }
        _resume =
            materialIcon(name = "Filled.Resume") {
            addPath(
                pathData = PathParser().parsePathString("M3 5V19H5V5H3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M9 7.13199V16.8672C9 18.4218 10.6959 19.382 12.029 18.5822L20.1417 13.7146C21.4364 12.9378 21.4364 11.0614 20.1417 10.2846L12.029 5.41701C10.6959 4.61718 9 5.5774 9 7.13199Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _resume!!
    }

private var _resume: ImageVector? = null
