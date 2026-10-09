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

public val Icons.Filled.Sport: ImageVector
    get() {
        if (_sport != null) {
            return _sport!!
        }
        _sport =
            materialIcon(name = "Filled.Sport") {
            addPath(
                pathData = PathParser().parsePathString("M16.6008 7.26145C18.0458 14.0164 17.9988 14.0164 21.1016 16.8712C23.3356 18.9267 22.9988 21.1753 19.3245 20.6077C14.7786 19.9053 11.5322 18.1025 6.46091 14.2661C2.47806 11.2532 1.23175 9.75819 1.5385 8.22456C1.69131 7.46057 3.19721 6.59074 4.37008 6.53093L4.38259 6.5136C5.17341 5.41845 6.47439 3.61681 8.34708 3.08176C10.7003 2.40941 9.58869 6.09185 11.1513 6.53094C13.7512 7.26146 15.6729 2.92432 16.6008 7.26145Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _sport!!
    }

private var _sport: ImageVector? = null
