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

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share =
            materialIcon(name = "Filled.Share") {
            addPath(
                pathData = PathParser().parsePathString("M21 5.5C21 3.567 19.433 2 17.5 2C15.567 2 14 3.567 14 5.5C14 5.74629 14.0254 5.98664 14.0738 6.21856L7.97295 9.52321C7.33973 8.89096 6.46552 8.5 5.5 8.5C3.567 8.5 2 10.067 2 12C2 13.933 3.567 15.5 5.5 15.5C6.46552 15.5 7.33973 15.109 7.97295 14.4768L14.0738 17.7814C14.0254 18.0134 14 18.2537 14 18.5C14 20.433 15.567 22 17.5 22C19.433 22 21 20.433 21 18.5C21 16.567 19.433 15 17.5 15C16.5345 15 15.6603 15.391 15.027 16.0232L8.92617 12.7186C8.97456 12.4866 9 12.2463 9 12C9 11.7537 8.97456 11.5134 8.92617 11.2814L15.027 7.97679C15.6603 8.60904 16.5345 9 17.5 9C19.433 9 21 7.433 21 5.5Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _share!!
    }

private var _share: ImageVector? = null
