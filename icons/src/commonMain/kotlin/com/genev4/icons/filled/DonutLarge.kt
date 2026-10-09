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

public val Icons.Filled.DonutLarge: ImageVector
    get() {
        if (_donutLarge != null) {
            return _donutLarge!!
        }
        _donutLarge =
            materialIcon(name = "Filled.DonutLarge") {
            addPath(
                pathData = PathParser().parsePathString("M11 5.07034C7.60771 5.55557 5 8.47298 5 11.9995C5 15.5259 7.60771 18.4433 11 18.9286V21.9501C5.94668 21.4484 2 17.1848 2 11.9995C2 6.8141 5.94668 2.55055 11 2.04883V5.07034Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M18.9291 10.9995C18.4906 7.93376 16.0657 5.50885 13 5.07034V2.04883C17.7244 2.5179 21.4816 6.27504 21.9506 10.9995H18.9291Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 18.9286C16.0657 18.4901 18.4906 16.0651 18.9291 12.9995H21.9506C21.4816 17.7239 17.7244 21.481 13 21.9501V18.9286Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _donutLarge!!
    }

private var _donutLarge: ImageVector? = null
