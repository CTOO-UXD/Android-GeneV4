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

public val Icons.Outlined.Drawing: ImageVector
    get() {
        if (_drawing != null) {
            return _drawing!!
        }
        _drawing =
            materialIcon(name = "Outlined.Drawing") {
            addPath(
                pathData = PathParser().parsePathString("M16 1.99902C17.6439 1.99902 19.0558 2.99139 19.6709 4.40918L18 6.08105V6C18 4.89543 17.1046 4 16 4H9V6C8.99974 6.55206 8.55212 7 8 7H6V18C6.00026 19.1043 6.89559 20 8 20H16C17.1044 20 17.9997 19.1043 18 18V15.9805L20 13.9805V18C19.9997 20.2089 18.209 22 16 22H8C5.79102 22 4.00026 20.2089 4 18V6L8 1.99902H16Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
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
