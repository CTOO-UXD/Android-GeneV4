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

public val Icons.Filled.Drawing: ImageVector
    get() {
        if (_drawing != null) {
            return _drawing!!
        }
        _drawing =
            materialIcon(name = "Filled.Drawing") {
            addPath(
                pathData = PathParser().parsePathString("M16 1.99902C17.7398 1.99902 19.219 3.1108 19.7695 4.66211C19.4275 4.80972 19.1035 5.01255 18.8135 5.27441L18.6826 5.39844L10.5508 13.5303L10.2607 13.8213L8.91113 17.1963L8.90918 17.2002C8.69772 17.7321 8.69518 18.3292 8.91016 18.8672L8.91113 18.8691C9.3711 20.015 10.6735 20.5813 11.8291 20.123L11.835 20.1211L15.21 18.7715L20 13.9814V18C19.9997 20.2089 18.209 22 16 22H8C5.79102 22 4.00026 20.2089 4 18V6L8 1.99902H16ZM5 6.41406V7H8C8.55212 7 8.99974 6.55206 9 6V2.99902H8.41406L5 6.41406Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.0967 11.0557L14.0859 17.0664L11.0918 18.2637C10.9637 18.3147 10.8188 18.2521 10.7676 18.124C10.7438 18.0644 10.7438 17.998 10.7676 17.9385L11.9648 14.9443L17.9756 8.93457L20.0967 11.0557Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.0967 6.8125C20.6824 6.22712 21.6321 6.22704 22.2178 6.8125C22.8035 7.39829 22.8036 8.34879 22.2178 8.93457L21.1572 9.99512L19.0361 7.87402L20.0967 6.8125Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _drawing!!
    }

private var _drawing: ImageVector? = null
