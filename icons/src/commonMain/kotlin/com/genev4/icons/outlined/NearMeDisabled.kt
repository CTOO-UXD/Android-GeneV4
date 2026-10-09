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

public val Icons.Outlined.NearMeDisabled: ImageVector
    get() {
        if (_nearMeDisabled != null) {
            return _nearMeDisabled!!
        }
        _nearMeDisabled =
            materialIcon(name = "Outlined.NearMeDisabled") {
            addPath(
                pathData = PathParser().parsePathString("M15.9522 15.7803L20.5711 20.3993L21.9854 18.9851L5.0148 2.01453L3.60059 3.42874L8.23002 8.05818L2.23658 10.5715C1.72727 10.7851 1.48753 11.3711 1.70111 11.8805C1.8179 12.159 2.05428 12.3698 2.34427 12.454L9.46574 14.5234L11.5643 21.6834C11.7197 22.2134 12.2752 22.5171 12.8052 22.3617C13.0949 22.2768 13.3307 22.0657 13.4469 21.7871L15.9522 15.7803ZM14.4225 14.2507L12.688 18.4084L11.0766 12.9087L5.61605 11.3224L9.75768 9.58583L14.4225 14.2507Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            )
            addPath(
                pathData = PathParser().parsePathString("M20.5543 4.7463L17.6171 11.7885L16.0877 10.2591L17.77 6.22636L13.7433 7.9147L12.2155 6.38685L19.2446 3.43916C19.4914 3.33568 19.7693 3.33541 20.0163 3.43842C20.526 3.65101 20.7669 4.23657 20.5543 4.7463Z").toNodes(),
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.NonZero,
            )
            }
        return _nearMeDisabled!!
    }

private var _nearMeDisabled: ImageVector? = null
