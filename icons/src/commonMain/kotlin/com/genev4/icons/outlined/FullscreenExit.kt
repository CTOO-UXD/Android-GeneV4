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

public val Icons.Outlined.FullscreenExit: ImageVector
    get() {
        if (_fullscreenExit != null) {
            return _fullscreenExit!!
        }
        _fullscreenExit =
            materialIcon(name = "Outlined.FullscreenExit") {
            addPath(
                pathData = PathParser().parsePathString("M9 2.99951H7V5.99951C7 6.5518 6.55228 6.99951 6 6.99951H3V8.99951H6C7.65685 8.99951 9 7.65637 9 5.99951V2.99951Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M3 14.9995V16.9995H6C6.55228 16.9995 7 17.4472 7 17.9995V20.9995H9V17.9995C9 16.3427 7.65685 14.9995 6 14.9995H3Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M21 14.9995V16.9995H18C17.4477 16.9995 17 17.4472 17 17.9995V20.9995H15V17.9995C15 16.3427 16.3431 14.9995 18 14.9995H21Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M15 2.99951V5.99951C15 7.65637 16.3431 8.99951 18 8.99951H21V6.99951H18C17.4477 6.99951 17 6.5518 17 5.99951V2.99951H15Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _fullscreenExit!!
    }

private var _fullscreenExit: ImageVector? = null
