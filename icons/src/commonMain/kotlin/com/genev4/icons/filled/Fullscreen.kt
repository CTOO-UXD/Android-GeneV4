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

public val Icons.Filled.Fullscreen: ImageVector
    get() {
        if (_fullscreen != null) {
            return _fullscreen!!
        }
        _fullscreen =
            materialIcon(name = "Filled.Fullscreen") {
            addPath(
                pathData = PathParser().parsePathString("M8 2.99951H6C4.34315 2.99951 3 4.34266 3 5.99951V7.99951H5V5.99951C5 5.44723 5.44772 4.99951 6 4.99951H8V2.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 4.99951V2.99951H18C19.6569 2.99951 21 4.34266 21 5.99951V7.99951H19V5.99951C19 5.44723 18.5523 4.99951 18 4.99951H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M16 18.9995H18C18.5523 18.9995 19 18.5518 19 17.9995V15.9995H21V17.9995C21 19.6564 19.6569 20.9995 18 20.9995H16V18.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M5 15.9995V17.9995C5 18.5518 5.44772 18.9995 6 18.9995H8V20.9995H6C4.34315 20.9995 3 19.6564 3 17.9995V15.9995H5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fullscreen!!
    }

private var _fullscreen: ImageVector? = null
