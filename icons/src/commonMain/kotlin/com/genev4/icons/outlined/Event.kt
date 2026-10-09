/*
 * Generated from Material-3 Gene4.0 Standard icons. Do not edit by hand.
 * Re-run: python tools/generate-icons/generate_icons.py
 */

package com.genev4.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import com.genev4.icons.Icons
import com.genev4.icons.materialIcon

public val Icons.Outlined.Event: ImageVector
    get() {
        if (_event != null) {
            return _event!!
        }
        _event =
            materialIcon(name = "Outlined.Event") {
            addPath(
                pathData = PathParser().parsePathString("M9 6.99951H7V2.99951H9V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M17 6.99951H15V2.99951H17V6.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M4 3.99951H6V5.99951H4V17.9995H20V5.99951H18V3.99951H20C21.1046 3.99951 22 4.89494 22 5.99951V17.9995C22 19.1041 21.1046 19.9995 20 19.9995H4C2.89543 19.9995 2 19.1041 2 17.9995V5.99951C2 4.89494 2.89543 3.99951 4 3.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M14 5.99951H10V3.99951H14V5.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15.5 15.9995C16.8807 15.9995 18 14.8802 18 13.4995C18 12.1188 16.8807 10.9995 15.5 10.9995C14.1193 10.9995 13 12.1188 13 13.4995C13 14.8802 14.1193 15.9995 15.5 15.9995Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _event!!
    }

private var _event: ImageVector? = null
