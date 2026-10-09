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

public val Icons.Outlined.DriveFileMove: ImageVector
    get() {
        if (_driveFileMove != null) {
            return _driveFileMove!!
        }
        _driveFileMove =
            materialIcon(name = "Outlined.DriveFileMove") {
            addPath(
                pathData = PathParser().parsePathString("M15.2917 11.7898L11.9648 8.46289L10.5506 9.8771L12.1704 11.4969H8V13.4969L12.1704 13.4969L10.554 15.1133L11.9682 16.5275L15.2917 13.204C15.6822 12.8135 15.6822 12.1803 15.2917 11.7898Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M13 4.99951L10 2.99951H6C3.79086 2.99951 2 4.79037 2 6.99951V15.9995C2 18.2087 3.79086 19.9995 6 19.9995H18C20.2091 19.9995 22 18.2087 22 15.9995V8.99951C22 6.79037 20.2091 4.99951 18 4.99951H13ZM9.39445 4.99951L12.3944 6.99951H18C19.1046 6.99951 20 7.89494 20 8.99951V15.9995C20 17.1041 19.1046 17.9995 18 17.9995H6C4.89543 17.9995 4 17.1041 4 15.9995V6.99951C4 5.89494 4.89543 4.99951 6 4.99951H9.39445Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            }
        return _driveFileMove!!
    }

private var _driveFileMove: ImageVector? = null
